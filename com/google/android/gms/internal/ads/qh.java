package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class qh extends ub2 implements rh {
  public qh() {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  public static rh S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    return (iInterface instanceof rh) ? (rh)iInterface : new th(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    uh uh;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        String str;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        if (paramInt1 != 3) {
          if (paramInt1 != 34) {
            ht2 ht2;
            IBinder iBinder;
            ph ph;
            Bundle bundle;
            switch (paramInt1) {
              default:
                return false;
              case 21:
                ht2 = p();
                paramParcel2.writeNoException();
                tb2.c(paramParcel2, ht2);
                return true;
              case 20:
                bool = x6();
                paramParcel2.writeNoException();
                tb2.a(paramParcel2, bool);
                return true;
              case 19:
                o9(ht2.readString());
                paramParcel2.writeNoException();
                return true;
              case 18:
                l7(a.a.i1(ht2.readStrongBinder()));
                paramParcel2.writeNoException();
                return true;
              case 17:
                C7(ht2.readString());
                paramParcel2.writeNoException();
                return true;
              case 16:
                iBinder = ht2.readStrongBinder();
                if (iBinder == null) {
                  iBinder = iBinder2;
                } else {
                  IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                  if (iInterface instanceof ph) {
                    ph = (ph)iInterface;
                  } else {
                    ph = new oh((IBinder)ph);
                  } 
                } 
                Z1(ph);
                paramParcel2.writeNoException();
                return true;
              case 15:
                bundle = H();
                paramParcel2.writeNoException();
                tb2.g(paramParcel2, (Parcelable)bundle);
                return true;
              case 14:
                b1(ds2.S9(bundle.readStrongBinder()));
                paramParcel2.writeNoException();
                return true;
              case 13:
                y0(bundle.readString());
                paramParcel2.writeNoException();
                return true;
              case 12:
                str = a();
                paramParcel2.writeNoException();
                paramParcel2.writeString(str);
                return true;
              case 11:
                r9(a.a.i1(str.readStrongBinder()));
                paramParcel2.writeNoException();
                return true;
              case 10:
                w6(a.a.i1(str.readStrongBinder()));
                paramParcel2.writeNoException();
                return true;
              case 9:
                B7(a.a.i1(str.readStrongBinder()));
                paramParcel2.writeNoException();
                return true;
              case 8:
                destroy();
                paramParcel2.writeNoException();
                return true;
              case 7:
                J();
                paramParcel2.writeNoException();
                return true;
              case 6:
                pause();
                paramParcel2.writeNoException();
                return true;
              case 5:
                break;
            } 
            boolean bool = O0();
            paramParcel2.writeNoException();
            tb2.a(paramParcel2, bool);
          } else {
            o(tb2.e((Parcel)str));
            paramParcel2.writeNoException();
          } 
        } else {
          IBinder iBinder = str.readStrongBinder();
          if (iBinder == null) {
            iBinder = iBinder1;
          } else {
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
            if (iInterface instanceof uh) {
              uh = (uh)iInterface;
            } else {
              uh = new wh((IBinder)uh);
            } 
          } 
          K0(uh);
          paramParcel2.writeNoException();
        } 
      } else {
        T0();
        paramParcel2.writeNoException();
      } 
    } else {
      a3(tb2.<zzava>b((Parcel)uh, zzava.CREATOR));
      paramParcel2.writeNoException();
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */