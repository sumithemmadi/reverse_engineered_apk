package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class Placeholder extends View {
  private int b = -1;
  
  private View c = null;
  
  private int d = 4;
  
  public Placeholder(Context paramContext) {
    super(paramContext);
    a(null);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private void a(AttributeSet paramAttributeSet) {
    setVisibility(this.d);
    this.b = -1;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_placeholder);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintLayout_placeholder_content) {
          this.b = typedArray.getResourceId(j, this.b);
        } else if (j == e.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
          this.d = typedArray.getInt(j, this.d);
        } 
      } 
      typedArray.recycle();
    } 
  }
  
  public void b(ConstraintLayout paramConstraintLayout) {
    if (this.c == null)
      return; 
    ConstraintLayout.LayoutParams layoutParams1 = (ConstraintLayout.LayoutParams)getLayoutParams();
    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams)this.c.getLayoutParams();
    layoutParams2.n0.X0(0);
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = layoutParams1.n0.B();
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.b;
    if (dimensionBehaviour1 != dimensionBehaviour2)
      layoutParams1.n0.Y0(layoutParams2.n0.U()); 
    if (layoutParams1.n0.R() != dimensionBehaviour2)
      layoutParams1.n0.z0(layoutParams2.n0.y()); 
    layoutParams2.n0.X0(8);
  }
  
  public void c(ConstraintLayout paramConstraintLayout) {
    if (this.b == -1 && !isInEditMode())
      setVisibility(this.d); 
    View view = paramConstraintLayout.findViewById(this.b);
    this.c = view;
    if (view != null) {
      ((ConstraintLayout.LayoutParams)view.getLayoutParams()).b0 = true;
      this.c.setVisibility(0);
      setVisibility(0);
    } 
  }
  
  public View getContent() {
    return this.c;
  }
  
  public int getEmptyVisibility() {
    return this.d;
  }
  
  public void onDraw(Canvas paramCanvas) {
    if (isInEditMode()) {
      paramCanvas.drawRGB(223, 223, 223);
      Paint paint = new Paint();
      paint.setARGB(255, 210, 210, 210);
      paint.setTextAlign(Paint.Align.CENTER);
      paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect rect = new Rect();
      paramCanvas.getClipBounds(rect);
      paint.setTextSize(rect.height());
      int i = rect.height();
      int j = rect.width();
      paint.setTextAlign(Paint.Align.LEFT);
      paint.getTextBounds("?", 0, 1, rect);
      paramCanvas.drawText("?", j / 2.0F - rect.width() / 2.0F - rect.left, i / 2.0F + rect.height() / 2.0F - rect.bottom, paint);
    } 
  }
  
  public void setContentId(int paramInt) {
    if (this.b == paramInt)
      return; 
    View view = this.c;
    if (view != null) {
      view.setVisibility(0);
      ((ConstraintLayout.LayoutParams)this.c.getLayoutParams()).b0 = false;
      this.c = null;
    } 
    this.b = paramInt;
    if (paramInt != -1) {
      view = ((View)getParent()).findViewById(paramInt);
      if (view != null)
        view.setVisibility(8); 
    } 
  }
  
  public void setEmptyVisibility(int paramInt) {
    this.d = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/Placeholder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */