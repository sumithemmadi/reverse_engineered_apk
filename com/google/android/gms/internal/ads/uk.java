package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class uk extends sb2 implements sk {
  uk(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
  }
  
  public final void R(String paramString1, String paramString2, Bundle paramBundle) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.d(parcel, (Parcelable)paramBundle);
    i1(3, parcel);
  }
  
  public final void l1(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(2, parcel);
  }
  
  public final void z6(String paramString1, String paramString2) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */