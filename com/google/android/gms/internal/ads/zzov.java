package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzov extends IOException {
  private final int type;
  
  private final xi2 zzbiy;
  
  public zzov(IOException paramIOException, xi2 paramxi2, int paramInt) {
    super(paramIOException);
    this.zzbiy = paramxi2;
    this.type = paramInt;
  }
  
  public zzov(String paramString, xi2 paramxi2, int paramInt) {
    super(paramString);
    this.zzbiy = paramxi2;
    this.type = 1;
  }
  
  public zzov(String paramString, IOException paramIOException, xi2 paramxi2, int paramInt) {
    super(paramString, paramIOException);
    this.zzbiy = paramxi2;
    this.type = 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */