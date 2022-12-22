package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class g1 extends ub2 implements d1 {
  public g1() {
    super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            q();
            paramParcel2.writeNoException();
          } else {
            R2();
            paramParcel2.writeNoException();
          } 
        } else {
          e3(a.a.i1(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
        } 
      } else {
        String str = getContent();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
      } 
    } else {
      String str = Q5();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */