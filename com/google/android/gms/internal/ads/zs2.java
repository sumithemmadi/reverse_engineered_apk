package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zs2 extends sb2 implements ys2 {
  zs2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
  }
  
  public final String P7() {
    Parcel parcel = Y0(2, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final String Z0() {
    Parcel parcel = Y0(1, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zs2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */