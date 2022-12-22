package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzc extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzc> CREATOR = new l0();
  
  Bundle b;
  
  Feature[] c;
  
  private int d;
  
  public zzc() {}
  
  zzc(Bundle paramBundle, Feature[] paramArrayOfFeature, int paramInt) {
    this.b = paramBundle;
    this.c = paramArrayOfFeature;
    this.d = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.e(paramParcel, 1, this.b, false);
    a.u(paramParcel, 2, (Parcelable[])this.c, paramInt, false);
    a.k(paramParcel, 3, this.d);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */