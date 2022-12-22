package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.cm;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<c, c>, MediationInterstitialAdapter<c, c> {
  private View a;
  
  private CustomEventBanner b;
  
  private CustomEventInterstitial c;
  
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
  
  public final void destroy() {
    CustomEventBanner customEventBanner = this.b;
    if (customEventBanner != null)
      customEventBanner.destroy(); 
    CustomEventInterstitial customEventInterstitial = this.c;
    if (customEventInterstitial != null)
      customEventInterstitial.destroy(); 
  }
  
  public final Class<c> getAdditionalParametersType() {
    return c.class;
  }
  
  public final View getBannerView() {
    return this.a;
  }
  
  public final Class<c> getServerParametersType() {
    return c.class;
  }
  
  public final void requestBannerAd(c paramc, Activity paramActivity, c paramc1, com.google.ads.a parama, com.google.ads.mediation.a parama1, c paramc2) {
    Object object;
    CustomEventBanner customEventBanner = a(paramc1.b);
    this.b = customEventBanner;
    if (customEventBanner == null) {
      paramc.a(this, AdRequest.ErrorCode.e);
      return;
    } 
    if (paramc2 == null) {
      paramc2 = null;
    } else {
      object = paramc2.a(paramc1.a);
    } 
    this.b.requestBannerAd(new b(this, paramc), paramActivity, paramc1.a, paramc1.c, parama, parama1, object);
  }
  
  public final void requestInterstitialAd(d paramd, Activity paramActivity, c paramc, com.google.ads.mediation.a parama, c paramc1) {
    Object object;
    CustomEventInterstitial customEventInterstitial = a(paramc.b);
    this.c = customEventInterstitial;
    if (customEventInterstitial == null) {
      paramd.b(this, AdRequest.ErrorCode.e);
      return;
    } 
    if (paramc1 == null) {
      paramc1 = null;
    } else {
      object = paramc1.a(paramc.a);
    } 
    this.c.requestInterstitialAd(new a(this, this, paramd), paramActivity, paramc.a, paramc.c, parama, object);
  }
  
  public final void showInterstitial() {
    this.c.showInterstitial();
  }
  
  final class a implements b {
    private final CustomEventAdapter a;
    
    private final d b;
    
    public a(CustomEventAdapter this$0, CustomEventAdapter param1CustomEventAdapter1, d param1d) {
      this.a = param1CustomEventAdapter1;
      this.b = param1d;
    }
  }
  
  static final class b implements a {
    private final CustomEventAdapter a;
    
    private final c b;
    
    public b(CustomEventAdapter param1CustomEventAdapter, c param1c) {
      this.a = param1CustomEventAdapter;
      this.b = param1c;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */