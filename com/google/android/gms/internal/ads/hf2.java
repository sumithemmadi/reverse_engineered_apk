package com.google.android.gms.internal.ads;

final class hf2 {
  private final qj2 a = new qj2(8);
  
  private int b;
  
  private final long b(le2 paramle2) {
    byte[] arrayOfByte = this.a.a;
    byte b1 = 0;
    paramle2.c(arrayOfByte, 0, 1);
    int i = this.a.a[0] & 0xFF;
    if (i == 0)
      return Long.MIN_VALUE; 
    int j = 128;
    byte b2;
    for (b2 = 0; (i & j) == 0; b2++)
      j >>= 1; 
    j = i & (j ^ 0xFFFFFFFF);
    paramle2.c(this.a.a, 1, b2);
    while (b1 < b2) {
      byte[] arrayOfByte1 = this.a.a;
      j = (arrayOfByte1[++b1] & 0xFF) + (j << 8);
    } 
    this.b += b2 + 1;
    return j;
  }
  
  public final boolean a(le2 paramle2) {
    long l1 = paramle2.getLength();
    long l2 = 1024L;
    long l3 = l2;
    if (l1 != -1L)
      if (l1 > 1024L) {
        l3 = l2;
      } else {
        l3 = l1;
      }  
    int i = (int)l3;
    paramle2.c(this.a.a, 0, 4);
    l3 = this.a.s();
    this.b = 4;
    while (l3 != 440786851L) {
      int j = this.b + 1;
      this.b = j;
      if (j == i)
        return false; 
      paramle2.c(this.a.a, 0, 1);
      l3 = l3 << 8L & 0xFFFFFFFFFFFFFF00L | (this.a.a[0] & 0xFF);
    } 
    l3 = b(paramle2);
    l2 = this.b;
    if (l3 != Long.MIN_VALUE && (l1 == -1L || l2 + l3 < l1))
      while (true) {
        int j = this.b;
        l1 = j;
        long l = l2 + l3;
        if (l1 < l) {
          if (b(paramle2) == Long.MIN_VALUE)
            return false; 
          l1 = b(paramle2);
          if (l1 < 0L || l1 > 2147483647L)
            return false; 
          if (l1 != 0L) {
            paramle2.d((int)l1);
            this.b = (int)(this.b + l1);
          } 
          continue;
        } 
        if (j == l)
          return true; 
        break;
      }  
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */