package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
  public static final Parcelable.Creator<ApicFrame> CREATOR = new a();
  
  public final String c;
  
  public final String d;
  
  public final int e;
  
  public final byte[] f;
  
  ApicFrame(Parcel paramParcel) {
    super("APIC");
    this.c = (String)h0.g(paramParcel.readString());
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public ApicFrame(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfbyte) {
    super("APIC");
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramInt;
    this.f = paramArrayOfbyte;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || ApicFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.e != ((ApicFrame)paramObject).e || !h0.b(this.c, ((ApicFrame)paramObject).c) || !h0.b(this.d, ((ApicFrame)paramObject).d) || !Arrays.equals(this.f, ((ApicFrame)paramObject).f))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
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
    return (((527 + i) * 31 + b) * 31 + j) * 31 + Arrays.hashCode(this.f);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(": mimeType=");
    stringBuilder.append(this.c);
    stringBuilder.append(", description=");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeByteArray(this.f);
  }
  
  static final class a implements Parcelable.Creator<ApicFrame> {
    public ApicFrame a(Parcel param1Parcel) {
      return new ApicFrame(param1Parcel);
    }
    
    public ApicFrame[] b(int param1Int) {
      return new ApicFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/ApicFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */