package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzmi extends zzmo {
  public static final Parcelable.Creator<zzmi> CREATOR = new tg2();
  
  private final String c;
  
  private final String d;
  
  private final int e;
  
  private final byte[] f;
  
  zzmi(Parcel paramParcel) {
    super("APIC");
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.createByteArray();
  }
  
  public zzmi(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfbyte) {
    super("APIC");
    this.c = paramString1;
    this.d = null;
    this.e = 3;
    this.f = paramArrayOfbyte;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && zzmi.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.e == ((zzmi)paramObject).e && wj2.g(this.c, ((zzmi)paramObject).c) && wj2.g(this.d, ((zzmi)paramObject).d) && Arrays.equals(this.f, ((zzmi)paramObject).f))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    byte b;
    int i = this.e;
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
    return (((i + 527) * 31 + b) * 31 + j) * 31 + Arrays.hashCode(this.f);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeByteArray(this.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */