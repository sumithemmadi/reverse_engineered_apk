package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class d41 implements hd0 {
  private final ByteBuffer a;
  
  public d41(ByteBuffer paramByteBuffer) {
    this.a = paramByteBuffer.slice();
  }
  
  public final void a(MessageDigest[] paramArrayOfMessageDigest, long paramLong, int paramInt) {
    ByteBuffer byteBuffer;
    MessageDigest messageDigest;
    synchronized (this.a) {
      ByteBuffer byteBuffer1 = this.a;
      int i = (int)paramLong;
      byteBuffer1.position(i);
      this.a.limit(i + paramInt);
      byteBuffer1 = this.a.slice();
      i = paramArrayOfMessageDigest.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        messageDigest = paramArrayOfMessageDigest[paramInt];
        byteBuffer1.position(0);
        messageDigest.update(byteBuffer1);
      } 
      return;
    } 
  }
  
  public final long size() {
    return this.a.capacity();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */