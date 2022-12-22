package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class bs2 extends sb2 implements cs2 {
  bs2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
  }
  
  public final IBinder A4(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt1, int paramInt2) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.d(parcel2, (Parcelable)paramzzvs);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(204204000);
    parcel2.writeInt(paramInt2);
    Parcel parcel1 = Y0(2, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    parcel1.recycle();
    return iBinder;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bs2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */