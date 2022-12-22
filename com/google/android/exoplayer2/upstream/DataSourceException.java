package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public final class DataSourceException extends IOException {
  public final int reason;
  
  public DataSourceException(int paramInt) {
    this.reason = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/DataSourceException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */