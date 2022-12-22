package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.b;

public final class v0 extends b implements u0 {
  v0(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.common.internal.ICertData");
  }
  
  public final a b() {
    Parcel parcel = i1(1, Y0());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final int c() {
    Parcel parcel = i1(2, Y0());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */