package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
public final class xu1 {
  @Deprecated
  public static final tu1 a(byte[] paramArrayOfbyte) {
    try {
      GeneralSecurityException generalSecurityException;
      c02 c02 = c02.N(paramArrayOfbyte, y32.b());
      for (c02.b b : c02.K()) {
        if (b.M().Q() != zzegd.zza.b && b.M().Q() != zzegd.zza.c && b.M().Q() != zzegd.zza.d)
          continue; 
        generalSecurityException = new GeneralSecurityException();
        this("keyset contains secret key material");
        throw generalSecurityException;
      } 
      return tu1.a((c02)generalSecurityException);
    } catch (zzelo zzelo) {
      GeneralSecurityException generalSecurityException = new GeneralSecurityException("invalid keyset");
      throw generalSecurityException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */