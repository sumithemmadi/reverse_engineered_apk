package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class i32 implements k32 {
  private i32() {}
  
  public final byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt2 + paramInt1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */