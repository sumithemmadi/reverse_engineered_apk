package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class b8 extends sb2 implements z7 {
  b8(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
  }
  
  public final void p3(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */