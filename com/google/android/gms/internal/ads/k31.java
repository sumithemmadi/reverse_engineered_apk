package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class k31 implements et1<p00> {
  k31(j31 paramj31, h31 paramh31, ce0 paramce0) {}
  
  public final void a(Throwable paramThrowable) {
    zzvg zzvg = this.b.c().l(paramThrowable);
    this.b.d().E(zzvg);
    j31.e(this.c).f().execute(new m31(this, zzvg));
    ui1.a(zzvg.b, paramThrowable, "NativeAdLoader.onFailure");
    this.a.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */