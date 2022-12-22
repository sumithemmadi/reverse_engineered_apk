package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ob extends sb2 implements mb {
  ob(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public final boolean e2(String paramString) {
    Parcel parcel2 = a2();
    parcel2.writeString(paramString);
    Parcel parcel1 = Y0(2, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
  
  public final kd g3(String paramString) {
    Parcel parcel2 = a2();
    parcel2.writeString(paramString);
    Parcel parcel1 = Y0(3, parcel2);
    kd kd = nd.S9(parcel1.readStrongBinder());
    parcel1.recycle();
    return kd;
  }
  
  public final rb i5(String paramString) {
    IInterface iInterface;
    Parcel parcel = a2();
    parcel.writeString(paramString);
    parcel = Y0(1, parcel);
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      paramString = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if (iInterface instanceof rb) {
        iInterface = iInterface;
      } else {
        iInterface = new tb(iBinder);
      } 
    } 
    parcel.recycle();
    return (rb)iInterface;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */