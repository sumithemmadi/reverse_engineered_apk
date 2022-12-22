package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.e;
import java.util.Arrays;

public final class TrackGroup implements Parcelable {
  public static final Parcelable.Creator<TrackGroup> CREATOR = new a();
  
  public final int b;
  
  private final Format[] c;
  
  private int d;
  
  TrackGroup(Parcel paramParcel) {
    int i = paramParcel.readInt();
    this.b = i;
    this.c = new Format[i];
    for (i = 0; i < this.b; i++)
      this.c[i] = (Format)paramParcel.readParcelable(Format.class.getClassLoader()); 
  }
  
  public TrackGroup(Format... paramVarArgs) {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.c = paramVarArgs;
    this.b = paramVarArgs.length;
  }
  
  public Format a(int paramInt) {
    return this.c[paramInt];
  }
  
  public int b(Format paramFormat) {
    byte b = 0;
    while (true) {
      Format[] arrayOfFormat = this.c;
      if (b < arrayOfFormat.length) {
        if (paramFormat == arrayOfFormat[b])
          return b; 
        b++;
        continue;
      } 
      return -1;
    } 
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || TrackGroup.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((TrackGroup)paramObject).b || !Arrays.equals((Object[])this.c, (Object[])((TrackGroup)paramObject).c))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    if (this.d == 0)
      this.d = 527 + Arrays.hashCode((Object[])this.c); 
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    for (paramInt = 0; paramInt < this.b; paramInt++)
      paramParcel.writeParcelable((Parcelable)this.c[paramInt], 0); 
  }
  
  static final class a implements Parcelable.Creator<TrackGroup> {
    public TrackGroup a(Parcel param1Parcel) {
      return new TrackGroup(param1Parcel);
    }
    
    public TrackGroup[] b(int param1Int) {
      return new TrackGroup[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/TrackGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */