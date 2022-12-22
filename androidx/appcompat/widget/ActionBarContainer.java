package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.a.f;
import b.a.j;
import b.h.k.w;

public class ActionBarContainer extends FrameLayout {
  private boolean b;
  
  private View c;
  
  private View d;
  
  private View e;
  
  Drawable f;
  
  Drawable g;
  
  Drawable h;
  
  boolean i;
  
  boolean j;
  
  private int k;
  
  public ActionBarContainer(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    w.u0((View)this, new b(this));
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionBar);
    this.f = typedArray.getDrawable(j.ActionBar_background);
    this.g = typedArray.getDrawable(j.ActionBar_backgroundStacked);
    this.k = typedArray.getDimensionPixelSize(j.ActionBar_height, -1);
    int i = getId();
    int j = f.split_action_bar;
    boolean bool = true;
    if (i == j) {
      this.i = true;
      this.h = typedArray.getDrawable(j.ActionBar_backgroundSplit);
    } 
    typedArray.recycle();
    if (this.i ? (this.h == null) : (this.f == null && this.g == null))
      bool = false; 
    setWillNotDraw(bool);
  }
  
  private int a(View paramView) {
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
  }
  
  private boolean b(View paramView) {
    return (paramView == null || paramView.getVisibility() == 8 || paramView.getMeasuredHeight() == 0);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.f;
    if (drawable != null && drawable.isStateful())
      this.f.setState(getDrawableState()); 
    drawable = this.g;
    if (drawable != null && drawable.isStateful())
      this.g.setState(getDrawableState()); 
    drawable = this.h;
    if (drawable != null && drawable.isStateful())
      this.h.setState(getDrawableState()); 
  }
  
  public View getTabContainer() {
    return this.c;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.g;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    this.d = findViewById(f.action_bar);
    this.e = findViewById(f.action_context_bar);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return (this.b || super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View view = this.c;
    paramInt2 = 1;
    paramInt4 = 0;
    if (view != null && view.getVisibility() != 8) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    if (view != null && view.getVisibility() != 8) {
      int i = getMeasuredHeight();
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int j = view.getMeasuredHeight();
      int k = layoutParams.bottomMargin;
      view.layout(paramInt1, i - j - k, paramInt3, i - k);
    } 
    if (this.i) {
      drawable = this.h;
      if (drawable != null) {
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramInt1 = paramInt2;
      } else {
        paramInt1 = 0;
      } 
    } else {
      paramInt1 = paramInt4;
      if (this.f != null) {
        if (this.d.getVisibility() == 0) {
          this.f.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
        } else {
          View view1 = this.e;
          if (view1 != null && view1.getVisibility() == 0) {
            this.f.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
          } else {
            this.f.setBounds(0, 0, 0, 0);
          } 
        } 
        paramInt1 = 1;
      } 
      this.j = paramBoolean;
      if (paramBoolean) {
        Drawable drawable1 = this.g;
        if (drawable1 != null) {
          drawable1.setBounds(drawable.getLeft(), drawable.getTop(), drawable.getRight(), drawable.getBottom());
          paramInt1 = paramInt2;
        } 
      } 
    } 
    if (paramInt1 != 0)
      invalidate(); 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (this.d == null) {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {
        int j = this.k;
        i = paramInt2;
        if (j >= 0)
          i = View.MeasureSpec.makeMeasureSpec(Math.min(j, View.MeasureSpec.getSize(paramInt2)), -2147483648); 
      } 
    } 
    super.onMeasure(paramInt1, i);
    if (this.d == null)
      return; 
    paramInt2 = View.MeasureSpec.getMode(i);
    View view = this.c;
    if (view != null && view.getVisibility() != 8 && paramInt2 != 1073741824) {
      if (!b(this.d)) {
        paramInt1 = a(this.d);
      } else if (!b(this.e)) {
        paramInt1 = a(this.e);
      } else {
        paramInt1 = 0;
      } 
      if (paramInt2 == Integer.MIN_VALUE) {
        paramInt2 = View.MeasureSpec.getSize(i);
      } else {
        paramInt2 = Integer.MAX_VALUE;
      } 
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + a(this.c), paramInt2));
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable) {
    Drawable drawable = this.f;
    if (drawable != null) {
      drawable.setCallback(null);
      unscheduleDrawable(this.f);
    } 
    this.f = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this);
      View view = this.d;
      if (view != null)
        this.f.setBounds(view.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom()); 
    } 
    boolean bool = this.i;
    boolean bool1 = true;
    if (bool ? (this.h == null) : (this.f == null && this.g == null))
      bool1 = false; 
    setWillNotDraw(bool1);
    invalidate();
    if (Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setSplitBackground(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroid/graphics/drawable/Drawable;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 22
    //   9: aload_2
    //   10: aconst_null
    //   11: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   14: aload_0
    //   15: aload_0
    //   16: getfield h : Landroid/graphics/drawable/Drawable;
    //   19: invokevirtual unscheduleDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   22: aload_0
    //   23: aload_1
    //   24: putfield h : Landroid/graphics/drawable/Drawable;
    //   27: iconst_0
    //   28: istore_3
    //   29: aload_1
    //   30: ifnull -> 68
    //   33: aload_1
    //   34: aload_0
    //   35: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   38: aload_0
    //   39: getfield i : Z
    //   42: ifeq -> 68
    //   45: aload_0
    //   46: getfield h : Landroid/graphics/drawable/Drawable;
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull -> 68
    //   54: aload_1
    //   55: iconst_0
    //   56: iconst_0
    //   57: aload_0
    //   58: invokevirtual getMeasuredWidth : ()I
    //   61: aload_0
    //   62: invokevirtual getMeasuredHeight : ()I
    //   65: invokevirtual setBounds : (IIII)V
    //   68: aload_0
    //   69: getfield i : Z
    //   72: ifeq -> 91
    //   75: iload_3
    //   76: istore #4
    //   78: aload_0
    //   79: getfield h : Landroid/graphics/drawable/Drawable;
    //   82: ifnonnull -> 114
    //   85: iconst_1
    //   86: istore #4
    //   88: goto -> 114
    //   91: iload_3
    //   92: istore #4
    //   94: aload_0
    //   95: getfield f : Landroid/graphics/drawable/Drawable;
    //   98: ifnonnull -> 114
    //   101: iload_3
    //   102: istore #4
    //   104: aload_0
    //   105: getfield g : Landroid/graphics/drawable/Drawable;
    //   108: ifnonnull -> 114
    //   111: goto -> 85
    //   114: aload_0
    //   115: iload #4
    //   117: invokevirtual setWillNotDraw : (Z)V
    //   120: aload_0
    //   121: invokevirtual invalidate : ()V
    //   124: getstatic android/os/Build$VERSION.SDK_INT : I
    //   127: bipush #21
    //   129: if_icmplt -> 136
    //   132: aload_0
    //   133: invokevirtual invalidateOutline : ()V
    //   136: return
  }
  
  public void setStackedBackground(Drawable paramDrawable) {
    Drawable drawable = this.g;
    if (drawable != null) {
      drawable.setCallback(null);
      unscheduleDrawable(this.g);
    } 
    this.g = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this);
      if (this.j) {
        paramDrawable = this.g;
        if (paramDrawable != null)
          paramDrawable.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom()); 
      } 
    } 
    boolean bool = this.i;
    boolean bool1 = true;
    if (bool ? (this.h == null) : (this.f == null && this.g == null))
      bool1 = false; 
    setWillNotDraw(bool1);
    invalidate();
    if (Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setTabContainer(ScrollingTabContainerView paramScrollingTabContainerView) {
    View view = this.c;
    if (view != null)
      removeView(view); 
    this.c = (View)paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null) {
      addView((View)paramScrollingTabContainerView);
      ViewGroup.LayoutParams layoutParams = paramScrollingTabContainerView.getLayoutParams();
      layoutParams.width = -1;
      layoutParams.height = -2;
      paramScrollingTabContainerView.setAllowCollapse(false);
    } 
  }
  
  public void setTransitioning(boolean paramBoolean) {
    int i;
    this.b = paramBoolean;
    if (paramBoolean) {
      i = 393216;
    } else {
      i = 262144;
    } 
    setDescendantFocusability(i);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.g;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.h;
    if (drawable != null)
      drawable.setVisible(bool, false); 
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback) {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt) {
    return (paramInt != 0) ? super.startActionModeForChild(paramView, paramCallback, paramInt) : null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    boolean bool;
    if ((paramDrawable == this.f && !this.i) || (paramDrawable == this.g && this.j) || (paramDrawable == this.h && this.i) || super.verifyDrawable(paramDrawable)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */