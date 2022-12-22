package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class l3 extends ub2 implements m3 {
  public l3() {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public static m3 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    return (iInterface instanceof m3) ? (m3)iInterface : new o3(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            paramInt1 = getHeight();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
          } else {
            paramInt1 = getWidth();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
          } 
        } else {
          double d = N5();
          paramParcel2.writeNoException();
          paramParcel2.writeDouble(d);
        } 
      } else {
        Uri uri = e0();
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)uri);
      } 
    } else {
      a a = D9();
      paramParcel2.writeNoException();
      tb2.c(paramParcel2, (IInterface)a);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */