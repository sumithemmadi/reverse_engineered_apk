package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public class MyGridView extends GridView {
  public MyGridView(Context paramContext) {
    super(paramContext);
  }
  
  public MyGridView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public MyGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, -2147483648));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/MyGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */