package com.google.android.gms.internal.ads;

public class qd {
  public static kd a(String paramString) {
    try {
      return new td(Class.forName(paramString, false, qd.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    } finally {
      paramString = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */