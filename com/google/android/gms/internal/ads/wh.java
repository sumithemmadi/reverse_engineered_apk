package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class wh extends sb2 implements uh {
  wh(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public final void D0() {
    i1(6, a2());
  }
  
  public final void D5(kh paramkh) {
    Parcel parcel = a2();
    tb2.c(parcel, paramkh);
    i1(5, parcel);
  }
  
  public final void I() {
    i1(3, a2());
  }
  
  public final void K() {
    i1(8, a2());
  }
  
  public final void e1() {
    i1(4, a2());
  }
  
  public final void f1() {
    i1(2, a2());
  }
  
  public final void j1() {
    i1(1, a2());
  }
  
  public final void w0(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(7, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */