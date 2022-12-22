package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class zzduw extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzduw> CREATOR = new ip1();
  
  private final int b;
  
  public final byte[] c;
  
  public final int d;
  
  zzduw(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    this.b = paramInt1;
    if (paramArrayOfbyte == null) {
      paramArrayOfbyte = null;
    } else {
      paramArrayOfbyte = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    } 
    this.c = paramArrayOfbyte;
    this.d = paramInt2;
  }
  
  public zzduw(byte[] paramArrayOfbyte, int paramInt) {
    this(1, null, 1);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.f(paramParcel, 2, this.c, false);
    a.k(paramParcel, 3, this.d);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzduw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */