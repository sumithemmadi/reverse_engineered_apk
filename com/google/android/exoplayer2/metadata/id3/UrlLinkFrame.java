package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;

public final class UrlLinkFrame extends Id3Frame {
  public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();
  
  public final String c;
  
  public final String d;
  
  UrlLinkFrame(Parcel paramParcel) {
    super((String)h0.g(paramParcel.readString()));
    this.c = paramParcel.readString();
    this.d = (String)h0.g(paramParcel.readString());
  }
  
  public UrlLinkFrame(String paramString1, String paramString2, String paramString3) {
    super(paramString1);
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || UrlLinkFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!this.b.equals(((Id3Frame)paramObject).b) || !h0.b(this.c, ((UrlLinkFrame)paramObject).c) || !h0.b(this.d, ((UrlLinkFrame)paramObject).d))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b;
    int i = this.b.hashCode();
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
    return ((527 + i) * 31 + b) * 31 + j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(": url=");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
  
  static final class a implements Parcelable.Creator<UrlLinkFrame> {
    public UrlLinkFrame a(Parcel param1Parcel) {
      return new UrlLinkFrame(param1Parcel);
    }
    
    public UrlLinkFrame[] b(int param1Int) {
      return new UrlLinkFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/UrlLinkFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */