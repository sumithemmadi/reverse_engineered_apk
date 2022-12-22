package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

final class ud1 implements et1<qy> {
  ud1(sd1 paramsd1, h31 paramh31, nz paramnz) {}
  
  public final void a(Throwable paramThrowable) {
    zzvg zzvg = this.b.c().l(paramThrowable);
    synchronized (this.c) {
      sd1.c(this.c, null);
      this.b.d().E(zzvg);
      x<Boolean> x = m0.J5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        Executor executor = sd1.n(this.c);
        wd1 wd1 = new wd1();
        this(this, zzvg);
        executor.execute(wd1);
      } 
      sd1.o(this.c).e1(60);
      ui1.a(zzvg.b, paramThrowable, "BannerAdLoader.onFailure");
      this.a.a();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ud1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */