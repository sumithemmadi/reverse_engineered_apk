package com.google.android.exoplayer2.c1.z;

import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.m;
import com.google.android.exoplayer2.c1.n;
import com.google.android.exoplayer2.c1.o;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.l;
import com.google.android.exoplayer2.util.v;

public final class d implements h {
  public static final l a = a.a;
  
  private final byte[] b = new byte[42];
  
  private final v c = new v(new byte[32768], 0);
  
  private final boolean d;
  
  private final m.a e;
  
  private j f;
  
  private v g;
  
  private int h;
  
  private Metadata i;
  
  private l j;
  
  private int k;
  
  private int l;
  
  private c m;
  
  private int n;
  
  private long o;
  
  public d() {
    this(0);
  }
  
  public d(int paramInt) {
    boolean bool = true;
    if ((paramInt & 0x1) == 0)
      bool = false; 
    this.d = bool;
    this.e = new m.a();
    this.h = 0;
  }
  
  private long b(v paramv, boolean paramBoolean) {
    e.e(this.j);
    int i;
    for (i = paramv.c(); i <= paramv.d() - 16; i++) {
      paramv.M(i);
      if (m.d(paramv, this.j, this.l, this.e)) {
        paramv.M(i);
        return this.e.a;
      } 
    } 
    if (paramBoolean) {
      while (i <= paramv.d() - this.k) {
        paramv.M(i);
        boolean bool = false;
        try {
          paramBoolean = m.d(paramv, this.j, this.l, this.e);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          paramBoolean = false;
        } 
        if (paramv.c() > paramv.d())
          paramBoolean = bool; 
        if (paramBoolean) {
          paramv.M(i);
          return this.e.a;
        } 
        i++;
      } 
      paramv.M(paramv.d());
    } else {
      paramv.M(i);
    } 
    return -1L;
  }
  
  private void c(i parami) {
    this.l = n.b(parami);
    ((j)h0.g(this.f)).a(d(parami.a(), parami.getLength()));
    this.h = 5;
  }
  
  private t d(long paramLong1, long paramLong2) {
    c c1;
    e.e(this.j);
    l l1 = this.j;
    if (l1.k != null)
      return (t)new o(l1, paramLong1); 
    if (paramLong2 != -1L && l1.j > 0L) {
      c1 = new c(l1, this.l, paramLong1, paramLong2);
      this.m = c1;
      return c1.b();
    } 
    return (t)new t.b(c1.h());
  }
  
  private void f(i parami) {
    byte[] arrayOfByte = this.b;
    parami.k(arrayOfByte, 0, arrayOfByte.length);
    parami.h();
    this.h = 2;
  }
  
  private void k() {
    long l1 = this.o * 1000000L / ((l)h0.g(this.j)).e;
    ((v)h0.g(this.g)).c(l1, 1, this.n, 0, null);
  }
  
  private int l(i parami, s params) {
    boolean bool;
    e.e(this.g);
    e.e(this.j);
    c c1 = this.m;
    if (c1 != null && c1.d())
      return this.m.c(parami, params); 
    if (this.o == -1L) {
      this.o = m.i(parami, this.j);
      return 0;
    } 
    int k = this.c.d();
    if (k < 32768) {
      int i1 = parami.read(this.c.a, k, 32768 - k);
      if (i1 == -1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (!bool) {
        this.c.L(k + i1);
      } else if (this.c.a() == 0) {
        k();
        return -1;
      } 
    } else {
      bool = false;
    } 
    k = this.c.c();
    int n = this.n;
    int m = this.k;
    if (n < m) {
      v v1 = this.c;
      v1.N(Math.min(m - n, v1.a()));
    } 
    long l1 = b(this.c, bool);
    m = this.c.c() - k;
    this.c.M(k);
    this.g.b(this.c, m);
    this.n += m;
    if (l1 != -1L) {
      k();
      this.n = 0;
      this.o = l1;
    } 
    if (this.c.a() < 16) {
      v v2 = this.c;
      byte[] arrayOfByte = v2.a;
      k = v2.c();
      v2 = this.c;
      System.arraycopy(arrayOfByte, k, v2.a, 0, v2.a());
      v v1 = this.c;
      v1.I(v1.a());
    } 
    return 0;
  }
  
  private void m(i parami) {
    this.i = n.d(parami, this.d ^ true);
    this.h = 1;
  }
  
  private void n(i parami) {
    n.a a1 = new n.a(this.j);
    boolean bool = false;
    while (!bool) {
      bool = n.e(parami, a1);
      this.j = (l)h0.g(a1.a);
    } 
    e.e(this.j);
    this.k = Math.max(this.j.c, 6);
    ((v)h0.g(this.g)).d(this.j.i(this.b, this.i));
    this.h = 4;
  }
  
  private void o(i parami) {
    n.j(parami);
    this.h = 3;
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    n.c(parami, false);
    return n.a(parami);
  }
  
  public int g(i parami, s params) {
    int k = this.h;
    if (k != 0) {
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            if (k != 4) {
              if (k == 5)
                return l(parami, params); 
              throw new IllegalStateException();
            } 
            c(parami);
            return 0;
          } 
          n(parami);
          return 0;
        } 
        o(parami);
        return 0;
      } 
      f(parami);
      return 0;
    } 
    m(parami);
    return 0;
  }
  
  public void h(j paramj) {
    this.f = paramj;
    this.g = paramj.g(0, 1);
    paramj.f();
  }
  
  public void i(long paramLong1, long paramLong2) {
    long l1 = 0L;
    if (paramLong1 == 0L) {
      this.h = 0;
    } else {
      c c1 = this.m;
      if (c1 != null)
        c1.h(paramLong2); 
    } 
    if (paramLong2 == 0L) {
      paramLong1 = l1;
    } else {
      paramLong1 = -1L;
    } 
    this.o = paramLong1;
    this.n = 0;
    this.c.H();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/z/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */