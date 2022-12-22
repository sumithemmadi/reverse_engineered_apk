package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ke1<R extends u30<AdT>, AdT extends p00> implements cf1<R, pe1<AdT>> {
  private final tj1 a;
  
  private final Executor b;
  
  private et1<Void> c = new qe1(this);
  
  public ke1(tj1 paramtj1, Executor paramExecutor) {
    this.a = paramtj1;
    this.b = paramExecutor;
  }
  
  public final ot1<pe1<AdT>> b(df1 paramdf1, ef1<R> paramef1) {
    return ys1.<af1>H((new we1<u30<? extends p00>>(this.a, paramdf1.b, paramef1, this.b)).c()).G(new ne1(this, paramdf1, paramef1), this.b).E(Exception.class, new me1(this), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ke1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */