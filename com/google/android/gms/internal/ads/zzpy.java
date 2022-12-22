package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzpy implements Parcelable {
  public static final Parcelable.Creator<zzpy> CREATOR = new ak2();
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final byte[] e;
  
  private int f;
  
  public zzpy(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramArrayOfbyte;
  }
  
  zzpy(Parcel paramParcel) {
    boolean bool;
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      byte[] arrayOfByte = paramParcel.createByteArray();
    } else {
      paramParcel = null;
    } 
    this.e = (byte[])paramParcel;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && zzpy.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((zzpy)paramObject).b && this.c == ((zzpy)paramObject).c && this.d == ((zzpy)paramObject).d && Arrays.equals(this.e, ((zzpy)paramObject).e))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.f == 0)
      this.f = (((this.b + 527) * 31 + this.c) * 31 + this.d) * 31 + Arrays.hashCode(this.e); 
    return this.f;
  }
  
  public final String toString() {
    boolean bool;
    int i = this.b;
    int j = this.c;
    int k = this.d;
    if (this.e != null) {
      bool = true;
    } else {
      bool = false;
    } 
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("ColorInfo(");
    stringBuilder.append(i);
    stringBuilder.append(", ");
    stringBuilder.append(j);
    stringBuilder.append(", ");
    stringBuilder.append(k);
    stringBuilder.append(", ");
    stringBuilder.append(bool);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    if (this.e != null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    paramParcel.writeInt(paramInt);
    byte[] arrayOfByte = this.e;
    if (arrayOfByte != null)
      paramParcel.writeByteArray(arrayOfByte); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */