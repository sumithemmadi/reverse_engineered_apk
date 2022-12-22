package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class y02 implements gu1 {
  private static final ThreadLocal<Cipher> a = new x02();
  
  private static final ThreadLocal<Cipher> b = new a12();
  
  private final byte[] c;
  
  private final byte[] d;
  
  private final SecretKeySpec e;
  
  private final int f;
  
  public y02(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt == 12 || paramInt == 16) {
      this.f = paramInt;
      k22.a(paramArrayOfbyte.length);
      SecretKeySpec secretKeySpec = new SecretKeySpec(paramArrayOfbyte, "AES");
      this.e = secretKeySpec;
      Cipher cipher = a.get();
      cipher.init(1, secretKeySpec);
      byte[] arrayOfByte = d(cipher.doFinal(new byte[16]));
      this.c = arrayOfByte;
      this.d = d(arrayOfByte);
      return;
    } 
    throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
  }
  
  private final byte[] b(Cipher paramCipher, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    byte[] arrayOfByte1 = new byte[16];
    arrayOfByte1[15] = (byte)(byte)paramInt1;
    if (paramInt3 == 0)
      return paramCipher.doFinal(c(arrayOfByte1, this.c)); 
    arrayOfByte1 = paramCipher.doFinal(arrayOfByte1);
    boolean bool = false;
    for (paramInt1 = 0; paramInt3 - paramInt1 > 16; paramInt1 += 16) {
      for (byte b = 0; b < 16; b++)
        arrayOfByte1[b] = (byte)(byte)(arrayOfByte1[b] ^ paramArrayOfbyte[paramInt2 + paramInt1 + b]); 
      arrayOfByte1 = paramCipher.doFinal(arrayOfByte1);
    } 
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte, paramInt1 + paramInt2, paramInt2 + paramInt3);
    if (arrayOfByte2.length == 16) {
      paramArrayOfbyte = c(arrayOfByte2, this.c);
    } else {
      paramArrayOfbyte = Arrays.copyOf(this.d, 16);
      for (paramInt1 = bool; paramInt1 < arrayOfByte2.length; paramInt1++)
        paramArrayOfbyte[paramInt1] = (byte)(byte)(paramArrayOfbyte[paramInt1] ^ arrayOfByte2[paramInt1]); 
      paramArrayOfbyte[arrayOfByte2.length] = (byte)(byte)(paramArrayOfbyte[arrayOfByte2.length] ^ 0x80);
    } 
    return paramCipher.doFinal(c(arrayOfByte1, paramArrayOfbyte));
  }
  
  private static byte[] c(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = paramArrayOfbyte1.length;
    byte[] arrayOfByte = new byte[i];
    for (byte b = 0; b < i; b++)
      arrayOfByte[b] = (byte)(byte)(paramArrayOfbyte1[b] ^ paramArrayOfbyte2[b]); 
    return arrayOfByte;
  }
  
  private static byte[] d(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[16];
    boolean bool = false;
    int i;
    for (i = 0; i < 15; i = j) {
      byte b1 = paramArrayOfbyte[i];
      int j = i + 1;
      arrayOfByte[i] = (byte)(byte)(b1 << 1 ^ (paramArrayOfbyte[j] & 0xFF) >>> 7);
    } 
    byte b = paramArrayOfbyte[15];
    if ((paramArrayOfbyte[0] & 0x80) == 0) {
      i = bool;
    } else {
      i = 135;
    } 
    arrayOfByte[15] = (byte)(byte)(b << 1 ^ i);
    return arrayOfByte;
  }
  
  public final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = paramArrayOfbyte1.length;
    int j = this.f;
    if (i <= Integer.MAX_VALUE - j - 16) {
      byte[] arrayOfByte1 = new byte[paramArrayOfbyte1.length + j + 16];
      byte[] arrayOfByte2 = j22.c(j);
      j = this.f;
      i = 0;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, j);
      Cipher cipher1 = a.get();
      cipher1.init(1, this.e);
      arrayOfByte2 = b(cipher1, 0, arrayOfByte2, 0, arrayOfByte2.length);
      if (paramArrayOfbyte2 == null)
        paramArrayOfbyte2 = new byte[0]; 
      paramArrayOfbyte2 = b(cipher1, 1, paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
      Cipher cipher2 = b.get();
      cipher2.init(1, this.e, new IvParameterSpec(arrayOfByte2));
      cipher2.doFinal(paramArrayOfbyte1, 0, paramArrayOfbyte1.length, arrayOfByte1, this.f);
      byte[] arrayOfByte3 = b(cipher1, 2, arrayOfByte1, this.f, paramArrayOfbyte1.length);
      j = paramArrayOfbyte1.length;
      int k = this.f;
      while (i < 16) {
        arrayOfByte1[j + k + i] = (byte)(byte)(paramArrayOfbyte2[i] ^ arrayOfByte2[i] ^ arrayOfByte3[i]);
        i++;
      } 
      return arrayOfByte1;
    } 
    GeneralSecurityException generalSecurityException = new GeneralSecurityException("plaintext too long");
    throw generalSecurityException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */