package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class wi extends ub2 implements ti {
  public wi() {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        s8(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
      } else {
        i7(paramParcel1.readInt());
      } 
    } else {
      S1();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */