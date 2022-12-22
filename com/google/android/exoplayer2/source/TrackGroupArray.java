package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
  public static final Parcelable.Creator<TrackGroupArray> CREATOR;
  
  public static final TrackGroupArray b = new TrackGroupArray(new TrackGroup[0]);
  
  public final int c;
  
  private final TrackGroup[] d;
  
  private int e;
  
  static {
    CREATOR = new a();
  }
  
  TrackGroupArray(Parcel paramParcel) {
    int i = paramParcel.readInt();
    this.c = i;
    this.d = new TrackGroup[i];
    for (i = 0; i < this.c; i++)
      this.d[i] = (TrackGroup)paramParcel.readParcelable(TrackGroup.class.getClassLoader()); 
  }
  
  public TrackGroupArray(TrackGroup... paramVarArgs) {
    this.d = paramVarArgs;
    this.c = paramVarArgs.length;
  }
  
  public TrackGroup a(int paramInt) {
    return this.d[paramInt];
  }
  
  public int b(TrackGroup paramTrackGroup) {
    for (byte b = 0; b < this.c; b++) {
      if (this.d[b] == paramTrackGroup)
        return b; 
    } 
    return -1;
  }
  
  public boolean c() {
    boolean bool;
    if (this.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || TrackGroupArray.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.c != ((TrackGroupArray)paramObject).c || !Arrays.equals((Object[])this.d, (Object[])((TrackGroupArray)paramObject).d))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    if (this.e == 0)
      this.e = Arrays.hashCode((Object[])this.d); 
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    for (paramInt = 0; paramInt < this.c; paramInt++)
      paramParcel.writeParcelable(this.d[paramInt], 0); 
  }
  
  static final class a implements Parcelable.Creator<TrackGroupArray> {
    public TrackGroupArray a(Parcel param1Parcel) {
      return new TrackGroupArray(param1Parcel);
    }
    
    public TrackGroupArray[] b(int param1Int) {
      return new TrackGroupArray[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/TrackGroupArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */