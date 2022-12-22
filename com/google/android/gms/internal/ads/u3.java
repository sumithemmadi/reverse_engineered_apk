package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class u3 extends sb2 implements r3 {
  u3(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
  }
  
  public final IBinder R4(a parama1, a parama2, a parama3, int paramInt) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama1);
    tb2.c(parcel2, (IInterface)parama2);
    tb2.c(parcel2, (IInterface)parama3);
    parcel2.writeInt(204204000);
    Parcel parcel1 = Y0(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    parcel1.recycle();
    return iBinder;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */