package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class pt2 extends sb2 implements nt2 {
  pt2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public final float P0() {
    Parcel parcel = Y0(7, a2());
    float f = parcel.readFloat();
    parcel.recycle();
    return f;
  }
  
  public final void P2(ot2 paramot2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramot2);
    i1(8, parcel);
  }
  
  public final ot2 d5() {
    ot2 ot2;
    Parcel parcel = Y0(11, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
      if (iInterface instanceof ot2) {
        ot2 = (ot2)iInterface;
      } else {
        ot2 = new qt2((IBinder)ot2);
      } 
    } 
    parcel.recycle();
    return ot2;
  }
  
  public final float getDuration() {
    Parcel parcel = Y0(6, a2());
    float f = parcel.readFloat();
    parcel.recycle();
    return f;
  }
  
  public final float k0() {
    Parcel parcel = Y0(9, a2());
    float f = parcel.readFloat();
    parcel.recycle();
    return f;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */