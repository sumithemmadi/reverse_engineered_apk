package com.allinone.callerid.customview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class MyScrollViewDownList extends ScrollView {
  public MyScrollViewDownList(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  protected int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect) {
    return 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/MyScrollViewDownList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */