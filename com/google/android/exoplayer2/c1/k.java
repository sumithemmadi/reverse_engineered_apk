package com.google.android.exoplayer2.c1;

final class k {
  public static int a(i parami, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int j;
    for (j = 0; j < paramInt2; j += m) {
      int m = parami.g(paramArrayOfbyte, paramInt1 + j, paramInt2 - j);
      if (m == -1)
        break; 
    } 
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */