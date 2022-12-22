package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class w3 extends ub2 implements t3 {
  public w3() {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        i0(a.a.i1(paramParcel1.readStrongBinder()));
      } else {
        Y7();
      } 
    } else {
      d1(a.a.i1(paramParcel1.readStrongBinder()));
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */