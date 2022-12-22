package com.allinone.callerid.util;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c0 {
  public static SpannableString a(Context paramContext, String paramString1, String paramString2) {
    SpannableString spannableString = new SpannableString(paramString1);
    if (paramString2 != null)
      try {
        if (!"".equals(paramString2)) {
          int i = d1.a(paramContext, 2130968859, 2131099706);
          Matcher matcher = Pattern.compile(paramString2.replaceAll("\\+", "")).matcher((CharSequence)spannableString);
          while (matcher.find()) {
            int j = matcher.start();
            int k = matcher.end();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan();
            this(i);
            spannableString.setSpan(foregroundColorSpan, j, k, 33);
          } 
          return spannableString;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return spannableString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */