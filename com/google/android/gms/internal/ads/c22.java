package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class c22 {
  private static void a(byte[] paramArrayOfbyte, long paramLong, int paramInt) {
    byte b = 0;
    while (b < 4) {
      paramArrayOfbyte[paramInt + b] = (byte)(byte)(int)(0xFFL & paramLong);
      b++;
      paramLong >>= 8L;
    } 
  }
  
  static byte[] b(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1.length == 32) {
      long l1 = d(paramArrayOfbyte1, 0, 0) & 0x3FFFFFFL;
      long l2 = d(paramArrayOfbyte1, 3, 2) & 0x3FFFF03L;
      long l3 = d(paramArrayOfbyte1, 6, 4) & 0x3FFC0FFL;
      long l4 = d(paramArrayOfbyte1, 9, 6) & 0x3F03FFFL;
      long l5 = d(paramArrayOfbyte1, 12, 8) & 0xFFFFFL;
      long l6 = l3 * 5L;
      long l7 = l4 * 5L;
      long l8 = l5 * 5L;
      byte[] arrayOfByte = new byte[17];
      long l9 = 0L;
      long l10 = 0L;
      long l11 = l10;
      long l12 = l11;
      long l13 = l12;
      byte b = 0;
      long l14 = l11;
      l11 = l9;
      while (b < paramArrayOfbyte2.length) {
        int i = Math.min(16, paramArrayOfbyte2.length - b);
        System.arraycopy(paramArrayOfbyte2, b, arrayOfByte, 0, i);
        arrayOfByte[i] = (byte)1;
        if (i != 16)
          Arrays.fill(arrayOfByte, i + 1, 17, (byte)0); 
        l13 += d(arrayOfByte, 0, 0);
        l11 += d(arrayOfByte, 3, 2);
        l9 = l10 + d(arrayOfByte, 6, 4);
        long l15 = l14 + d(arrayOfByte, 9, 6);
        long l16 = l12 + (d(arrayOfByte, 12, 8) | (arrayOfByte[16] << 24));
        long l17 = l13 * l1 + l11 * l8 + l9 * l7 + l15 * l6 + l16 * l2 * 5L;
        l10 = l13 * l2 + l11 * l1 + l9 * l8 + l15 * l7 + l16 * l6 + (l17 >> 26L);
        l14 = l13 * l3 + l11 * l2 + l9 * l1 + l15 * l8 + l16 * l7 + (l10 >> 26L);
        l12 = l13 * l4 + l11 * l3 + l9 * l2 + l15 * l1 + l16 * l8 + (l14 >> 26L);
        l9 = l13 * l5 + l11 * l4 + l9 * l3 + l15 * l2 + l16 * l1 + (l12 >> 26L);
        l13 = (l17 & 0x3FFFFFFL) + (l9 >> 26L) * 5L;
        l11 = (l10 & 0x3FFFFFFL) + (l13 >> 26L);
        b += 16;
        l10 = l14 & 0x3FFFFFFL;
        l14 = l12 & 0x3FFFFFFL;
        l12 = l9 & 0x3FFFFFFL;
        l13 &= 0x3FFFFFFL;
      } 
      l9 = l10 + (l11 >> 26L);
      l10 = l9 & 0x3FFFFFFL;
      l9 = l14 + (l9 >> 26L);
      l14 = l9 & 0x3FFFFFFL;
      l9 = l12 + (l9 >> 26L);
      l12 = l9 & 0x3FFFFFFL;
      l13 += (l9 >> 26L) * 5L;
      l7 = l13 & 0x3FFFFFFL;
      l2 = (l11 & 0x3FFFFFFL) + (l13 >> 26L);
      l1 = l7 + 5L;
      l6 = (l1 >> 26L) + l2;
      l3 = l10 + (l6 >> 26L);
      l8 = l14 + (l3 >> 26L);
      l9 = l12 + (l8 >> 26L) - 67108864L;
      l11 = l9 >> 63L;
      l13 = l11 ^ 0xFFFFFFFFFFFFFFFFL;
      l6 = l6 & 0x3FFFFFFL & l13 | l2 & l11;
      l10 = l3 & 0x3FFFFFFL & l13 | l10 & l11;
      l14 = l8 & 0x3FFFFFFL & l13 | l14 & l11;
      l7 = ((l6 << 26L | l7 & l11 | l1 & 0x3FFFFFFL & l13) & 0xFFFFFFFFL) + c(paramArrayOfbyte1, 16);
      l1 = ((l6 >> 6L | l10 << 20L) & 0xFFFFFFFFL) + c(paramArrayOfbyte1, 20) + (l7 >> 32L);
      l10 = ((l10 >> 12L | l14 << 14L) & 0xFFFFFFFFL) + c(paramArrayOfbyte1, 24) + (l1 >> 32L);
      l8 = c(paramArrayOfbyte1, 28);
      paramArrayOfbyte1 = new byte[16];
      a(paramArrayOfbyte1, l7 & 0xFFFFFFFFL, 0);
      a(paramArrayOfbyte1, l1 & 0xFFFFFFFFL, 4);
      a(paramArrayOfbyte1, l10 & 0xFFFFFFFFL, 8);
      a(paramArrayOfbyte1, ((l14 >> 18L | (l9 & l13 | l12 & l11) << 8L) & 0xFFFFFFFFL) + l8 + (l10 >> 32L) & 0xFFFFFFFFL, 12);
      return paramArrayOfbyte1;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The key length in bytes must be 32.");
    throw illegalArgumentException;
  }
  
  private static long c(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return ((paramArrayOfbyte[paramInt + 3] & 0xFF) << 24 | b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16) & 0xFFFFFFFFL;
  }
  
  private static long d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return c(paramArrayOfbyte, paramInt1) >> paramInt2 & 0x3FFFFFFL;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */