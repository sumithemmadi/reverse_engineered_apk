package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.h;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;

public final class i implements o {
  private final u a;
  
  private final v b;
  
  private final String c;
  
  private String d;
  
  private v e;
  
  private int f;
  
  private int g;
  
  private boolean h;
  
  private boolean i;
  
  private long j;
  
  private Format k;
  
  private int l;
  
  private long m;
  
  public i() {
    this(null);
  }
  
  public i(String paramString) {
    u u1 = new u(new byte[16]);
    this.a = u1;
    this.b = new v(u1.a);
    this.f = 0;
    this.g = 0;
    this.h = false;
    this.i = false;
    this.c = paramString;
  }
  
  private boolean a(v paramv, byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    int j = Math.min(paramv.a(), paramInt - this.g);
    paramv.h(paramArrayOfbyte, this.g, j);
    j = this.g + j;
    this.g = j;
    if (j == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void g() {
    this.a.o(0);
    h.b b = h.d(this.a);
    Format format = this.k;
    if (format == null || b.c != format.w || b.b != format.x || !"audio/ac4".equals(format.j)) {
      format = Format.p(this.d, "audio/ac4", null, -1, -1, b.c, b.b, null, null, 0, this.c);
      this.k = format;
      this.e.d(format);
    } 
    this.l = b.d;
    this.j = b.e * 1000000L / this.k.x;
  }
  
  private boolean h(v paramv) {
    while (true) {
      int j = paramv.a();
      boolean bool1 = false;
      boolean bool2 = false;
      if (j > 0) {
        if (!this.h) {
          if (paramv.z() == 172)
            bool2 = true; 
          this.h = bool2;
          continue;
        } 
        j = paramv.z();
        if (j == 172) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        this.h = bool2;
        if (j != 64) {
          if (j == 65)
            continue; 
          continue;
        } 
        bool2 = bool1;
        if (j == 65)
          bool2 = true; 
        this.i = bool2;
        return true;
      } 
      return false;
    } 
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int j = this.f;
      if (j != 0) {
        if (j != 1) {
          if (j != 2)
            continue; 
          j = Math.min(paramv.a(), this.l - this.g);
          this.e.b(paramv, j);
          j = this.g + j;
          this.g = j;
          int k = this.l;
          if (j == k) {
            this.e.c(this.m, 1, k, 0, null);
            this.m += this.j;
            this.f = 0;
          } 
          continue;
        } 
        if (a(paramv, this.b.a, 16)) {
          g();
          this.b.M(0);
          this.e.b(this.b, 16);
          this.f = 2;
        } 
        continue;
      } 
      if (h(paramv)) {
        this.f = 1;
        byte[] arrayOfByte = this.b.a;
        arrayOfByte[0] = (byte)-84;
        if (this.i) {
          j = 65;
        } else {
          j = 64;
        } 
        arrayOfByte[1] = (byte)(byte)j;
        this.g = 2;
      } 
    } 
  }
  
  public void c() {
    this.f = 0;
    this.g = 0;
    this.h = false;
    this.i = false;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.d = paramd.b();
    this.e = paramj.g(paramd.c(), 1);
  }
  
  public void f(long paramLong, int paramInt) {
    this.m = paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */