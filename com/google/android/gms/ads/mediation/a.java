package com.google.android.gms.ads.mediation;

import android.content.Context;
import java.util.List;

public abstract class a {
  public abstract x getSDKVersionInfo();
  
  public abstract x getVersionInfo();
  
  public abstract void initialize(Context paramContext, b paramb, List<i> paramList);
  
  public void loadBannerAd(g paramg, d<?, ?> paramd) {
    paramd.Q(getClass().getSimpleName().concat(" does not support banner ads."));
  }
  
  public void loadInterstitialAd(k paramk, d<j, ?> paramd) {
    paramd.Q(getClass().getSimpleName().concat(" does not support interstitial ads."));
  }
  
  public void loadNativeAd(m paramm, d<w, ?> paramd) {
    paramd.Q(getClass().getSimpleName().concat(" does not support native ads."));
  }
  
  public void loadRewardedAd(p paramp, d<o, ?> paramd) {
    paramd.Q(getClass().getSimpleName().concat(" does not support rewarded ads."));
  }
  
  public void loadRewardedInterstitialAd(p paramp, d<o, ?> paramd) {
    paramd.Q(getClass().getSimpleName().concat(" does not support rewarded interstitial ads."));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */