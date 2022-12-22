package com.google.android.gms.internal.ads;

public final class il0 implements a92<String> {
  private final m92<gi1> a;
  
  public il0(m92<gi1> paramm92) {
    this.a = paramm92;
  }
  
  public static String a(gi1 paramgi1) {
    String str;
    if (paramgi1.o.a == yh1.c) {
      str = "rewarded_interstitial";
    } else {
      str = "rewarded";
    } 
    return g92.<String>b(str, "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/il0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */