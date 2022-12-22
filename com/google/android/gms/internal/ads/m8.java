package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class m8 extends ub2 implements k8 {
  public m8() {
    super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      E5(paramParcel1.readInt());
    } else {
      Z6();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */