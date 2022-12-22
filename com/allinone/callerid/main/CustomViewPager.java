package com.allinone.callerid.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {
  private boolean n0 = true;
  
  public CustomViewPager(Context paramContext) {
    super(paramContext);
  }
  
  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  protected boolean W(View paramView) {
    return paramView instanceof android.widget.Switch;
  }
  
  protected boolean g(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    return (super.g(paramView, paramBoolean, paramInt1, paramInt2, paramInt3) || (paramBoolean && W(paramView)));
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    boolean bool;
    if (this.n0 && super.onInterceptTouchEvent(paramMotionEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    boolean bool;
    if (this.n0 && super.onTouchEvent(paramMotionEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void setScanScroll(boolean paramBoolean) {
    this.n0 = paramBoolean;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/main/CustomViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */