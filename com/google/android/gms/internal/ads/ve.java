package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class ve extends sb2 implements te {
  ve(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
  }
  
  public final void A3() {
    i1(3, a2());
  }
  
  public final void O7(a parama, String paramString1, String paramString2) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    i1(2, parcel);
  }
  
  public final void g1(Intent paramIntent) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramIntent);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */