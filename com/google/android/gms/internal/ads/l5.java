package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class l5 extends ub2 implements m5 {
  public l5() {
    super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    ht2 ht2;
    i3 i3;
    List list2;
    IBinder iBinder;
    i5 i5;
    Bundle bundle;
    a a;
    f3 f3;
    String str4;
    nt2 nt2;
    String str3;
    m3 m3;
    String str2;
    List list1;
    boolean bool;
    double d;
    switch (paramInt1) {
      default:
        return false;
      case 32:
        U(ft2.S9(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 31:
        ht2 = p();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ht2);
        return true;
      case 30:
        bool = n1();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 29:
        i3 = n0();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, i3);
        return true;
      case 28:
        e9();
        paramParcel2.writeNoException();
        return true;
      case 27:
        B0();
        paramParcel2.writeNoException();
        return true;
      case 26:
        o0(xs2.S9(i3.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 25:
        R0(at2.S9(i3.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 24:
        bool = D3();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 23:
        list2 = D6();
        paramParcel2.writeNoException();
        paramParcel2.writeList(list2);
        return true;
      case 22:
        r0();
        paramParcel2.writeNoException();
        return true;
      case 21:
        iBinder = list2.readStrongBinder();
        if (iBinder == null) {
          iBinder = null;
        } else {
          IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
          if (iInterface instanceof i5) {
            i5 = (i5)iInterface;
          } else {
            i5 = new k5((IBinder)i5);
          } 
        } 
        G0(i5);
        paramParcel2.writeNoException();
        return true;
      case 20:
        bundle = d();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 19:
        a = e();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 18:
        a = v();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 17:
        c0(tb2.<Bundle>b((Parcel)a, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 16:
        bool = T(tb2.<Bundle>b((Parcel)a, Bundle.CREATOR));
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 15:
        G(tb2.<Bundle>b((Parcel)a, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 14:
        f3 = g();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, f3);
        return true;
      case 13:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 12:
        str4 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str4);
        return true;
      case 11:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
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
        str3 = B();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
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
        list1 = k();
        paramParcel2.writeNoException();
        paramParcel2.writeList(list1);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */