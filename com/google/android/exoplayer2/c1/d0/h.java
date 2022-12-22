package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.v;

public final class h implements h {
  public static final l a = b.a;
  
  private final i b = new i();
  
  private final v c = new v(16384);
  
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
        label25: while (true) {
          byte b = 0;
          while (true) {
            parami.k(v1.a, 0, 7);
            v1.M(0);
            int n = v1.F();
            if (n != 44096 && n != 44097) {
              parami.h();
              if (++m - j >= 8192)
                return false; 
              parami.e(m);
              continue label25;
            } 
            if (++b >= 4)
              return true; 
            n = com.google.android.exoplayer2.audio.h.e(v1.a, n);
            if (n == -1)
              return false; 
            parami.e(n - 7);
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
    int j = parami.read(this.c.a, 0, 16384);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */