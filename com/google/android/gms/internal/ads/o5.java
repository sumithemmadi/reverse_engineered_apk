package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;
import java.util.List;

public final class o5 extends sb2 implements m5 {
  o5(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  public final String B() {
    Parcel parcel = Y0(7, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final String C() {
    Parcel parcel = Y0(9, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final List D6() {
    Parcel parcel = Y0(23, a2());
    ArrayList arrayList = tb2.f(parcel);
    parcel.recycle();
    return arrayList;
  }
  
  public final a e() {
    Parcel parcel = Y0(19, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final String f() {
    Parcel parcel = Y0(2, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final f3 g() {
    f3 f3;
    Parcel parcel = Y0(14, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
      if (iInterface instanceof f3) {
        f3 = (f3)iInterface;
      } else {
        f3 = new h3((IBinder)f3);
      } 
    } 
    parcel.recycle();
    return f3;
  }
  
  public final nt2 getVideoController() {
    Parcel parcel = Y0(11, a2());
    nt2 nt2 = mt2.S9(parcel.readStrongBinder());
    parcel.recycle();
    return nt2;
  }
  
  public final String h() {
    Parcel parcel = Y0(6, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final String j() {
    Parcel parcel = Y0(4, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final List k() {
    Parcel parcel = Y0(3, a2());
    ArrayList arrayList = tb2.f(parcel);
    parcel.recycle();
    return arrayList;
  }
  
  public final String s() {
    Parcel parcel = Y0(10, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final m3 t() {
    IInterface iInterface;
    Parcel parcel = Y0(5, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iInterface = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if (iInterface instanceof m3) {
        iInterface = iInterface;
      } else {
        iInterface = new o3(iBinder);
      } 
    } 
    parcel.recycle();
    return (m3)iInterface;
  }
  
  public final a v() {
    Parcel parcel = Y0(18, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final double w() {
    Parcel parcel = Y0(8, a2());
    double d = parcel.readDouble();
    parcel.recycle();
    return d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */