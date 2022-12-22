package com.allinone.callerid.mvc.view.recorder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.widget.NestedScrollView;

public class MyNestedScrollView extends NestedScrollView {
  private int D;
  
  private int E;
  
  private int F;
  
  public MyNestedScrollView(Context paramContext) {
    super(paramContext);
    this.F = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public MyNestedScrollView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.F = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public MyNestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.F = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i == 2 && Math.abs((int)paramMotionEvent.getRawY() - this.E) > this.F)
        return true; 
    } else {
      this.D = (int)paramMotionEvent.getRawX();
      this.E = (int)paramMotionEvent.getRawY();
    } 
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/view/recorder/MyNestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */