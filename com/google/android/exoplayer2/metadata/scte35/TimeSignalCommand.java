package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;

public final class TimeSignalCommand extends SpliceCommand {
  public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();
  
  public final long b;
  
  public final long c;
  
  private TimeSignalCommand(long paramLong1, long paramLong2) {
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  static TimeSignalCommand a(v paramv, long paramLong, e0 parame0) {
    paramLong = b(paramv, paramLong);
    return new TimeSignalCommand(paramLong, parame0.b(paramLong));
  }
  
  static long b(v paramv, long paramLong) {
    long l = paramv.z();
    if ((0x80L & l) != 0L) {
      paramLong = 0x1FFFFFFFFL & ((l & 0x1L) << 32L | paramv.B()) + paramLong;
    } else {
      paramLong = -9223372036854775807L;
    } 
    return paramLong;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeLong(this.b);
    paramParcel.writeLong(this.c);
  }
  
  static final class a implements Parcelable.Creator<TimeSignalCommand> {
    public TimeSignalCommand a(Parcel param1Parcel) {
      return new TimeSignalCommand(param1Parcel.readLong(), param1Parcel.readLong(), null);
    }
    
    public TimeSignalCommand[] b(int param1Int) {
      return new TimeSignalCommand[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/TimeSignalCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */