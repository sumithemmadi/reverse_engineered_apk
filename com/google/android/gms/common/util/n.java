package com.google.android.gms.common.util;

public class n {
  public static int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i = (paramInt2 & 0xFFFFFFFC) + paramInt1;
    while (paramInt1 < i) {
      int k = (paramArrayOfbyte[paramInt1] & 0xFF | (paramArrayOfbyte[paramInt1 + 1] & 0xFF) << 8 | (paramArrayOfbyte[paramInt1 + 2] & 0xFF) << 16 | paramArrayOfbyte[paramInt1 + 3] << 24) * -862048943;
      paramInt3 ^= (k << 15 | k >>> 17) * 461845907;
      paramInt3 = (paramInt3 >>> 19 | paramInt3 << 13) * 5 - 430675100;
      paramInt1 += 4;
    } 
    paramInt1 = 0;
    boolean bool = false;
    int j = paramInt2 & 0x3;
    if (j != 1) {
      paramInt1 = bool;
      if (j != 2) {
        if (j != 3) {
          paramInt1 = paramInt3 ^ paramInt2;
          paramInt1 = (paramInt1 ^ paramInt1 >>> 16) * -2048144789;
          paramInt1 = (paramInt1 ^ paramInt1 >>> 13) * -1028477387;
          return paramInt1 ^ paramInt1 >>> 16;
        } 
        paramInt1 = (paramArrayOfbyte[i + 2] & 0xFF) << 16;
      } 
      paramInt1 |= (paramArrayOfbyte[i + 1] & 0xFF) << 8;
    } 
    paramInt1 = (paramArrayOfbyte[i] & 0xFF | paramInt1) * -862048943;
    paramInt3 ^= (paramInt1 >>> 17 | paramInt1 << 15) * 461845907;
    paramInt1 = paramInt3 ^ paramInt2;
    paramInt1 = (paramInt1 ^ paramInt1 >>> 16) * -2048144789;
    paramInt1 = (paramInt1 ^ paramInt1 >>> 13) * -1028477387;
    return paramInt1 ^ paramInt1 >>> 16;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */