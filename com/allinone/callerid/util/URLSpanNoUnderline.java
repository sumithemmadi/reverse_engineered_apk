package com.allinone.callerid.util;

import android.text.TextPaint;
import android.text.style.URLSpan;

public class URLSpanNoUnderline extends URLSpan {
  public URLSpanNoUnderline(String paramString) {
    super(paramString);
  }
  
  public void updateDrawState(TextPaint paramTextPaint) {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/URLSpanNoUnderline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */