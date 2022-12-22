package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class xh extends ub2 implements uh {
  public xh() {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public static uh S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    return (iInterface instanceof uh) ? (uh)iInterface : new wh(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IBinder iBinder;
    kh kh;
    switch (paramInt1) {
      default:
        return false;
      case 8:
        K();
        paramParcel2.writeNoException();
        return true;
      case 7:
        w0(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 6:
        D0();
        paramParcel2.writeNoException();
        return true;
      case 5:
        iBinder = paramParcel1.readStrongBinder();
        if (iBinder == null) {
          iBinder = null;
        } else {
          IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
          if (iInterface instanceof kh) {
            kh = (kh)iInterface;
          } else {
            kh = new mh((IBinder)kh);
          } 
        } 
        D5(kh);
        paramParcel2.writeNoException();
        return true;
      case 4:
        e1();
        paramParcel2.writeNoException();
        return true;
      case 3:
        I();
        paramParcel2.writeNoException();
        return true;
      case 2:
        f1();
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    j1();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */