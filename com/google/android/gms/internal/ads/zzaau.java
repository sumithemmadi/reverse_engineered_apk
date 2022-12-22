package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzaau extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaau> CREATOR = new t();
  
  public final boolean b;
  
  public final boolean c;
  
  public final boolean d;
  
  public zzaau(u paramu) {
    this(paramu.c(), paramu.b(), paramu.a());
  }
  
  public zzaau(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.c(paramParcel, 2, this.b);
    a.c(paramParcel, 3, this.c);
    a.c(paramParcel, 4, this.d);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */