package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class k4 extends sb2 implements i4 {
  k4(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public final boolean h5(a parama) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    Parcel parcel1 = Y0(10, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
  
  public final a h8() {
    Parcel parcel = Y0(9, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final String u0() {
    Parcel parcel = Y0(4, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */