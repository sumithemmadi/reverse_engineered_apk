package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class sm2 extends ub2 implements tm2 {
  public sm2() {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
  }
  
  public static tm2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    return (iInterface instanceof tm2) ? (tm2)iInterface : new vm2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        W7(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
      } else {
        G6(paramParcel1.readInt());
      } 
    } else {
      om2 om2;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        iBinder = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        if (iInterface instanceof om2) {
          om2 = (om2)iInterface;
        } else {
          om2 = new qm2((IBinder)om2);
        } 
      } 
      M3(om2);
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */