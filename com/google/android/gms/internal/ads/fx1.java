package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class fx1 extends nu1<qx1> {
  fx1() {
    super(qx1.class, (pu1<?, qx1>[])new pu1[] { new ex1(uu1.class) });
  }
  
  private static void j(vx1 paramvx1) {
    if (paramvx1.J() >= 10) {
      if (paramvx1.J() <= 16)
        return; 
      throw new GeneralSecurityException("tag size too long");
    } 
    throw new GeneralSecurityException("tag size too short");
  }
  
  private static void l(int paramInt) {
    if (paramInt == 32)
      return; 
    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
  }
  
  public final String a() {
    return "type.googleapis.com/google.crypto.tink.AesCmacKey";
  }
  
  public final zzegd.zza d() {
    return zzegd.zza.c;
  }
  
  public final ru1<rx1, qx1> g() {
    return new hx1(this, rx1.class);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */