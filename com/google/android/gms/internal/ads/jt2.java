package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class jt2 extends sb2 implements ht2 {
  jt2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
  }
  
  public final List<zzvw> U5() {
    Parcel parcel = Y0(3, a2());
    ArrayList<zzvw> arrayList = parcel.createTypedArrayList(zzvw.CREATOR);
    parcel.recycle();
    return arrayList;
  }
  
  public final String a() {
    Parcel parcel = Y0(1, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final String s7() {
    Parcel parcel = Y0(2, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */