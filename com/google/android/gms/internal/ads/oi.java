package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class oi extends ub2 implements li {
  public oi() {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
  }
  
  public static li S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    return (iInterface instanceof li) ? (li)iInterface : new ni(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IBinder iBinder4;
    ti ti2;
    ht2 ht2;
    ki ki;
    Bundle bundle;
    IBinder iBinder3;
    yi yi;
    String str;
    IBinder iBinder2;
    qi qi;
    zzvl zzvl1;
    ti ti1;
    boolean bool;
    IBinder iBinder5 = null;
    IBinder iBinder6 = null;
    zzvl zzvl2 = null;
    IBinder iBinder7 = null;
    switch (paramInt1) {
      default:
        return false;
      case 15:
        o(tb2.e(paramParcel1));
        paramParcel2.writeNoException();
        return true;
      case 14:
        zzvl2 = tb2.<zzvl>b(paramParcel1, zzvl.CREATOR);
        iBinder4 = paramParcel1.readStrongBinder();
        if (iBinder4 == null) {
          iBinder4 = iBinder7;
        } else {
          IInterface iInterface = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
          if (iInterface instanceof ti) {
            ti2 = (ti)iInterface;
          } else {
            ti2 = new vi((IBinder)ti2);
          } 
        } 
        v8(zzvl2, ti2);
        paramParcel2.writeNoException();
        return true;
      case 13:
        U(ft2.S9(ti2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 12:
        ht2 = p();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ht2);
        return true;
      case 11:
        ki = M7();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ki);
        return true;
      case 10:
        M9(a.a.i1(ki.readStrongBinder()), tb2.e((Parcel)ki));
        paramParcel2.writeNoException();
        return true;
      case 9:
        bundle = H();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 8:
        E1(et2.S9(bundle.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 7:
        E7(tb2.<zzawh>b((Parcel)bundle, zzawh.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 6:
        iBinder3 = bundle.readStrongBinder();
        if (iBinder3 == null) {
          iBinder3 = iBinder5;
        } else {
          IInterface iInterface = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
          if (iInterface instanceof yi) {
            yi = (yi)iInterface;
          } else {
            yi = new xi((IBinder)yi);
          } 
        } 
        A2(yi);
        paramParcel2.writeNoException();
        return true;
      case 5:
        p0(a.a.i1(yi.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4:
        str = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 3:
        bool = O0();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 2:
        iBinder2 = str.readStrongBinder();
        if (iBinder2 == null) {
          iBinder2 = iBinder6;
        } else {
          IInterface iInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
          if (iInterface instanceof qi) {
            qi = (qi)iInterface;
          } else {
            qi = new si((IBinder)qi);
          } 
        } 
        d3(qi);
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    zzvl zzvl3 = tb2.<zzvl>b((Parcel)qi, zzvl.CREATOR);
    IBinder iBinder1 = qi.readStrongBinder();
    if (iBinder1 == null) {
      zzvl1 = zzvl2;
    } else {
      IInterface iInterface = zzvl1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
      if (iInterface instanceof ti) {
        ti1 = (ti)iInterface;
      } else {
        ti1 = new vi((IBinder)ti1);
      } 
    } 
    w7(zzvl3, ti1);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */