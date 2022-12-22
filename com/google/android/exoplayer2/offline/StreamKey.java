package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
  public static final Parcelable.Creator<StreamKey> CREATOR = new a();
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  StreamKey(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
  }
  
  public int a(StreamKey paramStreamKey) {
    int i = this.b - paramStreamKey.b;
    int j = i;
    if (i == 0) {
      i = this.c - paramStreamKey.c;
      j = i;
      if (i == 0)
        j = this.d - paramStreamKey.d; 
    } 
    return j;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || StreamKey.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((StreamKey)paramObject).b || this.c != ((StreamKey)paramObject).c || this.d != ((StreamKey)paramObject).d)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (this.b * 31 + this.c) * 31 + this.d;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(".");
    stringBuilder.append(this.c);
    stringBuilder.append(".");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
  }
  
  static final class a implements Parcelable.Creator<StreamKey> {
    public StreamKey a(Parcel param1Parcel) {
      return new StreamKey(param1Parcel);
    }
    
    public StreamKey[] b(int param1Int) {
      return new StreamKey[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/offline/StreamKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */