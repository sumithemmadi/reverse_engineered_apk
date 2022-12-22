package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class as2 extends ub2 implements xr2 {
  public as2() {
    super("com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public static xr2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    return (iInterface instanceof xr2) ? (xr2)iInterface : new zr2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IBinder iBinder8;
    ns2 ns2;
    IBinder iBinder7;
    IInterface iInterface1;
    IBinder iBinder6;
    gt2 gt2;
    ht2 ht2;
    Bundle bundle;
    IBinder iBinder5;
    es2 es2;
    String str3;
    jr2 jr22;
    fs2 fs22;
    String str2;
    nt2 nt2;
    IBinder iBinder4;
    ls2 ls2;
    IBinder iBinder3;
    ir2 ir2;
    String str1;
    zzvs zzvs;
    IBinder iBinder2;
    fs2 fs21;
    IBinder iBinder1;
    jr2 jr21;
    zzvl zzvl;
    boolean bool;
    IInterface iInterface2 = null;
    IBinder iBinder9 = null;
    IBinder iBinder10 = null;
    IBinder iBinder11 = null;
    IBinder iBinder12 = null;
    IBinder iBinder13 = null;
    IBinder iBinder14 = null;
    IBinder iBinder15 = null;
    switch (paramInt1) {
      default:
        return false;
      case 45:
        iBinder8 = paramParcel1.readStrongBinder();
        if (iBinder8 == null) {
          iBinder8 = iBinder15;
        } else {
          iInterface2 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
          if (iInterface2 instanceof ns2) {
            ns2 = (ns2)iInterface2;
          } else {
            ns2 = new ps2((IBinder)ns2);
          } 
        } 
        O4(ns2);
        paramParcel2.writeNoException();
        return true;
      case 44:
        p0(a.a.i1(ns2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 43:
        zzvl = tb2.<zzvl>b((Parcel)ns2, zzvl.CREATOR);
        iBinder7 = ns2.readStrongBinder();
        if (iBinder7 == null) {
          iInterface1 = iInterface2;
        } else {
          iInterface2 = iInterface1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
          if (iInterface2 instanceof or2) {
            iInterface1 = iInterface2;
          } else {
            iInterface1 = new qr2((IBinder)iInterface1);
          } 
        } 
        U4(zzvl, (or2)iInterface1);
        paramParcel2.writeNoException();
        return true;
      case 42:
        iBinder6 = iInterface1.readStrongBinder();
        if (iBinder6 == null) {
          iBinder6 = iBinder9;
        } else {
          iInterface2 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
          if (iInterface2 instanceof gt2) {
            gt2 = (gt2)iInterface2;
          } else {
            gt2 = new it2((IBinder)gt2);
          } 
        } 
        U(gt2);
        paramParcel2.writeNoException();
        return true;
      case 41:
        ht2 = p();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ht2);
        return true;
      case 40:
        h3(sm2.S9(ht2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 39:
        Z7(tb2.<zzvx>b((Parcel)ht2, zzvx.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 38:
        R6(ht2.readString());
        paramParcel2.writeNoException();
        return true;
      case 37:
        bundle = H();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 36:
        iBinder5 = bundle.readStrongBinder();
        if (iBinder5 == null) {
          iBinder5 = iBinder10;
        } else {
          iInterface2 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
          if (iInterface2 instanceof es2) {
            es2 = (es2)iInterface2;
          } else {
            es2 = new gs2((IBinder)es2);
          } 
        } 
        b1(es2);
        paramParcel2.writeNoException();
        return true;
      case 35:
        str3 = X0();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 34:
        o(tb2.e((Parcel)str3));
        paramParcel2.writeNoException();
        return true;
      case 33:
        jr22 = t3();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, jr22);
        return true;
      case 32:
        fs22 = b7();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, fs22);
        return true;
      case 31:
        str2 = E8();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 30:
        B6(tb2.<zzzi>b((Parcel)str2, zzzi.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 29:
        K2(tb2.<zzaau>b((Parcel)str2, zzaau.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 26:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
        return true;
      case 25:
        y0(nt2.readString());
        paramParcel2.writeNoException();
        return true;
      case 24:
        K0(xh.S9(nt2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 23:
        bool = r();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 22:
        c2(tb2.e((Parcel)nt2));
        paramParcel2.writeNoException();
        return true;
      case 21:
        iBinder4 = nt2.readStrongBinder();
        if (iBinder4 == null) {
          iBinder4 = iBinder11;
        } else {
          iInterface2 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
          if (iInterface2 instanceof ls2) {
            ls2 = (ls2)iInterface2;
          } else {
            ls2 = new os2((IBinder)ls2);
          } 
        } 
        q3(ls2);
        paramParcel2.writeNoException();
        return true;
      case 20:
        iBinder3 = ls2.readStrongBinder();
        if (iBinder3 == null) {
          iBinder3 = iBinder12;
        } else {
          iInterface2 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
          if (iInterface2 instanceof ir2) {
            ir2 = (ir2)iInterface2;
          } else {
            ir2 = new kr2((IBinder)ir2);
          } 
        } 
        i4(ir2);
        paramParcel2.writeNoException();
        return true;
      case 19:
        d9(h1.S9(ir2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 18:
        str1 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str1);
        return true;
      case 15:
        Z3(sf.S9(str1.readStrongBinder()), str1.readString());
        paramParcel2.writeNoException();
        return true;
      case 14:
        g8(of.S9(str1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 13:
        n5(tb2.<zzvs>b((Parcel)str1, zzvs.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 12:
        zzvs = L9();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)zzvs);
        return true;
      case 11:
        G8();
        paramParcel2.writeNoException();
        return true;
      case 10:
        f6();
        paramParcel2.writeNoException();
        return true;
      case 9:
        showInterstitial();
        paramParcel2.writeNoException();
        return true;
      case 8:
        iBinder2 = zzvs.readStrongBinder();
        if (iBinder2 == null) {
          iBinder2 = iBinder13;
        } else {
          iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
          if (iInterface2 instanceof fs2) {
            fs21 = (fs2)iInterface2;
          } else {
            fs21 = new hs2((IBinder)fs21);
          } 
        } 
        y6(fs21);
        paramParcel2.writeNoException();
        return true;
      case 7:
        iBinder1 = fs21.readStrongBinder();
        if (iBinder1 == null) {
          iBinder1 = iBinder14;
        } else {
          iInterface2 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
          if (iInterface2 instanceof jr2) {
            jr21 = (jr2)iInterface2;
          } else {
            jr21 = new lr2((IBinder)jr21);
          } 
        } 
        U6(jr21);
        paramParcel2.writeNoException();
        return true;
      case 6:
        J();
        paramParcel2.writeNoException();
        return true;
      case 5:
        pause();
        paramParcel2.writeNoException();
        return true;
      case 4:
        bool = o7(tb2.<zzvl>b((Parcel)jr21, zzvl.CREATOR));
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 3:
        bool = m();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 2:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    a a = Z2();
    paramParcel2.writeNoException();
    tb2.c(paramParcel2, (IInterface)a);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/as2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */