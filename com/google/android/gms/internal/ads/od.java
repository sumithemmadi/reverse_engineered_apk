package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class od extends ub2 implements pd {
  public od() {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        i6(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
      } else {
        Q(paramParcel1.readString());
      } 
    } else {
      I2(paramParcel1.readString());
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */