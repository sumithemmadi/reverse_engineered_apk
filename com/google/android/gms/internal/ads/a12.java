package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class a12 extends ThreadLocal<Cipher> {
  private static Cipher a() {
    try {
      return t12.c.a("AES/CTR/NOPADDING");
    } catch (GeneralSecurityException generalSecurityException) {
      throw new IllegalStateException(generalSecurityException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */