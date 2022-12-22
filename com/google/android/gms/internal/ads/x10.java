package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class x10 {
  public static int a(byte paramByte) {
    int i = paramByte;
    if (paramByte < 0)
      i = paramByte + 256; 
    return i;
  }
  
  public static long b(ByteBuffer paramByteBuffer) {
    long l1 = paramByteBuffer.getInt();
    long l2 = l1;
    if (l1 < 0L)
      l2 = l1 + 4294967296L; 
    return l2;
  }
  
  public static int c(ByteBuffer paramByteBuffer) {
    return (a(paramByteBuffer.get()) << 8) + 0 + a(paramByteBuffer.get());
  }
  
  public static long d(ByteBuffer paramByteBuffer) {
    long l = (b(paramByteBuffer) << 32L) + 0L;
    if (l >= 0L)
      return l + b(paramByteBuffer); 
    throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
  }
  
  public static double e(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    double d = (0x0 | arrayOfByte[0] << 24 & 0xFF000000 | arrayOfByte[1] << 16 & 0xFF0000 | arrayOfByte[2] << 8 & 0xFF00 | arrayOfByte[3] & 0xFF);
    Double.isNaN(d);
    return d / 65536.0D;
  }
  
  public static double f(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    double d = (0x0 | arrayOfByte[0] << 24 & 0xFF000000 | arrayOfByte[1] << 16 & 0xFF0000 | arrayOfByte[2] << 8 & 0xFF00 | arrayOfByte[3] & 0xFF);
    Double.isNaN(d);
    return d / 1.073741824E9D;
  }
  
  public static String g(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    try {
      return new String(arrayOfByte, "ISO-8859-1");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException(unsupportedEncodingException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */