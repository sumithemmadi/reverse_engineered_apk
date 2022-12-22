package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public class h82 extends j82 implements a50 {
  private z30 k;
  
  private String l;
  
  private boolean m;
  
  private long n;
  
  public h82(String paramString) {
    this.l = paramString;
  }
  
  public final void c(l82 paraml82, ByteBuffer paramByteBuffer, long paramLong, wz paramwz) {
    boolean bool;
    this.n = paraml82.K() - paramByteBuffer.remaining();
    if (paramByteBuffer.remaining() == 16) {
      bool = true;
    } else {
      bool = false;
    } 
    this.m = bool;
    super.e(paraml82, paramLong, paramwz);
  }
  
  public final void d(z30 paramz30) {
    this.k = paramz30;
  }
  
  public final void e(l82 paraml82, long paramLong, wz paramwz) {
    byte b;
    this.e = paraml82;
    long l = paraml82.K();
    this.g = l;
    if (this.m || 8L + paramLong >= 4294967296L) {
      b = 16;
    } else {
      b = 8;
    } 
    this.h = l - b;
    paraml82.D(paraml82.K() + paramLong);
    this.i = paraml82.K();
    this.d = paramwz;
  }
  
  public final String l() {
    return this.l;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */