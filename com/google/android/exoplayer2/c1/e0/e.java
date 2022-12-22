package com.google.android.exoplayer2.c1.e0;

import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.u;
import com.google.android.exoplayer2.util.h0;

final class e implements t {
  private final c a;
  
  private final int b;
  
  private final long c;
  
  private final long d;
  
  private final long e;
  
  public e(c paramc, int paramInt, long paramLong1, long paramLong2) {
    this.a = paramc;
    this.b = paramInt;
    this.c = paramLong1;
    paramLong1 = (paramLong2 - paramLong1) / paramc.e;
    this.d = paramLong1;
    this.e = a(paramLong1);
  }
  
  private long a(long paramLong) {
    return h0.l0(paramLong * this.b, 1000000L, this.a.c);
  }
  
  public boolean b() {
    return true;
  }
  
  public long c() {
    return this.e;
  }
  
  public t.a j(long paramLong) {
    long l1 = h0.o(this.a.c * paramLong / this.b * 1000000L, 0L, this.d - 1L);
    long l2 = this.c;
    long l3 = this.a.e;
    long l4 = a(l1);
    u u = new u(l4, l2 + l3 * l1);
    if (l4 >= paramLong || l1 == this.d - 1L)
      return new t.a(u); 
    paramLong = l1 + 1L;
    l1 = this.c;
    l3 = this.a.e;
    return new t.a(u, new u(a(paramLong), l1 + l3 * paramLong));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/e0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */