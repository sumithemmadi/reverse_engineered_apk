package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class c8 extends sb2 implements a8 {
  c8(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
  }
  
  public final void C8(List<zzajh> paramList) {
    Parcel parcel = a2();
    parcel.writeTypedList(paramList);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */