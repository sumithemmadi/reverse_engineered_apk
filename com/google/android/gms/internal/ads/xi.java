package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class xi extends sb2 implements yi {
  xi(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
  }
  
  public final void Z5(ki paramki, String paramString1, String paramString2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramki);
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */