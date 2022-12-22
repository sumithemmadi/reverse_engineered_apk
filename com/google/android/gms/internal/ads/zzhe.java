package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzhe extends Exception {
  private final int type;
  
  private final int zzaej;
  
  private zzhe(int paramInt1, String paramString, Throwable paramThrowable, int paramInt2) {
    super(null, paramThrowable);
    this.type = paramInt1;
    this.zzaej = paramInt2;
  }
  
  public static zzhe zza(IOException paramIOException) {
    return new zzhe(0, null, paramIOException, -1);
  }
  
  public static zzhe zza(Exception paramException, int paramInt) {
    return new zzhe(1, null, paramException, paramInt);
  }
  
  static zzhe zza(RuntimeException paramRuntimeException) {
    return new zzhe(2, null, paramRuntimeException, -1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */