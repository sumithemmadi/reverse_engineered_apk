package com.google.android.exoplayer2.text.s;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h {
  private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");
  
  public static Matcher a(v paramv) {
    label15: while (true) {
      String str = paramv.m();
      if (str != null) {
        if (a.matcher(str).matches()) {
          while (true) {
            str = paramv.m();
            if (str != null) {
              if (!str.isEmpty())
                continue; 
              continue label15;
            } 
            continue label15;
          } 
          break;
        } 
        Matcher matcher = f.a.matcher(str);
        if (matcher.matches())
          return matcher; 
        continue;
      } 
      return null;
    } 
  }
  
  public static boolean b(v paramv) {
    boolean bool;
    String str = paramv.m();
    if (str != null && str.startsWith("WEBVTT")) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static float c(String paramString) {
    if (paramString.endsWith("%"))
      return Float.parseFloat(paramString.substring(0, paramString.length() - 1)) / 100.0F; 
    throw new NumberFormatException("Percentages must end with %");
  }
  
  public static long d(String paramString) {
    String[] arrayOfString1 = h0.o0(paramString, "\\.");
    byte b = 0;
    String[] arrayOfString2 = h0.n0(arrayOfString1[0], ":");
    int i = arrayOfString2.length;
    long l1 = 0L;
    while (b < i) {
      l1 = l1 * 60L + Long.parseLong(arrayOfString2[b]);
      b++;
    } 
    long l2 = l1 * 1000L;
    l1 = l2;
    if (arrayOfString1.length == 2)
      l1 = l2 + Long.parseLong(arrayOfString1[1]); 
    return l1 * 1000L;
  }
  
  public static void e(v paramv) {
    int i = paramv.c();
    if (b(paramv))
      return; 
    paramv.M(i);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Expected WEBVTT. Got ");
    stringBuilder.append(paramv.m());
    throw new ParserException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */