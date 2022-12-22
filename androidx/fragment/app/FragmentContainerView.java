package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b.h.k.e0;
import b.h.k.w;
import b.m.c;
import java.util.ArrayList;

public final class FragmentContainerView extends FrameLayout {
  private ArrayList<View> b;
  
  private ArrayList<View> c;
  
  private View.OnApplyWindowInsetsListener d;
  
  private boolean e = true;
  
  public FragmentContainerView(Context paramContext) {
    super(paramContext);
  }
  
  public FragmentContainerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FragmentContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    if (paramAttributeSet != null) {
      String str1;
      String str2;
      String str3 = paramAttributeSet.getClassAttribute();
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c.FragmentContainerView);
      if (str3 == null) {
        str2 = typedArray.getString(c.FragmentContainerView_android_name);
        str1 = "android:name";
      } else {
        str1 = "class";
        str2 = str3;
      } 
      typedArray.recycle();
      if (str2 != null && !isInEditMode()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentContainerView must be within a FragmentActivity to use ");
        stringBuilder.append(str1);
        stringBuilder.append("=\"");
        stringBuilder.append(str2);
        stringBuilder.append("\"");
        throw new UnsupportedOperationException(stringBuilder.toString());
      } 
    } 
  }
  
  FragmentContainerView(Context paramContext, AttributeSet paramAttributeSet, FragmentManager paramFragmentManager) {
    super(paramContext, paramAttributeSet);
    String str1 = paramAttributeSet.getClassAttribute();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c.FragmentContainerView);
    String str2 = str1;
    if (str1 == null)
      str2 = typedArray.getString(c.FragmentContainerView_android_name); 
    str1 = typedArray.getString(c.FragmentContainerView_android_tag);
    typedArray.recycle();
    int i = getId();
    Fragment fragment = paramFragmentManager.h0(i);
    if (str2 != null && fragment == null) {
      String str;
      StringBuilder stringBuilder;
      if (i <= 0) {
        if (str1 != null) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(" with tag ");
          stringBuilder1.append(str1);
          str = stringBuilder1.toString();
        } else {
          str = "";
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentContainerView must have an android:id to add Fragment ");
        stringBuilder.append(str2);
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      Fragment fragment1 = paramFragmentManager.r0().a(str.getClassLoader(), str2);
      fragment1.E0((Context)str, (AttributeSet)stringBuilder, null);
      paramFragmentManager.l().s(true).d((ViewGroup)this, fragment1, str1).k();
    } 
    paramFragmentManager.T0(this);
  }
  
  private void a(View paramView) {
    ArrayList<View> arrayList = this.c;
    if (arrayList != null && arrayList.contains(paramView)) {
      if (this.b == null)
        this.b = new ArrayList<View>(); 
      this.b.add(paramView);
    } 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (FragmentManager.A0(paramView) != null) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not associated with a Fragment.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean) {
    if (FragmentManager.A0(paramView) != null)
      return super.addViewInLayout(paramView, paramInt, paramLayoutParams, paramBoolean); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not associated with a Fragment.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public WindowInsets dispatchApplyWindowInsets(WindowInsets paramWindowInsets) {
    e0 e0 = e0.t(paramWindowInsets);
    View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
    if (onApplyWindowInsetsListener != null) {
      e0 = e0.t(onApplyWindowInsetsListener.onApplyWindowInsets((View)this, paramWindowInsets));
    } else {
      e0 = w.c0((View)this, e0);
    } 
    if (!e0.m()) {
      int i = getChildCount();
      for (byte b = 0; b < i; b++)
        w.h(getChildAt(b), e0); 
    } 
    return paramWindowInsets;
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    if (this.e && this.b != null)
      for (byte b = 0; b < this.b.size(); b++)
        super.drawChild(paramCanvas, this.b.get(b), getDrawingTime());  
    super.dispatchDraw(paramCanvas);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    if (this.e) {
      ArrayList<View> arrayList = this.b;
      if (arrayList != null && arrayList.size() > 0 && this.b.contains(paramView))
        return false; 
    } 
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void endViewTransition(View paramView) {
    ArrayList<View> arrayList = this.c;
    if (arrayList != null) {
      arrayList.remove(paramView);
      arrayList = this.b;
      if (arrayList != null && arrayList.remove(paramView))
        this.e = true; 
    } 
    super.endViewTransition(paramView);
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    return paramWindowInsets;
  }
  
  public void removeAllViewsInLayout() {
    for (int i = getChildCount() - 1; i >= 0; i--)
      a(getChildAt(i)); 
    super.removeAllViewsInLayout();
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean) {
    if (paramBoolean)
      a(paramView); 
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public void removeView(View paramView) {
    a(paramView);
    super.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt) {
    a(getChildAt(paramInt));
    super.removeViewAt(paramInt);
  }
  
  public void removeViewInLayout(View paramView) {
    a(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public void removeViews(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
      a(getChildAt(i)); 
    super.removeViews(paramInt1, paramInt2);
  }
  
  public void removeViewsInLayout(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
      a(getChildAt(i)); 
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  void setDrawDisappearingViewsLast(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition) {
    if (Build.VERSION.SDK_INT < 18) {
      super.setLayoutTransition(paramLayoutTransition);
      return;
    } 
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener) {
    this.d = paramOnApplyWindowInsetsListener;
  }
  
  public void startViewTransition(View paramView) {
    if (paramView.getParent() == this) {
      if (this.c == null)
        this.c = new ArrayList<View>(); 
      this.c.add(paramView);
    } 
    super.startViewTransition(paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */