package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.zzk;

final class tz0 implements od0 {
  private final Context a;
  
  private final kl0 b;
  
  private final gi1 c;
  
  private final zzazn d;
  
  private final nh1 e;
  
  private final ot1<xk0> f;
  
  private final tq g;
  
  private tz0(Context paramContext, kl0 paramkl0, gi1 paramgi1, zzazn paramzzazn, nh1 paramnh1, ot1<xk0> paramot1, tq paramtq) {
    this.a = paramContext;
    this.b = paramkl0;
    this.c = paramgi1;
    this.d = paramzzazn;
    this.e = paramnh1;
    this.f = paramot1;
    this.g = paramtq;
  }
  
  public final void a(boolean paramBoolean, Context paramContext) {
    xk0 xk0 = dt1.<xk0>m(this.f);
    try {
      tq tq1;
      nh1 nh11 = this.e;
      if (!this.g.p0()) {
        tq1 = this.g;
      } else {
        x<Boolean> x = m0.u0;
        if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
          tq1 = this.g;
        } else {
          tq1 = this.b.c(this.c.e);
          g7.b(tq1, xk0.l());
          am0 am0 = new am0();
          this();
          am0.b(this.a, tq1.getView());
          xk0.h().d(tq1, true);
          es es = tq1.N();
          sz0 sz0 = new sz0();
          this(am0, tq1);
          es.w0(sz0);
          tq1.N().J0(vz0.b(tq1));
          uh1 uh11 = nh11.r;
          tq1.Q(uh11.b, uh11.a, null);
        } 
      } 
      tq1.h0(true);
      q.c();
      boolean bool = h1.I(this.a);
      nh11 = this.e;
      zzk zzk = new zzk(false, bool, false, 0.0F, -1, paramBoolean, nh11.J, nh11.K);
      q.b();
      dd0 dd0 = xk0.i();
      nh1 nh12 = this.e;
      int i = nh12.L;
      zzazn zzazn1 = this.d;
      String str = nh12.A;
      uh1 uh1 = nh12.r;
      n.a(paramContext, new AdOverlayInfoParcel(null, dd0, null, tq1, i, zzazn1, str, zzk, uh1.b, uh1.a), true);
      return;
    } catch (zzben zzben) {
      cm.c("", zzben);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */