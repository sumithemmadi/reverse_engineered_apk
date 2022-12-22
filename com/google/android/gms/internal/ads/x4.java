package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class x4 extends ub2 implements t4 {
  public x4() {
    super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
  }
  
  public static t4 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    return (iInterface instanceof t4) ? (t4)iInterface : new w4(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      IInterface iInterface;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        paramParcel1 = null;
      } else {
        iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (iInterface instanceof i4) {
          iInterface = iInterface;
        } else {
          iInterface = new k4(iBinder);
        } 
      } 
      w8((i4)iInterface);
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/x4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */