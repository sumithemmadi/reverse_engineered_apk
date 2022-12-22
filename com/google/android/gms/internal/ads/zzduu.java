package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzduu extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzduu> CREATOR = new hp1();
  
  private final int b;
  
  private final int c;
  
  private final String d;
  
  private final String e;
  
  private final int f;
  
  zzduu(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramInt3;
  }
  
  public zzduu(int paramInt, zzgp paramzzgp, String paramString1, String paramString2) {
    this(1, paramInt, paramzzgp.zzv(), paramString1, paramString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, this.c);
    a.r(paramParcel, 3, this.d, false);
    a.r(paramParcel, 4, this.e, false);
    a.k(paramParcel, 5, this.f);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzduu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */