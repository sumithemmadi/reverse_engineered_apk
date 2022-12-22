package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzduf extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzduf> CREATOR = new yo1();
  
  private final int b;
  
  private final byte[] c;
  
  zzduf(int paramInt, byte[] paramArrayOfbyte) {
    this.b = paramInt;
    this.c = paramArrayOfbyte;
  }
  
  public zzduf(byte[] paramArrayOfbyte) {
    this(1, paramArrayOfbyte);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.f(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzduf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */