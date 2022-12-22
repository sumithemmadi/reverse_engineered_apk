package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzaiv extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaiv> CREATOR = new l7();
  
  public final boolean b;
  
  public final String c;
  
  public final int d;
  
  public final byte[] e;
  
  public final String[] f;
  
  public final String[] g;
  
  public final boolean h;
  
  public final long i;
  
  zzaiv(boolean paramBoolean1, String paramString, int paramInt, byte[] paramArrayOfbyte, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean2, long paramLong) {
    this.b = paramBoolean1;
    this.c = paramString;
    this.d = paramInt;
    this.e = paramArrayOfbyte;
    this.f = paramArrayOfString1;
    this.g = paramArrayOfString2;
    this.h = paramBoolean2;
    this.i = paramLong;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.c(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.k(paramParcel, 3, this.d);
    a.f(paramParcel, 4, this.e, false);
    a.s(paramParcel, 5, this.f, false);
    a.s(paramParcel, 6, this.g, false);
    a.c(paramParcel, 7, this.h);
    a.n(paramParcel, 8, this.i);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */