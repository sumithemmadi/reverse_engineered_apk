package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.a;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends e, SERVER_PARAMETERS extends MediationServerParameters> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
  View getBannerView();
  
  void requestBannerAd(c paramc, Activity paramActivity, SERVER_PARAMETERS paramSERVER_PARAMETERS, a parama, a parama1, ADDITIONAL_PARAMETERS paramADDITIONAL_PARAMETERS);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/MediationBannerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */