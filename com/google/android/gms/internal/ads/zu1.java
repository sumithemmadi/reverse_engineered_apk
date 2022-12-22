package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zu1<P> {
  private final P a;
  
  private final byte[] b;
  
  private final zzege c;
  
  private final zzegx d;
  
  private final int e;
  
  zu1(P paramP, byte[] paramArrayOfbyte, zzege paramzzege, zzegx paramzzegx, int paramInt) {
    this.a = paramP;
    this.b = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    this.c = paramzzege;
    this.d = paramzzegx;
    this.e = paramInt;
  }
  
  public final P a() {
    return this.a;
  }
  
  public final zzege b() {
    return this.c;
  }
  
  public final zzegx c() {
    return this.d;
  }
  
  public final byte[] d() {
    byte[] arrayOfByte = this.b;
    return (arrayOfByte == null) ? null : Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */