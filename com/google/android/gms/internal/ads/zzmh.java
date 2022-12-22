package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzmh implements Parcelable {
  public static final Parcelable.Creator<zzmh> CREATOR = new sg2();
  
  private final zza[] b;
  
  zzmh(Parcel paramParcel) {
    this.b = new zza[paramParcel.readInt()];
    byte b = 0;
    while (true) {
      zza[] arrayOfZza = this.b;
      if (b < arrayOfZza.length) {
        arrayOfZza[b] = (zza)paramParcel.readParcelable(zza.class.getClassLoader());
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public zzmh(List<? extends zza> paramList) {
    zza[] arrayOfZza = new zza[paramList.size()];
    this.b = arrayOfZza;
    paramList.toArray(arrayOfZza);
  }
  
  public final int a() {
    return this.b.length;
  }
  
  public final zza b(int paramInt) {
    return this.b[paramInt];
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || zzmh.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals((Object[])this.b, (Object[])((zzmh)paramObject).b);
  }
  
  public final int hashCode() {
    return Arrays.hashCode((Object[])this.b);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b.length);
    zza[] arrayOfZza = this.b;
    int i = arrayOfZza.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(arrayOfZza[paramInt], 0); 
  }
  
  public static interface zza extends Parcelable {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */