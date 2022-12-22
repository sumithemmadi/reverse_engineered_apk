package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

public abstract class lt2 extends ub2 implements ht2 {
  public lt2() {
    super("com.google.android.gms.ads.internal.client.IResponseInfo");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        List<zzvw> list = U5();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList(list);
      } else {
        String str = s7();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
      } 
    } else {
      String str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */