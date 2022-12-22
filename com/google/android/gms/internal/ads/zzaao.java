package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzaao extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaao> CREATOR = new p();
  
  private final int b;
  
  private final int c;
  
  public zzaao(int paramInt1, int paramInt2) {
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public zzaao(r paramr) {
    this.b = paramr.b();
    this.c = paramr.c();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, this.c);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */