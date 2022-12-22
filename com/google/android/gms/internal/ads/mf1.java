package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class mf1 implements f31<ec0> {
  private final Context a;
  
  private final Executor b;
  
  private final ss c;
  
  private final z11 d;
  
  private final xf1 e;
  
  private i1 f;
  
  private final ii1 g;
  
  private ot1<ec0> h;
  
  public mf1(Context paramContext, Executor paramExecutor, ss paramss, z11 paramz11, xf1 paramxf1, ii1 paramii1) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = paramss;
    this.d = paramz11;
    this.g = paramii1;
    this.e = paramxf1;
  }
  
  public final boolean a(zzvl paramzzvl, String paramString, e31 parame31, h31<? super ec0> paramh31) {
    fd0 fd0;
    zzvs zzvs;
    if (paramString == null) {
      cm.g("Ad unit ID should not be null for interstitial ad.");
      this.b.execute(new lf1(this));
      return false;
    } 
    if (r())
      return false; 
    if (parame31 instanceof jf1) {
      zzvs = ((jf1)parame31).a;
    } else {
      zzvs = new zzvs();
    } 
    gi1 gi1 = this.g.A(paramString).z(zzvs).C(paramzzvl).e();
    x<Boolean> x = m0.L5;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      fd0 = this.c.r().p((new w30.a()).g(this.a).c(gi1).d()).q((new k90.a()).j(this.d, this.b).a(this.d, this.b).n()).g(new b11(this.f)).f();
    } else {
      k90.a a = new k90.a();
      xf1 xf11 = this.e;
      if (xf11 != null)
        a.c(xf11, this.b).g(this.e, this.b).d(this.e, this.b); 
      fd0 = this.c.r().p((new w30.a()).g(this.a).c((gi1)fd0).d()).q(a.j(this.d, this.b).c(this.d, this.b).g(this.d, this.b).d(this.d, this.b).l(this.d, this.b).a(this.d, this.b).i(this.d, this.b).e(this.d, this.b).n()).g(new b11(this.f)).f();
    } 
    ot1<ec0> ot11 = fd0.b().g();
    this.h = ot11;
    dt1.g(ot11, new of1(this, paramh31, fd0), this.b);
    return true;
  }
  
  public final void d(i1 parami1) {
    this.f = parami1;
  }
  
  public final boolean r() {
    ot1<ec0> ot11 = this.h;
    return (ot11 != null && !ot11.isDone());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */