package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class nv1 extends nu1<ay1> {
  nv1() {
    super(ay1.class, (pu1<?, ay1>[])new pu1[] { new qv1(d22.class) });
  }
  
  public static void k(ay1 paramay1) {
    k22.b(paramay1.J(), 0);
    k22.a(paramay1.P().size());
    l(paramay1.Q());
  }
  
  private static void l(ey1 paramey1) {
    if (paramey1.J() >= 12 && paramey1.J() <= 16)
      return; 
    throw new GeneralSecurityException("invalid IV size");
  }
  
  public final String a() {
    return "type.googleapis.com/google.crypto.tink.AesCtrKey";
  }
  
  public final zzegd.zza d() {
    return zzegd.zza.c;
  }
  
  public final ru1<dy1, ay1> g() {
    return new pv1(this, dy1.class);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */