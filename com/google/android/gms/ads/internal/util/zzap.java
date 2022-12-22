package com.google.android.gms.ads.internal.util;

public final class zzap extends Exception {
  private final int errorCode;
  
  public zzap(String paramString, int paramInt) {
    super(paramString);
    this.errorCode = paramInt;
  }
  
  public final int getErrorCode() {
    return this.errorCode;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/zzap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */