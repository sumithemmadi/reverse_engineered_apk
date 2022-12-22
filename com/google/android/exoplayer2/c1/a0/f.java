package com.google.android.exoplayer2.c1.a0;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.v;

final class f {
  private final v a = new v(8);
  
  private int b;
  
  private long a(i parami) {
    byte[] arrayOfByte = this.a.a;
    int j = 0;
    parami.k(arrayOfByte, 0, 1);
    int k = this.a.a[0] & 0xFF;
    if (k == 0)
      return Long.MIN_VALUE; 
    int m = 128;
    byte b;
    for (b = 0; (k & m) == 0; b++)
      m >>= 1; 
    k &= m ^ 0xFFFFFFFF;
    parami.k(this.a.a, 1, b);
    m = j;
    for (j = k; m < b; j = (arrayOfByte1[++m] & 0xFF) + (j << 8))
      byte[] arrayOfByte1 = this.a.a; 
    this.b += b + 1;
    return j;
  }
  
  public boolean b(i parami) {
    long l1 = parami.getLength();
    long l2 = 1024L;
    long l3 = l2;
    if (l1 != -1L)
      if (l1 > 1024L) {
        l3 = l2;
      } else {
        l3 = l1;
      }  
    int j = (int)l3;
    byte[] arrayOfByte = this.a.a;
    boolean bool1 = false;
    parami.k(arrayOfByte, 0, 4);
    l3 = this.a.B();
    this.b = 4;
    while (l3 != 440786851L) {
      int k = this.b + 1;
      this.b = k;
      if (k == j)
        return false; 
      parami.k(this.a.a, 0, 1);
      l3 = l3 << 8L & 0xFFFFFFFFFFFFFF00L | (this.a.a[0] & 0xFF);
    } 
    l3 = a(parami);
    l2 = this.b;
    boolean bool2 = bool1;
    if (l3 != Long.MIN_VALUE)
      if (l1 != -1L && l2 + l3 >= l1) {
        bool2 = bool1;
      } else {
        while (true) {
          int k = this.b;
          l1 = k;
          long l = l2 + l3;
          if (l1 < l) {
            if (a(parami) == Long.MIN_VALUE)
              return false; 
            l1 = a(parami);
            if (l1 < 0L || l1 > 2147483647L)
              return false; 
            if (l1 != 0L) {
              k = (int)l1;
              parami.e(k);
              this.b += k;
            } 
            continue;
          } 
          bool2 = bool1;
          if (k == l)
            bool2 = true; 
          break;
        } 
      }  
    return bool2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/a0/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */