package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class n22 extends g12 {
  n22(byte[] paramArrayOfbyte, int paramInt) {
    super(paramArrayOfbyte, paramInt);
  }
  
  final int[] f(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint.length == 6) {
      int[] arrayOfInt1 = new int[16];
      int[] arrayOfInt2 = this.b;
      int[] arrayOfInt3 = new int[16];
      g12.e(arrayOfInt3, arrayOfInt2);
      arrayOfInt3[12] = paramArrayOfint[0];
      arrayOfInt3[13] = paramArrayOfint[1];
      arrayOfInt3[14] = paramArrayOfint[2];
      arrayOfInt3[15] = paramArrayOfint[3];
      g12.h(arrayOfInt3);
      arrayOfInt3[4] = arrayOfInt3[12];
      arrayOfInt3[5] = arrayOfInt3[13];
      arrayOfInt3[6] = arrayOfInt3[14];
      arrayOfInt3[7] = arrayOfInt3[15];
      g12.e(arrayOfInt1, Arrays.copyOf(arrayOfInt3, 8));
      arrayOfInt1[12] = paramInt;
      arrayOfInt1[13] = 0;
      arrayOfInt1[14] = paramArrayOfint[4];
      arrayOfInt1[15] = paramArrayOfint[5];
      return arrayOfInt1;
    } 
    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(paramArrayOfint.length << 5) }));
  }
  
  final int g() {
    return 24;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */