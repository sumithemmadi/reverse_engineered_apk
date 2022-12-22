package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.b1;

public final class t extends f {
  public t(Activity paramActivity) {
    super(paramActivity);
  }
  
  public final void G9(Bundle paramBundle) {
    b1.m("AdOverlayParcel is null or does not contain valid overlay type.");
    this.o = zzn.e;
    this.c.finish();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */