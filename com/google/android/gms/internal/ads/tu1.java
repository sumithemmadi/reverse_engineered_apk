package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class tu1 {
  private final c02 a;
  
  private tu1(c02 paramc02) {
    this.a = paramc02;
  }
  
  static final tu1 a(c02 paramc02) {
    if (paramc02 != null && paramc02.L() > 0)
      return new tu1(paramc02); 
    throw new GeneralSecurityException("empty keyset");
  }
  
  final c02 b() {
    return this.a;
  }
  
  public final String toString() {
    return hv1.a(this.a).toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */