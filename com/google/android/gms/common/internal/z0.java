package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzj;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.b;
import com.google.android.gms.internal.common.c;

public final class z0 extends b implements y0 {
  z0(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
  }
  
  public final boolean A8(zzj paramzzj, a parama) {
    Parcel parcel2 = Y0();
    c.c(parcel2, (Parcelable)paramzzj);
    c.b(parcel2, (IInterface)parama);
    Parcel parcel1 = i1(5, parcel2);
    boolean bool = c.e(parcel1);
    parcel1.recycle();
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */