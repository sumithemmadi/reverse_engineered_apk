package com.google.android.exoplayer2.c1.d0;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;
import java.util.Collections;

public final class p implements o {
  private static final double[] a = new double[] { 23.976023976023978D, 24.0D, 25.0D, 29.97002997002997D, 30.0D, 50.0D, 59.94005994005994D, 60.0D };
  
  private String b;
  
  private v c;
  
  private boolean d;
  
  private long e;
  
  private final j0 f;
  
  private final v g;
  
  private final boolean[] h;
  
  private final a i;
  
  private final v j;
  
  private long k;
  
  private boolean l;
  
  private long m;
  
  private long n;
  
  private long o;
  
  private boolean p;
  
  private boolean q;
  
  public p() {
    this(null);
  }
  
  p(j0 paramj0) {
    this.f = paramj0;
    this.h = new boolean[4];
    this.i = new a(128);
    if (paramj0 != null) {
      this.j = new v(178, 128);
      this.g = new v();
    } else {
      this.j = null;
      this.g = null;
    } 
  }
  
  private static Pair<Format, Long> a(a parama, String paramString) {
    float f;
    byte[] arrayOfByte = Arrays.copyOf(parama.e, parama.c);
    byte b1 = arrayOfByte[4];
    int j = arrayOfByte[5] & 0xFF;
    byte b2 = arrayOfByte[6];
    int i = (b1 & 0xFF) << 4 | j >> 4;
    j = (j & 0xF) << 8 | b2 & 0xFF;
    int k = (arrayOfByte[7] & 0xF0) >> 4;
    if (k != 2) {
      if (k != 3) {
        if (k != 4) {
          f = 1.0F;
        } else {
          f = (j * 121);
          k = i * 100;
          f /= k;
        } 
      } else {
        f = (j * 16);
        k = i * 9;
        f /= k;
      } 
    } else {
      f = (j * 4);
      k = i * 3;
      f /= k;
    } 
    Format format = Format.D(paramString, "video/mpeg2", null, -1, -1, i, j, -1.0F, Collections.singletonList(arrayOfByte), -1, f, null);
    long l1 = 0L;
    k = (arrayOfByte[7] & 0xF) - 1;
    long l2 = l1;
    if (k >= 0) {
      double[] arrayOfDouble = a;
      l2 = l1;
      if (k < arrayOfDouble.length) {
        double d1 = arrayOfDouble[k];
        i = parama.d + 9;
        k = (arrayOfByte[i] & 0x60) >> 5;
        i = arrayOfByte[i] & 0x1F;
        double d2 = d1;
        if (k != i) {
          d2 = k;
          Double.isNaN(d2);
          double d = (i + 1);
          Double.isNaN(d);
          d2 = d1 * (d2 + 1.0D) / d;
        } 
        l2 = (long)(1000000.0D / d2);
      } 
    } 
    return Pair.create(format, Long.valueOf(l2));
  }
  
  public void b(v paramv) {
    int i = paramv.c();
    int j = paramv.d();
    byte[] arrayOfByte = paramv.a;
    this.k += paramv.a();
    this.c.b(paramv, paramv.a());
    while (true) {
      int k = s.c(arrayOfByte, i, j, this.h);
      if (k == j) {
        if (!this.d)
          this.i.a(arrayOfByte, i, j); 
        if (this.f != null)
          this.j.a(arrayOfByte, i, j); 
        return;
      } 
      byte[] arrayOfByte1 = paramv.a;
      int m = k + 3;
      int n = arrayOfByte1[m] & 0xFF;
      int i1 = k - i;
      boolean bool = this.d;
      boolean bool1 = false;
      if (!bool) {
        boolean bool2;
        if (i1 > 0)
          this.i.a(arrayOfByte, i, k); 
        if (i1 < 0) {
          bool2 = -i1;
        } else {
          bool2 = false;
        } 
        if (this.i.b(n, bool2)) {
          Pair<Format, Long> pair = a(this.i, this.b);
          this.c.d((Format)pair.first);
          this.e = ((Long)pair.second).longValue();
          this.d = true;
        } 
      } 
      if (this.f != null) {
        if (i1 > 0) {
          this.j.a(arrayOfByte, i, k);
          i = 0;
        } else {
          i = -i1;
        } 
        if (this.j.b(i)) {
          v v1 = this.j;
          i = s.k(v1.d, v1.e);
          this.g.K(this.j.d, i);
          this.f.a(this.o, this.g);
        } 
        if (n == 178 && paramv.a[k + 2] == 1)
          this.j.e(n); 
      } 
      if (n == 0 || n == 179) {
        k = j - k;
        if (this.l && this.q && this.d) {
          boolean bool2 = this.p;
          int i2 = (int)(this.k - this.n);
          this.c.c(this.o, bool2, i2 - k, k, null);
        } 
        bool = this.l;
        if (!bool || this.q) {
          this.n = this.k - k;
          long l = this.m;
          if (l == -9223372036854775807L)
            if (bool) {
              l = this.o + this.e;
            } else {
              l = 0L;
            }  
          this.o = l;
          this.p = false;
          this.m = -9223372036854775807L;
          this.l = true;
        } 
        if (n == 0)
          bool1 = true; 
        this.q = bool1;
      } else if (n == 184) {
        this.p = true;
      } 
      i = m;
    } 
  }
  
  public void c() {
    s.a(this.h);
    this.i.c();
    if (this.f != null)
      this.j.d(); 
    this.k = 0L;
    this.l = false;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.b = paramd.b();
    this.c = paramj.g(paramd.c(), 2);
    j0 j01 = this.f;
    if (j01 != null)
      j01.b(paramj, paramd); 
  }
  
  public void f(long paramLong, int paramInt) {
    this.m = paramLong;
  }
  
  private static final class a {
    private static final byte[] a = new byte[] { 0, 0, 1 };
    
    private boolean b;
    
    public int c;
    
    public int d;
    
    public byte[] e;
    
    public a(int param1Int) {
      this.e = new byte[param1Int];
    }
    
    public void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (!this.b)
        return; 
      int i = param1Int2 - param1Int1;
      byte[] arrayOfByte = this.e;
      int j = arrayOfByte.length;
      param1Int2 = this.c;
      if (j < param1Int2 + i)
        this.e = Arrays.copyOf(arrayOfByte, (param1Int2 + i) * 2); 
      System.arraycopy(param1ArrayOfbyte, param1Int1, this.e, this.c, i);
      this.c += i;
    }
    
    public boolean b(int param1Int1, int param1Int2) {
      if (this.b) {
        param1Int2 = this.c - param1Int2;
        this.c = param1Int2;
        if (this.d == 0 && param1Int1 == 181) {
          this.d = param1Int2;
        } else {
          this.b = false;
          return true;
        } 
      } else if (param1Int1 == 179) {
        this.b = true;
      } 
      byte[] arrayOfByte = a;
      a(arrayOfByte, 0, arrayOfByte.length);
      return false;
    }
    
    public void c() {
      this.b = false;
      this.c = 0;
      this.d = 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */