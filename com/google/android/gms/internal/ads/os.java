package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class os extends sb2 implements ms {
  os(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
  }
  
  public final void F1(a parama, ls paramls) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramls);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */