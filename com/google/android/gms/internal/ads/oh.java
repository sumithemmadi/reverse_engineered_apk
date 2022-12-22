package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class oh extends sb2 implements ph {
  oh(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
  }
  
  public final void J9(kh paramkh, String paramString1, String paramString2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramkh);
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */