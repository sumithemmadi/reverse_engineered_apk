package com.google.android.exoplayer2.c1.d0;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;

public final class t implements o {
  private final String a;
  
  private final v b;
  
  private final u c;
  
  private v d;
  
  private Format e;
  
  private String f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private long k;
  
  private boolean l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private boolean p;
  
  private long q;
  
  private int r;
  
  private long s;
  
  private int t;
  
  public t(String paramString) {
    this.a = paramString;
    v v1 = new v(1024);
    this.b = v1;
    this.c = new u(v1.a);
  }
  
  private static long a(u paramu) {
    return paramu.h((paramu.h(2) + 1) * 8);
  }
  
  private void g(u paramu) {
    if (!paramu.g()) {
      this.l = true;
      l(paramu);
    } else if (!this.l) {
      return;
    } 
    if (this.m == 0) {
      if (this.n == 0) {
        k(paramu, j(paramu));
        if (this.p)
          paramu.q((int)this.q); 
        return;
      } 
      throw new ParserException();
    } 
    throw new ParserException();
  }
  
  private int h(u paramu) {
    int i = paramu.b();
    Pair pair = g.f(paramu, true);
    this.r = ((Integer)pair.first).intValue();
    this.t = ((Integer)pair.second).intValue();
    return i - paramu.b();
  }
  
  private void i(u paramu) {
    int i = paramu.h(3);
    this.o = i;
    if (i != 0) {
      if (i != 1) {
        if (i != 3 && i != 4 && i != 5) {
          if (i == 6 || i == 7) {
            paramu.q(1);
            return;
          } 
          throw new IllegalStateException();
        } 
        paramu.q(6);
      } else {
        paramu.q(9);
      } 
    } else {
      paramu.q(8);
    } 
  }
  
  private int j(u paramu) {
    if (this.o == 0) {
      int i = 0;
      while (true) {
        int j = paramu.h(8);
        int k = i + j;
        i = k;
        if (j != 255)
          return k; 
      } 
    } 
    ParserException parserException = new ParserException();
    throw parserException;
  }
  
  private void k(u paramu, int paramInt) {
    int i = paramu.e();
    if ((i & 0x7) == 0) {
      this.b.M(i >> 3);
    } else {
      paramu.i(this.b.a, 0, paramInt * 8);
      this.b.M(0);
    } 
    this.d.b(this.b, paramInt);
    this.d.c(this.k, 1, paramInt, 0, null);
    this.k += this.s;
  }
  
  private void l(u paramu) {
    int j;
    int i = paramu.h(1);
    if (i == 1) {
      j = paramu.h(1);
    } else {
      j = 0;
    } 
    this.m = j;
    if (!j) {
      if (i == 1)
        a(paramu); 
      if (paramu.g()) {
        this.n = paramu.h(6);
        int k = paramu.h(4);
        j = paramu.h(3);
        if (k == 0 && j == 0) {
          if (i == 0) {
            k = paramu.e();
            j = h(paramu);
            paramu.o(k);
            byte[] arrayOfByte = new byte[(j + 7) / 8];
            paramu.i(arrayOfByte, 0, j);
            Format format = Format.p(this.f, "audio/mp4a-latm", null, -1, -1, this.t, this.r, Collections.singletonList(arrayOfByte), null, 0, this.a);
            if (!format.equals(this.e)) {
              this.e = format;
              this.s = 1024000000L / format.x;
              this.d.d(format);
            } 
          } else {
            paramu.q((int)a(paramu) - h(paramu));
          } 
          i(paramu);
          boolean bool = paramu.g();
          this.p = bool;
          this.q = 0L;
          if (bool)
            if (i == 1) {
              this.q = a(paramu);
            } else {
              do {
                bool = paramu.g();
                this.q = (this.q << 8L) + paramu.h(8);
              } while (bool);
            }  
          if (paramu.g())
            paramu.q(8); 
          return;
        } 
        throw new ParserException();
      } 
      throw new ParserException();
    } 
    ParserException parserException = new ParserException();
    throw parserException;
  }
  
  private void m(int paramInt) {
    this.b.I(paramInt);
    this.c.m(this.b.a);
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int i = this.g;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              i = Math.min(paramv.a(), this.i - this.h);
              paramv.h(this.c.a, this.h, i);
              i = this.h + i;
              this.h = i;
              if (i == this.i) {
                this.c.o(0);
                g(this.c);
                this.g = 0;
              } 
              continue;
            } 
            throw new IllegalStateException();
          } 
          i = (this.j & 0xFFFFFF1F) << 8 | paramv.z();
          this.i = i;
          if (i > this.b.a.length)
            m(i); 
          this.h = 0;
          this.g = 3;
          continue;
        } 
        i = paramv.z();
        if ((i & 0xE0) == 224) {
          this.j = i;
          this.g = 2;
          continue;
        } 
        if (i != 86)
          this.g = 0; 
        continue;
      } 
      if (paramv.z() == 86)
        this.g = 1; 
    } 
  }
  
  public void c() {
    this.g = 0;
    this.l = false;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.d = paramj.g(paramd.c(), 1);
    this.f = paramd.b();
  }
  
  public void f(long paramLong, int paramInt) {
    this.k = paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */