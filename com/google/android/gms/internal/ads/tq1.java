package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

final class tq1 {
  private static final Logger a = Logger.getLogger(tq1.class.getName());
  
  private static final uq1 b = (uq1)new a(null);
  
  static String a(String paramString) {
    String str = paramString;
    if (b(paramString))
      str = null; 
    return str;
  }
  
  static boolean b(String paramString) {
    return (paramString == null || paramString.isEmpty());
  }
  
  static String c(String paramString) {
    String str = paramString;
    if (paramString == null)
      str = ""; 
    return str;
  }
  
  private static final class a {
    private a() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */