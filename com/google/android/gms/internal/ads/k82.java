package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class k82 extends i82 implements a50 {
  private int m;
  
  private int n;
  
  protected k82(String paramString) {
    super(paramString);
  }
  
  public final int f() {
    if (!this.e)
      b(); 
    return this.m;
  }
  
  protected final long g(ByteBuffer paramByteBuffer) {
    this.m = x10.a(paramByteBuffer.get());
    this.n = (x10.c(paramByteBuffer) << 8) + 0 + x10.a(paramByteBuffer.get());
    return 4L;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */