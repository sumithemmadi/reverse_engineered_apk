package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.a;

public abstract class Id3Frame implements Metadata.Entry {
  public final String b;
  
  public Id3Frame(String paramString) {
    this.b = paramString;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/Id3Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */