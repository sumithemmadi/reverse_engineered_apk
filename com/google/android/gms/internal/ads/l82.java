package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface l82 extends Closeable {
  void D(long paramLong);
  
  long K();
  
  ByteBuffer P(long paramLong1, long paramLong2);
  
  void close();
  
  int read(ByteBuffer paramByteBuffer);
  
  long size();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */