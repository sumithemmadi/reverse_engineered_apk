package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzaye extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaye> CREATOR = new yk();
  
  @Deprecated
  public final String b;
  
  public final String c;
  
  @Deprecated
  public final zzvs d;
  
  public final zzvl e;
  
  public zzaye(String paramString1, String paramString2, zzvs paramzzvs, zzvl paramzzvl) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramzzvs;
    this.e = paramzzvl;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.r(paramParcel, 2, this.c, false);
    a.q(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    a.q(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */