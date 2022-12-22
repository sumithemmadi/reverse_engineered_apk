package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.a;

public abstract class SpliceCommand implements Metadata.Entry {
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SCTE-35 splice command: type=");
    stringBuilder.append(getClass().getSimpleName());
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/SpliceCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */