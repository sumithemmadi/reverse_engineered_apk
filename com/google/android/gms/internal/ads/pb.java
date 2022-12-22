package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class pb extends ub2 implements mb {
  public pb() {
    super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public static mb S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    return (iInterface instanceof mb) ? (mb)iInterface : new ob(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    kd kd;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        kd = g3(paramParcel1.readString());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, kd);
      } else {
        boolean bool = e2(kd.readString());
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
      } 
    } else {
      rb rb = i5(kd.readString());
      paramParcel2.writeNoException();
      tb2.c(paramParcel2, rb);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */