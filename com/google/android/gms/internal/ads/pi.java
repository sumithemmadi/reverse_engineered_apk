package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class pi extends ub2 implements qi {
  public pi() {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            v9(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
          } else {
            O8(paramParcel1.readInt());
          } 
        } else {
          ki ki;
          IBinder iBinder = paramParcel1.readStrongBinder();
          if (iBinder == null) {
            iBinder = null;
          } else {
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (iInterface instanceof ki) {
              ki = (ki)iInterface;
            } else {
              ki = new mi((IBinder)ki);
            } 
          } 
          h1(ki);
        } 
      } else {
        T1();
      } 
    } else {
      L2();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */