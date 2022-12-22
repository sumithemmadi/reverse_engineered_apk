package com.google.android.gms.internal.ads;

final class z22 {
  static {
    if (c("org.robolectric.Robolectric") != null) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
  }
  
  static boolean a() {
    return (a != null && !b);
  }
  
  static Class<?> b() {
    return a;
  }
  
  private static <T> Class<T> c(String paramString) {
    try {
      return (Class)Class.forName(paramString);
    } finally {
      paramString = null;
    } 
  }
  
  static {
    boolean bool;
  }
  
  private static final Class<?> a = c("libcore.io.Memory");
  
  private static final boolean b;
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */