package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class hs2 extends sb2 implements fs2 {
  hs2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
  }
  
  public final void n(String paramString1, String paramString2) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hs2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */