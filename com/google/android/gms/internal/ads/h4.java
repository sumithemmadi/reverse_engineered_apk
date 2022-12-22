package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class h4 extends ub2 implements i4 {
  public h4() {
    super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public static i4 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    return (iInterface instanceof i4) ? (i4)iInterface : new k4(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    a a;
    nt2 nt2;
    String str2;
    List<String> list;
    m3 m3;
    boolean bool;
    switch (paramInt1) {
      default:
        return false;
      case 15:
        q4();
        paramParcel2.writeNoException();
        return true;
      case 14:
        d4(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 13:
        bool = K5();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 12:
        bool = f7();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 11:
        a = v();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 10:
        bool = h5(a.a.i1(a.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 9:
        a = h8();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 8:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 7:
        nt2 = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, nt2);
        return true;
      case 6:
        q();
        paramParcel2.writeNoException();
        return true;
      case 5:
        O6(nt2.readString());
        paramParcel2.writeNoException();
        return true;
      case 4:
        str2 = u0();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 3:
        list = F5();
        paramParcel2.writeNoException();
        paramParcel2.writeStringList(list);
        return true;
      case 2:
        m3 = K8(list.readString());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, m3);
        return true;
      case 1:
        break;
    } 
    String str1 = f3(m3.readString());
    paramParcel2.writeNoException();
    paramParcel2.writeString(str1);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */