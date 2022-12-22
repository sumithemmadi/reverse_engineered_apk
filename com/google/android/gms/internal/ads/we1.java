package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class we1<R extends u30<? extends p00>> {
  private final tj1 a;
  
  private final bf1 b;
  
  private final ef1<R> c;
  
  private final Executor d;
  
  private af1 e;
  
  public we1(tj1 paramtj1, bf1 parambf1, ef1<R> paramef1, Executor paramExecutor) {
    this.a = paramtj1;
    this.b = parambf1;
    this.c = paramef1;
    this.d = paramExecutor;
  }
  
  @Deprecated
  private final ak1 d() {
    gi1 gi1 = ((u30)this.c.a(this.b).n()).c();
    zzvl zzvl = gi1.d;
    String str = gi1.f;
    zzvx zzvx = gi1.j;
    return this.a.e(zzvl, str, zzvx);
  }
  
  public final ot1<af1> c() {
    ot1<af1> ot1;
    af1 af11 = this.e;
    if (af11 != null)
      return dt1.h(af11); 
    if (!((Boolean)j2.a.a()).booleanValue()) {
      af11 = new af1(null, d(), null);
      this.e = af11;
      ot1 = dt1.h(af11);
    } else {
      ot1 = ys1.<zzatq>H(((u30)this.c.a(this.b).y(new le1((this.a.a()).k)).n()).a().c(this.a.a())).D(new xe1(this), this.d).E(zzcoc.class, new ye1(this), this.d);
    } 
    return dt1.j(ot1, ve1.a, this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/we1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */