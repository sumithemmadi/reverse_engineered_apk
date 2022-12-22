package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l {
  private static final Pattern a = Pattern.compile("\\\\.");
  
  private static final Pattern b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  
  public static String a(String paramString) {
    String str = paramString;
    if (!TextUtils.isEmpty(paramString)) {
      StringBuffer stringBuffer;
      Matcher matcher = b.matcher(paramString);
      String str1 = null;
      while (matcher.find()) {
        StringBuffer stringBuffer1;
        str = str1;
        if (str1 == null)
          stringBuffer1 = new StringBuffer(); 
        char c = matcher.group().charAt(0);
        if (c != '\f') {
          if (c != '\r') {
            if (c != '"') {
              if (c != '/') {
                if (c != '\\') {
                  switch (c) {
                    default:
                      stringBuffer6 = stringBuffer1;
                      continue;
                    case '\n':
                      matcher.appendReplacement(stringBuffer1, "\\\\n");
                      stringBuffer6 = stringBuffer1;
                      continue;
                    case '\t':
                      matcher.appendReplacement(stringBuffer1, "\\\\t");
                      stringBuffer6 = stringBuffer1;
                      continue;
                    case '\b':
                      break;
                  } 
                  matcher.appendReplacement(stringBuffer1, "\\\\b");
                  StringBuffer stringBuffer6 = stringBuffer1;
                  continue;
                } 
                matcher.appendReplacement(stringBuffer1, "\\\\\\\\");
                StringBuffer stringBuffer5 = stringBuffer1;
                continue;
              } 
              matcher.appendReplacement(stringBuffer1, "\\\\/");
              StringBuffer stringBuffer4 = stringBuffer1;
              continue;
            } 
            matcher.appendReplacement(stringBuffer1, "\\\\\\\"");
            StringBuffer stringBuffer3 = stringBuffer1;
            continue;
          } 
          matcher.appendReplacement(stringBuffer1, "\\\\r");
          StringBuffer stringBuffer2 = stringBuffer1;
          continue;
        } 
        matcher.appendReplacement(stringBuffer1, "\\\\f");
        stringBuffer = stringBuffer1;
      } 
      if (stringBuffer == null)
        return paramString; 
      matcher.appendTail(stringBuffer);
      str = stringBuffer.toString();
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */