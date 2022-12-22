package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class yb extends ub2 implements zb {
  public yb() {
    super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    a a2;
    f3 f3;
    a a1;
    nt2 nt2;
    Bundle bundle;
    String str3;
    m3 m3;
    String str2;
    List list;
    boolean bool;
    double d;
    switch (paramInt1) {
      default:
        return false;
      case 22:
        N(a.a.i1(paramParcel1.readStrongBinder()), a.a.i1(paramParcel1.readStrongBinder()), a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 21:
        a2 = e();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a2);
        return true;
      case 20:
        a2 = W();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a2);
        return true;
      case 19:
        f3 = g();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, f3);
        return true;
      case 18:
        a1 = a0();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a1);
        return true;
      case 17:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
        return true;
      case 16:
        F(a.a.i1(nt2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 15:
        bundle = d();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 14:
        bool = d0();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 13:
        bool = M();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 12:
        x0(a.a.i1(bundle.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 11:
        b0(a.a.i1(bundle.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 10:
        q();
        paramParcel2.writeNoException();
        return true;
      case 9:
        str3 = s();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 8:
        str3 = C();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 7:
        d = w();
        paramParcel2.writeNoException();
        paramParcel2.writeDouble(d);
        return true;
      case 6:
        str3 = h();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 5:
        m3 = t();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, m3);
        return true;
      case 4:
        str2 = j();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 3:
        list = k();
        paramParcel2.writeNoException();
        paramParcel2.writeList(list);
        return true;
      case 2:
        break;
    } 
    String str1 = f();
    paramParcel2.writeNoException();
    paramParcel2.writeString(str1);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */