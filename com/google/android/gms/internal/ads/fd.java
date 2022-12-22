package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class fd extends sb2 implements dd {
  fd(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
  }
  
  public final void u(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */