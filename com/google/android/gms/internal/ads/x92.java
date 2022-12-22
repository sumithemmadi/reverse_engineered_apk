package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

final class x92 implements hd0 {
  private final FileChannel a;
  
  private final long b;
  
  private final long c;
  
  public x92(FileChannel paramFileChannel, long paramLong1, long paramLong2) {
    this.a = paramFileChannel;
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public final void a(MessageDigest[] paramArrayOfMessageDigest, long paramLong, int paramInt) {
    long l = this.b;
    MappedByteBuffer mappedByteBuffer = this.a.map(FileChannel.MapMode.READ_ONLY, l + paramLong, paramInt);
    mappedByteBuffer.load();
    int i = paramArrayOfMessageDigest.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      MessageDigest messageDigest = paramArrayOfMessageDigest[paramInt];
      mappedByteBuffer.position(0);
      messageDigest.update(mappedByteBuffer);
    } 
  }
  
  public final long size() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */