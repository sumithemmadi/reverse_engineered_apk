package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class bp1 extends sb2 implements cp1 {
  bp1(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.gass.internal.IGassService");
  }
  
  public final zzduw F2(zzduu paramzzduu) {
    Parcel parcel2 = a2();
    tb2.d(parcel2, (Parcelable)paramzzduu);
    Parcel parcel1 = Y0(3, parcel2);
    zzduw zzduw = tb2.<zzduw>b(parcel1, zzduw.CREATOR);
    parcel1.recycle();
    return zzduw;
  }
  
  public final zzdum W4(zzduk paramzzduk) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzduk);
    parcel = Y0(1, parcel);
    zzdum zzdum = tb2.<zzdum>b(parcel, zzdum.CREATOR);
    parcel.recycle();
    return zzdum;
  }
  
  public final void p9(zzduf paramzzduf) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzduf);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */