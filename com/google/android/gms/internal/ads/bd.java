package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class bd extends ub2 implements yc {
  public bd() {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
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
      H4(a.a.i1(paramParcel1.readStrongBinder()));
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */