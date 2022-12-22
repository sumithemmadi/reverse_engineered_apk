package com.google.android.gms.internal.ads;

public final class wg2 implements xh2 {
  private final xh2[] b;
  
  public wg2(xh2[] paramArrayOfxh2) {
    this.b = paramArrayOfxh2;
  }
  
  public final boolean a(long paramLong) {
    boolean bool2;
    boolean bool1 = false;
    while (true) {
      long l = b();
      bool2 = bool1;
      if (l != Long.MIN_VALUE) {
        xh2[] arrayOfXh2 = this.b;
        int i = arrayOfXh2.length;
        byte b = 0;
        boolean bool;
        for (bool = false; b < i; bool = bool3) {
          xh2 xh21 = arrayOfXh2[b];
          boolean bool3 = bool;
          if (xh21.b() == l)
            bool3 = bool | xh21.a(paramLong); 
          b++;
        } 
        bool2 = bool1 | bool;
        bool1 = bool2;
        if (!bool)
          break; 
        continue;
      } 
      break;
    } 
    return bool2;
  }
  
  public final long b() {
    xh2[] arrayOfXh2 = this.b;
    int i = arrayOfXh2.length;
    byte b = 0;
    long l;
    for (l = Long.MAX_VALUE; b < i; l = l2) {
      long l1 = arrayOfXh2[b].b();
      long l2 = l;
      if (l1 != Long.MIN_VALUE)
        l2 = Math.min(l, l1); 
      b++;
    } 
    return (l == Long.MAX_VALUE) ? Long.MIN_VALUE : l;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */