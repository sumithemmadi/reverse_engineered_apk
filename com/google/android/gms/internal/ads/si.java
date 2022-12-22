package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class si extends sb2 implements qi {
  si(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
  }
  
  public final void L2() {
    i1(1, a2());
  }
  
  public final void O8(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(4, parcel);
  }
  
  public final void T1() {
    i1(2, a2());
  }
  
  public final void h1(ki paramki) {
    Parcel parcel = a2();
    tb2.c(parcel, paramki);
    i1(3, parcel);
  }
  
  public final void v9(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(5, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */