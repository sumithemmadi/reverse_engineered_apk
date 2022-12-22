package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzvw extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzvw> CREATOR = new oq2();
  
  public String b;
  
  public long c;
  
  public zzvg d;
  
  public Bundle e;
  
  public zzvw(String paramString, long paramLong, zzvg paramzzvg, Bundle paramBundle) {
    this.b = paramString;
    this.c = paramLong;
    this.d = paramzzvg;
    this.e = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.n(paramParcel, 2, this.c);
    a.q(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    a.e(paramParcel, 4, this.e, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzvw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */