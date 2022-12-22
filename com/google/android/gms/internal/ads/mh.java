package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class mh extends sb2 implements kh {
  mh(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  public final int P() {
    Parcel parcel = Y0(2, a2());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
  
  public final String l() {
    Parcel parcel = Y0(1, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */