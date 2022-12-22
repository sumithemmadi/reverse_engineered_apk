package com.google.android.gms.internal.ads;

final class gf2 {
  private static final long[] a = new long[] { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  
  private final byte[] b = new byte[8];
  
  private int c;
  
  private int d;
  
  public static long c(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    long l1 = paramArrayOfbyte[0] & 0xFFL;
    long l2 = l1;
    if (paramBoolean)
      l2 = l1 & (a[paramInt - 1] ^ 0xFFFFFFFFFFFFFFFFL); 
    for (byte b = 1; b < paramInt; b++)
      l2 = l2 << 8L | paramArrayOfbyte[b] & 0xFFL; 
    return l2;
  }
  
  public static int d(int paramInt) {
    byte b = 0;
    while (true) {
      long[] arrayOfLong = a;
      if (b < arrayOfLong.length) {
        if ((arrayOfLong[b] & paramInt) != 0L) {
          paramInt = b + 1;
          break;
        } 
        b++;
        continue;
      } 
      paramInt = -1;
      break;
    } 
    return paramInt;
  }
  
  public final void a() {
    this.c = 0;
    this.d = 0;
  }
  
  public final long b(le2 paramle2, boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
    if (this.c == 0) {
      if (!paramle2.e(this.b, 0, 1, paramBoolean1))
        return -1L; 
      int j = d(this.b[0] & 0xFF);
      this.d = j;
      if (j != -1) {
        this.c = 1;
      } else {
        throw new IllegalStateException("No valid varint length mask found");
      } 
    } 
    int i = this.d;
    if (i > paramInt) {
      this.c = 0;
      return -2L;
    } 
    if (i != 1)
      paramle2.readFully(this.b, 1, i - 1); 
    this.c = 0;
    return c(this.b, this.d, paramBoolean2);
  }
  
  public final int e() {
    return this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */