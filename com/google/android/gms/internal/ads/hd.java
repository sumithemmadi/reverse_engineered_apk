package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class hd extends ub2 implements ed {
  public hd() {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        y(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
      } else {
        u(paramParcel1.readString());
      } 
    } else {
      N6(ec.S9(paramParcel1.readStrongBinder()));
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */