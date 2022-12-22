package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaq;

public abstract class pg extends ub2 implements mg {
  public pg() {
    super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      K4(tb2.<zzaq>b(paramParcel1, zzaq.CREATOR));
    } else {
      A1(tb2.<ParcelFileDescriptor>b(paramParcel1, ParcelFileDescriptor.CREATOR));
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */