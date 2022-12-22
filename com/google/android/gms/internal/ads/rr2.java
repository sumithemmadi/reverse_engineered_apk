package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class rr2 extends sb2 implements pr2 {
  rr2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  public final void Y5(zzvl paramzzvl) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvl);
    i1(1, parcel);
  }
  
  public final boolean r() {
    Parcel parcel = Y0(3, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */