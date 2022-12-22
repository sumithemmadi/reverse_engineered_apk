package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
  public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();
  
  public final String c;
  
  public final int d;
  
  public final int e;
  
  public final long f;
  
  public final long g;
  
  private final Id3Frame[] h;
  
  ChapterFrame(Parcel paramParcel) {
    super("CHAP");
    this.c = (String)h0.g(paramParcel.readString());
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readLong();
    this.g = paramParcel.readLong();
    int i = paramParcel.readInt();
    this.h = new Id3Frame[i];
    for (byte b = 0; b < i; b++)
      this.h[b] = (Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()); 
  }
  
  public ChapterFrame(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, Id3Frame[] paramArrayOfId3Frame) {
    super("CHAP");
    this.c = paramString;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramArrayOfId3Frame;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || ChapterFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.d != ((ChapterFrame)paramObject).d || this.e != ((ChapterFrame)paramObject).e || this.f != ((ChapterFrame)paramObject).f || this.g != ((ChapterFrame)paramObject).g || !h0.b(this.c, ((ChapterFrame)paramObject).c) || !Arrays.equals((Object[])this.h, (Object[])((ChapterFrame)paramObject).h))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b;
    int i = this.d;
    int j = this.e;
    int k = (int)this.f;
    int m = (int)this.g;
    String str = this.c;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    return ((((527 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeLong(this.f);
    paramParcel.writeLong(this.g);
    paramParcel.writeInt(this.h.length);
    Id3Frame[] arrayOfId3Frame = this.h;
    int i = arrayOfId3Frame.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable((Parcelable)arrayOfId3Frame[paramInt], 0); 
  }
  
  static final class a implements Parcelable.Creator<ChapterFrame> {
    public ChapterFrame a(Parcel param1Parcel) {
      return new ChapterFrame(param1Parcel);
    }
    
    public ChapterFrame[] b(int param1Int) {
      return new ChapterFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/ChapterFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */