package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
  public static final Parcelable.Creator<ColorInfo> CREATOR = new a();
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final byte[] e;
  
  private int f;
  
  public ColorInfo(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramArrayOfbyte;
  }
  
  ColorInfo(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    if (h0.i0(paramParcel)) {
      byte[] arrayOfByte = paramParcel.createByteArray();
    } else {
      paramParcel = null;
    } 
    this.e = (byte[])paramParcel;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || ColorInfo.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((ColorInfo)paramObject).b || this.c != ((ColorInfo)paramObject).c || this.d != ((ColorInfo)paramObject).d || !Arrays.equals(this.e, ((ColorInfo)paramObject).e))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    if (this.f == 0)
      this.f = (((527 + this.b) * 31 + this.c) * 31 + this.d) * 31 + Arrays.hashCode(this.e); 
    return this.f;
  }
  
  public String toString() {
    boolean bool;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ColorInfo(");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.d);
    stringBuilder.append(", ");
    if (this.e != null) {
      bool = true;
    } else {
      bool = false;
    } 
    stringBuilder.append(bool);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    boolean bool;
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    if (this.e != null) {
      bool = true;
    } else {
      bool = false;
    } 
    h0.x0(paramParcel, bool);
    byte[] arrayOfByte = this.e;
    if (arrayOfByte != null)
      paramParcel.writeByteArray(arrayOfByte); 
  }
  
  static final class a implements Parcelable.Creator<ColorInfo> {
    public ColorInfo a(Parcel param1Parcel) {
      return new ColorInfo(param1Parcel);
    }
    
    public ColorInfo[] b(int param1Int) {
      return new ColorInfo[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/ColorInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */