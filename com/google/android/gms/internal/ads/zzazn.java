package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzazn extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzazn> CREATOR = new gm();
  
  public String b;
  
  public int c;
  
  public int d;
  
  public boolean e;
  
  public boolean f;
  
  public zzazn(int paramInt1, int paramInt2, boolean paramBoolean) {
    this(paramInt1, paramInt2, paramBoolean, false, false);
  }
  
  public zzazn(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this(204204000, paramInt2, true, false, false);
  }
  
  private zzazn(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this(stringBuilder.toString(), paramInt1, paramInt2, paramBoolean1, false);
  }
  
  zzazn(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public static zzazn o0() {
    return new zzazn(12451000, 12451000, true);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.k(paramParcel, 3, this.c);
    a.k(paramParcel, 4, this.d);
    a.c(paramParcel, 5, this.e);
    a.c(paramParcel, 6, this.f);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzazn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */