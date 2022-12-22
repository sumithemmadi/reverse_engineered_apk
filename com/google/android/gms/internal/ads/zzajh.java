package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzajh extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzajh> CREATOR = new x7();
  
  public final String b;
  
  public final boolean c;
  
  public final int d;
  
  public final String e;
  
  public zzajh(String paramString1, boolean paramBoolean, int paramInt, String paramString2) {
    this.b = paramString1;
    this.c = paramBoolean;
    this.d = paramInt;
    this.e = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.c(paramParcel, 2, this.c);
    a.k(paramParcel, 3, this.d);
    a.r(paramParcel, 4, this.e, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzajh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */