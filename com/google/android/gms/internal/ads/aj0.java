package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class aj0 {
  private final gi1 a;
  
  private final Executor b;
  
  private final kl0 c;
  
  public aj0(gi1 paramgi1, Executor paramExecutor, kl0 paramkl0) {
    this.a = paramgi1;
    this.b = paramExecutor;
    this.c = paramkl0;
  }
  
  private final void e(tq paramtq) {
    paramtq.d("/video", (x6)d6.m);
    paramtq.d("/videoMeta", (x6)d6.n);
    paramtq.d("/precache", new dq());
    paramtq.d("/delayPageLoaded", d6.q);
    paramtq.d("/instrument", d6.o);
    paramtq.d("/log", (x6)d6.h);
    paramtq.d("/videoClicked", d6.i);
    paramtq.N().C0(true);
    paramtq.d("/click", d6.d);
    x<Boolean> x = m0.q2;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      paramtq.d("/getNativeAdViewSignals", d6.t); 
    if (this.a.c != null) {
      paramtq.N().W(true);
      paramtq.d("/open", new b7<tq>(null, null, null, null, null));
    } else {
      paramtq.N().W(false);
    } 
    if (q.A().H(paramtq.getContext()))
      paramtq.d("/logScionEvent", new z6(paramtq.getContext())); 
  }
  
  public final ot1<tq> f(JSONObject paramJSONObject) {
    return dt1.k(dt1.k(dt1.h(null), new bj0(this), this.b), new zi0(this, paramJSONObject), this.b);
  }
  
  public final ot1<tq> g(String paramString1, String paramString2) {
    return dt1.k(dt1.h(null), new cj0(this, paramString1, paramString2), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/aj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */