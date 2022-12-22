package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class j5 extends sb2 implements h5 {
  j5(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
  }
  
  public final boolean u8(a parama) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    Parcel parcel1 = Y0(2, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */