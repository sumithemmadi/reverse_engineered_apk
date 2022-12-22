package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class q8 extends sb2 implements p8 {
  q8(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
  }
  
  public final void L8(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(2, parcel);
  }
  
  public final void b4(j8 paramj8) {
    Parcel parcel = a2();
    tb2.c(parcel, paramj8);
    i1(1, parcel);
  }
  
  public final void z3(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */