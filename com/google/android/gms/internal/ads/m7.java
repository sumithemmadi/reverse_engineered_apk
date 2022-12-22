package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class m7 extends ub2 implements n7 {
  public m7() {
    super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      H2(tb2.<ParcelFileDescriptor>b(paramParcel1, ParcelFileDescriptor.CREATOR));
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */