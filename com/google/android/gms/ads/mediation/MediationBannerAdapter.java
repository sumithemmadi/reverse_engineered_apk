package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.f;

public interface MediationBannerAdapter extends f {
  View getBannerView();
  
  void requestBannerAd(Context paramContext, h paramh, Bundle paramBundle1, f paramf, e parame, Bundle paramBundle2);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/MediationBannerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */