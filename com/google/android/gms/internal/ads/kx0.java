package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.zzk;

final class kx0 implements od0 {
  private final Context a;
  
  private final zzazn b;
  
  private final ot1<hc0> c;
  
  private final nh1 d;
  
  private final tq e;
  
  private kx0(Context paramContext, zzazn paramzzazn, ot1<hc0> paramot1, nh1 paramnh1, tq paramtq) {
    this.a = paramContext;
    this.b = paramzzazn;
    this.c = paramot1;
    this.d = paramnh1;
    this.e = paramtq;
  }
  
  public final void a(boolean paramBoolean, Context paramContext) {
    hc0 hc0 = dt1.<hc0>m(this.c);
    this.e.h0(true);
    q.c();
    zzk zzk = new zzk(false, h1.I(this.a), false, 0.0F, -1, paramBoolean, this.d.J, false);
    q.b();
    dd0 dd0 = hc0.i();
    tq tq1 = this.e;
    nh1 nh11 = this.d;
    int i = nh11.L;
    zzazn zzazn1 = this.b;
    String str = nh11.A;
    uh1 uh1 = nh11.r;
    n.a(paramContext, new AdOverlayInfoParcel(null, dd0, null, tq1, i, zzazn1, str, zzk, uh1.b, uh1.a), true);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */