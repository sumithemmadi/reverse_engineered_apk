package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

public final class k22 {
  private static final Pattern a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" }), 2);
  
  private static final Pattern b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" }), 2);
  
  public static void a(int paramInt) {
    if (paramInt == 16 || paramInt == 32)
      return; 
    throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt << 3) }));
  }
  
  public static void b(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 <= 0)
      return; 
    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0) }));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */