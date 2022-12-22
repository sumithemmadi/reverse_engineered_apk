package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.e;
import java.util.Arrays;

public final class IcyInfo implements Metadata.Entry {
  public static final Parcelable.Creator<IcyInfo> CREATOR = new a();
  
  public final byte[] b;
  
  public final String c;
  
  public final String d;
  
  IcyInfo(Parcel paramParcel) {
    this.b = (byte[])e.e(paramParcel.createByteArray());
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
  }
  
  public IcyInfo(byte[] paramArrayOfbyte, String paramString1, String paramString2) {
    this.b = paramArrayOfbyte;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || IcyInfo.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals(this.b, ((IcyInfo)paramObject).b);
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.b);
  }
  
  public String toString() {
    return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[] { this.c, this.d, Integer.valueOf(this.b.length) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeByteArray(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
  
  static final class a implements Parcelable.Creator<IcyInfo> {
    public IcyInfo a(Parcel param1Parcel) {
      return new IcyInfo(param1Parcel);
    }
    
    public IcyInfo[] b(int param1Int) {
      return new IcyInfo[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/icy/IcyInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */