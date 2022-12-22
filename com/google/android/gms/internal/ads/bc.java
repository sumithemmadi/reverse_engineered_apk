package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;
import java.util.List;

public final class bc extends sb2 implements zb {
  bc(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  public final String C() {
    Parcel parcel = Y0(8, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final void F(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(16, parcel);
  }
  
  public final boolean M() {
    Parcel parcel = Y0(13, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final void N(a parama1, a parama2, a parama3) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama1);
    tb2.c(parcel, (IInterface)parama2);
    tb2.c(parcel, (IInterface)parama3);
    i1(22, parcel);
  }
  
  public final a W() {
    Parcel parcel = Y0(20, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final a a0() {
    Parcel parcel = Y0(18, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final void b0(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(11, parcel);
  }
  
  public final Bundle d() {
    Parcel parcel = Y0(15, a2());
    Bundle bundle = tb2.<Bundle>b(parcel, Bundle.CREATOR);
    parcel.recycle();
    return bundle;
  }
  
  public final boolean d0() {
    Parcel parcel = Y0(14, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final a e() {
    Parcel parcel = Y0(21, a2());
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
    Parcel parcel = Y0(19, a2());
    f3 f3 = e3.S9(parcel.readStrongBinder());
    parcel.recycle();
    return f3;
  }
  
  public final nt2 getVideoController() {
    Parcel parcel = Y0(17, a2());
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
  
  public final void q() {
    i1(10, a2());
  }
  
  public final String s() {
    Parcel parcel = Y0(9, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final m3 t() {
    Parcel parcel = Y0(5, a2());
    m3 m3 = l3.S9(parcel.readStrongBinder());
    parcel.recycle();
    return m3;
  }
  
  public final double w() {
    Parcel parcel = Y0(7, a2());
    double d = parcel.readDouble();
    parcel.recycle();
    return d;
  }
  
  public final void x0(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(12, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */