package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class we extends sb2 implements ue {
  we(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
  }
  
  public final te j0(a parama, mb parammb, int paramInt) {
    te te;
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(204204000);
    Parcel parcel1 = Y0(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
      if (iInterface instanceof te) {
        te = (te)iInterface;
      } else {
        te = new ve((IBinder)te);
      } 
    } 
    parcel1.recycle();
    return te;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */