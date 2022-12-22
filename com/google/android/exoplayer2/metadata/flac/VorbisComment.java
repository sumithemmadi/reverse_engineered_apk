package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.h0;

public final class VorbisComment implements Metadata.Entry {
  public static final Parcelable.Creator<VorbisComment> CREATOR = new a();
  
  public final String b;
  
  public final String c;
  
  VorbisComment(Parcel paramParcel) {
    this.b = (String)h0.g(paramParcel.readString());
    this.c = (String)h0.g(paramParcel.readString());
  }
  
  public VorbisComment(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || VorbisComment.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!this.b.equals(((VorbisComment)paramObject).b) || !this.c.equals(((VorbisComment)paramObject).c))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (527 + this.b.hashCode()) * 31 + this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("VC: ");
    stringBuilder.append(this.b);
    stringBuilder.append("=");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
  
  static final class a implements Parcelable.Creator<VorbisComment> {
    public VorbisComment a(Parcel param1Parcel) {
      return new VorbisComment(param1Parcel);
    }
    
    public VorbisComment[] b(int param1Int) {
      return new VorbisComment[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/flac/VorbisComment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */