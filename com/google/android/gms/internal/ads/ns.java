package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;
import java.util.Map;

public abstract class ns extends ub2 implements ls {
  public ns() {
    super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    String str;
    List list;
    Map map;
    Bundle bundle;
    long l;
    switch (paramInt1) {
      default:
        return false;
      case 19:
        X8(tb2.<Bundle>b(paramParcel1, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 18:
        str = g6();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 17:
        str = e7();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 16:
        str = Y3();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 15:
        F6(a.a.i1(str.readStrongBinder()), str.readString(), str.readString());
        paramParcel2.writeNoException();
        return true;
      case 14:
        B9(str.readString());
        paramParcel2.writeNoException();
        return true;
      case 13:
        q8(str.readString());
        paramParcel2.writeNoException();
        return true;
      case 12:
        l = O3();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        return true;
      case 11:
        str = o6();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 10:
        str = m3();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 9:
        list = a7(str.readString(), str.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeList(list);
        return true;
      case 8:
        clearConditionalUserProperty(list.readString(), list.readString(), tb2.<Bundle>b((Parcel)list, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 7:
        h7(tb2.<Bundle>b((Parcel)list, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramInt1 = k5(list.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5:
        map = T5(list.readString(), list.readString(), tb2.e((Parcel)list));
        paramParcel2.writeNoException();
        paramParcel2.writeMap(map);
        return true;
      case 4:
        p8(map.readString(), map.readString(), a.a.i1(map.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3:
        L0(map.readString(), map.readString(), tb2.<Bundle>b((Parcel)map, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 2:
        bundle = B3(tb2.<Bundle>b((Parcel)map, Bundle.CREATOR));
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 1:
        break;
    } 
    N1(tb2.<Bundle>b((Parcel)bundle, Bundle.CREATOR));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */