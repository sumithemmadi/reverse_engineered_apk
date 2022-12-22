package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;

public final class w implements h0 {
  private final o a;
  
  private final u b;
  
  private int c;
  
  private int d;
  
  private e0 e;
  
  private boolean f;
  
  private boolean g;
  
  private boolean h;
  
  private int i;
  
  private int j;
  
  private boolean k;
  
  private long l;
  
  public w(o paramo) {
    this.a = paramo;
    this.b = new u(new byte[10]);
    this.c = 0;
  }
  
  private boolean d(v paramv, byte[] paramArrayOfbyte, int paramInt) {
    int i = Math.min(paramv.a(), paramInt - this.d);
    boolean bool = true;
    if (i <= 0)
      return true; 
    if (paramArrayOfbyte == null) {
      paramv.N(i);
    } else {
      paramv.h(paramArrayOfbyte, this.d, i);
    } 
    i = this.d + i;
    this.d = i;
    if (i != paramInt)
      bool = false; 
    return bool;
  }
  
  private boolean e() {
    this.b.o(0);
    int i = this.b.h(24);
    if (i != 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected start code prefix: ");
      stringBuilder.append(i);
      o.f("PesReader", stringBuilder.toString());
      this.j = -1;
      return false;
    } 
    this.b.q(8);
    i = this.b.h(16);
    this.b.q(5);
    this.k = this.b.g();
    this.b.q(2);
    this.f = this.b.g();
    this.g = this.b.g();
    this.b.q(6);
    int j = this.b.h(8);
    this.i = j;
    if (i == 0) {
      this.j = -1;
    } else {
      this.j = i + 6 - 9 - j;
    } 
    return true;
  }
  
  private void f() {
    this.b.o(0);
    this.l = -9223372036854775807L;
    if (this.f) {
      this.b.q(4);
      long l1 = this.b.h(3);
      this.b.q(1);
      long l2 = (this.b.h(15) << 15);
      this.b.q(1);
      long l3 = this.b.h(15);
      this.b.q(1);
      if (!this.h && this.g) {
        this.b.q(4);
        long l4 = this.b.h(3);
        this.b.q(1);
        long l5 = (this.b.h(15) << 15);
        this.b.q(1);
        long l6 = this.b.h(15);
        this.b.q(1);
        this.e.b(l4 << 30L | l5 | l6);
        this.h = true;
      } 
      this.l = this.e.b(l1 << 30L | l2 | l3);
    } 
  }
  
  private void g(int paramInt) {
    this.c = paramInt;
    this.d = 0;
  }
  
  public void a(e0 parame0, j paramj, h0.d paramd) {
    this.e = parame0;
    this.a.e(paramj, paramd);
  }
  
  public final void b(v paramv, int paramInt) {
    int i = paramInt;
    if ((paramInt & 0x1) != 0) {
      i = this.c;
      if (i != 0 && i != 1)
        if (i != 2) {
          if (i == 3) {
            if (this.j != -1) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unexpected start indicator: expected ");
              stringBuilder.append(this.j);
              stringBuilder.append(" more bytes");
              o.f("PesReader", stringBuilder.toString());
            } 
            this.a.d();
          } else {
            throw new IllegalStateException();
          } 
        } else {
          o.f("PesReader", "Unexpected start indicator reading extended header");
        }  
      g(1);
      i = paramInt;
    } 
    while (paramv.a() > 0) {
      int j = this.c;
      if (j != 0) {
        paramInt = 0;
        int k = 0;
        int m = 0;
        if (j != 1) {
          if (j != 2) {
            if (j == 3) {
              k = paramv.a();
              paramInt = this.j;
              if (paramInt != -1)
                m = k - paramInt; 
              paramInt = k;
              if (m > 0) {
                paramInt = k - m;
                paramv.L(paramv.c() + paramInt);
              } 
              this.a.b(paramv);
              m = this.j;
              if (m != -1) {
                paramInt = m - paramInt;
                this.j = paramInt;
                if (paramInt == 0) {
                  this.a.d();
                  g(1);
                } 
              } 
              continue;
            } 
            throw new IllegalStateException();
          } 
          m = Math.min(10, this.i);
          if (d(paramv, this.b.a, m) && d(paramv, null, this.i)) {
            f();
            if (this.k)
              paramInt = 4; 
            i |= paramInt;
            this.a.f(this.l, i);
            g(3);
          } 
          continue;
        } 
        if (d(paramv, this.b.a, 9)) {
          paramInt = k;
          if (e())
            paramInt = 2; 
          g(paramInt);
        } 
        continue;
      } 
      paramv.N(paramv.a());
    } 
  }
  
  public final void c() {
    this.c = 0;
    this.d = 0;
    this.h = false;
    this.a.c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */