package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class lg extends sb2 implements jg {
  lg(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  public final void D4(String paramString, mg parammg) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    tb2.c(parcel, parammg);
    i1(7, parcel);
  }
  
  public final void V4(zzatq paramzzatq, mg parammg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzatq);
    tb2.c(parcel, parammg);
    i1(5, parcel);
  }
  
  public final void m6(zzatq paramzzatq, mg parammg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzatq);
    tb2.c(parcel, parammg);
    i1(6, parcel);
  }
  
  public final void o4(zzatq paramzzatq, mg parammg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzatq);
    tb2.c(parcel, parammg);
    i1(4, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */