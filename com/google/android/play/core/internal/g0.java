package com.google.android.play.core.internal;

import java.io.InputStream;

public final class g0 extends f0 {
  private final f0 b;
  
  private final long c;
  
  private final long d;
  
  public g0(f0 paramf0, long paramLong1, long paramLong2) {
    this.b = paramf0;
    paramLong1 = e(paramLong1);
    this.c = paramLong1;
    this.d = e(paramLong1 + paramLong2);
  }
  
  private final long e(long paramLong) {
    if (paramLong < 0L)
      return 0L; 
    long l = paramLong;
    if (paramLong > this.b.b())
      l = this.b.b(); 
    return l;
  }
  
  public final long b() {
    return this.d - this.c;
  }
  
  protected final InputStream c(long paramLong1, long paramLong2) {
    paramLong1 = e(this.c);
    paramLong2 = e(paramLong2 + paramLong1);
    return this.b.c(paramLong1, paramLong2 - paramLong1);
  }
  
  public final void close() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */