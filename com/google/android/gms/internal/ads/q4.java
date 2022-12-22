package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class q4 extends ub2 implements n4 {
  public q4() {
    super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
  }
  
  public static n4 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    return (iInterface instanceof n4) ? (n4)iInterface : new p4(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      e4 e4;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        iBinder = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        if (iInterface instanceof e4) {
          e4 = (e4)iInterface;
        } else {
          e4 = new g4((IBinder)e4);
        } 
      } 
      e4(e4);
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */