package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class k1 extends sb2 implements i1 {
  k1(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
  }
  
  public final void M6(d1 paramd1) {
    Parcel parcel = a2();
    tb2.c(parcel, paramd1);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */