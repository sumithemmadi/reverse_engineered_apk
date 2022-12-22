package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class zzapy extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzapy> CREATOR = new zd();
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  zzapy(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public static zzapy o0(x paramx) {
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    if (paramObject instanceof zzapy) {
      paramObject = paramObject;
      if (((zzapy)paramObject).d == this.d && ((zzapy)paramObject).c == this.c && ((zzapy)paramObject).b == this.b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new int[] { this.b, this.c, this.d });
  }
  
  public final String toString() {
    int i = this.b;
    int j = this.c;
    int k = this.d;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append(i);
    stringBuilder.append(".");
    stringBuilder.append(j);
    stringBuilder.append(".");
    stringBuilder.append(k);
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, this.c);
    a.k(paramParcel, 3, this.d);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzapy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */