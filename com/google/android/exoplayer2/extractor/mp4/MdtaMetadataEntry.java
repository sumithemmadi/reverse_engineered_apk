package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class MdtaMetadataEntry implements Metadata.Entry {
  public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();
  
  public final String b;
  
  public final byte[] c;
  
  public final int d;
  
  public final int e;
  
  private MdtaMetadataEntry(Parcel paramParcel) {
    this.b = (String)h0.g(paramParcel.readString());
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    this.c = arrayOfByte;
    paramParcel.readByteArray(arrayOfByte);
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
  }
  
  public MdtaMetadataEntry(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.b = paramString;
    this.c = paramArrayOfbyte;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || MdtaMetadataEntry.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!this.b.equals(((MdtaMetadataEntry)paramObject).b) || !Arrays.equals(this.c, ((MdtaMetadataEntry)paramObject).c) || this.d != ((MdtaMetadataEntry)paramObject).d || this.e != ((MdtaMetadataEntry)paramObject).e)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (((527 + this.b.hashCode()) * 31 + Arrays.hashCode(this.c)) * 31 + this.d) * 31 + this.e;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("mdta: key=");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c.length);
    paramParcel.writeByteArray(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
  }
  
  static final class a implements Parcelable.Creator<MdtaMetadataEntry> {
    public MdtaMetadataEntry a(Parcel param1Parcel) {
      return new MdtaMetadataEntry(param1Parcel, null);
    }
    
    public MdtaMetadataEntry[] b(int param1Int) {
      return new MdtaMetadataEntry[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/MdtaMetadataEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */