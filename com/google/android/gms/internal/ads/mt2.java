package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class mt2 extends ub2 implements nt2 {
  public mt2() {
    super("com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public static nt2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
    return (iInterface instanceof nt2) ? (nt2)iInterface : new pt2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    ot2 ot22;
    IBinder iBinder;
    ot2 ot21;
    boolean bool;
    float f;
    switch (paramInt1) {
      default:
        return false;
      case 13:
        stop();
        paramParcel2.writeNoException();
        return true;
      case 12:
        bool = K1();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 11:
        ot22 = d5();
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ot22);
        return true;
      case 10:
        bool = K7();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 9:
        f = k0();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 8:
        iBinder = ot22.readStrongBinder();
        if (iBinder == null) {
          iBinder = null;
        } else {
          IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
          if (iInterface instanceof ot2) {
            ot21 = (ot2)iInterface;
          } else {
            ot21 = new qt2((IBinder)ot21);
          } 
        } 
        P2(ot21);
        paramParcel2.writeNoException();
        return true;
      case 7:
        f = P0();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 6:
        f = getDuration();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 5:
        paramInt1 = V();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 4:
        bool = w2();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 3:
        v3(tb2.e((Parcel)ot21));
        paramParcel2.writeNoException();
        return true;
      case 2:
        pause();
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    c1();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */