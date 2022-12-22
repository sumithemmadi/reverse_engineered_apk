package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;

public final class t11 extends as2 {
  private final Context b;
  
  private final jr2 c;
  
  private final gi1 d;
  
  private final qy e;
  
  private final ViewGroup f;
  
  public t11(Context paramContext, jr2 paramjr2, gi1 paramgi1, qy paramqy) {
    this.b = paramContext;
    this.c = paramjr2;
    this.d = paramgi1;
    this.e = paramqy;
    FrameLayout frameLayout = new FrameLayout(paramContext);
    frameLayout.removeAllViews();
    frameLayout.addView(paramqy.j(), q.e().p());
    frameLayout.setMinimumHeight((L9()).d);
    frameLayout.setMinimumWidth((L9()).g);
    this.f = (ViewGroup)frameLayout;
  }
  
  public final void B6(zzzi paramzzzi) {}
  
  public final String E8() {
    return this.d.f;
  }
  
  public final void G8() {
    this.e.m();
  }
  
  public final Bundle H() {
    cm.h("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
    return new Bundle();
  }
  
  public final void J() {
    t.e("destroy must be called on the main UI thread.");
    this.e.c().d1(null);
  }
  
  public final void K0(uh paramuh) {}
  
  public final void K2(zzaau paramzzaau) {
    cm.h("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final zzvs L9() {
    t.e("getAdSize must be called on the main UI thread.");
    return ki1.b(this.b, Collections.singletonList(this.e.i()));
  }
  
  public final void O4(ns2 paramns2) {}
  
  public final void R6(String paramString) {}
  
  public final void U(gt2 paramgt2) {
    cm.h("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final void U4(zzvl paramzzvl, or2 paramor2) {}
  
  public final void U6(jr2 paramjr2) {
    cm.h("setAdListener is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final String X0() {
    return (this.e.d() != null) ? this.e.d().a() : null;
  }
  
  public final a Z2() {
    return b.a2(this.f);
  }
  
  public final void Z3(qf paramqf, String paramString) {}
  
  public final void Z7(zzvx paramzzvx) {}
  
  public final String a() {
    return (this.e.d() != null) ? this.e.d().a() : null;
  }
  
  public final void b1(es2 parames2) {
    cm.h("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final fs2 b7() {
    return this.d.n;
  }
  
  public final void c2(boolean paramBoolean) {
    cm.h("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final void d9(i1 parami1) {
    cm.h("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final void destroy() {
    t.e("destroy must be called on the main UI thread.");
    this.e.a();
  }
  
  public final void f6() {}
  
  public final void g8(kf paramkf) {}
  
  public final nt2 getVideoController() {
    return this.e.g();
  }
  
  public final void h3(tm2 paramtm2) {}
  
  public final void i4(ir2 paramir2) {
    cm.h("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final boolean m() {
    return false;
  }
  
  public final void n5(zzvs paramzzvs) {
    t.e("setAdSize must be called on the main UI thread.");
    qy qy1 = this.e;
    if (qy1 != null)
      qy1.h(this.f, paramzzvs); 
  }
  
  public final void o(boolean paramBoolean) {}
  
  public final boolean o7(zzvl paramzzvl) {
    cm.h("loadAd is not supported for a Publisher AdView returned from AdLoader.");
    return false;
  }
  
  public final ht2 p() {
    return this.e.d();
  }
  
  public final void p0(a parama) {}
  
  public final void pause() {
    t.e("destroy must be called on the main UI thread.");
    this.e.c().c1(null);
  }
  
  public final void q3(ls2 paramls2) {
    cm.h("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
  }
  
  public final boolean r() {
    return false;
  }
  
  public final void showInterstitial() {}
  
  public final jr2 t3() {
    return this.c;
  }
  
  public final void y0(String paramString) {}
  
  public final void y6(fs2 paramfs2) {
    cm.h("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */