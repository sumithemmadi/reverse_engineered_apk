package com.google.android.datatransport.h.v;

import android.util.Log;

public final class a {
  public static void a(String paramString1, String paramString2, Object paramObject) {
    Log.d(d(paramString1), String.format(paramString2, new Object[] { paramObject }));
  }
  
  public static void b(String paramString1, String paramString2, Object... paramVarArgs) {
    Log.d(d(paramString1), String.format(paramString2, paramVarArgs));
  }
  
  public static void c(String paramString1, String paramString2, Throwable paramThrowable) {
    Log.e(d(paramString1), paramString2, paramThrowable);
  }
  
  private static String d(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TransportRuntime.");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  public static void e(String paramString1, String paramString2) {
    Log.i(d(paramString1), paramString2);
  }
  
  public static void f(String paramString1, String paramString2, Object paramObject) {
    Log.w(d(paramString1), String.format(paramString2, new Object[] { paramObject }));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/v/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */