package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class u4 extends sb2 implements s4 {
  u4(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
  }
  
  public final void I0(i4 parami4, String paramString) {
    Parcel parcel = a2();
    tb2.c(parcel, parami4);
    parcel.writeString(paramString);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */