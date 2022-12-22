package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class h1 extends ub2 implements i1 {
  public h1() {
    super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
  }
  
  public static i1 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    return (iInterface instanceof i1) ? (i1)iInterface : new k1(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      IInterface iInterface;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        paramParcel1 = null;
      } else {
        iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        if (iInterface instanceof d1) {
          iInterface = iInterface;
        } else {
          iInterface = new f1(iBinder);
        } 
      } 
      M6((d1)iInterface);
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */