package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class SpliceNullCommand extends SpliceCommand {
  public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new a();
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
  
  static final class a implements Parcelable.Creator<SpliceNullCommand> {
    public SpliceNullCommand a(Parcel param1Parcel) {
      return new SpliceNullCommand();
    }
    
    public SpliceNullCommand[] b(int param1Int) {
      return new SpliceNullCommand[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/SpliceNullCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */