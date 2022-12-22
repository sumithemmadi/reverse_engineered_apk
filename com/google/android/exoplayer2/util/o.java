package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.util.Log;

public final class o {
  private static int a = 0;
  
  private static boolean b = true;
  
  private static String a(String paramString, Throwable paramThrowable) {
    if (paramThrowable == null)
      return paramString; 
    String str = paramThrowable.getMessage();
    if (!TextUtils.isEmpty(str)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(" - ");
      stringBuilder.append(str);
      paramString = stringBuilder.toString();
    } 
    return paramString;
  }
  
  public static void b(String paramString1, String paramString2) {
    if (a == 0)
      Log.d(paramString1, paramString2); 
  }
  
  public static void c(String paramString1, String paramString2) {
    if (a <= 3)
      Log.e(paramString1, paramString2); 
  }
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable) {
    if (!b) {
      c(paramString1, a(paramString2, paramThrowable));
    } else if (a <= 3) {
      Log.e(paramString1, paramString2, paramThrowable);
    } 
  }
  
  public static void e(String paramString1, String paramString2) {
    if (a <= 1)
      Log.i(paramString1, paramString2); 
  }
  
  public static void f(String paramString1, String paramString2) {
    if (a <= 2)
      Log.w(paramString1, paramString2); 
  }
  
  public static void g(String paramString1, String paramString2, Throwable paramThrowable) {
    if (!b) {
      f(paramString1, a(paramString2, paramThrowable));
    } else if (a <= 2) {
      Log.w(paramString1, paramString2, paramThrowable);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */