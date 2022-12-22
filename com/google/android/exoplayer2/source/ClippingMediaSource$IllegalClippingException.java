package com.google.android.exoplayer2.source;

import java.io.IOException;

public final class ClippingMediaSource$IllegalClippingException extends IOException {
  public final int reason;
  
  public ClippingMediaSource$IllegalClippingException(int paramInt) {
    super(stringBuilder.toString());
    this.reason = paramInt;
  }
  
  private static String a(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? "unknown" : "start exceeds end") : "not seekable to start") : "invalid period count";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */