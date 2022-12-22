package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.r;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;

public final class u implements o {
  private final v a;
  
  private final r b;
  
  private final String c;
  
  private String d;
  
  private v e;
  
  private int f = 0;
  
  private int g;
  
  private boolean h;
  
  private boolean i;
  
  private long j;
  
  private int k;
  
  private long l;
  
  public u() {
    this(null);
  }
  
  public u(String paramString) {
    v v1 = new v(4);
    this.a = v1;
    v1.a[0] = (byte)-1;
    this.b = new r();
    this.c = paramString;
  }
  
  private void a(v paramv) {
    byte[] arrayOfByte = paramv.a;
    int i = paramv.c();
    int j = paramv.d();
    while (i < j) {
      boolean bool1;
      boolean bool2;
      if ((arrayOfByte[i] & 0xFF) == 255) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (this.i && (arrayOfByte[i] & 0xE0) == 224) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.i = bool1;
      if (bool2) {
        paramv.M(i + 1);
        this.i = false;
        this.a.a[1] = (byte)arrayOfByte[i];
        this.g = 2;
        this.f = 1;
        return;
      } 
      i++;
    } 
    paramv.M(j);
  }
  
  private void g(v paramv) {
    int i = Math.min(paramv.a(), this.k - this.g);
    this.e.b(paramv, i);
    int j = this.g + i;
    this.g = j;
    i = this.k;
    if (j < i)
      return; 
    this.e.c(this.l, 1, i, 0, null);
    this.l += this.j;
    this.g = 0;
    this.f = 0;
  }
  
  private void h(v paramv) {
    int i = Math.min(paramv.a(), 4 - this.g);
    paramv.h(this.a.a, this.g, i);
    i = this.g + i;
    this.g = i;
    if (i < 4)
      return; 
    this.a.M(0);
    if (!r.e(this.a.k(), this.b)) {
      this.g = 0;
      this.f = 1;
      return;
    } 
    r r1 = this.b;
    this.k = r1.j;
    if (!this.h) {
      long l = r1.n;
      i = r1.k;
      this.j = l * 1000000L / i;
      Format format = Format.p(this.d, r1.i, null, -1, 4096, r1.l, i, null, null, 0, this.c);
      this.e.d(format);
      this.h = true;
    } 
    this.a.M(0);
    this.e.b(this.a, 4);
    this.f = 2;
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int i = this.f;
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            g(paramv);
            continue;
          } 
          throw new IllegalStateException();
        } 
        h(paramv);
        continue;
      } 
      a(paramv);
    } 
  }
  
  public void c() {
    this.f = 0;
    this.g = 0;
    this.i = false;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.d = paramd.b();
    this.e = paramj.g(paramd.c(), 1);
  }
  
  public void f(long paramLong, int paramInt) {
    this.l = paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */