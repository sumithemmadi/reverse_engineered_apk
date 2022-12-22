package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.util.h0;

public class d implements t {
  private final long a;
  
  private final long b;
  
  private final int c;
  
  private final long d;
  
  private final int e;
  
  private final long f;
  
  public d(long paramLong1, long paramLong2, int paramInt1, int paramInt2) {
    this.a = paramLong1;
    this.b = paramLong2;
    int i = paramInt2;
    if (paramInt2 == -1)
      i = 1; 
    this.c = i;
    this.e = paramInt1;
    if (paramLong1 == -1L) {
      this.d = -1L;
      this.f = -9223372036854775807L;
    } else {
      this.d = paramLong1 - paramLong2;
      this.f = g(paramLong1, paramLong2, paramInt1);
    } 
  }
  
  private long a(long paramLong) {
    paramLong = paramLong * this.e / 8000000L;
    int i = this.c;
    paramLong = h0.o(paramLong / i * i, 0L, this.d - i);
    return this.b + paramLong;
  }
  
  private static long g(long paramLong1, long paramLong2, int paramInt) {
    return Math.max(0L, paramLong1 - paramLong2) * 8L * 1000000L / paramInt;
  }
  
  public boolean b() {
    boolean bool;
    if (this.d != -1L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public long c() {
    return this.f;
  }
  
  public long e(long paramLong) {
    return g(paramLong, this.b, this.e);
  }
  
  public t.a j(long paramLong) {
    if (this.d == -1L)
      return new t.a(new u(0L, this.b)); 
    long l1 = a(paramLong);
    long l2 = e(l1);
    u u = new u(l2, l1);
    if (l2 < paramLong) {
      int i = this.c;
      if (i + l1 < this.a) {
        paramLong = l1 + i;
        return new t.a(u, new u(e(paramLong), paramLong));
      } 
    } 
    return new t.a(u);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */