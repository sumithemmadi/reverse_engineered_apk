package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzaq;

public final class og extends sb2 implements mg {
  og(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
  }
  
  public final void A1(ParcelFileDescriptor paramParcelFileDescriptor) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramParcelFileDescriptor);
    i1(1, parcel);
  }
  
  public final void K4(zzaq paramzzaq) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzaq);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/og.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */