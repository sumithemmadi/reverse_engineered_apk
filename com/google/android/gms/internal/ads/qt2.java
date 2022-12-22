package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class qt2 extends sb2 implements ot2 {
  qt2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
  }
  
  public final void I6() {
    i1(1, a2());
  }
  
  public final void N0() {
    i1(4, a2());
  }
  
  public final void a1() {
    i1(2, a2());
  }
  
  public final void q0() {
    i1(3, a2());
  }
  
  public final void w1(boolean paramBoolean) {
    Parcel parcel = a2();
    tb2.a(parcel, paramBoolean);
    i1(5, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */