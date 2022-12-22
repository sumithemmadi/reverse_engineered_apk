package com.google.android.gms.internal.ads;

import android.util.Log;

public class cm {
  public static boolean a(int paramInt) {
    return (paramInt >= 5 || Log.isLoggable("Ads", paramInt));
  }
  
  public static void b(String paramString, Throwable paramThrowable) {
    if (a(3))
      Log.d("Ads", paramString, paramThrowable); 
  }
  
  public static void c(String paramString, Throwable paramThrowable) {
    if (a(6))
      Log.e("Ads", paramString, paramThrowable); 
  }
  
  public static void d(String paramString, Throwable paramThrowable) {
    if (a(5))
      Log.w("Ads", paramString, paramThrowable); 
  }
  
  public static void e(String paramString) {
    if (a(3))
      Log.d("Ads", paramString); 
  }
  
  public static void f(String paramString, Throwable paramThrowable) {
    if (a(5)) {
      if (paramThrowable != null) {
        d(j(paramString), paramThrowable);
        return;
      } 
      i(j(paramString));
    } 
  }
  
  public static void g(String paramString) {
    if (a(6))
      Log.e("Ads", paramString); 
  }
  
  public static void h(String paramString) {
    if (a(4))
      Log.i("Ads", paramString); 
  }
  
  public static void i(String paramString) {
    if (a(5))
      Log.w("Ads", paramString); 
  }
  
  private static String j(String paramString) {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    String str = paramString;
    if (arrayOfStackTraceElement.length >= 4) {
      int i = arrayOfStackTraceElement[3].getLineNumber();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 13);
      stringBuilder.append(paramString);
      stringBuilder.append(" @");
      stringBuilder.append(i);
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  public static void k(String paramString) {
    f(paramString, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */