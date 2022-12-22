package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class lr2 extends sb2 implements jr2 {
  lr2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdListener");
  }
  
  public final void J0(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(8, parcel);
  }
  
  public final void L() {
    i1(5, a2());
  }
  
  public final void O() {
    i1(3, a2());
  }
  
  public final void S() {
    i1(7, a2());
  }
  
  public final void Y() {
    i1(1, a2());
  }
  
  public final void Z(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(2, parcel);
  }
  
  public final void i() {
    i1(4, a2());
  }
  
  public final void x() {
    i1(6, a2());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */