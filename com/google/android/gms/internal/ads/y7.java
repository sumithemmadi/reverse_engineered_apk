package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class y7 extends ub2 implements z7 {
  public y7() {
    super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
  }
  
  public static z7 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    return (iInterface instanceof z7) ? (z7)iInterface : new b8(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 2) {
      if (paramInt1 != 3)
        return false; 
      p3(paramParcel1.readString());
    } else {
      W0();
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */