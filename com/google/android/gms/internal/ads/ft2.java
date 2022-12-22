package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ft2 extends ub2 implements gt2 {
  public ft2() {
    super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
  }
  
  public static gt2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    return (iInterface instanceof gt2) ? (gt2)iInterface : new it2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      V7(tb2.<zzvu>b(paramParcel1, zzvu.CREATOR));
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ft2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */