package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.h0;

final class f {
  public static b a(int paramInt, long[] paramArrayOflong, int[] paramArrayOfint, long paramLong) {
    int i = 8192 / paramInt;
    int j = paramArrayOfint.length;
    int k = 0;
    byte b = 0;
    int m = 0;
    while (b < j) {
      m += h0.i(paramArrayOfint[b], i);
      b++;
    } 
    long[] arrayOfLong1 = new long[m];
    int[] arrayOfInt1 = new int[m];
    long[] arrayOfLong2 = new long[m];
    int[] arrayOfInt2 = new int[m];
    int n = 0;
    b = 0;
    j = 0;
    for (m = k; m < paramArrayOfint.length; m++) {
      k = paramArrayOfint[m];
      long l = paramArrayOflong[m];
      while (k > 0) {
        int i1 = Math.min(i, k);
        arrayOfLong1[b] = l;
        arrayOfInt1[b] = paramInt * i1;
        j = Math.max(j, arrayOfInt1[b]);
        arrayOfLong2[b] = n * paramLong;
        arrayOfInt2[b] = 1;
        l += arrayOfInt1[b];
        n += i1;
        k -= i1;
        b++;
      } 
    } 
    return new b(arrayOfLong1, arrayOfInt1, j, arrayOfLong2, arrayOfInt2, paramLong * n, null);
  }
  
  public static final class b {
    public final long[] a;
    
    public final int[] b;
    
    public final int c;
    
    public final long[] d;
    
    public final int[] e;
    
    public final long f;
    
    private b(long[] param1ArrayOflong1, int[] param1ArrayOfint1, int param1Int, long[] param1ArrayOflong2, int[] param1ArrayOfint2, long param1Long) {
      this.a = param1ArrayOflong1;
      this.b = param1ArrayOfint1;
      this.c = param1Int;
      this.d = param1ArrayOflong2;
      this.e = param1ArrayOfint2;
      this.f = param1Long;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */