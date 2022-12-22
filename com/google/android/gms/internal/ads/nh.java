package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class nh extends ub2 implements kh {
  public nh() {
    super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */