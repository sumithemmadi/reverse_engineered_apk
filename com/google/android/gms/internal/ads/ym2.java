package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class ym2 extends ub2 implements zm2 {
  public ym2() {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        t0(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
      } else {
        H0();
      } 
    } else {
      E0();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ym2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */