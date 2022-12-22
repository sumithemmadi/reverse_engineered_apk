package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class j3 extends sb2 implements i3 {
  j3(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
  }
  
  public final a l6() {
    Parcel parcel = Y0(4, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */