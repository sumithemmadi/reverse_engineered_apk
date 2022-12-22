package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;

public class d implements h {
  public static final l a = a.a;
  
  private j b;
  
  private i c;
  
  private boolean d;
  
  private static v c(v paramv) {
    paramv.M(0);
    return paramv;
  }
  
  private boolean d(i parami) {
    f f = new f();
    if (!f.a(parami, true) || (f.b & 0x2) != 2)
      return false; 
    int k = Math.min(f.i, 8);
    v v = new v(k);
    parami.k(v.a, 0, k);
    if (c.o(c(v))) {
      this.c = new c();
    } else if (j.p(c(v))) {
      this.c = new j();
    } else {
      if (h.n(c(v))) {
        this.c = new h();
        return true;
      } 
      return false;
    } 
    return true;
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    try {
      return d(parami);
    } catch (ParserException parserException) {
      return false;
    } 
  }
  
  public int g(i parami, s params) {
    if (this.c == null)
      if (d(parami)) {
        parami.h();
      } else {
        throw new ParserException("Failed to determine bitstream type");
      }  
    if (!this.d) {
      v v = this.b.g(0, 1);
      this.b.f();
      this.c.c(this.b, v);
      this.d = true;
    } 
    return this.c.f(parami, params);
  }
  
  public void h(j paramj) {
    this.b = paramj;
  }
  
  public void i(long paramLong1, long paramLong2) {
    i i1 = this.c;
    if (i1 != null)
      i1.k(paramLong1, paramLong2); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */