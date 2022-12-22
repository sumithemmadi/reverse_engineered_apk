package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class of1 implements et1<ec0> {
  of1(mf1 parammf1, h31 paramh31, fd0 paramfd0) {}
  
  public final void a(Throwable paramThrowable) {
    zzvg zzvg = this.b.b().l(paramThrowable);
    synchronized (this.c) {
      mf1.c(this.c, null);
      this.b.c().E(zzvg);
      x<Boolean> x = m0.L5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        Executor executor = mf1.g(this.c);
        qf1 qf1 = new qf1();
        this(this, zzvg);
        executor.execute(qf1);
        executor = mf1.g(this.c);
        tf1 tf1 = new tf1();
        this(this, zzvg);
        executor.execute(tf1);
      } 
      ui1.a(zzvg.b, paramThrowable, "InterstitialAdLoader.onFailure");
      this.a.a();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/of1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */