package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class tc1 implements et1<AppOpenAd> {
  tc1(sc1 paramsc1, h31 paramh31, vc1 paramvc1) {}
  
  public final void a(Throwable paramThrowable) {
    zzvg zzvg;
    yx yx = (yx)sc1.j(this.c).a();
    if (yx == null) {
      zzvg = bj1.c(paramThrowable, null);
    } else {
      zzvg = yx.a().l(paramThrowable);
    } 
    synchronized (this.c) {
      sc1.f(this.c, null);
      if (yx != null) {
        yx.b().E(zzvg);
        x<Boolean> x = m0.K5;
        if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
          Executor executor = sc1.k(this.c);
          wc1 wc1 = new wc1();
          this(this, zzvg);
          executor.execute(wc1);
        } 
      } else {
        sc1.e(this.c).E(zzvg);
        ((yx)sc1.c(this.c, this.b).n()).a().h().W0();
      } 
      ui1.a(zzvg.b, paramThrowable, "AppOpenAdLoader.onFailure");
      this.a.a();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */