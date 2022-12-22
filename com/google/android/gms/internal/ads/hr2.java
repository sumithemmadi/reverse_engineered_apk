package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class hr2 extends ub2 implements ir2 {
  public hr2() {
    super("com.google.android.gms.ads.internal.client.IAdClickListener");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      x();
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */