package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class at2 extends ub2 implements ys2 {
  public at2() {
    super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
  }
  
  public static ys2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    return (iInterface instanceof ys2) ? (ys2)iInterface : new zs2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      String str = P7();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    } else {
      String str = Z0();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/at2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */