package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.ads.mediation.AbstractAdViewAdapter;

@Keep
public final class AdMobAdapter extends AbstractAdViewAdapter {
  public static final String NEW_BUNDLE = "_newBundle";
  
  protected final Bundle zza(Bundle paramBundle1, Bundle paramBundle2) {
    if (paramBundle1 == null)
      paramBundle1 = new Bundle(); 
    Bundle bundle = paramBundle1;
    if (paramBundle1.getBoolean("_newBundle"))
      bundle = new Bundle(paramBundle1); 
    bundle.putInt("gw", 1);
    bundle.putString("mad_hac", paramBundle2.getString("mad_hac"));
    if (!TextUtils.isEmpty(paramBundle2.getString("adJson")))
      bundle.putString("_ad", paramBundle2.getString("adJson")); 
    bundle.putBoolean("_noRefresh", true);
    return bundle;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/admob/AdMobAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */