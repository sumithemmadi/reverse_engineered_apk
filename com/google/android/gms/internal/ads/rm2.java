package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class rm2 extends ub2 implements om2 {
  public rm2() {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 2) {
      zm2 zm2;
      a a = null;
      IBinder iBinder = null;
      if (paramInt1 != 3) {
        ht2 ht2;
        if (paramInt1 != 4) {
          if (paramInt1 != 5) {
            if (paramInt1 != 6)
              return false; 
            o(tb2.e(paramParcel1));
            paramParcel2.writeNoException();
          } else {
            ht2 = p();
            paramParcel2.writeNoException();
            tb2.c(paramParcel2, ht2);
          } 
        } else {
          a = a.a.i1(ht2.readStrongBinder());
          IBinder iBinder1 = ht2.readStrongBinder();
          if (iBinder1 == null) {
            iBinder1 = iBinder;
          } else {
            IInterface iInterface = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
            if (iInterface instanceof zm2) {
              zm2 = (zm2)iInterface;
            } else {
              zm2 = new bn2((IBinder)zm2);
            } 
          } 
          u3(a, zm2);
          paramParcel2.writeNoException();
        } 
      } else {
        a a1;
        um2 um2;
        IBinder iBinder1 = zm2.readStrongBinder();
        if (iBinder1 == null) {
          a1 = a;
        } else {
          IInterface iInterface = a1.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
          if (iInterface instanceof um2) {
            um2 = (um2)iInterface;
          } else {
            um2 = new wm2((IBinder)um2);
          } 
        } 
        g2(um2);
        paramParcel2.writeNoException();
      } 
    } else {
      xr2 xr2 = b5();
      paramParcel2.writeNoException();
      tb2.c(paramParcel2, xr2);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */