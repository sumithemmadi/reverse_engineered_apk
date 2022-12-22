package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class r4 extends ub2 implements s4 {
  public r4() {
    super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
  }
  
  public static s4 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    return (iInterface instanceof s4) ? (s4)iInterface : new u4(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      i4 i4;
      IBinder iBinder = paramParcel1.readStrongBinder();
      if (iBinder == null) {
        iBinder = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (iInterface instanceof i4) {
          i4 = (i4)iInterface;
        } else {
          i4 = new k4((IBinder)i4);
        } 
      } 
      I0(i4, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */