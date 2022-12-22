package com.google.android.gms.internal.ads;

public final class fs1 {
  private static final byte[] a = new byte[] { 
      9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 
      6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 
      3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 
      0, 0, 0 };
  
  private static final int[] b = new int[] { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
  
  private static final int[] c = new int[] { 3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE };
  
  private static final int[] d = new int[] { 
      1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 
      3628800, 39916800, 479001600 };
  
  private static int[] e = new int[] { 
      Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 
      43, 39, 37, 35, 34, 34, 33 };
  
  public static int a(int paramInt1, int paramInt2) {
    long l = paramInt1 << 1L;
    return (l > 2147483647L) ? Integer.MAX_VALUE : ((l < -2147483648L) ? Integer.MIN_VALUE : (int)l);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */