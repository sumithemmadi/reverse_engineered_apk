package com.google.android.gms.internal.ads;

public final class i10 implements a92<String> {
  private final g10 a;
  
  private i10(g10 paramg10) {
    this.a = paramg10;
  }
  
  public static i10 a(g10 paramg10) {
    return new i10(paramg10);
  }
  
  public static String b(g10 paramg10) {
    return g92.<String>b(paramg10.d(), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */