package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class mp implements l82 {
  private final ByteBuffer b;
  
  mp(ByteBuffer paramByteBuffer) {
    this.b = paramByteBuffer.duplicate();
  }
  
  public final void D(long paramLong) {
    this.b.position((int)paramLong);
  }
  
  public final long K() {
    return this.b.position();
  }
  
  public final ByteBuffer P(long paramLong1, long paramLong2) {
    int i = this.b.position();
    this.b.position((int)paramLong1);
    ByteBuffer byteBuffer = this.b.slice();
    byteBuffer.limit((int)paramLong2);
    this.b.position(i);
    return byteBuffer;
  }
  
  public final void close() {}
  
  public final int read(ByteBuffer paramByteBuffer) {
    if (this.b.remaining() == 0 && paramByteBuffer.remaining() > 0)
      return -1; 
    int i = Math.min(paramByteBuffer.remaining(), this.b.remaining());
    byte[] arrayOfByte = new byte[i];
    this.b.get(arrayOfByte);
    paramByteBuffer.put(arrayOfByte);
    return i;
  }
  
  public final long size() {
    return this.b.limit();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */