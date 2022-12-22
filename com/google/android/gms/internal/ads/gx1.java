package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class gx1 extends nu1<nz1> {
  public gx1() {
    super(nz1.class, (pu1<?, nz1>[])new pu1[] { new jx1(uu1.class) });
  }
  
  public static void j(nz1 paramnz1) {
    k22.b(paramnz1.J(), 0);
    if (paramnz1.O().size() >= 16) {
      k(paramnz1.P());
      return;
    } 
    throw new GeneralSecurityException("key too short");
  }
  
  private static void k(tz1 paramtz1) {
    if (paramtz1.J() >= 10) {
      int i = lx1.a[paramtz1.K().ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            if (paramtz1.J() > 64)
              throw new GeneralSecurityException("tag size too big"); 
          } else {
            throw new GeneralSecurityException("unknown hash type");
          } 
        } else if (paramtz1.J() > 32) {
          throw new GeneralSecurityException("tag size too big");
        } 
      } else if (paramtz1.J() > 20) {
        throw new GeneralSecurityException("tag size too big");
      } 
      return;
    } 
    throw new GeneralSecurityException("tag size too small");
  }
  
  public final String a() {
    return "type.googleapis.com/google.crypto.tink.HmacKey";
  }
  
  public final zzegd.zza d() {
    return zzegd.zza.c;
  }
  
  public final ru1<rz1, nz1> g() {
    return new ix1(this, rz1.class);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */