package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.y.a;

final class g extends a {
  g(AbstractAdViewAdapter paramAbstractAdViewAdapter) {}
  
  public final void B() {
    if (AbstractAdViewAdapter.zzb(this.a) != null && AbstractAdViewAdapter.zza(this.a) != null) {
      Bundle bundle = AbstractAdViewAdapter.zzb(this.a).a();
      AbstractAdViewAdapter.zza(this.a).z(bundle);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */