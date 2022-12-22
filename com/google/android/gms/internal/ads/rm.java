package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class rm extends FilterInputStream {
  private final long b;
  
  private long c;
  
  rm(InputStream paramInputStream, long paramLong) {
    super(paramInputStream);
    this.b = paramLong;
  }
  
  final long b() {
    return this.b - this.c;
  }
  
  public final int read() {
    int i = super.read();
    if (i != -1)
      this.c++; 
    return i;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = super.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt1 != -1)
      this.c += paramInt1; 
    return paramInt1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */