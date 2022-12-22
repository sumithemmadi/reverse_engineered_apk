package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

public final class g22 implements uu1 {
  private final ox1 a;
  
  private final int b;
  
  public g22(ox1 paramox1, int paramInt) {
    this.a = paramox1;
    this.b = paramInt;
    if (paramInt >= 10) {
      paramox1.a(new byte[0], paramInt);
      return;
    } 
    throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
  }
  
  public final byte[] a(byte[] paramArrayOfbyte) {
    return this.a.a(paramArrayOfbyte, this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */