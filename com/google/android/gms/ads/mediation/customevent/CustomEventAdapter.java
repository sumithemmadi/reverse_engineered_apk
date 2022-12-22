package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.cm;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
  private static final com.google.android.gms.ads.a a = new com.google.android.gms.ads.a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
  
  private View b;
  
  private CustomEventBanner c;
  
  private CustomEventInterstitial d;
  
  private CustomEventNative e;
  
  private static <T> T a(String paramString) {
    try {
      return (T)Class.forName(paramString).newInstance();
    } finally {
      Exception exception = null;
      String str = exception.getMessage();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 46 + String.valueOf(str).length());
      stringBuilder.append("Could not instantiate custom event adapter: ");
      stringBuilder.append(paramString);
      stringBuilder.append(". ");
      stringBuilder.append(str);
      cm.i(stringBuilder.toString());
    } 
  }
  
  public final View getBannerView() {
    return this.b;
  }
  
  public final void onDestroy() {
    CustomEventBanner customEventBanner = this.c;
    if (customEventBanner != null)
      customEventBanner.onDestroy(); 
    CustomEventInterstitial customEventInterstitial = this.d;
    if (customEventInterstitial != null)
      customEventInterstitial.onDestroy(); 
    CustomEventNative customEventNative = this.e;
    if (customEventNative != null)
      customEventNative.onDestroy(); 
  }
  
  public final void onPause() {
    CustomEventBanner customEventBanner = this.c;
    if (customEventBanner != null)
      customEventBanner.onPause(); 
    CustomEventInterstitial customEventInterstitial = this.d;
    if (customEventInterstitial != null)
      customEventInterstitial.onPause(); 
    CustomEventNative customEventNative = this.e;
    if (customEventNative != null)
      customEventNative.onPause(); 
  }
  
  public final void onResume() {
    CustomEventBanner customEventBanner = this.c;
    if (customEventBanner != null)
      customEventBanner.onResume(); 
    CustomEventInterstitial customEventInterstitial = this.d;
    if (customEventInterstitial != null)
      customEventInterstitial.onResume(); 
    CustomEventNative customEventNative = this.e;
    if (customEventNative != null)
      customEventNative.onResume(); 
  }
  
  public final void requestBannerAd(Context paramContext, h paramh, Bundle paramBundle1, f paramf, e parame, Bundle paramBundle2) {
    CustomEventBanner customEventBanner = a(paramBundle1.getString("class_name"));
    this.c = customEventBanner;
    if (customEventBanner == null) {
      paramh.f(this, a);
      return;
    } 
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    } 
    this.c.requestBannerAd(paramContext, new a(this, paramh), paramBundle1.getString("parameter"), paramf, parame, paramBundle2);
  }
  
  public final void requestInterstitialAd(Context paramContext, l paraml, Bundle paramBundle1, e parame, Bundle paramBundle2) {
    CustomEventInterstitial customEventInterstitial = a(paramBundle1.getString("class_name"));
    this.d = customEventInterstitial;
    if (customEventInterstitial == null) {
      paraml.q(this, a);
      return;
    } 
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    } 
    this.d.requestInterstitialAd(paramContext, new c(this, this, paraml), paramBundle1.getString("parameter"), parame, paramBundle2);
  }
  
  public final void requestNativeAd(Context paramContext, n paramn, Bundle paramBundle1, t paramt, Bundle paramBundle2) {
    CustomEventNative customEventNative = a(paramBundle1.getString("class_name"));
    this.e = customEventNative;
    if (customEventNative == null) {
      paramn.c(this, a);
      return;
    } 
    if (paramBundle2 == null) {
      paramBundle2 = null;
    } else {
      paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name"));
    } 
    this.e.requestNativeAd(paramContext, new b(this, paramn), paramBundle1.getString("parameter"), paramt, paramBundle2);
  }
  
  public final void showInterstitial() {
    this.d.showInterstitial();
  }
  
  static final class a implements b {
    private final CustomEventAdapter a;
    
    private final h b;
    
    public a(CustomEventAdapter param1CustomEventAdapter, h param1h) {
      this.a = param1CustomEventAdapter;
      this.b = param1h;
    }
  }
  
  static final class b implements e {
    private final CustomEventAdapter a;
    
    private final n b;
    
    public b(CustomEventAdapter param1CustomEventAdapter, n param1n) {
      this.a = param1CustomEventAdapter;
      this.b = param1n;
    }
  }
  
  final class c implements d {
    private final CustomEventAdapter a;
    
    private final l b;
    
    public c(CustomEventAdapter this$0, CustomEventAdapter param1CustomEventAdapter1, l param1l) {
      this.a = param1CustomEventAdapter1;
      this.b = param1l;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */