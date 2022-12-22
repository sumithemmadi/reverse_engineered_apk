package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;

public final class CommentFrame extends Id3Frame {
  public static final Parcelable.Creator<CommentFrame> CREATOR = new a();
  
  public final String c;
  
  public final String d;
  
  public final String e;
  
  CommentFrame(Parcel paramParcel) {
    super("COMM");
    this.c = (String)h0.g(paramParcel.readString());
    this.d = (String)h0.g(paramParcel.readString());
    this.e = (String)h0.g(paramParcel.readString());
  }
  
  public CommentFrame(String paramString1, String paramString2, String paramString3) {
    super("COMM");
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || CommentFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!h0.b(this.d, ((CommentFrame)paramObject).d) || !h0.b(this.c, ((CommentFrame)paramObject).c) || !h0.b(this.e, ((CommentFrame)paramObject).e))
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
    return ((527 + b1) * 31 + b2) * 31 + i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(": language=");
    stringBuilder.append(this.c);
    stringBuilder.append(", description=");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.e);
  }
  
  static final class a implements Parcelable.Creator<CommentFrame> {
    public CommentFrame a(Parcel param1Parcel) {
      return new CommentFrame(param1Parcel);
    }
    
    public CommentFrame[] b(int param1Int) {
      return new CommentFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/CommentFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */