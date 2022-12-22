package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
  public static final Parcelable.Creator<GeobFrame> CREATOR = new a();
  
  public final String c;
  
  public final String d;
  
  public final String e;
  
  public final byte[] f;
  
  GeobFrame(Parcel paramParcel) {
    super("GEOB");
    this.c = (String)h0.g(paramParcel.readString());
    this.d = (String)h0.g(paramParcel.readString());
    this.e = (String)h0.g(paramParcel.readString());
    this.f = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public GeobFrame(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfbyte) {
    super("GEOB");
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramArrayOfbyte;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || GeobFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!h0.b(this.c, ((GeobFrame)paramObject).c) || !h0.b(this.d, ((GeobFrame)paramObject).d) || !h0.b(this.e, ((GeobFrame)paramObject).e) || !Arrays.equals(this.f, ((GeobFrame)paramObject).f))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
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
    return (((527 + b1) * 31 + b2) * 31 + i) * 31 + Arrays.hashCode(this.f);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(": mimeType=");
    stringBuilder.append(this.c);
    stringBuilder.append(", filename=");
    stringBuilder.append(this.d);
    stringBuilder.append(", description=");
    stringBuilder.append(this.e);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeByteArray(this.f);
  }
  
  static final class a implements Parcelable.Creator<GeobFrame> {
    public GeobFrame a(Parcel param1Parcel) {
      return new GeobFrame(param1Parcel);
    }
    
    public GeobFrame[] b(int param1Int) {
      return new GeobFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/GeobFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */