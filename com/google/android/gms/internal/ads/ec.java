package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class ec extends ub2 implements fc {
  public ec() {
    super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
  }
  
  public static fc S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    return (iInterface instanceof fc) ? (fc)iInterface : new hc(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    Bundle bundle;
    a a;
    f3 f3;
    nt2 nt2;
    String str3;
    m3 m3;
    String str2;
    List list;
    float f;
    boolean bool;
    double d;
    switch (paramInt1) {
      default:
        return false;
      case 25:
        f = V2();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 24:
        f = n3();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 23:
        f = b2();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 22:
        F(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 21:
        N(a.a.i1(paramParcel1.readStrongBinder()), a.a.i1(paramParcel1.readStrongBinder()), a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 20:
        b0(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 19:
        q();
        paramParcel2.writeNoException();
        return true;
      case 18:
        bool = d0();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 17:
        bool = M();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 16:
        bundle = d();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 15:
        a = e();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 14:
        a = W();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 13:
        a = a0();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 12:
        f3 = g();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, f3);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */