package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;

public final class g implements o {
  private final u a;
  
  private final v b;
  
  private final String c;
  
  private String d;
  
  private v e;
  
  private int f;
  
  private int g;
  
  private boolean h;
  
  private long i;
  
  private Format j;
  
  private int k;
  
  private long l;
  
  public g() {
    this(null);
  }
  
  public g(String paramString) {
    u u1 = new u(new byte[128]);
    this.a = u1;
    this.b = new v(u1.a);
    this.f = 0;
    this.c = paramString;
  }
  
  private boolean a(v paramv, byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    int i = Math.min(paramv.a(), paramInt - this.g);
    paramv.h(paramArrayOfbyte, this.g, i);
    i = this.g + i;
    this.g = i;
    if (i == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void g() {
    this.a.o(0);
    com.google.android.exoplayer2.audio.g.b b = com.google.android.exoplayer2.audio.g.e(this.a);
    Format format = this.j;
    if (format == null || b.d != format.w || b.c != format.x || b.a != format.j) {
      format = Format.p(this.d, b.a, null, -1, -1, b.d, b.c, null, null, 0, this.c);
      this.j = format;
      this.e.d(format);
    } 
    this.k = b.e;
    this.i = b.f * 1000000L / this.j.x;
  }
  
  private boolean h(v paramv) {
    while (true) {
      int i = paramv.a();
      boolean bool1 = false;
      boolean bool2 = false;
      if (i > 0) {
        if (!this.h) {
          if (paramv.z() == 11)
            bool2 = true; 
          this.h = bool2;
          continue;
        } 
        i = paramv.z();
        if (i == 119) {
          this.h = false;
          return true;
        } 
        bool2 = bool1;
        if (i == 11)
          bool2 = true; 
        this.h = bool2;
        continue;
      } 
      return false;
    } 
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int i = this.f;
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            continue; 
          i = Math.min(paramv.a(), this.k - this.g);
          this.e.b(paramv, i);
          int j = this.g + i;
          this.g = j;
          i = this.k;
          if (j == i) {
            this.e.c(this.l, 1, i, 0, null);
            this.l += this.i;
            this.f = 0;
          } 
          continue;
        } 
        if (a(paramv, this.b.a, 128)) {
          g();
          this.b.M(0);
          this.e.b(this.b, 128);
          this.f = 2;
        } 
        continue;
      } 
      if (h(paramv)) {
        this.f = 1;
        byte[] arrayOfByte = this.b.a;
        arrayOfByte[0] = (byte)11;
        arrayOfByte[1] = (byte)119;
        this.g = 2;
      } 
    } 
  }
  
  public void c() {
    this.f = 0;
    this.g = 0;
    this.h = false;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */