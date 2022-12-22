package com.google.android.exoplayer2.drm;

public final class UnsupportedDrmException extends Exception {
  public final int reason;
  
  public UnsupportedDrmException(int paramInt) {
    this.reason = paramInt;
  }
  
  public UnsupportedDrmException(int paramInt, Exception paramException) {
    super(paramException);
    this.reason = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/UnsupportedDrmException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */