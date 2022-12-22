package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.r;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;

public final class m implements o {
  private final v a = new v(new byte[18]);
  
  private final String b;
  
  private String c;
  
  private v d;
  
  private int e = 0;
  
  private int f;
  
  private int g;
  
  private long h;
  
  private Format i;
  
  private int j;
  
  private long k;
  
  public m(String paramString) {
    this.b = paramString;
  }
  
  private boolean a(v paramv, byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    int i = Math.min(paramv.a(), paramInt - this.f);
    paramv.h(paramArrayOfbyte, this.f, i);
    i = this.f + i;
    this.f = i;
    if (i == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void g() {
    byte[] arrayOfByte = this.a.a;
    if (this.i == null) {
      Format format = r.g(arrayOfByte, this.c, this.b, null);
      this.i = format;
      this.d.d(format);
    } 
    this.j = r.a(arrayOfByte);
    this.h = (int)(r.f(arrayOfByte) * 1000000L / this.i.x);
  }
  
  private boolean h(v paramv) {
    while (paramv.a() > 0) {
      int i = this.g << 8;
      this.g = i;
      i |= paramv.z();
      this.g = i;
      if (r.d(i)) {
        byte[] arrayOfByte = this.a.a;
        i = this.g;
        arrayOfByte[0] = (byte)(byte)(i >> 24 & 0xFF);
        arrayOfByte[1] = (byte)(byte)(i >> 16 & 0xFF);
        arrayOfByte[2] = (byte)(byte)(i >> 8 & 0xFF);
        arrayOfByte[3] = (byte)(byte)(i & 0xFF);
        this.f = 4;
        this.g = 0;
        return true;
      } 
    } 
    return false;
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int i = this.e;
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            i = Math.min(paramv.a(), this.j - this.f);
            this.d.b(paramv, i);
            int j = this.f + i;
            this.f = j;
            i = this.j;
            if (j == i) {
              this.d.c(this.k, 1, i, 0, null);
              this.k += this.h;
              this.e = 0;
            } 
            continue;
          } 
          throw new IllegalStateException();
        } 
        if (a(paramv, this.a.a, 18)) {
          g();
          this.a.M(0);
          this.d.b(this.a, 18);
          this.e = 2;
        } 
        continue;
      } 
      if (h(paramv))
        this.e = 1; 
    } 
  }
  
  public void c() {
    this.e = 0;
    this.f = 0;
    this.g = 0;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.c = paramd.b();
    this.d = paramj.g(paramd.c(), 1);
  }
  
  public void f(long paramLong, int paramInt) {
    this.k = paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */