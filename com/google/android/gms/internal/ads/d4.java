package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class d4 extends ub2 implements e4 {
  public d4() {
    super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
    switch (paramInt1) {
      default:
        return false;
      case 17:
        str4 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str4);
        return true;
      case 16:
        a2 = e();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a2);
        return true;
      case 15:
        f3 = g();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, f3);
        return true;
      case 14:
        c0(tb2.<Bundle>b((Parcel)f3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 13:
        bool = T(tb2.<Bundle>b((Parcel)f3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 12:
        G(tb2.<Bundle>b((Parcel)f3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 11:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
        return true;
      case 10:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 9:
        bundle = d();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 8:
        str3 = B();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 7:
        str3 = h();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 6:
        m3 = k1();
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */