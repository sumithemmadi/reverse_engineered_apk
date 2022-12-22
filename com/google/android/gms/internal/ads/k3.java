package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class k3 extends ub2 implements i3 {
  public k3() {
    super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IInterface iInterface;
    a a;
    IBinder iBinder;
    boolean bool;
    switch (paramInt1) {
      default:
        return false;
      case 9:
        iBinder = paramParcel1.readStrongBinder();
        if (iBinder == null) {
          paramParcel1 = null;
        } else {
          iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
          if (iInterface instanceof z4) {
            iInterface = iInterface;
          } else {
            iInterface = new y4(iBinder);
          } 
        } 
        H3((z4)iInterface);
        paramParcel2.writeNoException();
        return true;
      case 8:
        bool = O2();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 7:
        iInterface = getVideoController();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, iInterface);
        return true;
      case 6:
        f = P0();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 5:
        f = getDuration();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 4:
        a = l6();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 3:
        n2(a.a.i1(a.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        break;
    } 
    float f = k0();
    paramParcel2.writeNoException();
    paramParcel2.writeFloat(f);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */