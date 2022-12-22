package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class f5 extends ub2 implements c5 {
  public f5() {
    super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
  }
  
  public static c5 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    return (iInterface instanceof c5) ? (c5)iInterface : new e5(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      IInterface iInterface;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        paramParcel1 = null;
      } else {
        iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        if (iInterface instanceof m5) {
          iInterface = iInterface;
        } else {
          iInterface = new o5(iBinder);
        } 
      } 
      k7((m5)iInterface);
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */