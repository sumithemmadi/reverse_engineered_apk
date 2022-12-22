package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

@Deprecated
public final class zzv extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzv> CREATOR = new c1();
  
  private final int b;
  
  zzv(int paramInt) {
    this.b = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */