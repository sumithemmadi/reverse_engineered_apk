package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.a;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ml0 {
  private final l40 a;
  
  private final n50 b;
  
  private final c60 c;
  
  private final l60 d;
  
  private final x80 e;
  
  private final Executor f;
  
  private final eb0 g;
  
  private final sw h;
  
  private final a i;
  
  private final h50 j;
  
  private final uj k;
  
  private final p12 l;
  
  private final m80 m;
  
  private final pu0 n;
  
  private final jn1 o;
  
  private final jo0 p;
  
  private final pm1 q;
  
  public ml0(l40 paraml40, n50 paramn50, c60 paramc60, l60 paraml60, x80 paramx80, Executor paramExecutor, eb0 parameb0, sw paramsw, a parama, h50 paramh50, uj paramuj, p12 paramp12, m80 paramm80, pu0 parampu0, jn1 paramjn1, jo0 paramjo0, pm1 parampm1) {
    this.a = paraml40;
    this.b = paramn50;
    this.c = paramc60;
    this.d = paraml60;
    this.e = paramx80;
    this.f = paramExecutor;
    this.g = parameb0;
    this.h = paramsw;
    this.i = parama;
    this.j = paramh50;
    this.k = paramuj;
    this.l = paramp12;
    this.m = paramm80;
    this.n = parampu0;
    this.o = paramjn1;
    this.p = paramjo0;
    this.q = parampm1;
  }
  
  public static ot1<?> b(tq paramtq, String paramString1, String paramString2) {
    sm<?> sm = new sm();
    paramtq.N().w0(new tl0(sm));
    paramtq.Q(paramString1, paramString2, null);
    return sm;
  }
  
  public final void d(tq paramtq, boolean paramBoolean) {
    paramtq.N().s(new ll0(this), this.c, this.d, new ol0(this), new nl0(this), paramBoolean, null, this.i, new xl0(this), this.k, this.n, this.o, this.p, this.q);
    paramtq.setOnTouchListener(new ql0(this));
    paramtq.setOnClickListener(new pl0(this));
    x<Boolean> x = m0.S1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      xr1 xr1 = this.l.h();
      if (xr1 != null)
        xr1.b(paramtq.getView()); 
    } 
    this.g.Z0(paramtq, this.f);
    this.g.Z0(new sl0(paramtq), this.f);
    this.g.b1(paramtq.getView());
    paramtq.d("/trackActiveViewUnit", new rl0(this, paramtq));
    this.h.t(paramtq);
    x = m0.v0;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      this.j.b1(vl0.b(paramtq), this.f); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ml0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */