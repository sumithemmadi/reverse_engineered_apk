package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class z02 implements gu1 {
  private static final ThreadLocal<Cipher> a = new c12();
  
  private final SecretKey b;
  
  public z02(byte[] paramArrayOfbyte) {
    k22.a(paramArrayOfbyte.length);
    this.b = new SecretKeySpec(paramArrayOfbyte, "AES");
  }
  
  private static AlgorithmParameterSpec b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      Class.forName("javax.crypto.spec.GCMParameterSpec");
      return new GCMParameterSpec(128, paramArrayOfbyte, 0, paramInt2);
    } catch (ClassNotFoundException classNotFoundException) {
      if (l22.a())
        return new IvParameterSpec(paramArrayOfbyte, 0, paramInt2); 
      throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    } 
  }
  
  public final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1.length <= 2147483619) {
      byte[] arrayOfByte1 = new byte[paramArrayOfbyte1.length + 12 + 16];
      byte[] arrayOfByte2 = j22.c(12);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, 12);
      AlgorithmParameterSpec algorithmParameterSpec = b(arrayOfByte2, 0, arrayOfByte2.length);
      ThreadLocal<Cipher> threadLocal = a;
      ((Cipher)threadLocal.get()).init(1, this.b, algorithmParameterSpec);
      if (paramArrayOfbyte2 != null && paramArrayOfbyte2.length != 0)
        ((Cipher)threadLocal.get()).updateAAD(paramArrayOfbyte2); 
      int i = ((Cipher)threadLocal.get()).doFinal(paramArrayOfbyte1, 0, paramArrayOfbyte1.length, arrayOfByte1, 12);
      if (i == paramArrayOfbyte1.length + 16)
        return arrayOfByte1; 
      throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[] { Integer.valueOf(16), Integer.valueOf(i - paramArrayOfbyte1.length) }));
    } 
    throw new GeneralSecurityException("plaintext too long");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */