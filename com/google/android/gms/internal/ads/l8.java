package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class l8 extends sb2 implements k8 {
  l8(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
  }
  
  public final void E5(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(2, parcel);
  }
  
  public final void Z6() {
    i1(1, a2());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */