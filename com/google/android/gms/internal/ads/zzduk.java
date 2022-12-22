package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzduk extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzduk> CREATOR = new zo1();
  
  private final int b;
  
  private final String c;
  
  private final String d;
  
  zzduk(int paramInt, String paramString1, String paramString2) {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public zzduk(String paramString1, String paramString2) {
    this(1, paramString1, paramString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.r(paramParcel, 3, this.d, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzduk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */