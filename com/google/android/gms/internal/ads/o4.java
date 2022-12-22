package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class o4 extends sb2 implements m4 {
  o4(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
  }
  
  public final void c7(a4 parama4) {
    Parcel parcel = a2();
    tb2.c(parcel, parama4);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */