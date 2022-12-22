package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class i12 implements gu1 {
  private final g12 a;
  
  private final g12 b;
  
  public i12(byte[] paramArrayOfbyte) {
    this.a = b(paramArrayOfbyte, 1);
    this.b = b(paramArrayOfbyte, 0);
  }
  
  public byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1.length <= Integer.MAX_VALUE - this.a.g() - 16) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(paramArrayOfbyte1.length + this.a.g() + 16);
      if (byteBuffer.remaining() >= paramArrayOfbyte1.length + this.a.g() + 16) {
        int i = byteBuffer.position();
        this.a.c(byteBuffer, paramArrayOfbyte1);
        byteBuffer.position(i);
        byte[] arrayOfByte = new byte[this.a.g()];
        byteBuffer.get(arrayOfByte);
        byteBuffer.limit(byteBuffer.limit() - 16);
        paramArrayOfbyte1 = paramArrayOfbyte2;
        if (paramArrayOfbyte2 == null)
          paramArrayOfbyte1 = new byte[0]; 
        ByteBuffer byteBuffer1 = this.b.i(arrayOfByte, 0);
        paramArrayOfbyte2 = new byte[32];
        byteBuffer1.get(paramArrayOfbyte2);
        if (paramArrayOfbyte1.length % 16 == 0) {
          i = paramArrayOfbyte1.length;
        } else {
          i = paramArrayOfbyte1.length + 16 - paramArrayOfbyte1.length % 16;
        } 
        int j = byteBuffer.remaining();
        int k = j % 16;
        if (k == 0) {
          k = j;
        } else {
          k = j + 16 - k;
        } 
        k += i;
        byteBuffer1 = ByteBuffer.allocate(k + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer1.put(paramArrayOfbyte1);
        byteBuffer1.position(i);
        byteBuffer1.put(byteBuffer);
        byteBuffer1.position(k);
        byteBuffer1.putLong(paramArrayOfbyte1.length);
        byteBuffer1.putLong(j);
        paramArrayOfbyte1 = c22.b(paramArrayOfbyte2, byteBuffer1.array());
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(paramArrayOfbyte1);
        return byteBuffer.array();
      } 
      throw new IllegalArgumentException("Given ByteBuffer output is too small");
    } 
    throw new GeneralSecurityException("plaintext too long");
  }
  
  abstract g12 b(byte[] paramArrayOfbyte, int paramInt);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */