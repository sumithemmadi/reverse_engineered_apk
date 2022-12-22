package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.sb2;
import com.google.android.gms.internal.ads.tb2;

public final class i0 extends sb2 implements g0 {
  i0(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
  }
  
  public final void zzap(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(2, parcel);
  }
  
  public final boolean zzd(a parama, String paramString1, String paramString2) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    Parcel parcel1 = Y0(1, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */