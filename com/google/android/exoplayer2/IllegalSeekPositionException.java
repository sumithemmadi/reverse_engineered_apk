package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
  public final long positionMs;
  
  public final y0 timeline;
  
  public final int windowIndex;
  
  public IllegalSeekPositionException(y0 paramy0, int paramInt, long paramLong) {
    this.timeline = paramy0;
    this.windowIndex = paramInt;
    this.positionMs = paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/IllegalSeekPositionException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */