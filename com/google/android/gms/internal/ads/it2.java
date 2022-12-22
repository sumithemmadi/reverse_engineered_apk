package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class it2 extends sb2 implements gt2 {
  it2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
  }
  
  public final void V7(zzvu paramzzvu) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvu);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/it2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */