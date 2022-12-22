package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;

public final class PrivateCommand extends SpliceCommand {
  public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();
  
  public final long b;
  
  public final long c;
  
  public final byte[] d;
  
  private PrivateCommand(long paramLong1, byte[] paramArrayOfbyte, long paramLong2) {
    this.b = paramLong2;
    this.c = paramLong1;
    this.d = paramArrayOfbyte;
  }
  
  private PrivateCommand(Parcel paramParcel) {
    this.b = paramParcel.readLong();
    this.c = paramParcel.readLong();
    this.d = (byte[])h0.g(paramParcel.createByteArray());
  }
  
  static PrivateCommand a(v paramv, int paramInt, long paramLong) {
    long l = paramv.B();
    paramInt -= 4;
    byte[] arrayOfByte = new byte[paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    return new PrivateCommand(l, arrayOfByte, paramLong);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeLong(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeByteArray(this.d);
  }
  
  static final class a implements Parcelable.Creator<PrivateCommand> {
    public PrivateCommand a(Parcel param1Parcel) {
      return new PrivateCommand(param1Parcel, null);
    }
    
    public PrivateCommand[] b(int param1Int) {
      return new PrivateCommand[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/PrivateCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */