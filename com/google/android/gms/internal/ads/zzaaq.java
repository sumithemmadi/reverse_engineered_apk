package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzaaq extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaaq> CREATOR = new q();
  
  public final String b;
  
  public zzaaq(a parama) {
    throw null;
  }
  
  zzaaq(String paramString) {
    this.b = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 15, this.b, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */