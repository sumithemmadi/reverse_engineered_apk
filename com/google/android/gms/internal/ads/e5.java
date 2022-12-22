package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class e5 extends sb2 implements c5 {
  e5(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
  }
  
  public final void k7(m5 paramm5) {
    Parcel parcel = a2();
    tb2.c(parcel, paramm5);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */