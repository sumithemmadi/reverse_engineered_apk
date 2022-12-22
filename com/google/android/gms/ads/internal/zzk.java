package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzk extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzk> CREATOR = new j();
  
  public final boolean b;
  
  public final boolean c;
  
  private final String d;
  
  public final boolean e;
  
  public final float f;
  
  public final int g;
  
  public final boolean h;
  
  public final boolean i;
  
  public final boolean j;
  
  zzk(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6) {
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramString;
    this.e = paramBoolean3;
    this.f = paramFloat;
    this.g = paramInt;
    this.h = paramBoolean4;
    this.i = paramBoolean5;
    this.j = paramBoolean6;
  }
  
  public zzk(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6) {
    this(paramBoolean1, paramBoolean2, null, false, 0.0F, -1, paramBoolean4, paramBoolean5, paramBoolean6);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.c(paramParcel, 2, this.b);
    a.c(paramParcel, 3, this.c);
    a.r(paramParcel, 4, this.d, false);
    a.c(paramParcel, 5, this.e);
    a.h(paramParcel, 6, this.f);
    a.k(paramParcel, 7, this.g);
    a.c(paramParcel, 8, this.h);
    a.c(paramParcel, 9, this.i);
    a.c(paramParcel, 10, this.j);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */