package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;

abstract class i {
  private final e a = new e();
  
  private v b;
  
  private j c;
  
  private g d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private int h;
  
  private int i;
  
  private b j;
  
  private long k;
  
  private boolean l;
  
  private boolean m;
  
  private int g(com.google.android.exoplayer2.c1.i parami) {
    boolean bool = true;
    while (bool) {
      if (!this.a.d(parami)) {
        this.h = 3;
        return -1;
      } 
      this.k = parami.a() - this.f;
      boolean bool1 = h(this.a.c(), this.f, this.j);
      bool = bool1;
      if (bool1) {
        this.f = parami.a();
        bool = bool1;
      } 
    } 
    Format format = this.j.a;
    this.i = format.x;
    if (!this.m) {
      this.b.d(format);
      this.m = true;
    } 
    g g1 = this.j.b;
    if (g1 != null) {
      this.d = g1;
    } else if (parami.getLength() == -1L) {
      this.d = new c(null);
    } else {
      f f = this.a.b();
      if ((f.b & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.d = new b(this, this.f, parami.getLength(), (f.h + f.i), f.c, bool);
    } 
    this.j = null;
    this.h = 2;
    this.a.f();
    return 0;
  }
  
  private int i(com.google.android.exoplayer2.c1.i parami, s params) {
    long l = this.d.b(parami);
    if (l >= 0L) {
      params.a = l;
      return 1;
    } 
    if (l < -1L)
      d(-(l + 2L)); 
    if (!this.l) {
      t t = this.d.a();
      this.c.a(t);
      this.l = true;
    } 
    if (this.k > 0L || this.a.d(parami)) {
      this.k = 0L;
      v v1 = this.a.c();
      l = e(v1);
      if (l >= 0L) {
        long l1 = this.g;
        if (l1 + l >= this.e) {
          l1 = a(l1);
          this.b.b(v1, v1.d());
          this.b.c(l1, 1, v1.d(), 0, null);
          this.e = -1L;
        } 
      } 
      this.g += l;
      return 0;
    } 
    this.h = 3;
    return -1;
  }
  
  protected long a(long paramLong) {
    return paramLong * 1000000L / this.i;
  }
  
  protected long b(long paramLong) {
    return this.i * paramLong / 1000000L;
  }
  
  void c(j paramj, v paramv) {
    this.c = paramj;
    this.b = paramv;
    j(true);
  }
  
  protected void d(long paramLong) {
    this.g = paramLong;
  }
  
  protected abstract long e(v paramv);
  
  final int f(com.google.android.exoplayer2.c1.i parami, s params) {
    int k = this.h;
    if (k != 0) {
      if (k != 1) {
        if (k == 2)
          return i(parami, params); 
        throw new IllegalStateException();
      } 
      parami.i((int)this.f);
      this.h = 2;
      return 0;
    } 
    return g(parami);
  }
  
  protected abstract boolean h(v paramv, long paramLong, b paramb);
  
  protected void j(boolean paramBoolean) {
    if (paramBoolean) {
      this.j = new b();
      this.f = 0L;
      this.h = 0;
    } else {
      this.h = 1;
    } 
    this.e = -1L;
    this.g = 0L;
  }
  
  final void k(long paramLong1, long paramLong2) {
    this.a.e();
    if (paramLong1 == 0L) {
      j(this.l ^ true);
    } else if (this.h != 0) {
      paramLong1 = b(paramLong2);
      this.e = paramLong1;
      this.d.c(paramLong1);
      this.h = 2;
    } 
  }
  
  static class b {
    Format a;
    
    g b;
  }
  
  private static final class c implements g {
    private c() {}
    
    public t a() {
      return (t)new t.b(-9223372036854775807L);
    }
    
    public long b(com.google.android.exoplayer2.c1.i param1i) {
      return -1L;
    }
    
    public void c(long param1Long) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */