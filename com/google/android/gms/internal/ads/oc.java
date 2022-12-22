package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.t;
import com.google.android.gms.common.internal.t;

public final class oc implements h, l, n {
  private final sb a;
  
  private q b;
  
  private w c;
  
  private f d;
  
  public oc(sb paramsb) {
    this.a = paramsb;
  }
  
  private static void A(MediationNativeAdapter paramMediationNativeAdapter, w paramw, q paramq) {
    if (paramMediationNativeAdapter instanceof com.google.ads.mediation.admob.AdMobAdapter)
      return; 
    t t = new t();
    t.b(new gc());
    if (paramw != null && paramw.s())
      paramw.H(t); 
    if (paramq != null && paramq.g())
      paramq.n(t); 
  }
  
  public final q B() {
    return this.b;
  }
  
  public final w C() {
    return this.c;
  }
  
  public final f D() {
    return this.d;
  }
  
  public final void a(MediationBannerAdapter paramMediationBannerAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdClosed.");
    try {
      this.a.Y();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void b(MediationNativeAdapter paramMediationNativeAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdOpened.");
    try {
      this.a.L();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void c(MediationNativeAdapter paramMediationNativeAdapter, a parama) {
    t.e("#008 Must be called on the main UI thread.");
    int i = parama.a();
    String str1 = parama.c();
    String str2 = parama.b();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 97 + String.valueOf(str2).length());
    stringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
    stringBuilder.append(i);
    stringBuilder.append(". ErrorMessage: ");
    stringBuilder.append(str1);
    stringBuilder.append(". ErrorDomain: ");
    stringBuilder.append(str2);
    cm.e(stringBuilder.toString());
    try {
      this.a.J0(parama.d());
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void d(MediationInterstitialAdapter paramMediationInterstitialAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLeftApplication.");
    try {
      this.a.O();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void e(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt) {
    t.e("#008 Must be called on the main UI thread.");
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("Adapter called onAdFailedToLoad with error ");
    stringBuilder.append(paramInt);
    stringBuilder.append(".");
    cm.e(stringBuilder.toString());
    try {
      this.a.Z(paramInt);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void f(MediationBannerAdapter paramMediationBannerAdapter, a parama) {
    t.e("#008 Must be called on the main UI thread.");
    int i = parama.a();
    String str2 = parama.c();
    String str1 = parama.b();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 97 + String.valueOf(str1).length());
    stringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
    stringBuilder.append(i);
    stringBuilder.append(". ErrorMessage: ");
    stringBuilder.append(str2);
    stringBuilder.append(". ErrorDomain: ");
    stringBuilder.append(str1);
    cm.e(stringBuilder.toString());
    try {
      this.a.J0(parama.d());
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void g(MediationBannerAdapter paramMediationBannerAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdClicked.");
    try {
      this.a.x();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void h(MediationNativeAdapter paramMediationNativeAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdClosed.");
    try {
      this.a.Y();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void i(MediationBannerAdapter paramMediationBannerAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLoaded.");
    try {
      this.a.i();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void j(MediationNativeAdapter paramMediationNativeAdapter, int paramInt) {
    t.e("#008 Must be called on the main UI thread.");
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("Adapter called onAdFailedToLoad with error ");
    stringBuilder.append(paramInt);
    stringBuilder.append(".");
    cm.e(stringBuilder.toString());
    try {
      this.a.Z(paramInt);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void k(MediationNativeAdapter paramMediationNativeAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    q q1 = this.b;
    w w1 = this.c;
    if (this.d == null) {
      if (q1 == null && w1 == null) {
        cm.f("#007 Could not call remote method.", null);
        return;
      } 
      if (w1 != null && !w1.l()) {
        cm.e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        return;
      } 
      if (q1 != null && !q1.c()) {
        cm.e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        return;
      } 
    } 
    cm.e("Adapter called onAdClicked.");
    try {
      this.a.x();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void l(MediationNativeAdapter paramMediationNativeAdapter, f paramf) {
    t.e("#008 Must be called on the main UI thread.");
    String str = String.valueOf(paramf.u0());
    if (str.length() != 0) {
      str = "Adapter called onAdLoaded with template id ".concat(str);
    } else {
      str = new String("Adapter called onAdLoaded with template id ");
    } 
    cm.e(str);
    this.d = paramf;
    try {
      this.a.i();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void m(MediationBannerAdapter paramMediationBannerAdapter, String paramString1, String paramString2) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAppEvent.");
    try {
      this.a.n(paramString1, paramString2);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void n(MediationInterstitialAdapter paramMediationInterstitialAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdClicked.");
    try {
      this.a.x();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void o(MediationNativeAdapter paramMediationNativeAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLeftApplication.");
    try {
      this.a.O();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void p(MediationBannerAdapter paramMediationBannerAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLeftApplication.");
    try {
      this.a.O();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void q(MediationInterstitialAdapter paramMediationInterstitialAdapter, a parama) {
    t.e("#008 Must be called on the main UI thread.");
    int i = parama.a();
    String str2 = parama.c();
    String str1 = parama.b();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 97 + String.valueOf(str1).length());
    stringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
    stringBuilder.append(i);
    stringBuilder.append(". ErrorMessage: ");
    stringBuilder.append(str2);
    stringBuilder.append(". ErrorDomain: ");
    stringBuilder.append(str1);
    cm.e(stringBuilder.toString());
    try {
      this.a.J0(parama.d());
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void r(MediationInterstitialAdapter paramMediationInterstitialAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLoaded.");
    try {
      this.a.i();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void s(MediationBannerAdapter paramMediationBannerAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdOpened.");
    try {
      this.a.L();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void t(MediationInterstitialAdapter paramMediationInterstitialAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdClosed.");
    try {
      this.a.Y();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void u(MediationNativeAdapter paramMediationNativeAdapter, q paramq) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLoaded.");
    this.b = paramq;
    this.c = null;
    A(paramMediationNativeAdapter, null, paramq);
    try {
      this.a.i();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void v(MediationNativeAdapter paramMediationNativeAdapter, w paramw) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLoaded.");
    this.c = paramw;
    this.b = null;
    A(paramMediationNativeAdapter, paramw, null);
    try {
      this.a.i();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void w(MediationNativeAdapter paramMediationNativeAdapter, f paramf, String paramString) {
    if (paramf instanceof j4)
      try {
        this.a.I0(((j4)paramf).a(), paramString);
        return;
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
        return;
      }  
    cm.i("Unexpected native custom template ad type.");
  }
  
  public final void x(MediationNativeAdapter paramMediationNativeAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    q q1 = this.b;
    w w1 = this.c;
    if (this.d == null) {
      if (q1 == null && w1 == null) {
        cm.f("#007 Could not call remote method.", null);
        return;
      } 
      if (w1 != null && !w1.m()) {
        cm.e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        return;
      } 
      if (q1 != null && !q1.d()) {
        cm.e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        return;
      } 
    } 
    cm.e("Adapter called onAdImpression.");
    try {
      this.a.S();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void y(MediationInterstitialAdapter paramMediationInterstitialAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdOpened.");
    try {
      this.a.L();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void z(MediationBannerAdapter paramMediationBannerAdapter, int paramInt) {
    t.e("#008 Must be called on the main UI thread.");
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("Adapter called onAdFailedToLoad with error. ");
    stringBuilder.append(paramInt);
    cm.e(stringBuilder.toString());
    try {
      this.a.Z(paramInt);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */