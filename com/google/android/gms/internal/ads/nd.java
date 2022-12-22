package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class nd extends ub2 implements kd {
  public nd() {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public static kd S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    return (iInterface instanceof kd) ? (kd)iInterface : new md(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    zzapy zzapy;
    zzvl zzvl = null;
    String str1 = null;
    String str2 = null;
    a a = null;
    IInterface iInterface = null;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 5) {
            if (paramInt1 != 10) {
              if (paramInt1 != 11) {
                a a2;
                zzvl zzvl1;
                zzvl zzvl2;
                String str5;
                IBinder iBinder4;
                zzvl zzvl4;
                ed ed;
                IBinder iBinder3;
                a a3;
                jd jd;
                IBinder iBinder2;
                zzvl zzvl3;
                dd dd;
                String str6;
                yc yc;
                IBinder iBinder5;
                String str7;
                a a4;
                boolean bool;
                switch (paramInt1) {
                  default:
                    return false;
                  case 20:
                    str2 = paramParcel1.readString();
                    str1 = paramParcel1.readString();
                    zzvl = tb2.<zzvl>b(paramParcel1, zzvl.CREATOR);
                    a = a.a.i1(paramParcel1.readStrongBinder());
                    iBinder5 = paramParcel1.readStrongBinder();
                    if (iBinder5 != null) {
                      iInterface = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                      if (iInterface instanceof jd) {
                        iInterface = iInterface;
                      } else {
                        iInterface = new ld(iBinder5);
                      } 
                    } 
                    B5(str2, str1, zzvl, a, (jd)iInterface, vb.S9(paramParcel1.readStrongBinder()));
                    paramParcel2.writeNoException();
                    return true;
                  case 19:
                    G1(paramParcel1.readString());
                    paramParcel2.writeNoException();
                    return true;
                  case 18:
                    str5 = paramParcel1.readString();
                    str7 = paramParcel1.readString();
                    zzvl2 = tb2.<zzvl>b(paramParcel1, zzvl.CREATOR);
                    a2 = a.a.i1(paramParcel1.readStrongBinder());
                    iBinder4 = paramParcel1.readStrongBinder();
                    if (iBinder4 == null) {
                      zzvl4 = zzvl;
                    } else {
                      IInterface iInterface1 = zzvl4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                      if (iInterface1 instanceof ed) {
                        ed = (ed)iInterface1;
                      } else {
                        ed = new gd((IBinder)ed);
                      } 
                    } 
                    U3(str5, str7, zzvl2, a2, ed, vb.S9(paramParcel1.readStrongBinder()));
                    paramParcel2.writeNoException();
                    return true;
                  case 17:
                    bool = U8(a.a.i1(paramParcel1.readStrongBinder()));
                    paramParcel2.writeNoException();
                    tb2.a(paramParcel2, bool);
                    return true;
                  case 16:
                    str5 = paramParcel1.readString();
                    str3 = paramParcel1.readString();
                    zzvl2 = tb2.<zzvl>b(paramParcel1, zzvl.CREATOR);
                    a4 = a.a.i1(paramParcel1.readStrongBinder());
                    iBinder3 = paramParcel1.readStrongBinder();
                    if (iBinder3 == null) {
                      a3 = a2;
                    } else {
                      IInterface iInterface1 = a3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                      if (iInterface1 instanceof jd) {
                        jd = (jd)iInterface1;
                      } else {
                        jd = new ld((IBinder)jd);
                      } 
                    } 
                    u4(str5, str3, zzvl2, a4, jd, vb.S9(paramParcel1.readStrongBinder()));
                    paramParcel2.writeNoException();
                    return true;
                  case 15:
                    bool = a4(a.a.i1(paramParcel1.readStrongBinder()));
                    paramParcel2.writeNoException();
                    tb2.a(paramParcel2, bool);
                    return true;
                  case 14:
                    str3 = paramParcel1.readString();
                    str5 = paramParcel1.readString();
                    zzvl1 = tb2.<zzvl>b(paramParcel1, zzvl.CREATOR);
                    a4 = a.a.i1(paramParcel1.readStrongBinder());
                    iBinder2 = paramParcel1.readStrongBinder();
                    if (iBinder2 == null) {
                      zzvl3 = zzvl2;
                    } else {
                      IInterface iInterface1 = zzvl3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                      if (iInterface1 instanceof dd) {
                        dd = (dd)iInterface1;
                      } else {
                        dd = new fd((IBinder)dd);
                      } 
                    } 
                    v7(str3, str5, zzvl1, a4, dd, vb.S9(paramParcel1.readStrongBinder()));
                    paramParcel2.writeNoException();
                    return true;
                  case 13:
                    break;
                } 
                String str3 = paramParcel1.readString();
                String str4 = paramParcel1.readString();
                zzvl zzvl5 = tb2.<zzvl>b(paramParcel1, zzvl.CREATOR);
                a a1 = a.a.i1(paramParcel1.readStrongBinder());
                IBinder iBinder1 = paramParcel1.readStrongBinder();
                if (iBinder1 == null) {
                  str6 = str5;
                } else {
                  IInterface iInterface1 = str6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                  if (iInterface1 instanceof yc) {
                    yc = (yc)iInterface1;
                  } else {
                    yc = new ad((IBinder)yc);
                  } 
                } 
                I4(str3, str4, zzvl5, a1, yc, vb.S9(paramParcel1.readStrongBinder()), tb2.<zzvs>b(paramParcel1, zzvs.CREATOR));
                paramParcel2.writeNoException();
              } else {
                H7(paramParcel1.createStringArray(), (Bundle[])paramParcel1.createTypedArray(Bundle.CREATOR));
                paramParcel2.writeNoException();
              } 
            } else {
              F3(a.a.i1(paramParcel1.readStrongBinder()));
              paramParcel2.writeNoException();
            } 
          } else {
            nt2 nt2 = getVideoController();
            paramParcel2.writeNoException();
            tb2.c(paramParcel2, nt2);
          } 
        } else {
          zzapy = v0();
          paramParcel2.writeNoException();
          tb2.g(paramParcel2, (Parcelable)zzapy);
        } 
      } else {
        zzapy = F0();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)zzapy);
      } 
    } else {
      pd pd;
      a a1 = a.a.i1(zzapy.readStrongBinder());
      str1 = zzapy.readString();
      Parcelable.Creator<Bundle> creator = Bundle.CREATOR;
      Bundle bundle1 = tb2.<Bundle>b((Parcel)zzapy, creator);
      Bundle bundle2 = tb2.<Bundle>b((Parcel)zzapy, creator);
      zzvs zzvs = tb2.<zzvs>b((Parcel)zzapy, zzvs.CREATOR);
      IBinder iBinder = zzapy.readStrongBinder();
      if (iBinder == null) {
        iBinder = null;
      } else {
        IInterface iInterface1 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        if (iInterface1 instanceof pd) {
          pd = (pd)iInterface1;
        } else {
          pd = new rd((IBinder)pd);
        } 
      } 
      J5(a1, str1, bundle1, bundle2, zzvs, pd);
      paramParcel2.writeNoException();
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */