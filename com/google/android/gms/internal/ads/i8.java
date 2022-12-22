package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class i8 extends ub2 implements j8 {
  public i8() {
    super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 3) {
      if (paramInt1 != 4) {
        i3 i3;
        if (paramInt1 != 5) {
          if (paramInt1 != 6) {
            if (paramInt1 != 7)
              return false; 
            i3 = n0();
            paramParcel2.writeNoException();
            tb2.c(paramParcel2, i3);
          } else {
            g7(a.a.i1(i3.readStrongBinder()));
            paramParcel2.writeNoException();
          } 
        } else {
          IInterface iInterface;
          a a = a.a.i1(i3.readStrongBinder());
          IBinder iBinder = i3.readStrongBinder();
          if (iBinder == null) {
            i3 = null;
          } else {
            iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            if (iInterface instanceof k8) {
              iInterface = iInterface;
            } else {
              iInterface = new l8(iBinder);
            } 
          } 
          T4(a, (k8)iInterface);
          paramParcel2.writeNoException();
        } 
      } else {
        destroy();
        paramParcel2.writeNoException();
      } 
    } else {
      nt2 nt2 = getVideoController();
      paramParcel2.writeNoException();
      tb2.c(paramParcel2, nt2);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */