package com.google.android.exoplayer2.c1.d0;

import android.util.SparseArray;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;

public final class z implements h {
  public static final l a = d.a;
  
  private final e0 b;
  
  private final SparseArray<a> c;
  
  private final v d;
  
  private final y e;
  
  private boolean f;
  
  private boolean g;
  
  private boolean h;
  
  private long i;
  
  private x j;
  
  private j k;
  
  private boolean l;
  
  public z() {
    this(new e0(0L));
  }
  
  public z(e0 parame0) {
    this.b = parame0;
    this.d = new v(4096);
    this.c = new SparseArray();
    this.e = new y();
  }
  
  private void c(long paramLong) {
    if (!this.l) {
      this.l = true;
      if (this.e.c() != -9223372036854775807L) {
        x x1 = new x(this.e.d(), this.e.c(), paramLong);
        this.j = x1;
        this.k.a(x1.b());
      } else {
        this.k.a((t)new t.b(this.e.c()));
      } 
    } 
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    byte[] arrayOfByte = new byte[14];
    boolean bool = false;
    parami.k(arrayOfByte, 0, 14);
    if (442 != ((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF))
      return false; 
    if ((arrayOfByte[4] & 0xC4) != 68)
      return false; 
    if ((arrayOfByte[6] & 0x4) != 4)
      return false; 
    if ((arrayOfByte[8] & 0x4) != 4)
      return false; 
    if ((arrayOfByte[9] & 0x1) != 1)
      return false; 
    if ((arrayOfByte[12] & 0x3) != 3)
      return false; 
    parami.e(arrayOfByte[13] & 0x7);
    parami.k(arrayOfByte, 0, 3);
    if (1 == ((arrayOfByte[0] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF))
      bool = true; 
    return bool;
  }
  
  public int g(i parami, s params) {
    long l1 = parami.getLength();
    if (l1 != -1L) {
      k = 1;
    } else {
      k = 0;
    } 
    if (k && !this.e.e())
      return this.e.g(parami, params); 
    c(l1);
    x x1 = this.j;
    if (x1 != null && x1.d())
      return this.j.c(parami, params); 
    parami.h();
    if (l1 != -1L) {
      l1 -= parami.d();
    } else {
      l1 = -1L;
    } 
    if (l1 != -1L && l1 < 4L)
      return -1; 
    if (!parami.c(this.d.a, 0, 4, true))
      return -1; 
    this.d.M(0);
    int k = this.d.k();
    if (k == 441)
      return -1; 
    if (k == 442) {
      parami.k(this.d.a, 0, 10);
      this.d.M(9);
      parami.i((this.d.z() & 0x7) + 14);
      return 0;
    } 
    if (k == 443) {
      parami.k(this.d.a, 0, 2);
      this.d.M(0);
      parami.i(this.d.F() + 6);
      return 0;
    } 
    if ((k & 0xFFFFFF00) >> 8 != 1) {
      parami.i(1);
      return 0;
    } 
    k &= 0xFF;
    a a2 = (a)this.c.get(k);
    a a1 = a2;
    if (!this.f) {
      a a = a2;
      if (a2 == null) {
        p p;
        a1 = null;
        if (k == 189) {
          g g = new g();
          this.g = true;
          this.i = parami.a();
        } else if ((k & 0xE0) == 192) {
          u u = new u();
          this.g = true;
          this.i = parami.a();
        } else if ((k & 0xF0) == 224) {
          p = new p();
          this.h = true;
          this.i = parami.a();
        } 
        a = a2;
        if (p != null) {
          h0.d d = new h0.d(k, 256);
          p.e(this.k, d);
          a = new a(p, this.b);
          this.c.put(k, a);
        } 
      } 
      if (this.g && this.h) {
        l1 = this.i + 8192L;
      } else {
        l1 = 1048576L;
      } 
      a1 = a;
      if (parami.a() > l1) {
        this.f = true;
        this.k.f();
        a1 = a;
      } 
    } 
    parami.k(this.d.a, 0, 2);
    this.d.M(0);
    k = this.d.F() + 6;
    if (a1 == null) {
      parami.i(k);
    } else {
      this.d.I(k);
      parami.readFully(this.d.a, 0, k);
      this.d.M(6);
      a1.a(this.d);
      v v1 = this.d;
      v1.L(v1.b());
    } 
    return 0;
  }
  
  public void h(j paramj) {
    this.k = paramj;
  }
  
  public void i(long paramLong1, long paramLong2) {
    paramLong1 = this.b.e();
    byte b1 = 0;
    if (paramLong1 == -9223372036854775807L) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (b2 || (this.b.c() != 0L && this.b.c() != paramLong2)) {
      this.b.g();
      this.b.h(paramLong2);
    } 
    x x1 = this.j;
    byte b2 = b1;
    if (x1 != null) {
      x1.h(paramLong2);
      b2 = b1;
    } 
    while (b2 < this.c.size()) {
      ((a)this.c.valueAt(b2)).d();
      b2++;
    } 
  }
  
  private static final class a {
    private final o a;
    
    private final e0 b;
    
    private final u c;
    
    private boolean d;
    
    private boolean e;
    
    private boolean f;
    
    private int g;
    
    private long h;
    
    public a(o param1o, e0 param1e0) {
      this.a = param1o;
      this.b = param1e0;
      this.c = new u(new byte[64]);
    }
    
    private void b() {
      this.c.q(8);
      this.d = this.c.g();
      this.e = this.c.g();
      this.c.q(6);
      this.g = this.c.h(8);
    }
    
    private void c() {
      this.h = 0L;
      if (this.d) {
        this.c.q(4);
        long l1 = this.c.h(3);
        this.c.q(1);
        long l2 = (this.c.h(15) << 15);
        this.c.q(1);
        long l3 = this.c.h(15);
        this.c.q(1);
        if (!this.f && this.e) {
          this.c.q(4);
          long l4 = this.c.h(3);
          this.c.q(1);
          long l5 = (this.c.h(15) << 15);
          this.c.q(1);
          long l6 = this.c.h(15);
          this.c.q(1);
          this.b.b(l4 << 30L | l5 | l6);
          this.f = true;
        } 
        this.h = this.b.b(l1 << 30L | l2 | l3);
      } 
    }
    
    public void a(v param1v) {
      param1v.h(this.c.a, 0, 3);
      this.c.o(0);
      b();
      param1v.h(this.c.a, 0, this.g);
      this.c.o(0);
      c();
      this.a.f(this.h, 4);
      this.a.b(param1v);
      this.a.d();
    }
    
    public void d() {
      this.f = false;
      this.a.c();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */