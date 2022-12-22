package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class p4 extends sb2 implements n4 {
  p4(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
  }
  
  public final void e4(e4 parame4) {
    Parcel parcel = a2();
    tb2.c(parcel, parame4);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */