package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.trackselection.i;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.o;

final class h0 {
  public final u a;
  
  public final Object b;
  
  public final b0[] c;
  
  public boolean d;
  
  public boolean e;
  
  public i0 f;
  
  private final boolean[] g;
  
  private final t0[] h;
  
  private final h i;
  
  private final v j;
  
  private h0 k;
  
  private TrackGroupArray l;
  
  private i m;
  
  private long n;
  
  public h0(t0[] paramArrayOft0, long paramLong, h paramh, e parame, v paramv, i0 parami0, i parami) {
    this.h = paramArrayOft0;
    this.n = paramLong;
    this.i = paramh;
    this.j = paramv;
    v.a a = parami0.a;
    this.b = a.a;
    this.f = parami0;
    this.l = TrackGroupArray.b;
    this.m = parami;
    this.c = new b0[paramArrayOft0.length];
    this.g = new boolean[paramArrayOft0.length];
    this.a = e(a, paramv, parame, parami0.b, parami0.d);
  }
  
  private void c(b0[] paramArrayOfb0) {
    byte b = 0;
    while (true) {
      t0[] arrayOfT0 = this.h;
      if (b < arrayOfT0.length) {
        if (arrayOfT0[b].n() == 6 && this.m.c(b))
          paramArrayOfb0[b] = (b0)new r(); 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  private static u e(v.a parama, v paramv, e parame, long paramLong1, long paramLong2) {
    m m;
    u u2 = paramv.a(parama, parame, paramLong1);
    u u1 = u2;
    if (paramLong2 != -9223372036854775807L) {
      u1 = u2;
      if (paramLong2 != Long.MIN_VALUE)
        m = new m(u2, true, 0L, paramLong2); 
    } 
    return (u)m;
  }
  
  private void f() {
    if (!r())
      return; 
    byte b = 0;
    while (true) {
      i i1 = this.m;
      if (b < i1.a) {
        boolean bool = i1.c(b);
        f f = this.m.c.a(b);
        if (bool && f != null)
          f.p(); 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  private void g(b0[] paramArrayOfb0) {
    byte b = 0;
    while (true) {
      t0[] arrayOfT0 = this.h;
      if (b < arrayOfT0.length) {
        if (arrayOfT0[b].n() == 6)
          paramArrayOfb0[b] = null; 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  private void h() {
    if (!r())
      return; 
    byte b = 0;
    while (true) {
      i i1 = this.m;
      if (b < i1.a) {
        boolean bool = i1.c(b);
        f f = this.m.c.a(b);
        if (bool && f != null)
          f.e(); 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  private boolean r() {
    boolean bool;
    if (this.k == null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static void u(long paramLong, v paramv, u paramu) {
    if (paramLong != -9223372036854775807L && paramLong != Long.MIN_VALUE) {
      try {
        paramv.i(((m)paramu).b);
      } catch (RuntimeException runtimeException) {
        o.d("MediaPeriodHolder", "Period release failed.", runtimeException);
      } 
    } else {
      runtimeException.i(paramu);
    } 
  }
  
  public long a(i parami, long paramLong, boolean paramBoolean) {
    return b(parami, paramLong, paramBoolean, new boolean[this.h.length]);
  }
  
  public long b(i parami, long paramLong, boolean paramBoolean, boolean[] paramArrayOfboolean) {
    byte b = 0;
    while (true) {
      int j = parami.a;
      boolean bool = true;
      if (b < j) {
        boolean[] arrayOfBoolean = this.g;
        if (paramBoolean || !parami.b(this.m, b))
          bool = false; 
        arrayOfBoolean[b] = bool;
        b++;
        continue;
      } 
      g(this.c);
      f();
      this.m = parami;
      h();
      g g = parami.c;
      paramLong = this.a.w(g.b(), this.g, this.c, paramArrayOfboolean, paramLong);
      c(this.c);
      this.e = false;
      b = 0;
      while (true) {
        b0[] arrayOfB0 = this.c;
        if (b < arrayOfB0.length) {
          if (arrayOfB0[b] != null) {
            e.f(parami.c(b));
            if (this.h[b].n() != 6)
              this.e = true; 
          } else {
            if (g.a(b) == null) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            } 
            e.f(paramBoolean);
          } 
          b++;
          continue;
        } 
        return paramLong;
      } 
      break;
    } 
  }
  
  public void d(long paramLong) {
    e.f(r());
    paramLong = y(paramLong);
    this.a.t(paramLong);
  }
  
  public long i() {
    long l1;
    if (!this.d)
      return this.f.b; 
    if (this.e) {
      l1 = this.a.u();
    } else {
      l1 = Long.MIN_VALUE;
    } 
    long l2 = l1;
    if (l1 == Long.MIN_VALUE)
      l2 = this.f.e; 
    return l2;
  }
  
  public h0 j() {
    return this.k;
  }
  
  public long k() {
    long l;
    if (!this.d) {
      l = 0L;
    } else {
      l = this.a.s();
    } 
    return l;
  }
  
  public long l() {
    return this.n;
  }
  
  public long m() {
    return this.f.b + this.n;
  }
  
  public TrackGroupArray n() {
    return this.l;
  }
  
  public i o() {
    return this.m;
  }
  
  public void p(float paramFloat, y0 paramy0) {
    this.d = true;
    this.l = this.a.C();
    long l1 = a(v(paramFloat, paramy0), this.f.b, false);
    long l2 = this.n;
    i0 i01 = this.f;
    this.n = l2 + i01.b - l1;
    this.f = i01.b(l1);
  }
  
  public boolean q() {
    boolean bool;
    if (this.d && (!this.e || this.a.u() == Long.MIN_VALUE)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void s(long paramLong) {
    e.f(r());
    if (this.d)
      this.a.v(y(paramLong)); 
  }
  
  public void t() {
    f();
    u(this.f.d, this.j, this.a);
  }
  
  public i v(float paramFloat, y0 paramy0) {
    i i1 = this.i.d(this.h, n(), this.f.a, paramy0);
    for (f f : i1.c.b()) {
      if (f != null)
        f.k(paramFloat); 
    } 
    return i1;
  }
  
  public void w(h0 paramh0) {
    if (paramh0 == this.k)
      return; 
    f();
    this.k = paramh0;
    h();
  }
  
  public void x(long paramLong) {
    this.n = paramLong;
  }
  
  public long y(long paramLong) {
    return paramLong - l();
  }
  
  public long z(long paramLong) {
    return paramLong + l();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */