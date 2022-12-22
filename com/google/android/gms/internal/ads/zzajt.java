package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzajt extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzajt> CREATOR = new h8();
  
  public final int b;
  
  public final int c;
  
  public final String d;
  
  public final int e;
  
  public zzajt(int paramInt1, int paramInt2, String paramString, int paramInt3) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramString;
    this.e = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.c);
    a.r(paramParcel, 2, this.d, false);
    a.k(paramParcel, 3, this.e);
    a.k(paramParcel, 1000, this.b);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzajt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */