package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class g12 implements d22 {
  private static final int[] a = j(new byte[] { 
        101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 
        98, 121, 116, 101, 32, 107 });
  
  int[] b;
  
  private final int c;
  
  g12(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length == 32) {
      this.b = j(paramArrayOfbyte);
      this.c = paramInt;
      return;
    } 
    throw new InvalidKeyException("The key length in bytes must be 32.");
  }
  
  private static int b(int paramInt1, int paramInt2) {
    return paramInt1 >>> -paramInt2 | paramInt1 << paramInt2;
  }
  
  private static void d(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramArrayOfint[paramInt1] = paramArrayOfint[paramInt1] + paramArrayOfint[paramInt2];
    paramArrayOfint[paramInt4] = b(paramArrayOfint[paramInt4] ^ paramArrayOfint[paramInt1], 16);
    paramArrayOfint[paramInt3] = paramArrayOfint[paramInt3] + paramArrayOfint[paramInt4];
    paramArrayOfint[paramInt2] = b(paramArrayOfint[paramInt2] ^ paramArrayOfint[paramInt3], 12);
    paramArrayOfint[paramInt1] = paramArrayOfint[paramInt1] + paramArrayOfint[paramInt2];
    int i = paramArrayOfint[paramInt4];
    paramArrayOfint[paramInt4] = b(paramArrayOfint[paramInt1] ^ i, 8);
    paramArrayOfint[paramInt3] = paramArrayOfint[paramInt3] + paramArrayOfint[paramInt4];
    paramArrayOfint[paramInt2] = b(paramArrayOfint[paramInt2] ^ paramArrayOfint[paramInt3], 7);
  }
  
  static void e(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int[] arrayOfInt = a;
    System.arraycopy(arrayOfInt, 0, paramArrayOfint1, 0, arrayOfInt.length);
    System.arraycopy(paramArrayOfint2, 0, paramArrayOfint1, arrayOfInt.length, 8);
  }
  
  static void h(int[] paramArrayOfint) {
    for (byte b = 0; b < 10; b++) {
      d(paramArrayOfint, 0, 4, 8, 12);
      d(paramArrayOfint, 1, 5, 9, 13);
      d(paramArrayOfint, 2, 6, 10, 14);
      d(paramArrayOfint, 3, 7, 11, 15);
      d(paramArrayOfint, 0, 5, 10, 15);
      d(paramArrayOfint, 1, 6, 11, 12);
      d(paramArrayOfint, 2, 7, 8, 13);
      d(paramArrayOfint, 3, 4, 9, 14);
    } 
  }
  
  private static int[] j(byte[] paramArrayOfbyte) {
    IntBuffer intBuffer = ByteBuffer.wrap(paramArrayOfbyte).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
    int[] arrayOfInt = new int[intBuffer.remaining()];
    intBuffer.get(arrayOfInt);
    return arrayOfInt;
  }
  
  public final byte[] a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length <= Integer.MAX_VALUE - g()) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(g() + paramArrayOfbyte.length);
      c(byteBuffer, paramArrayOfbyte);
      return byteBuffer.array();
    } 
    throw new GeneralSecurityException("plaintext too long");
  }
  
  final void c(ByteBuffer paramByteBuffer, byte[] paramArrayOfbyte) {
    if (paramByteBuffer.remaining() - g() >= paramArrayOfbyte.length) {
      byte[] arrayOfByte = j22.c(g());
      paramByteBuffer.put(arrayOfByte);
      ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
      int i = byteBuffer.remaining();
      int j = i / 64 + 1;
      for (byte b = 0; b < j; b++) {
        ByteBuffer byteBuffer1 = i(arrayOfByte, this.c + b);
        if (b == j - 1) {
          e12.a(paramByteBuffer, byteBuffer, byteBuffer1, i % 64);
        } else {
          e12.a(paramByteBuffer, byteBuffer, byteBuffer1, 64);
        } 
      } 
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given ByteBuffer output is too small");
    throw illegalArgumentException;
  }
  
  abstract int[] f(int[] paramArrayOfint, int paramInt);
  
  abstract int g();
  
  final ByteBuffer i(byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt1 = f(j(paramArrayOfbyte), paramInt);
    int[] arrayOfInt2 = (int[])arrayOfInt1.clone();
    h(arrayOfInt2);
    for (paramInt = 0; paramInt < arrayOfInt1.length; paramInt++)
      arrayOfInt1[paramInt] = arrayOfInt1[paramInt] + arrayOfInt2[paramInt]; 
    ByteBuffer byteBuffer = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
    byteBuffer.asIntBuffer().put(arrayOfInt1, 0, 16);
    return byteBuffer;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */