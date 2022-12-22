package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class l4 extends ub2 implements m4 {
  public l4() {
    super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
  }
  
  public static m4 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    return (iInterface instanceof m4) ? (m4)iInterface : new o4(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      IInterface iInterface;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        paramParcel1 = null;
      } else {
        iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        if (iInterface instanceof a4) {
          iInterface = iInterface;
        } else {
          iInterface = new c4(iBinder);
        } 
      } 
      c7((a4)iInterface);
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */