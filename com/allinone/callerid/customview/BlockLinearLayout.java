package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class BlockLinearLayout extends LinearLayout {
  private boolean b = false;
  
  public BlockLinearLayout(Context paramContext) {
    super(paramContext);
  }
  
  public BlockLinearLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public BlockLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return this.b;
  }
  
  public void setClick(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/BlockLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */