package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class EventMessage implements Metadata.Entry {
  public static final Parcelable.Creator<EventMessage> CREATOR;
  
  private static final Format b = Format.t(null, "application/id3", Long.MAX_VALUE);
  
  private static final Format c = Format.t(null, "application/x-scte35", Long.MAX_VALUE);
  
  public final String d;
  
  public final String e;
  
  public final long f;
  
  public final long g;
  
  public final byte[] h;
  
  private int i;
  
  static {
    CREATOR = new a();
  }
  
  EventMessage(Parcel paramParcel) {
    this.d = (String)h0.g(paramParcel.readString());
    this.e = (String)h0.g(paramParcel.readString());
    this.f = paramParcel.readLong();
    this.g = paramParcel.readLong();
    this.h = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  public EventMessage(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfbyte) {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramArrayOfbyte;
  }
  
  public Format A() {
    String str = this.d;
    str.hashCode();
    int i = str.hashCode();
    byte b = -1;
    switch (i) {
      case 1303648457:
        if (!str.equals("https://developer.apple.com/streaming/emsg-id3"))
          break; 
        b = 2;
        break;
      case -795945609:
        if (!str.equals("https://aomedia.org/emsg/ID3"))
          break; 
        b = 1;
        break;
      case -1468477611:
        if (!str.equals("urn:scte:scte35:2014:bin"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        return null;
      case 1:
      case 2:
        return b;
      case 0:
        break;
    } 
    return c;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || EventMessage.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.f != ((EventMessage)paramObject).f || this.g != ((EventMessage)paramObject).g || !h0.b(this.d, ((EventMessage)paramObject).d) || !h0.b(this.e, ((EventMessage)paramObject).e) || !Arrays.equals(this.h, ((EventMessage)paramObject).h))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    if (this.i == 0) {
      byte b;
      String str = this.d;
      int i = 0;
      if (str != null) {
        b = str.hashCode();
      } else {
        b = 0;
      } 
      str = this.e;
      if (str != null)
        i = str.hashCode(); 
      long l = this.f;
      int j = (int)(l ^ l >>> 32L);
      l = this.g;
      this.i = ((((527 + b) * 31 + i) * 31 + j) * 31 + (int)(l ^ l >>> 32L)) * 31 + Arrays.hashCode(this.h);
    } 
    return this.i;
  }
  
  public byte[] l0() {
    byte[] arrayOfByte;
    if (A() != null) {
      arrayOfByte = this.h;
    } else {
      arrayOfByte = null;
    } 
    return arrayOfByte;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EMSG: scheme=");
    stringBuilder.append(this.d);
    stringBuilder.append(", id=");
    stringBuilder.append(this.g);
    stringBuilder.append(", durationMs=");
    stringBuilder.append(this.f);
    stringBuilder.append(", value=");
    stringBuilder.append(this.e);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeLong(this.f);
    paramParcel.writeLong(this.g);
    paramParcel.writeByteArray(this.h);
  }
  
  static final class a implements Parcelable.Creator<EventMessage> {
    public EventMessage a(Parcel param1Parcel) {
      return new EventMessage(param1Parcel);
    }
    
    public EventMessage[] b(int param1Int) {
      return new EventMessage[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/emsg/EventMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */