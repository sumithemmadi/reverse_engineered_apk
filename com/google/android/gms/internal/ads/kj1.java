package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.d1;

public final class kj1 implements a92<d1> {
  private final hj1 a;
  
  private final m92<fl> b;
  
  private kj1(hj1 paramhj1, m92<fl> paramm92) {
    this.a = paramhj1;
    this.b = paramm92;
  }
  
  public static d1 a(hj1 paramhj1, fl paramfl) {
    return g92.<d1>b(paramfl.r(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static kj1 b(hj1 paramhj1, m92<fl> paramm92) {
    return new kj1(paramhj1, paramm92);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */