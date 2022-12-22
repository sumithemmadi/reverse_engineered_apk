package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class p3 extends ub2 implements q3 {
  public p3() {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public static q3 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    return (iInterface instanceof q3) ? (q3)iInterface : new s3(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IInterface iInterface;
    a a;
    IBinder iBinder;
    switch (paramInt1) {
      default:
        return false;
      case 9:
        y3(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 8:
        iBinder = paramParcel1.readStrongBinder();
        if (iBinder == null) {
          paramParcel1 = null;
        } else {
          iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
          if (iInterface instanceof i3) {
            iInterface = iInterface;
          } else {
            iInterface = new j3(iBinder);
          } 
        } 
        r6((i3)iInterface);
        paramParcel2.writeNoException();
        return true;
      case 7:
        P4(a.a.i1(iInterface.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 6:
        i0(a.a.i1(iInterface.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
        C1(a.a.i1(iInterface.readStrongBinder()), iInterface.readInt());
        paramParcel2.writeNoException();
        return true;
      case 4:
        destroy();
        paramParcel2.writeNoException();
        return true;
      case 3:
        d1(a.a.i1(iInterface.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        a = W6(iInterface.readString());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a);
        return true;
      case 1:
        break;
    } 
    K3(a.readString(), a.a.i1(a.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */