package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class bn2 extends sb2 implements zm2 {
  bn2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
  }
  
  public final void E0() {
    i1(1, a2());
  }
  
  public final void H0() {
    i1(2, a2());
  }
  
  public final void t0(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */