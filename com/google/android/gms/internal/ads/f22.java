package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class f22 implements ox1 {
  private final SecretKey a;
  
  private byte[] b;
  
  private byte[] c;
  
  public f22(byte[] paramArrayOfbyte) {
    k22.a(paramArrayOfbyte.length);
    SecretKeySpec secretKeySpec = new SecretKeySpec(paramArrayOfbyte, "AES");
    this.a = secretKeySpec;
    Cipher cipher = b();
    cipher.init(1, secretKeySpec);
    byte[] arrayOfByte = b12.a(cipher.doFinal(new byte[16]));
    this.b = arrayOfByte;
    this.c = b12.a(arrayOfByte);
  }
  
  private static Cipher b() {
    return t12.c.a("AES/ECB/NoPadding");
  }
  
  public final byte[] a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt <= 16) {
      byte[] arrayOfByte1;
      Cipher cipher = b();
      cipher.init(1, this.a);
      double d = paramArrayOfbyte.length;
      Double.isNaN(d);
      int i = Math.max(1, (int)Math.ceil(d / 16.0D));
      if (i << 4 == paramArrayOfbyte.length) {
        arrayOfByte1 = e12.b(paramArrayOfbyte, i - 1 << 4, this.b, 0, 16);
      } else {
        arrayOfByte1 = Arrays.copyOfRange(paramArrayOfbyte, i - 1 << 4, paramArrayOfbyte.length);
        if (arrayOfByte1.length < 16) {
          byte[] arrayOfByte = Arrays.copyOf(arrayOfByte1, 16);
          arrayOfByte[arrayOfByte1.length] = (byte)Byte.MIN_VALUE;
          arrayOfByte1 = e12.d(arrayOfByte, this.c);
        } else {
          throw new IllegalArgumentException("x must be smaller than a block.");
        } 
      } 
      byte[] arrayOfByte2 = new byte[16];
      for (byte b = 0; b < i - 1; b++)
        arrayOfByte2 = cipher.doFinal(e12.b(arrayOfByte2, 0, paramArrayOfbyte, b << 4, 16)); 
      return Arrays.copyOf(cipher.doFinal(e12.d(arrayOfByte1, arrayOfByte2)), paramInt);
    } 
    InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    throw invalidAlgorithmParameterException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */