package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class rt2 extends ub2 implements ot2 {
  public rt2() {
    super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            w1(tb2.e(paramParcel1));
          } else {
            N0();
          } 
        } else {
          q0();
        } 
      } else {
        a1();
      } 
    } else {
      I6();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */