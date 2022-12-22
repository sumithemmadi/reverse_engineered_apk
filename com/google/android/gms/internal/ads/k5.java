package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class k5 extends sb2 implements i5 {
  k5(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
  }
  
  public final void E9() {
    i1(2, a2());
  }
  
  public final void n7(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(1, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */