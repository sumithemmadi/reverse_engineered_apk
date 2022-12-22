package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;

@Deprecated
public interface MediationRewardedVideoAdAdapter extends f {
  public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
  
  void initialize(Context paramContext, e parame, String paramString, a parama, Bundle paramBundle1, Bundle paramBundle2);
  
  boolean isInitialized();
  
  void loadAd(e parame, Bundle paramBundle1, Bundle paramBundle2);
  
  void showVideo();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */