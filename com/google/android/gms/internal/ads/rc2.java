package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class rc2 {
  static Pair<ByteBuffer, Long> a(RandomAccessFile paramRandomAccessFile) {
    if (paramRandomAccessFile.length() < 22L)
      return null; 
    Pair<ByteBuffer, Long> pair = b(paramRandomAccessFile, 0);
    return (pair != null) ? pair : b(paramRandomAccessFile, 65535);
  }
  
  private static Pair<ByteBuffer, Long> b(RandomAccessFile paramRandomAccessFile, int paramInt) {
    if (paramInt >= 0 && paramInt <= 65535) {
      long l = paramRandomAccessFile.length();
      if (l < 22L)
        return null; 
      ByteBuffer byteBuffer2 = ByteBuffer.allocate((int)Math.min(paramInt, l - 22L) + 22);
      byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
      l -= byteBuffer2.capacity();
      paramRandomAccessFile.seek(l);
      paramRandomAccessFile.readFully(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.capacity());
      g(byteBuffer2);
      paramInt = byteBuffer2.capacity();
      if (paramInt >= 22) {
        int i = paramInt - 22;
        int j = Math.min(i, 65535);
        for (paramInt = 0; paramInt < j; paramInt++) {
          int k = i - paramInt;
          if (byteBuffer2.getInt(k) == 101010256 && (byteBuffer2.getShort(k + 20) & 0xFFFF) == paramInt) {
            paramInt = k;
            // Byte code: goto -> 175
          } 
        } 
      } 
      paramInt = -1;
      if (paramInt == -1)
        return null; 
      byteBuffer2.position(paramInt);
      ByteBuffer byteBuffer1 = byteBuffer2.slice();
      byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
      return Pair.create(byteBuffer1, Long.valueOf(l + paramInt));
    } 
    StringBuilder stringBuilder = new StringBuilder(27);
    stringBuilder.append("maxCommentSize: ");
    stringBuilder.append(paramInt);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public static void c(ByteBuffer paramByteBuffer, long paramLong) {
    g(paramByteBuffer);
    int i = paramByteBuffer.position();
    if (paramLong >= 0L && paramLong <= 4294967295L) {
      paramByteBuffer.putInt(paramByteBuffer.position() + i + 16, (int)paramLong);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder(47);
    stringBuilder.append("uint32 value of out range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static long d(ByteBuffer paramByteBuffer, int paramInt) {
    return paramByteBuffer.getInt(paramInt) & 0xFFFFFFFFL;
  }
  
  public static long e(ByteBuffer paramByteBuffer) {
    g(paramByteBuffer);
    return d(paramByteBuffer, paramByteBuffer.position() + 16);
  }
  
  public static long f(ByteBuffer paramByteBuffer) {
    g(paramByteBuffer);
    return d(paramByteBuffer, paramByteBuffer.position() + 12);
  }
  
  private static void g(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN)
      return; 
    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */