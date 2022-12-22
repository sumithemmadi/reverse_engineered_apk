package com.google.android.gms.internal.ads;

final class d12 extends g12 {
  d12(byte[] paramArrayOfbyte, int paramInt) {
    super(paramArrayOfbyte, paramInt);
  }
  
  final int[] f(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint.length == 3) {
      int[] arrayOfInt = new int[16];
      g12.e(arrayOfInt, this.b);
      arrayOfInt[12] = paramInt;
      System.arraycopy(paramArrayOfint, 0, arrayOfInt, 13, paramArrayOfint.length);
      return arrayOfInt;
    } 
    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(paramArrayOfint.length << 5) }));
  }
  
  final int g() {
    return 12;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */