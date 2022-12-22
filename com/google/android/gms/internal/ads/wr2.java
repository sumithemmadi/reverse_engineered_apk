package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class wr2 extends sb2 implements ur2 {
  wr2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  public final void C2(n4 paramn4) {
    Parcel parcel = a2();
    tb2.c(parcel, paramn4);
    i1(4, parcel);
  }
  
  public final void C5(jr2 paramjr2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramjr2);
    i1(2, parcel);
  }
  
  public final void E3(m4 paramm4) {
    Parcel parcel = a2();
    tb2.c(parcel, paramm4);
    i1(3, parcel);
  }
  
  public final void R8(c5 paramc5) {
    Parcel parcel = a2();
    tb2.c(parcel, paramc5);
    i1(10, parcel);
  }
  
  public final void c3(zzaeh paramzzaeh) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzaeh);
    i1(6, parcel);
  }
  
  public final void k3(String paramString, t4 paramt4, s4 params4) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    tb2.c(parcel, paramt4);
    tb2.c(parcel, params4);
    i1(5, parcel);
  }
  
  public final pr2 n8() {
    IInterface iInterface;
    Parcel parcel = Y0(1, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iInterface = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if (iInterface instanceof pr2) {
        iInterface = iInterface;
      } else {
        iInterface = new rr2(iBinder);
      } 
    } 
    parcel.recycle();
    return (pr2)iInterface;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */