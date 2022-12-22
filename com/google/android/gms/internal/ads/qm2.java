package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class qm2 extends sb2 implements om2 {
  qm2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
  }
  
  public final xr2 b5() {
    Parcel parcel = Y0(2, a2());
    xr2 xr2 = as2.S9(parcel.readStrongBinder());
    parcel.recycle();
    return xr2;
  }
  
  public final void g2(um2 paramum2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramum2);
    i1(3, parcel);
  }
  
  public final void u3(a parama, zm2 paramzm2) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramzm2);
    i1(4, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */