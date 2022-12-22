package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class MarqueeTextView extends AppCompatTextView {
  public MarqueeTextView(Context paramContext) {
    super(paramContext);
  }
  
  public MarqueeTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public MarqueeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean isFocused() {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/MarqueeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */