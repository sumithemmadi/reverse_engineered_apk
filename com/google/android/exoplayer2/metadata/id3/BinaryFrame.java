package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
  public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();
  
  public final byte[] c;
  
  BinaryFrame(Parcel paramParcel) {
    super((String)h0.g(paramParcel.readString()));
    this.c = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public BinaryFrame(String paramString, byte[] paramArrayOfbyte) {
    super(paramString);
    this.c = paramArrayOfbyte;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || BinaryFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!this.b.equals(((Id3Frame)paramObject).b) || !Arrays.equals(this.c, ((BinaryFrame)paramObject).c))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (527 + this.b.hashCode()) * 31 + Arrays.hashCode(this.c);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeByteArray(this.c);
  }
  
  static final class a implements Parcelable.Creator<BinaryFrame> {
    public BinaryFrame a(Parcel param1Parcel) {
      return new BinaryFrame(param1Parcel);
    }
    
    public BinaryFrame[] b(int param1Int) {
      return new BinaryFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/BinaryFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */