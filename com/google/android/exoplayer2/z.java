package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.a0;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.q;

final class z implements q {
  private final a0 b;
  
  private final a c;
  
  private r0 d;
  
  private q e;
  
  private boolean f;
  
  private boolean g;
  
  public z(a parama, f paramf) {
    this.c = parama;
    this.b = new a0(paramf);
    this.f = true;
  }
  
  private boolean e(boolean paramBoolean) {
    r0 r01 = this.d;
    return (r01 == null || r01.o() || (!this.d.m() && (paramBoolean || this.d.s())));
  }
  
  private void i(boolean paramBoolean) {
    if (e(paramBoolean)) {
      this.f = true;
      if (this.g)
        this.b.b(); 
      return;
    } 
    long l = this.e.c();
    if (this.f) {
      if (l < this.b.c()) {
        this.b.d();
        return;
      } 
      this.f = false;
      if (this.g)
        this.b.b(); 
    } 
    this.b.a(l);
    l0 l0 = this.e.W();
    if (!l0.equals(this.b.W())) {
      this.b.d1(l0);
      this.c.onPlaybackParametersChanged(l0);
    } 
  }
  
  public l0 W() {
    l0 l0;
    q q1 = this.e;
    if (q1 != null) {
      l0 = q1.W();
    } else {
      l0 = this.b.W();
    } 
    return l0;
  }
  
  public void a(r0 paramr0) {
    if (paramr0 == this.d) {
      this.e = null;
      this.d = null;
      this.f = true;
    } 
  }
  
  public void b(r0 paramr0) {
    q q1 = paramr0.C();
    if (q1 != null) {
      q q2 = this.e;
      if (q1 != q2)
        if (q2 == null) {
          this.e = q1;
          this.d = paramr0;
          q1.d1(this.b.W());
        } else {
          throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }  
    } 
  }
  
  public long c() {
    long l;
    if (this.f) {
      l = this.b.c();
    } else {
      l = this.e.c();
    } 
    return l;
  }
  
  public void d(long paramLong) {
    this.b.a(paramLong);
  }
  
  public void d1(l0 paraml0) {
    q q1 = this.e;
    l0 l01 = paraml0;
    if (q1 != null) {
      q1.d1(paraml0);
      l01 = this.e.W();
    } 
    this.b.d1(l01);
  }
  
  public void f() {
    this.g = true;
    this.b.b();
  }
  
  public void g() {
    this.g = false;
    this.b.d();
  }
  
  public long h(boolean paramBoolean) {
    i(paramBoolean);
    return c();
  }
  
  public static interface a {
    void onPlaybackParametersChanged(l0 param1l0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */