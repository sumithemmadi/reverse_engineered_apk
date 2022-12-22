package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
  private final Feature zza;
  
  public UnsupportedApiCallException(Feature paramFeature) {
    this.zza = paramFeature;
  }
  
  public final String getMessage() {
    String str = String.valueOf(this.zza);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 8);
    stringBuilder.append("Missing ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/UnsupportedApiCallException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */