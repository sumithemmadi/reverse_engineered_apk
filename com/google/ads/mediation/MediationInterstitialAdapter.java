package com.google.ads.mediation;

import android.app.Activity;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends e, SERVER_PARAMETERS extends MediationServerParameters> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
  void requestInterstitialAd(d paramd, Activity paramActivity, SERVER_PARAMETERS paramSERVER_PARAMETERS, a parama, ADDITIONAL_PARAMETERS paramADDITIONAL_PARAMETERS);
  
  void showInterstitial();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/MediationInterstitialAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */