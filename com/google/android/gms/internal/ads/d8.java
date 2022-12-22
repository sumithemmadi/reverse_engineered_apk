package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class d8 extends ub2 implements a8 {
  public d8() {
    super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
  }
  
  public static a8 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    return (iInterface instanceof a8) ? (a8)iInterface : new c8(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      C8(paramParcel1.createTypedArrayList(zzajh.CREATOR));
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */