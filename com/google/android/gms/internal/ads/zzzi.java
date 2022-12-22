package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzzi extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzzi> CREATOR = new st2();
  
  private final int b;
  
  public zzzi(int paramInt) {
    this.b = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 2, this.b);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */