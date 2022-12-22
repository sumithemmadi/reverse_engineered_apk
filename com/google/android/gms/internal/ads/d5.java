package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class d5 extends sb2 implements b5 {
  d5(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
  }
  
  public final void p2(xr2 paramxr2, a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, paramxr2);
    tb2.c(parcel, (IInterface)parama);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */