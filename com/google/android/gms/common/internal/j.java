package com.google.android.gms.common.internal;

public final class j {
  private final String a;
  
  private final String b;
  
  public j(String paramString) {
    this(paramString, null);
  }
  
  public j(String paramString1, String paramString2) {
    boolean bool;
    t.k(paramString1, "log tag cannot be null");
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    t.c(bool, "tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) });
    this.a = paramString1;
    if (paramString2 == null || paramString2.length() <= 0) {
      this.b = null;
      return;
    } 
    this.b = paramString2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */