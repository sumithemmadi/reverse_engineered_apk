package com.allinone.callerid.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class LFrameLayout extends FrameLayout implements a {
  private b b;
  
  public LFrameLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  @SuppressLint({"NewApi"})
  public LFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.b = new b((View)this, paramAttributeSet);
  }
  
  public void a() {
    super.performClick();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    return !isEnabled() ? false : super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected void onDraw(Canvas paramCanvas) {
    if (!isEnabled()) {
      super.onDraw(paramCanvas);
      return;
    } 
    this.b.a(paramCanvas);
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    b b1 = this.b;
    if (b1 != null) {
      if (b1.h()) {
        int[] arrayOfInt = this.b.c(paramInt1, paramInt2);
        setMeasuredDimension(arrayOfInt[0], arrayOfInt[1]);
      } else {
        super.onMeasure(paramInt1, paramInt2);
      } 
    } else {
      super.onMeasure(paramInt1, paramInt2);
    } 
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    b b1 = this.b;
    if (b1 != null)
      b1.i(paramMotionEvent); 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    b b1 = this.b;
    if (b1 != null)
      b1.j(paramView, paramInt); 
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    b b1 = this.b;
    if (b1 != null)
      b1.k(paramBoolean); 
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public boolean performClick() {
    b b1 = this.b;
    if (b1 != null) {
      b1.l();
      return true;
    } 
    return super.performClick();
  }
  
  public void setBackground(Drawable paramDrawable) {
    b b1 = this.b;
    if (b1 != null)
      b1.o(paramDrawable); 
  }
  
  public void setBackgroundColor(int paramInt) {
    b b1 = this.b;
    if (b1 != null)
      b1.p(paramInt); 
  }
  
  @Deprecated
  public void setBackgroundDrawable(Drawable paramDrawable) {
    setBackground(paramDrawable);
  }
  
  public void setBackgroundResource(int paramInt) {
    setBackground(getResources().getDrawable(paramInt));
  }
  
  public void setColor(int paramInt) {
    this.b.q(paramInt);
  }
  
  public void setDelayClick(boolean paramBoolean) {
    this.b.r(paramBoolean);
  }
  
  public void setType(int paramInt) {
    this.b.s(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/LFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */