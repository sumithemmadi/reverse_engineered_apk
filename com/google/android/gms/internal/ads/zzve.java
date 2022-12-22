package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzve extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzve> CREATOR = new cq2();
  
  public final String b;
  
  public final String c;
  
  public zzve(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.r(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */