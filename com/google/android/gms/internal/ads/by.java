package com.google.android.gms.internal.ads;

import android.view.View;

public final class by extends p00 {
  private final View h;
  
  private final tq i;
  
  private final qh1 j;
  
  private final int k;
  
  private final boolean l;
  
  private final boolean m;
  
  private um2 n;
  
  private final px o;
  
  by(s00 params00, View paramView, tq paramtq, qh1 paramqh1, int paramInt, boolean paramBoolean1, boolean paramBoolean2, px parampx) {
    super(params00);
    this.h = paramView;
    this.i = paramtq;
    this.j = paramqh1;
    this.k = paramInt;
    this.l = paramBoolean1;
    this.m = paramBoolean2;
    this.o = parampx;
  }
  
  public final void g(lm2 paramlm2) {
    tq tq1 = this.i;
    if (tq1 != null)
      tq1.u(paramlm2); 
  }
  
  public final void h(um2 paramum2) {
    this.n = paramum2;
  }
  
  public final boolean i() {
    tq tq1 = this.i;
    return (tq1 != null && tq1.N() != null && this.i.N().E0());
  }
  
  public final int j() {
    return this.k;
  }
  
  public final boolean k() {
    return this.l;
  }
  
  public final boolean l() {
    return this.m;
  }
  
  public final qh1 m() {
    return ki1.a(this.b.q, this.j);
  }
  
  public final View n() {
    return this.h;
  }
  
  public final boolean o() {
    tq tq1 = this.i;
    return (tq1 != null && tq1.f0());
  }
  
  public final um2 p() {
    return this.n;
  }
  
  public final void q(long paramLong, int paramInt) {
    this.o.a(paramLong, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */