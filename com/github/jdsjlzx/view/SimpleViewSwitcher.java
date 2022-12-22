package com.github.jdsjlzx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class SimpleViewSwitcher extends ViewGroup {
  public SimpleViewSwitcher(Context paramContext) {
    super(paramContext);
  }
  
  public SimpleViewSwitcher(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SimpleViewSwitcher(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if (view.getVisibility() != 8)
        view.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2); 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i = getChildCount();
    byte b = 0;
    int j = 0;
    int k = 0;
    while (b < i) {
      View view = getChildAt(b);
      measureChild(view, paramInt1, paramInt2);
      view.getMeasuredWidth();
      j = view.getMeasuredWidth();
      k = view.getMeasuredHeight();
      b++;
    } 
    setMeasuredDimension(j, k);
  }
  
  public void setView(View paramView) {
    if (getChildCount() != 0)
      removeViewAt(0); 
    new LinearLayout.LayoutParams(64, 64);
    addView(paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/view/SimpleViewSwitcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */