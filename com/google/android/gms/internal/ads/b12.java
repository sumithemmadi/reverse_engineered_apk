package com.google.android.gms.internal.ads;

final class b12 {
  static byte[] a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length == 16) {
      byte[] arrayOfByte = new byte[16];
      byte b;
      for (b = 0; b < 16; b++) {
        arrayOfByte[b] = (byte)(byte)(paramArrayOfbyte[b] << 1 & 0xFE);
        if (b < 15)
          arrayOfByte[b] = (byte)(byte)(arrayOfByte[b] | (byte)(paramArrayOfbyte[b + 1] >> 7 & 0x1)); 
      } 
      b = arrayOfByte[15];
      arrayOfByte[15] = (byte)(byte)((byte)(paramArrayOfbyte[0] >> 7 & 0x87) ^ b);
      return arrayOfByte;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("value must be a block.");
    throw illegalArgumentException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */