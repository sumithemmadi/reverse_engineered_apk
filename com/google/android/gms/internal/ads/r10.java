package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class r10<T> {
  private final cr0 a;
  
  private final gi1 b;
  
  private final am1 c;
  
  private final zv d;
  
  private final yy0<T> e;
  
  private final y80 f;
  
  private final ci1 g;
  
  private final zr0 h;
  
  private final t30 i;
  
  private final Executor j;
  
  private final vr0 k;
  
  private final nv0 l;
  
  r10(cr0 paramcr0, gi1 paramgi1, am1 paramam1, zv paramzv, yy0<T> paramyy0, y80 paramy80, ci1 paramci1, zr0 paramzr0, t30 paramt30, Executor paramExecutor, vr0 paramvr0, nv0 paramnv0) {
    this.a = paramcr0;
    this.b = paramgi1;
    this.c = paramam1;
    this.d = paramzv;
    this.e = paramyy0;
    this.f = paramy80;
    this.g = paramci1;
    this.h = paramzr0;
    this.i = paramt30;
    this.j = paramExecutor;
    this.k = paramvr0;
    this.l = paramnv0;
  }
  
  private final ot1<ci1> e(ot1<zzatq> paramot1) {
    if (this.g != null)
      return this.c.g(zzdrk.d).<ci1>d(dt1.h(this.g)).f(); 
    q.i().m();
    if (this.b.d.t != null)
      return this.c.g(zzdrk.d).<ci1>d(this.a.a()).f(); 
    sl1<zzatq> sl1 = this.c.b(zzdrk.d, paramot1);
    vr0 vr01 = this.k;
    vr01.getClass();
    return sl1.<ci1>b(q10.c(vr01)).f();
  }
  
  public final ot1<ci1> b(zzatq paramzzatq) {
    return e(dt1.h(paramzzatq));
  }
  
  public final ot1<zzatq> c(zzdpf paramzzdpf) {
    ml1<?> ml1 = this.c.<zzatq>b(zzdrk.v, this.i.b()).b(new t10(this, paramzzdpf)).f();
    dt1.g(ml1, new s10(this), this.j);
    return ml1;
  }
  
  public final ot1<ci1> f() {
    return e(this.i.b());
  }
  
  public final ot1<T> g() {
    return j(f());
  }
  
  public final y80 h() {
    return this.f;
  }
  
  public final ot1<T> i(zzatq paramzzatq) {
    return j(b(paramzzatq));
  }
  
  public final ot1<T> j(ot1<ci1> paramot1) {
    x<Boolean> x1 = m0.d4;
    if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue())
      return this.c.<ci1>b(zzdrk.e, paramot1).b(this.d).b(this.e).f(); 
    sl1<T> sl1 = this.c.<ci1>b(zzdrk.e, paramot1).b(this.d).b(this.e);
    x<Integer> x = m0.e4;
    return sl1.a(((Integer)er2.e().<Integer>c(x)).intValue(), TimeUnit.SECONDS).f();
  }
  
  public final ot1<Void> k(zzatq paramzzatq) {
    ml1<?> ml1 = this.c.<Void>b(zzdrk.w, this.h.d(paramzzatq)).f();
    dt1.g(ml1, new v10(this), this.j);
    return ml1;
  }
  
  public final zzvg l(Throwable paramThrowable) {
    return bj1.c(paramThrowable, this.l);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */