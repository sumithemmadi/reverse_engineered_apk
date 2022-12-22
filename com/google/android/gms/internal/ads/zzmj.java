package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzmj extends zzmo {
  public static final Parcelable.Creator<zzmj> CREATOR = new vg2();
  
  private final String c;
  
  public final String d;
  
  public final String e;
  
  zzmj(Parcel paramParcel) {
    super("COMM");
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
  }
  
  public zzmj(String paramString1, String paramString2, String paramString3) {
    super("COMM");
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && zzmj.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (wj2.g(this.d, ((zzmj)paramObject).d) && wj2.g(this.c, ((zzmj)paramObject).c) && wj2.g(this.e, ((zzmj)paramObject).e))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    byte b1;
    byte b2;
    String str = this.c;
    int i = 0;
    if (str != null) {
      b1 = str.hashCode();
    } else {
      b1 = 0;
    } 
    str = this.d;
    if (str != null) {
      b2 = str.hashCode();
    } else {
      b2 = 0;
    } 
    str = this.e;
    if (str != null)
      i = str.hashCode(); 
    return ((b1 + 527) * 31 + b2) * 31 + i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.e);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */