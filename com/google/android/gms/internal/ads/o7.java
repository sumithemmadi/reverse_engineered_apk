package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class o7 extends sb2 implements p7 {
  o7(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
  }
  
  public final void x7(zzait paramzzait, n7 paramn7) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzait);
    tb2.c(parcel, paramn7);
    o1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */