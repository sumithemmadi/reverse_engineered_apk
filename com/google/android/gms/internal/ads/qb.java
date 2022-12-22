package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class qb extends ub2 implements rb {
  public qb() {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    zzapy zzapy;
    IBinder iBinder6;
    sb sb5;
    IBinder iBinder5;
    sb sb4;
    fc fc;
    nt2 nt2;
    i4 i4;
    Bundle bundle;
    ac ac;
    zb zb;
    IBinder iBinder4;
    String str1;
    sb sb3;
    IBinder iBinder3;
    zzvl zzvl1;
    sb sb2;
    IBinder iBinder2;
    sb sb1;
    a a1;
    IInterface iInterface1;
    zzvl zzvl2;
    a a2;
    String str2;
    String str4;
    zzvs zzvs2;
    IBinder iBinder8;
    a a5;
    sb sb6;
    zzvl zzvl3;
    String str6;
    a a6;
    IInterface iInterface2;
    a a7;
    String str7;
    boolean bool;
    IBinder iBinder7 = null;
    String str3 = null;
    a a4 = null;
    zzvl zzvl4 = null;
    IBinder iBinder9 = null;
    IInterface iInterface3 = null;
    IBinder iBinder10 = null;
    switch (paramInt1) {
      default:
        return false;
      case 34:
        zzapy = v0();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)zzapy);
        return true;
      case 33:
        zzapy = F0();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)zzapy);
        return true;
      case 32:
        a4 = a.a.i1(zzapy.readStrongBinder());
        zzvl4 = tb2.<zzvl>b((Parcel)zzapy, zzvl.CREATOR);
        str3 = zzapy.readString();
        iBinder6 = zzapy.readStrongBinder();
        if (iBinder6 == null) {
          iBinder6 = iBinder10;
        } else {
          iInterface3 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if (iInterface3 instanceof sb) {
            sb5 = (sb)iInterface3;
          } else {
            sb5 = new ub((IBinder)sb5);
          } 
        } 
        z7(a4, zzvl4, str3, sb5);
        paramParcel2.writeNoException();
        return true;
      case 31:
        B8(a.a.i1(sb5.readStrongBinder()), y7.S9(sb5.readStrongBinder()), sb5.createTypedArrayList(zzajr.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 30:
        Q8(a.a.i1(sb5.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 28:
        a2 = a.a.i1(sb5.readStrongBinder());
        zzvl4 = tb2.<zzvl>b((Parcel)sb5, zzvl.CREATOR);
        str4 = sb5.readString();
        iBinder5 = sb5.readStrongBinder();
        if (iBinder5 == null) {
          iBinder5 = iBinder7;
        } else {
          iInterface3 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if (iInterface3 instanceof sb) {
            sb4 = (sb)iInterface3;
          } else {
            sb4 = new ub((IBinder)sb4);
          } 
        } 
        p6(a2, zzvl4, str4, sb4);
        paramParcel2.writeNoException();
        return true;
      case 27:
        fc = M4();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, fc);
        return true;
      case 26:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
        return true;
      case 25:
        o(tb2.e((Parcel)nt2));
        paramParcel2.writeNoException();
        return true;
      case 24:
        i4 = a6();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, i4);
        return true;
      case 23:
        Q4(a.a.i1(i4.readStrongBinder()), ei.S9(i4.readStrongBinder()), i4.createStringArrayList());
        paramParcel2.writeNoException();
        return true;
      case 22:
        bool = c4();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 21:
        S5(a.a.i1(i4.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 20:
        A5(tb2.<zzvl>b((Parcel)i4, zzvl.CREATOR), i4.readString(), i4.readString());
        paramParcel2.writeNoException();
        return true;
      case 19:
        bundle = p5();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 18:
        bundle = getInterstitialAdapterInfo();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 17:
        bundle = zzux();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 16:
        ac = z5();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ac);
        return true;
      case 15:
        zb = S6();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, zb);
        return true;
      case 14:
        a7 = a.a.i1(zb.readStrongBinder());
        zzvl2 = tb2.<zzvl>b((Parcel)zb, zzvl.CREATOR);
        str4 = zb.readString();
        str6 = zb.readString();
        iBinder8 = zb.readStrongBinder();
        if (iBinder8 == null) {
          a5 = a2;
        } else {
          IInterface iInterface = a5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if (iInterface instanceof sb) {
            sb6 = (sb)iInterface;
          } else {
            sb6 = new ub((IBinder)sb6);
          } 
        } 
        W1(a7, zzvl2, str4, str6, sb6, tb2.<zzaeh>b((Parcel)zb, zzaeh.CREATOR), zb.createStringArrayList());
        paramParcel2.writeNoException();
        return true;
      case 13:
        bool = isInitialized();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 12:
        showVideo();
        paramParcel2.writeNoException();
        return true;
      case 11:
        p1(tb2.<zzvl>b((Parcel)zb, zzvl.CREATOR), zb.readString());
        paramParcel2.writeNoException();
        return true;
      case 10:
        F4(a.a.i1(zb.readStrongBinder()), tb2.<zzvl>b((Parcel)zb, zzvl.CREATOR), zb.readString(), ei.S9(zb.readStrongBinder()), zb.readString());
        paramParcel2.writeNoException();
        return true;
      case 9:
        J();
        paramParcel2.writeNoException();
        return true;
      case 8:
        pause();
        paramParcel2.writeNoException();
        return true;
      case 7:
        a7 = a.a.i1(zb.readStrongBinder());
        zzvl3 = tb2.<zzvl>b((Parcel)zb, zzvl.CREATOR);
        str2 = zb.readString();
        str6 = zb.readString();
        iBinder4 = zb.readStrongBinder();
        if (iBinder4 == null) {
          str1 = str4;
        } else {
          IInterface iInterface = str1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if (iInterface instanceof sb) {
            sb3 = (sb)iInterface;
          } else {
            sb3 = new ub((IBinder)sb3);
          } 
        } 
        j9(a7, zzvl3, str2, str6, sb3);
        paramParcel2.writeNoException();
        return true;
      case 6:
        a6 = a.a.i1(sb3.readStrongBinder());
        zzvs2 = tb2.<zzvs>b((Parcel)sb3, zzvs.CREATOR);
        zzvl2 = tb2.<zzvl>b((Parcel)sb3, zzvl.CREATOR);
        str7 = sb3.readString();
        str2 = sb3.readString();
        iBinder3 = sb3.readStrongBinder();
        if (iBinder3 == null) {
          zzvl1 = zzvl3;
        } else {
          IInterface iInterface = zzvl1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if (iInterface instanceof sb) {
            sb2 = (sb)iInterface;
          } else {
            sb2 = new ub((IBinder)sb2);
          } 
        } 
        r2(a6, zzvs2, zzvl2, str7, str2, sb2);
        paramParcel2.writeNoException();
        return true;
      case 5:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 4:
        showInterstitial();
        paramParcel2.writeNoException();
        return true;
      case 3:
        a3 = a.a.i1(sb2.readStrongBinder());
        zzvl3 = tb2.<zzvl>b((Parcel)sb2, zzvl.CREATOR);
        str2 = sb2.readString();
        iBinder2 = sb2.readStrongBinder();
        if (iBinder2 == null) {
          iBinder2 = iBinder9;
        } else {
          iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if (iInterface2 instanceof sb) {
            sb1 = (sb)iInterface2;
          } else {
            sb1 = new ub((IBinder)sb1);
          } 
        } 
        z9(a3, zzvl3, str2, sb1);
        paramParcel2.writeNoException();
        return true;
      case 2:
        a1 = c8();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a1);
        return true;
      case 1:
        break;
    } 
    a a3 = a.a.i1(a1.readStrongBinder());
    zzvs zzvs1 = tb2.<zzvs>b((Parcel)a1, zzvs.CREATOR);
    zzvl zzvl5 = tb2.<zzvl>b((Parcel)a1, zzvl.CREATOR);
    String str5 = a1.readString();
    IBinder iBinder1 = a1.readStrongBinder();
    if (iBinder1 == null) {
      iInterface1 = iInterface2;
    } else {
      iInterface2 = iInterface1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      if (iInterface2 instanceof sb) {
        iInterface1 = iInterface2;
      } else {
        iInterface1 = new ub((IBinder)iInterface1);
      } 
    } 
    u1(a3, zzvs1, zzvl5, str5, (sb)iInterface1);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */