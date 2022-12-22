package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class is2 extends ub2 implements fs2 {
  public is2() {
    super("com.google.android.gms.ads.internal.client.IAppEventListener");
  }
  
  public static fs2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
    return (iInterface instanceof fs2) ? (fs2)iInterface : new hs2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      n(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/is2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */