package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.util.e;
import java.io.IOException;

public final class AdsMediaSource$AdLoadException extends IOException {
  public final int type;
  
  private AdsMediaSource$AdLoadException(int paramInt, Exception paramException) {
    super(paramException);
    this.type = paramInt;
  }
  
  public static AdsMediaSource$AdLoadException createForAd(Exception paramException) {
    return new AdsMediaSource$AdLoadException(0, paramException);
  }
  
  public static AdsMediaSource$AdLoadException createForAdGroup(Exception paramException, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to load ad group ");
    stringBuilder.append(paramInt);
    return new AdsMediaSource$AdLoadException(1, new IOException(stringBuilder.toString(), paramException));
  }
  
  public static AdsMediaSource$AdLoadException createForAllAds(Exception paramException) {
    return new AdsMediaSource$AdLoadException(2, paramException);
  }
  
  public static AdsMediaSource$AdLoadException createForUnexpected(RuntimeException paramRuntimeException) {
    return new AdsMediaSource$AdLoadException(3, paramRuntimeException);
  }
  
  public RuntimeException getRuntimeExceptionForUnexpected() {
    boolean bool;
    if (this.type == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    return (RuntimeException)e.e(getCause());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/ads/AdsMediaSource$AdLoadException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */