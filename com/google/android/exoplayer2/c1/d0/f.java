package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.audio.g;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.v;

public final class f implements h {
  public static final l a = a.a;
  
  private final g b = new g();
  
  private final v c = new v(2786);
  
  private boolean d;
  
  public void a() {}
  
  public boolean e(i parami) {
    v v1 = new v(10);
    int j = 0;
    while (true) {
      parami.k(v1.a, 0, 10);
      v1.M(0);
      if (v1.C() != 4801587) {
        parami.h();
        parami.e(j);
        int m = j;
        label24: while (true) {
          byte b = 0;
          while (true) {
            parami.k(v1.a, 0, 6);
            v1.M(0);
            if (v1.F() != 2935) {
              parami.h();
              if (++m - j >= 8192)
                return false; 
              parami.e(m);
              continue label24;
            } 
            if (++b >= 4)
              return true; 
            int n = g.f(v1.a);
            if (n == -1)
              return false; 
            parami.e(n - 6);
          } 
          break;
        } 
        break;
      } 
      v1.N(3);
      int k = v1.y();
      j += k + 10;
      parami.e(k);
    } 
  }
  
  public int g(i parami, s params) {
    int j = parami.read(this.c.a, 0, 2786);
    if (j == -1)
      return -1; 
    this.c.M(0);
    this.c.L(j);
    if (!this.d) {
      this.b.f(0L, 4);
      this.d = true;
    } 
    this.b.b(this.c);
    return 0;
  }
  
  public void h(j paramj) {
    this.b.e(paramj, new h0.d(0, 1));
    paramj.f();
    paramj.a((t)new t.b(-9223372036854775807L));
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.d = false;
    this.b.c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */