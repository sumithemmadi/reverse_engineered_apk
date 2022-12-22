package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class PictureFrame implements Metadata.Entry {
  public static final Parcelable.Creator<PictureFrame> CREATOR = new a();
  
  public final int b;
  
  public final String c;
  
  public final String d;
  
  public final int e;
  
  public final int f;
  
  public final int g;
  
  public final int h;
  
  public final byte[] i;
  
  public PictureFrame(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte[] paramArrayOfbyte) {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
    this.h = paramInt5;
    this.i = paramArrayOfbyte;
  }
  
  PictureFrame(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = (String)h0.g(paramParcel.readString());
    this.d = (String)h0.g(paramParcel.readString());
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readInt();
    this.i = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || PictureFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((PictureFrame)paramObject).b || !this.c.equals(((PictureFrame)paramObject).c) || !this.d.equals(((PictureFrame)paramObject).d) || this.e != ((PictureFrame)paramObject).e || this.f != ((PictureFrame)paramObject).f || this.g != ((PictureFrame)paramObject).g || this.h != ((PictureFrame)paramObject).h || !Arrays.equals(this.i, ((PictureFrame)paramObject).i))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (((((((527 + this.b) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + Arrays.hashCode(this.i);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Picture: mimeType=");
    stringBuilder.append(this.c);
    stringBuilder.append(", description=");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeByteArray(this.i);
  }
  
  static final class a implements Parcelable.Creator<PictureFrame> {
    public PictureFrame a(Parcel param1Parcel) {
      return new PictureFrame(param1Parcel);
    }
    
    public PictureFrame[] b(int param1Int) {
      return new PictureFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/flac/PictureFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */