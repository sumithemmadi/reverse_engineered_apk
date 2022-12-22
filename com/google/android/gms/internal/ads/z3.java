package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class z3 extends ub2 implements a4 {
  public z3() {
    super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    String str4;
    a a2;
    f3 f3;
    nt2 nt2;
    Bundle bundle;
    String str3;
    m3 m3;
    String str2;
    List list;
    String str1;
    boolean bool;
    double d;
    switch (paramInt1) {
      default:
        return false;
      case 19:
        str4 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str4);
        return true;
      case 18:
        a2 = e();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a2);
        return true;
      case 17:
        f3 = g();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, f3);
        return true;
      case 16:
        c0(tb2.<Bundle>b((Parcel)f3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 15:
        bool = T(tb2.<Bundle>b((Parcel)f3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 14:
        G(tb2.<Bundle>b((Parcel)f3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 13:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
        return true;
      case 12:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 11:
        bundle = d();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 10:
        str3 = s();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 9:
        str3 = C();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 8:
        d = w();
        paramParcel2.writeNoException();
        paramParcel2.writeDouble(d);
        return true;
      case 7:
        str3 = h();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 6:
        m3 = t();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, m3);
        return true;
      case 5:
        str2 = j();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 4:
        list = k();
        paramParcel2.writeNoException();
        paramParcel2.writeList(list);
        return true;
      case 3:
        str1 = f();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str1);
        return true;
      case 2:
        break;
    } 
    a a1 = v();
    paramParcel2.writeNoException();
    tb2.c(paramParcel2, (IInterface)a1);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */