package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.tb2;
import com.google.android.gms.internal.ads.ub2;

public abstract class f0 extends ub2 implements g0 {
  public f0() {
    super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      zzap(a.a.i1(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    } else {
      boolean bool = zzd(a.a.i1(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      tb2.a(paramParcel2, bool);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */