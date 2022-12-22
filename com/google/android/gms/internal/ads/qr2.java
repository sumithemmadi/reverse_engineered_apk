package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class qr2 extends sb2 implements or2 {
  qr2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
  }
  
  public final void E(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(2, parcel);
  }
  
  public final void i() {
    i1(1, a2());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */