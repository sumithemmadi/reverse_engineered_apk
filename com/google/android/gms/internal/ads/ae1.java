package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ae1<R extends u30<AdT>, AdT extends p00> implements cf1<R, bk1<AdT>> {
  private R a;
  
  private final Executor b = qt1.c();
  
  public final ot1<bk1<AdT>> b(df1 paramdf1, ef1<R> paramef1) {
    ot1<ci1> ot1;
    x30<R> x30 = paramef1.a(paramdf1.b);
    x30.k(new kf1(true));
    u30 u301 = (u30)x30.n();
    this.a = (R)u301;
    r10 r10 = u301.a();
    bk1<p00> bk1 = new bk1<p00>();
    zzatq zzatq = paramdf1.a;
    if (zzatq != null) {
      ot1 = r10.b(zzatq);
    } else {
      ot1 = r10.f();
    } 
    return ys1.<ci1>H(ot1).G(new de1(this, bk1, r10), this.b).D(new ce1(bk1), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ae1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */