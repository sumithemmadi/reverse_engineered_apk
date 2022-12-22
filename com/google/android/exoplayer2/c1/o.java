package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.l;

public final class o implements t {
  private final l a;
  
  private final long b;
  
  public o(l paraml, long paramLong) {
    this.a = paraml;
    this.b = paramLong;
  }
  
  private u a(long paramLong1, long paramLong2) {
    return new u(paramLong1 * 1000000L / this.a.e, this.b + paramLong2);
  }
  
  public boolean b() {
    return true;
  }
  
  public long c() {
    return this.a.h();
  }
  
  public t.a j(long paramLong) {
    long l3;
    e.e(this.a.k);
    l l1 = this.a;
    l.a a = l1.k;
    long[] arrayOfLong2 = a.a;
    long[] arrayOfLong1 = a.b;
    int i = h0.f(arrayOfLong2, l1.k(paramLong), true, false);
    long l2 = 0L;
    if (i == -1) {
      l3 = 0L;
    } else {
      l3 = arrayOfLong2[i];
    } 
    if (i != -1)
      l2 = arrayOfLong1[i]; 
    u u = a(l3, l2);
    return (u.b == paramLong || i == arrayOfLong2.length - 1) ? new t.a(u) : new t.a(u, a(arrayOfLong2[++i], arrayOfLong1[i]));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */