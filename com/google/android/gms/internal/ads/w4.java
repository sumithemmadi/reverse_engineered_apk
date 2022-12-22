package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class w4 extends sb2 implements t4 {
  w4(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
  }
  
  public final void w8(i4 parami4) {
    Parcel parcel = a2();
    tb2.c(parcel, parami4);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */