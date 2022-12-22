package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.lang.ref.WeakReference;

public final class vk0 extends p00 {
  private final Context h;
  
  private final WeakReference<tq> i;
  
  private final od0 j;
  
  private final ta0 k;
  
  private final t40 l;
  
  private final c60 m;
  
  private final n10 n;
  
  private final ki o;
  
  private final eo1 p;
  
  private boolean q = false;
  
  vk0(s00 params00, Context paramContext, tq paramtq, od0 paramod0, ta0 paramta0, t40 paramt40, c60 paramc60, n10 paramn10, nh1 paramnh1, eo1 parameo1) {
    super(params00);
    this.h = paramContext;
    this.j = paramod0;
    this.i = new WeakReference<tq>(paramtq);
    this.k = paramta0;
    this.l = paramt40;
    this.m = paramc60;
    this.n = paramn10;
    this.p = parameo1;
    this.o = new hj(paramnh1.l);
  }
  
  public final void finalize() {
    try {
      tq tq = this.i.get();
      x<Boolean> x = m0.n5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        if (!this.q && tq != null)
          fm.e.execute(yk0.a(tq)); 
      } else if (tq != null) {
        tq.destroy();
      } 
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public final Bundle g() {
    return this.m.b1();
  }
  
  public final boolean h() {
    return this.n.a();
  }
  
  public final boolean i() {
    return this.q;
  }
  
  public final boolean j(boolean paramBoolean, Activity paramActivity) {
    x<Boolean> x1;
    Context context;
    x<Boolean> x2 = m0.m0;
    if (((Boolean)er2.e().<Boolean>c(x2)).booleanValue()) {
      q.c();
      if (h1.B(this.h)) {
        cm.i("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
        this.l.Q0();
        x1 = m0.n0;
        if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue())
          this.p.a(this.a.b.b.b); 
        return false;
      } 
    } 
    if (this.q) {
      cm.i("The rewarded ad have been showed.");
      this.l.y(bj1.b(zzdom.k, null, null));
      return false;
    } 
    this.q = true;
    this.k.c1();
    x2 = x1;
    if (x1 == null)
      context = this.h; 
    try {
      this.j.a(paramBoolean, context);
      this.k.b1();
      return true;
    } catch (zzcaf zzcaf) {
      this.l.Y(zzcaf);
      return false;
    } 
  }
  
  public final ki k() {
    return this.o;
  }
  
  public final boolean l() {
    tq tq = this.i.get();
    return (tq != null && !tq.p0());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */