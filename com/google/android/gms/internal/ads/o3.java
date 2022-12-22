package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class o3 extends sb2 implements m3 {
  o3(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public final a D9() {
    Parcel parcel = Y0(1, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final double N5() {
    Parcel parcel = Y0(3, a2());
    double d = parcel.readDouble();
    parcel.recycle();
    return d;
  }
  
  public final Uri e0() {
    Parcel parcel = Y0(2, a2());
    Uri uri = tb2.<Uri>b(parcel, Uri.CREATOR);
    parcel.recycle();
    return uri;
  }
  
  public final int getHeight() {
    Parcel parcel = Y0(5, a2());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
  
  public final int getWidth() {
    Parcel parcel = Y0(4, a2());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */