package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import java.util.List;

public abstract class qs2 extends ub2 implements rs2 {
  public qs2() {
    super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    List<zzajh> list;
    String str;
    boolean bool;
    float f;
    switch (paramInt1) {
      default:
        return false;
      case 15:
        H8();
        paramParcel2.writeNoException();
        return true;
      case 14:
        d8(tb2.<zzaao>b(paramParcel1, zzaao.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 13:
        list = O9();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList(list);
        return true;
      case 12:
        I5(d8.S9(list.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 11:
        D8(pb.S9(list.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 10:
        s9(list.readString());
        paramParcel2.writeNoException();
        return true;
      case 9:
        str = j5();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 8:
        bool = N8();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 7:
        f = r1();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 6:
        v5(str.readString(), a.a.i1(str.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
        t1(a.a.i1(str.readStrongBinder()), str.readString());
        paramParcel2.writeNoException();
        return true;
      case 4:
        Y2(tb2.e((Parcel)str));
        paramParcel2.writeNoException();
        return true;
      case 3:
        M8(str.readString());
        paramParcel2.writeNoException();
        return true;
      case 2:
        T7(str.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    D();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qs2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */