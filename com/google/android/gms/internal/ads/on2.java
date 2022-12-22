package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class on2 extends sb2 implements ln2 {
  on2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
  }
  
  public final zztc B2(zzth paramzzth) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzth);
    parcel = Y0(2, parcel);
    zztc zztc = tb2.<zztc>b(parcel, zztc.CREATOR);
    parcel.recycle();
    return zztc;
  }
  
  public final zztc Z8(zzth paramzzth) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzth);
    parcel = Y0(1, parcel);
    zztc zztc = tb2.<zztc>b(parcel, zztc.CREATOR);
    parcel.recycle();
    return zztc;
  }
  
  public final long m8(zzth paramzzth) {
    Parcel parcel2 = a2();
    tb2.d(parcel2, (Parcelable)paramzzth);
    Parcel parcel1 = Y0(3, parcel2);
    long l = parcel1.readLong();
    parcel1.recycle();
    return l;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/on2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */