package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class ni extends sb2 implements li {
  ni(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
  }
  
  public final boolean O0() {
    Parcel parcel = Y0(3, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final void d3(qi paramqi) {
    Parcel parcel = a2();
    tb2.c(parcel, paramqi);
    i1(2, parcel);
  }
  
  public final void p0(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(5, parcel);
  }
  
  public final void w7(zzvl paramzzvl, ti paramti) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvl);
    tb2.c(parcel, paramti);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */