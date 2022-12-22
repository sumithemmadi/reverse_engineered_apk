package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzajr extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzajr> CREATOR = new g8();
  
  public final String b;
  
  public final Bundle c;
  
  public zzajr(String paramString, Bundle paramBundle) {
    this.b = paramString;
    this.c = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.e(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzajr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */