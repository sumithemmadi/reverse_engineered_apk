package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.util.v;

public final class i0 {
  public static int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    while (paramInt1 < paramInt2 && paramArrayOfbyte[paramInt1] != 71)
      paramInt1++; 
    return paramInt1;
  }
  
  public static long b(v paramv, int paramInt1, int paramInt2) {
    paramv.M(paramInt1);
    if (paramv.a() < 5)
      return -9223372036854775807L; 
    paramInt1 = paramv.k();
    if ((0x800000 & paramInt1) != 0)
      return -9223372036854775807L; 
    if ((0x1FFF00 & paramInt1) >> 8 != paramInt2)
      return -9223372036854775807L; 
    paramInt2 = 1;
    if ((paramInt1 & 0x20) != 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (paramInt1 == 0)
      return -9223372036854775807L; 
    if (paramv.z() >= 7 && paramv.a() >= 7) {
      if ((paramv.z() & 0x10) == 16) {
        paramInt1 = paramInt2;
      } else {
        paramInt1 = 0;
      } 
      if (paramInt1 != 0) {
        byte[] arrayOfByte = new byte[6];
        paramv.h(arrayOfByte, 0, 6);
        return c(arrayOfByte);
      } 
    } 
    return -9223372036854775807L;
  }
  
  private static long c(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte[0] & 0xFFL) << 25L | (paramArrayOfbyte[1] & 0xFFL) << 17L | (paramArrayOfbyte[2] & 0xFFL) << 9L | (paramArrayOfbyte[3] & 0xFFL) << 1L | (0xFFL & paramArrayOfbyte[4]) >> 7L;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */