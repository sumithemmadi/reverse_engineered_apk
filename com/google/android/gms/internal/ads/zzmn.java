package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzmn extends zzmo {
  public static final Parcelable.Creator<zzmn> CREATOR = new xg2();
  
  private final String c;
  
  private final String d;
  
  zzmn(Parcel paramParcel) {
    super(paramParcel.readString());
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
  }
  
  public zzmn(String paramString1, String paramString2, String paramString3) {
    super(paramString1);
    this.c = null;
    this.d = paramString3;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && zzmn.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b.equals(((zzmo)paramObject).b) && wj2.g(this.c, ((zzmn)paramObject).c) && wj2.g(this.d, ((zzmn)paramObject).d))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    byte b;
    int i = this.b.hashCode();
    String str = this.c;
    int j = 0;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    str = this.d;
    if (str != null)
      j = str.hashCode(); 
    return ((i + 527) * 31 + b) * 31 + j;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */