package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class h3 extends sb2 implements f3 {
  h3(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public final String R1() {
    Parcel parcel = Y0(2, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final List<m3> v4() {
    Parcel parcel = Y0(3, a2());
    ArrayList<m3> arrayList = tb2.f(parcel);
    parcel.recycle();
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */