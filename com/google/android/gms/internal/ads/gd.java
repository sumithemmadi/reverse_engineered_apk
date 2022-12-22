package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class gd extends sb2 implements ed {
  gd(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
  }
  
  public final void u(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */