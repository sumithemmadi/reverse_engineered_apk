package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
  public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();
  
  public final String c;
  
  public final boolean d;
  
  public final boolean e;
  
  public final String[] f;
  
  private final Id3Frame[] g;
  
  ChapterTocFrame(Parcel paramParcel) {
    super("CTOC");
    boolean bool2;
    this.c = (String)h0.g(paramParcel.readString());
    byte b = paramParcel.readByte();
    boolean bool1 = true;
    byte b1 = 0;
    if (b != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.d = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    this.e = bool2;
    this.f = (String[])h0.g(paramParcel.createStringArray());
    int i = paramParcel.readInt();
    this.g = new Id3Frame[i];
    while (b1 < i) {
      this.g[b1] = (Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader());
      b1++;
    } 
  }
  
  public ChapterTocFrame(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, Id3Frame[] paramArrayOfId3Frame) {
    super("CTOC");
    this.c = paramString;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramArrayOfString;
    this.g = paramArrayOfId3Frame;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || ChapterTocFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.d != ((ChapterTocFrame)paramObject).d || this.e != ((ChapterTocFrame)paramObject).e || !h0.b(this.c, ((ChapterTocFrame)paramObject).c) || !Arrays.equals((Object[])this.f, (Object[])((ChapterTocFrame)paramObject).f) || !Arrays.equals((Object[])this.g, (Object[])((ChapterTocFrame)paramObject).g))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b;
    boolean bool1 = this.d;
    boolean bool2 = this.e;
    String str = this.c;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    return ((527 + bool1) * 31 + bool2) * 31 + b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.c);
    paramParcel.writeByte((byte)this.d);
    paramParcel.writeByte((byte)this.e);
    paramParcel.writeStringArray(this.f);
    paramParcel.writeInt(this.g.length);
    Id3Frame[] arrayOfId3Frame = this.g;
    int i = arrayOfId3Frame.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable((Parcelable)arrayOfId3Frame[paramInt], 0); 
  }
  
  static final class a implements Parcelable.Creator<ChapterTocFrame> {
    public ChapterTocFrame a(Parcel param1Parcel) {
      return new ChapterTocFrame(param1Parcel);
    }
    
    public ChapterTocFrame[] b(int param1Int) {
      return new ChapterTocFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/ChapterTocFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */