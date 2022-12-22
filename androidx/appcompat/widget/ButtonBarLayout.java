package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.a.f;
import b.a.j;
import b.h.k.w;

public class ButtonBarLayout extends LinearLayout {
  private boolean b;
  
  private int c = -1;
  
  private int d = 0;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = j.ButtonBarLayout;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    w.p0((View)this, paramContext, arrayOfInt, paramAttributeSet, typedArray, 0, 0);
    this.b = typedArray.getBoolean(j.ButtonBarLayout_allowStacking, true);
    typedArray.recycle();
  }
  
  private int a(int paramInt) {
    int i = getChildCount();
    while (paramInt < i) {
      if (getChildAt(paramInt).getVisibility() == 0)
        return paramInt; 
      paramInt++;
    } 
    return -1;
  }
  
  private boolean b() {
    int i = getOrientation();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  private void setStacked(boolean paramBoolean) {
    byte b;
    setOrientation(paramBoolean);
    if (paramBoolean) {
      b = 8388613;
    } else {
      b = 80;
    } 
    setGravity(b);
    View view = findViewById(f.spacer);
    if (view != null) {
      byte b1;
      if (paramBoolean) {
        b1 = 8;
      } else {
        b1 = 4;
      } 
      view.setVisibility(b1);
    } 
    for (int i = getChildCount() - 2; i >= 0; i--)
      bringChildToFront(getChildAt(i)); 
  }
  
  public int getMinimumHeight() {
    return Math.max(this.d, super.getMinimumHeight());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int j;
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = this.b;
    boolean bool1 = false;
    if (bool) {
      if (i > this.c && b())
        setStacked(false); 
      this.c = i;
    } 
    if (!b() && View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      j = View.MeasureSpec.makeMeasureSpec(i, -2147483648);
      i = 1;
    } else {
      j = paramInt1;
      i = 0;
    } 
    super.onMeasure(j, paramInt2);
    int k = i;
    if (this.b) {
      k = i;
      if (!b()) {
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216) {
          j = 1;
        } else {
          j = 0;
        } 
        k = i;
        if (j != 0) {
          setStacked(true);
          k = 1;
        } 
      } 
    } 
    if (k != 0)
      super.onMeasure(paramInt1, paramInt2); 
    i = a(0);
    paramInt1 = bool1;
    if (i >= 0) {
      View view = getChildAt(i);
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
      paramInt2 = getPaddingTop() + view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
      if (b()) {
        i = a(i + 1);
        paramInt1 = paramInt2;
        if (i >= 0)
          paramInt1 = paramInt2 + getChildAt(i).getPaddingTop() + (int)((getResources().getDisplayMetrics()).density * 16.0F); 
      } else {
        paramInt1 = paramInt2 + getPaddingBottom();
      } 
    } 
    if (w.D((View)this) != paramInt1)
      setMinimumHeight(paramInt1); 
  }
  
  public void setAllowStacking(boolean paramBoolean) {
    if (this.b != paramBoolean) {
      this.b = paramBoolean;
      if (!paramBoolean && getOrientation() == 1)
        setStacked(false); 
      requestLayout();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */