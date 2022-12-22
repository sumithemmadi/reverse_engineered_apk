package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class zr2 extends sb2 implements xr2 {
  zr2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public final String E8() {
    Parcel parcel = Y0(31, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final Bundle H() {
    Parcel parcel = Y0(37, a2());
    Bundle bundle = tb2.<Bundle>b(parcel, Bundle.CREATOR);
    parcel.recycle();
    return bundle;
  }
  
  public final void J() {
    i1(6, a2());
  }
  
  public final void K0(uh paramuh) {
    Parcel parcel = a2();
    tb2.c(parcel, paramuh);
    i1(24, parcel);
  }
  
  public final void K2(zzaau paramzzaau) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzaau);
    i1(29, parcel);
  }
  
  public final zzvs L9() {
    Parcel parcel = Y0(12, a2());
    zzvs zzvs = tb2.<zzvs>b(parcel, zzvs.CREATOR);
    parcel.recycle();
    return zzvs;
  }
  
  public final void U(gt2 paramgt2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramgt2);
    i1(42, parcel);
  }
  
  public final void U6(jr2 paramjr2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramjr2);
    i1(7, parcel);
  }
  
  public final String X0() {
    Parcel parcel = Y0(35, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final a Z2() {
    Parcel parcel = Y0(1, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final void Z7(zzvx paramzzvx) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvx);
    i1(39, parcel);
  }
  
  public final void b1(es2 parames2) {
    Parcel parcel = a2();
    tb2.c(parcel, parames2);
    i1(36, parcel);
  }
  
  public final void c2(boolean paramBoolean) {
    Parcel parcel = a2();
    tb2.a(parcel, paramBoolean);
    i1(22, parcel);
  }
  
  public final void d9(i1 parami1) {
    Parcel parcel = a2();
    tb2.c(parcel, parami1);
    i1(19, parcel);
  }
  
  public final void destroy() {
    i1(2, a2());
  }
  
  public final nt2 getVideoController() {
    IInterface iInterface;
    Parcel parcel = Y0(26, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iInterface = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
      if (iInterface instanceof nt2) {
        iInterface = iInterface;
      } else {
        iInterface = new pt2(iBinder);
      } 
    } 
    parcel.recycle();
    return (nt2)iInterface;
  }
  
  public final void h3(tm2 paramtm2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramtm2);
    i1(40, parcel);
  }
  
  public final void i4(ir2 paramir2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramir2);
    i1(20, parcel);
  }
  
  public final boolean m() {
    Parcel parcel = Y0(3, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final void n5(zzvs paramzzvs) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvs);
    i1(13, parcel);
  }
  
  public final void o(boolean paramBoolean) {
    Parcel parcel = a2();
    tb2.a(parcel, paramBoolean);
    i1(34, parcel);
  }
  
  public final boolean o7(zzvl paramzzvl) {
    Parcel parcel2 = a2();
    tb2.d(parcel2, (Parcelable)paramzzvl);
    Parcel parcel1 = Y0(4, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
  
  public final ht2 p() {
    IInterface iInterface;
    Parcel parcel = Y0(41, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iInterface = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
      if (iInterface instanceof ht2) {
        iInterface = iInterface;
      } else {
        iInterface = new jt2(iBinder);
      } 
    } 
    parcel.recycle();
    return (ht2)iInterface;
  }
  
  public final void pause() {
    i1(5, a2());
  }
  
  public final void showInterstitial() {
    i1(9, a2());
  }
  
  public final void y6(fs2 paramfs2) {
    Parcel parcel = a2();
    tb2.c(parcel, paramfs2);
    i1(8, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */