package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ji extends ub2 implements ki {
  public ji() {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
  }
  
  public static ki S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    return (iInterface instanceof ki) ? (ki)iInterface : new mi(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      paramInt1 = P();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    } else {
      String str = l();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */