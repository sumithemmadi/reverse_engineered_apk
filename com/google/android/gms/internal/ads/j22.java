package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class j22 {
  private static final ThreadLocal<SecureRandom> a = new i22();
  
  private static SecureRandom a() {
    SecureRandom secureRandom = new SecureRandom();
    secureRandom.nextLong();
    return secureRandom;
  }
  
  public static byte[] c(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    ((SecureRandom)a.get()).nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */