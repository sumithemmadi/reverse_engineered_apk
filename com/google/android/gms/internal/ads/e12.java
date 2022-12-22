package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class e12 {
  public static final void a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, ByteBuffer paramByteBuffer3, int paramInt) {
    if (paramInt >= 0 && paramByteBuffer2.remaining() >= paramInt && paramByteBuffer3.remaining() >= paramInt && paramByteBuffer1.remaining() >= paramInt) {
      for (byte b = 0; b < paramInt; b++)
        paramByteBuffer1.put((byte)(paramByteBuffer2.get() ^ paramByteBuffer3.get())); 
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    throw illegalArgumentException;
  }
  
  public static final byte[] b(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    if (paramInt3 >= 0 && paramArrayOfbyte1.length - paramInt3 >= paramInt1 && paramArrayOfbyte2.length - paramInt3 >= paramInt2) {
      byte[] arrayOfByte = new byte[paramInt3];
      for (byte b = 0; b < paramInt3; b++)
        arrayOfByte[b] = (byte)(byte)(paramArrayOfbyte1[b + paramInt1] ^ paramArrayOfbyte2[b + paramInt2]); 
      return arrayOfByte;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    throw illegalArgumentException;
  }
  
  public static byte[] c(byte[]... paramVarArgs) {
    int i = paramVarArgs.length;
    byte b = 0;
    int j = 0;
    while (b < i) {
      byte[] arrayOfByte1 = paramVarArgs[b];
      if (j <= Integer.MAX_VALUE - arrayOfByte1.length) {
        j += arrayOfByte1.length;
        b++;
        continue;
      } 
      throw new GeneralSecurityException("exceeded size limit");
    } 
    byte[] arrayOfByte = new byte[j];
    i = paramVarArgs.length;
    b = 0;
    j = 0;
    while (b < i) {
      byte[] arrayOfByte1 = paramVarArgs[b];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, j, arrayOfByte1.length);
      j += arrayOfByte1.length;
      b++;
    } 
    return arrayOfByte;
  }
  
  public static final byte[] d(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1.length == paramArrayOfbyte2.length)
      return b(paramArrayOfbyte1, 0, paramArrayOfbyte2, 0, paramArrayOfbyte1.length); 
    throw new IllegalArgumentException("The lengths of x and y should match.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */