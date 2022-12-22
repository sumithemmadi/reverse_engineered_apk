package com.google.android.gms.internal.ads;

public final class l22 {
  public static boolean a() {
    boolean bool = false;
    try {
      Class.forName("android.app.Application", false, (ClassLoader)null);
      bool = true;
    } catch (Exception exception) {}
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */