package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class w02 implements d22 {
  private static final ThreadLocal<Cipher> a = new v02();
  
  private final SecretKeySpec b;
  
  private final int c;
  
  private final int d;
  
  public w02(byte[] paramArrayOfbyte, int paramInt) {
    k22.a(paramArrayOfbyte.length);
    this.b = new SecretKeySpec(paramArrayOfbyte, "AES");
    int i = ((Cipher)a.get()).getBlockSize();
    this.d = i;
    if (paramInt >= 12 && paramInt <= i) {
      this.c = paramInt;
      return;
    } 
    throw new GeneralSecurityException("invalid IV size");
  }
  
  public final byte[] a(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    int j = this.c;
    if (i <= Integer.MAX_VALUE - j) {
      byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + j];
      byte[] arrayOfByte2 = j22.c(j);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, this.c);
      j = paramArrayOfbyte.length;
      i = this.c;
      Cipher cipher = a.get();
      byte[] arrayOfByte3 = new byte[this.d];
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, this.c);
      IvParameterSpec ivParameterSpec = new IvParameterSpec(arrayOfByte3);
      cipher.init(1, this.b, ivParameterSpec);
      if (cipher.doFinal(paramArrayOfbyte, 0, j, arrayOfByte1, i) == j)
        return arrayOfByte1; 
      throw new GeneralSecurityException("stored output's length does not match input's length");
    } 
    j = this.c;
    StringBuilder stringBuilder = new StringBuilder(43);
    stringBuilder.append("plaintext length can not exceed ");
    stringBuilder.append(Integer.MAX_VALUE - j);
    throw new GeneralSecurityException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */