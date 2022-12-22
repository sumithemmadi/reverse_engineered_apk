package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class vm2 extends sb2 implements tm2 {
  vm2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
  }
  
  public final void G6(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(2, parcel);
  }
  
  public final void M3(om2 paramom2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramom2);
    i1(1, parcel);
  }
  
  public final void W7(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */