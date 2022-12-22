package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class MlltFrame extends Id3Frame {
  public static final Parcelable.Creator<MlltFrame> CREATOR = new a();
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public final int[] f;
  
  public final int[] g;
  
  public MlltFrame(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    super("MLLT");
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramArrayOfint1;
    this.g = paramArrayOfint2;
  }
  
  MlltFrame(Parcel paramParcel) {
    super("MLLT");
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = (int[])h0.g(paramParcel.createIntArray());
    this.g = (int[])h0.g(paramParcel.createIntArray());
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || MlltFrame.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.c != ((MlltFrame)paramObject).c || this.d != ((MlltFrame)paramObject).d || this.e != ((MlltFrame)paramObject).e || !Arrays.equals(this.f, ((MlltFrame)paramObject).f) || !Arrays.equals(this.g, ((MlltFrame)paramObject).g))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return ((((527 + this.c) * 31 + this.d) * 31 + this.e) * 31 + Arrays.hashCode(this.f)) * 31 + Arrays.hashCode(this.g);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeIntArray(this.f);
    paramParcel.writeIntArray(this.g);
  }
  
  static final class a implements Parcelable.Creator<MlltFrame> {
    public MlltFrame a(Parcel param1Parcel) {
      return new MlltFrame(param1Parcel);
    }
    
    public MlltFrame[] b(int param1Int) {
      return new MlltFrame[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/MlltFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */