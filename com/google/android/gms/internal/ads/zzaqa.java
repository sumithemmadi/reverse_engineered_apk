package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.common.util.o;

public final class zzaqa implements MediationInterstitialAdapter {
  private Activity a;
  
  private l b;
  
  private Uri c;
  
  public final void onDestroy() {
    cm.e("Destroying AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onPause() {
    cm.e("Pausing AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onResume() {
    cm.e("Resuming AdMobCustomTabsAdapter adapter.");
  }
  
  public final void requestInterstitialAd(Context paramContext, l paraml, Bundle paramBundle1, e parame, Bundle paramBundle2) {
    boolean bool;
    this.b = paraml;
    if (paraml == null) {
      cm.i("Listener not set for mediation. Returning.");
      return;
    } 
    if (!(paramContext instanceof Activity)) {
      cm.i("AdMobCustomTabs can only work with Activity context. Bailing out.");
      this.b.e(this, 0);
      return;
    } 
    if (o.b() && m1.f(paramContext)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool) {
      cm.i("Default browser does not support custom tabs. Bailing out.");
      this.b.e(this, 0);
      return;
    } 
    String str = paramBundle1.getString("tab_url");
    if (TextUtils.isEmpty(str)) {
      cm.i("The tab_url retrieved from mediation metadata is empty. Bailing out.");
      this.b.e(this, 0);
      return;
    } 
    this.a = (Activity)paramContext;
    this.c = Uri.parse(str);
    this.b.r(this);
  }
  
  public final void showInterstitial() {
    c c = (new c.a()).a();
    c.a.setData(this.c);
    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzd(c.a, null), null, new be(this), null, new zzazn(0, 0, false), null);
    h1.a.post(new ae(this, adOverlayInfoParcel));
    q.g().n();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */