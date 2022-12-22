package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class MyListView extends ListView {
  public MyListView(Context paramContext) {
    super(paramContext);
  }
  
  public MyListView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public MyListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    try {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(536870911, -2147483648);
    } catch (Exception exception) {
      exception.printStackTrace();
      paramInt2 = 0;
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/MyListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */