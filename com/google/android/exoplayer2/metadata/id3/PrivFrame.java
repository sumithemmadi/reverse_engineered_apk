package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
  public static final Parcelable.Creator<PrivFrame> CREATOR = new a();
  
  public final String c;
  
  public final byte[] d;
  
  PrivFrame(Parcel paramParcel) {
    super("PRIV");
    this.c = (String)h0.g(paramParcel.readString());
    this.d = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public PrivFrame(String paramString, byte[] paramArrayOfbyte) {
    super("PRIV");
    this.c = paramString;
    this.d = paramArrayOfbyte;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || PrivFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!h0.b(this.c, ((PrivFrame)paramObject).c) || !Arrays.equals(this.d, ((PrivFrame)paramObject).d))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b;
    String str = this.c;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    return (527 + b) * 31 + Arrays.hashCode(this.d);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(": owner=");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.c);
    paramParcel.writeByteArray(this.d);
  }
  
  static final class a implements Parcelable.Creator<PrivFrame> {
    public PrivFrame a(Parcel param1Parcel) {
      return new PrivFrame(param1Parcel);
    }
    
    public PrivFrame[] b(int param1Int) {
      return new PrivFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/PrivFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */