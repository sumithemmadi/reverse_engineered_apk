package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class id extends ub2 implements jd {
  public id() {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 2) {
      if (paramInt1 != 3) {
        if (paramInt1 != 4)
          return false; 
        y(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
      } else {
        u(paramParcel1.readString());
      } 
    } else {
      m0();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */