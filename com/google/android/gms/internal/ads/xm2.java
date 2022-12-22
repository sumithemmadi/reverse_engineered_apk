package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class xm2 extends ub2 implements um2 {
  public xm2() {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      S2();
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */