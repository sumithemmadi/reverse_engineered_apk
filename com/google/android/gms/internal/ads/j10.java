package com.google.android.gms.internal.ads;

public final class j10 implements a92<nh1> {
  private final g10 a;
  
  private j10(g10 paramg10) {
    this.a = paramg10;
  }
  
  public static j10 a(g10 paramg10) {
    return new j10(paramg10);
  }
  
  public static nh1 b(g10 paramg10) {
    return g92.<nh1>b(paramg10.b(), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */