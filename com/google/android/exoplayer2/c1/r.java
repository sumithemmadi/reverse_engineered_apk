package com.google.android.exoplayer2.c1;

public final class r {
  private static final String[] a = new String[] { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  
  private static final int[] b = new int[] { 44100, 48000, 32000 };
  
  private static final int[] c = new int[] { 
      32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 
      352000, 384000, 416000, 448000 };
  
  private static final int[] d = new int[] { 
      32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 
      176000, 192000, 224000, 256000 };
  
  private static final int[] e = new int[] { 
      32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 
      224000, 256000, 320000, 384000 };
  
  private static final int[] f = new int[] { 
      32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 
      192000, 224000, 256000, 320000 };
  
  private static final int[] g = new int[] { 
      8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 
      112000, 128000, 144000, 160000 };
  
  public int h;
  
  public String i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public static int a(int paramInt) {
    if (!d(paramInt))
      return -1; 
    int i = paramInt >>> 19 & 0x3;
    if (i == 1)
      return -1; 
    int j = paramInt >>> 17 & 0x3;
    if (j == 0)
      return -1; 
    int k = paramInt >>> 12 & 0xF;
    return (k == 0 || k == 15 || (paramInt >>> 10 & 0x3) == 3) ? -1 : c(i, j);
  }
  
  public static int b(int paramInt) {
    if (!d(paramInt))
      return -1; 
    int i = paramInt >>> 19 & 0x3;
    if (i == 1)
      return -1; 
    int j = paramInt >>> 17 & 0x3;
    if (j == 0)
      return -1; 
    int k = paramInt >>> 12 & 0xF;
    if (k == 0 || k == 15)
      return -1; 
    int m = paramInt >>> 10 & 0x3;
    if (m == 3)
      return -1; 
    int n = b[m];
    if (i == 2) {
      m = n / 2;
    } else {
      m = n;
      if (i == 0)
        m = n / 4; 
    } 
    int i1 = paramInt >>> 9 & 0x1;
    if (j == 3) {
      if (i == 3) {
        paramInt = c[k - 1];
      } else {
        paramInt = d[k - 1];
      } 
      return (paramInt * 12 / m + i1) * 4;
    } 
    if (i == 3) {
      if (j == 2) {
        paramInt = e[k - 1];
      } else {
        paramInt = f[k - 1];
      } 
    } else {
      paramInt = g[k - 1];
    } 
    n = 144;
    if (i == 3)
      return paramInt * 144 / m + i1; 
    if (j == 1)
      n = 72; 
    return n * paramInt / m + i1;
  }
  
  private static int c(int paramInt1, int paramInt2) {
    char c = 'Ҁ';
    if (paramInt2 != 1) {
      if (paramInt2 != 2) {
        if (paramInt2 == 3)
          return 384; 
        throw new IllegalArgumentException();
      } 
      return 1152;
    } 
    if (paramInt1 == 3) {
      paramInt1 = c;
    } else {
      paramInt1 = 576;
    } 
    return paramInt1;
  }
  
  private static boolean d(int paramInt) {
    boolean bool;
    if ((paramInt & 0xFFE00000) == -2097152) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean e(int paramInt, r paramr) {
    if (!d(paramInt))
      return false; 
    int i = paramInt >>> 19 & 0x3;
    if (i == 1)
      return false; 
    int j = paramInt >>> 17 & 0x3;
    if (j == 0)
      return false; 
    int k = paramInt >>> 12 & 0xF;
    if (k == 0 || k == 15)
      return false; 
    int m = paramInt >>> 10 & 0x3;
    if (m == 3)
      return false; 
    int n = b[m];
    if (i == 2) {
      m = n / 2;
    } else {
      m = n;
      if (i == 0)
        m = n / 4; 
    } 
    int i1 = paramInt >>> 9 & 0x1;
    int i2 = c(i, j);
    if (j == 3) {
      if (i == 3) {
        n = c[k - 1];
      } else {
        n = d[k - 1];
      } 
      k = (n * 12 / m + i1) * 4;
    } else {
      if (i == 3) {
        if (j == 2) {
          n = e[k - 1];
        } else {
          n = f[k - 1];
        } 
        k = n * 144 / m;
      } else {
        int i3 = g[k - 1];
        if (j == 1) {
          n = 72;
        } else {
          n = 144;
        } 
        k = n * i3 / m;
        n = i3;
      } 
      k += i1;
    } 
    String str = a[3 - j];
    if ((paramInt >> 6 & 0x3) == 3) {
      paramInt = 1;
    } else {
      paramInt = 2;
    } 
    paramr.f(i, str, k, m, paramInt, n, i2);
    return true;
  }
  
  private void f(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.h = paramInt1;
    this.i = paramString;
    this.j = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
    this.m = paramInt5;
    this.n = paramInt6;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */