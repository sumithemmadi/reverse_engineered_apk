package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;

final class f0 {
  private final e0 a = new e0(0L);
  
  private final v b = new v();
  
  private boolean c;
  
  private boolean d;
  
  private boolean e;
  
  private long f = -9223372036854775807L;
  
  private long g = -9223372036854775807L;
  
  private long h = -9223372036854775807L;
  
  private int a(i parami) {
    this.b.J(h0.f);
    this.c = true;
    parami.h();
    return 0;
  }
  
  private int f(i parami, s params, int paramInt) {
    int j = (int)Math.min(112800L, parami.getLength());
    long l1 = parami.a();
    long l2 = 0L;
    if (l1 != l2) {
      params.a = l2;
      return 1;
    } 
    this.b.I(j);
    parami.h();
    parami.k(this.b.a, 0, j);
    this.f = g(this.b, paramInt);
    this.d = true;
    return 0;
  }
  
  private long g(v paramv, int paramInt) {
    int i = paramv.c();
    int j = paramv.d();
    while (i < j) {
      if (paramv.a[i] == 71) {
        long l = i0.b(paramv, i, paramInt);
        if (l != -9223372036854775807L)
          return l; 
      } 
      i++;
    } 
    return -9223372036854775807L;
  }
  
  private int h(i parami, s params, int paramInt) {
    long l = parami.getLength();
    int j = (int)Math.min(112800L, l);
    l -= j;
    if (parami.a() != l) {
      params.a = l;
      return 1;
    } 
    this.b.I(j);
    parami.h();
    parami.k(this.b.a, 0, j);
    this.g = i(this.b, paramInt);
    this.e = true;
    return 0;
  }
  
  private long i(v paramv, int paramInt) {
    int i = paramv.c();
    for (int j = paramv.d() - 1; j >= i; j--) {
      if (paramv.a[j] == 71) {
        long l = i0.b(paramv, j, paramInt);
        if (l != -9223372036854775807L)
          return l; 
      } 
    } 
    return -9223372036854775807L;
  }
  
  public long b() {
    return this.h;
  }
  
  public e0 c() {
    return this.a;
  }
  
  public boolean d() {
    return this.c;
  }
  
  public int e(i parami, s params, int paramInt) {
    if (paramInt <= 0)
      return a(parami); 
    if (!this.e)
      return h(parami, params, paramInt); 
    if (this.g == -9223372036854775807L)
      return a(parami); 
    if (!this.d)
      return f(parami, params, paramInt); 
    long l = this.f;
    if (l == -9223372036854775807L)
      return a(parami); 
    l = this.a.b(l);
    this.h = this.a.b(this.g) - l;
    return a(parami);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */