package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class ud2 {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final short[] f;
  
  private int g;
  
  private short[] h;
  
  private int i;
  
  private short[] j;
  
  private int k;
  
  private short[] l;
  
  private int m;
  
  private int n;
  
  private float o;
  
  private float p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  public ud2(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt1 / 400;
    paramInt1 /= 65;
    this.d = paramInt1;
    paramInt1 *= 2;
    this.e = paramInt1;
    this.f = new short[paramInt1];
    this.g = paramInt1;
    this.h = new short[paramInt1 * paramInt2];
    this.i = paramInt1;
    this.j = new short[paramInt1 * paramInt2];
    this.k = paramInt1;
    this.l = new short[paramInt1 * paramInt2];
    this.m = 0;
    this.n = 0;
    this.u = 0;
    this.o = 1.0F;
    this.p = 1.0F;
  }
  
  private final int b(short[] paramArrayOfshort, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 * this.b;
    int j = 1;
    int k = 255;
    int m = 0;
    int n;
    for (n = 0; paramInt2 <= paramInt3; n = i2) {
      int i1 = 0;
      paramInt1 = 0;
      while (i1 < paramInt2) {
        short s = paramArrayOfshort[i + i1];
        int i4 = paramArrayOfshort[i + paramInt2 + i1];
        if (s >= i4) {
          i4 = s - i4;
        } else {
          i4 -= s;
        } 
        paramInt1 += i4;
        i1++;
      } 
      int i3 = j;
      i1 = m;
      if (paramInt1 * m < j * paramInt2) {
        i1 = paramInt2;
        i3 = paramInt1;
      } 
      m = k;
      int i2 = n;
      if (paramInt1 * k > n * paramInt2) {
        m = paramInt2;
        i2 = paramInt1;
      } 
      paramInt2++;
      j = i3;
      k = m;
      m = i1;
    } 
    this.w = j / m;
    this.x = n / k;
    return m;
  }
  
  private static void d(int paramInt1, int paramInt2, short[] paramArrayOfshort1, int paramInt3, short[] paramArrayOfshort2, int paramInt4, short[] paramArrayOfshort3, int paramInt5) {
    for (byte b = 0; b < paramInt2; b++) {
      int i = paramInt3 * paramInt2 + b;
      int j = paramInt5 * paramInt2 + b;
      int k = paramInt4 * paramInt2 + b;
      for (byte b1 = 0; b1 < paramInt1; b1++) {
        paramArrayOfshort1[i] = (short)(short)((paramArrayOfshort2[k] * (paramInt1 - b1) + paramArrayOfshort3[j] * b1) / paramInt1);
        i += paramInt2;
        k += paramInt2;
        j += paramInt2;
      } 
    } 
  }
  
  private final void f(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    l(paramInt2);
    int i = this.b;
    System.arraycopy(paramArrayOfshort, paramInt1 * i, this.j, this.r * i, i * paramInt2);
    this.r += paramInt2;
  }
  
  private final void h(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    int i = this.e / paramInt2;
    int j = this.b;
    int k = paramInt2 * j;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
      byte b = 0;
      int m = 0;
      while (b < k) {
        m += paramArrayOfshort[paramInt2 * k + paramInt1 * j + b];
        b++;
      } 
      m /= k;
      this.f[paramInt2] = (short)(short)m;
    } 
  }
  
  private final void k() {
    int i = this.r;
    float f = this.o / this.p;
    double d = f;
    if (d > 1.00001D || d < 0.99999D) {
      int j = this.q;
      if (j >= this.e) {
        int k;
        for (k = 0;; k = m) {
          int m = this.t;
          if (m > 0) {
            m = Math.min(this.e, m);
            f(this.h, k, m);
            this.t -= m;
            m = k + m;
          } else {
            short[] arrayOfShort = this.h;
            m = this.a;
            if (m > 4000) {
              m /= 4000;
            } else {
              m = 1;
            } 
            if (this.b == 1 && m == 1) {
              m = b(arrayOfShort, k, this.c, this.d);
            } else {
              h(arrayOfShort, k, m);
              int i2 = b(this.f, 0, this.c / m, this.d / m);
              if (m != 1) {
                int i3 = i2 * m;
                m <<= 2;
                i2 = i3 - m;
                i3 += m;
                int i4 = this.c;
                m = i2;
                if (i2 < i4)
                  m = i4; 
                i4 = this.d;
                i2 = i3;
                if (i3 > i4)
                  i2 = i4; 
                if (this.b == 1) {
                  m = b(arrayOfShort, k, m, i2);
                } else {
                  h(arrayOfShort, k, 1);
                  m = b(this.f, 0, m, i2);
                } 
              } else {
                m = i2;
              } 
            } 
            int i1 = this.w;
            int n = this.x;
            if (i1 == 0 || this.u == 0 || n > i1 * 3 || i1 << 1 <= this.v * 3) {
              n = 0;
            } else {
              n = 1;
            } 
            if (n != 0) {
              n = this.u;
            } else {
              n = m;
            } 
            this.v = i1;
            this.u = m;
            if (d > 1.0D) {
              arrayOfShort = this.h;
              if (f >= 2.0F) {
                m = (int)(n / (f - 1.0F));
              } else {
                this.t = (int)(n * (2.0F - f) / (f - 1.0F));
                m = n;
              } 
              l(m);
              d(m, this.b, this.j, this.r, arrayOfShort, k, arrayOfShort, k + n);
              this.r += m;
              m = k + n + m;
            } else {
              arrayOfShort = this.h;
              if (f < 0.5F) {
                m = (int)(n * f / (1.0F - f));
              } else {
                this.t = (int)(n * (2.0F * f - 1.0F) / (1.0F - f));
                m = n;
              } 
              int i2 = n + m;
              l(i2);
              i1 = this.b;
              System.arraycopy(arrayOfShort, k * i1, this.j, this.r * i1, i1 * n);
              d(m, this.b, this.j, this.r + n, arrayOfShort, n + k, arrayOfShort, k);
              this.r += i2;
              m = k + m;
            } 
          } 
          if (this.e + m > j) {
            int n = this.q - m;
            short[] arrayOfShort = this.h;
            k = this.b;
            System.arraycopy(arrayOfShort, m * k, arrayOfShort, 0, k * n);
            this.q = n;
            break;
          } 
        } 
      } 
    } else {
      f(this.h, 0, this.q);
      this.q = 0;
    } 
    f = this.p;
    if (f != 1.0F && this.r != i) {
      int j = this.a;
      int k = (int)(j / f);
      while (true) {
        if (k > 16384 || j > 16384) {
          k /= 2;
          j /= 2;
          continue;
        } 
        int m = this.r - i;
        int i1 = this.s;
        int n = this.k;
        if (i1 + m > n) {
          n += n / 2 + m;
          this.k = n;
          this.l = Arrays.copyOf(this.l, n * this.b);
        } 
        short[] arrayOfShort = this.j;
        n = this.b;
        System.arraycopy(arrayOfShort, i * n, this.l, this.s * n, n * m);
        this.r = i;
        this.s += m;
        m = 0;
        while (true) {
          n = this.s;
          if (m < n - 1) {
            while (true) {
              i1 = this.m;
              n = this.n;
              if ((i1 + 1) * k > n * j) {
                l(1);
                n = 0;
                while (true) {
                  i = this.b;
                  if (n < i) {
                    arrayOfShort = this.j;
                    int i2 = this.r;
                    short[] arrayOfShort1 = this.l;
                    int i3 = m * i + n;
                    i1 = arrayOfShort1[i3];
                    i3 = arrayOfShort1[i3 + i];
                    int i4 = this.n;
                    int i5 = this.m;
                    int i6 = (i5 + 1) * k;
                    i4 = i6 - i4 * j;
                    i6 -= i5 * k;
                    arrayOfShort[i2 * i + n] = (short)(short)((i1 * i4 + (i6 - i4) * i3) / i6);
                    n++;
                    continue;
                  } 
                  this.n++;
                  this.r++;
                } 
              } 
              this.m = ++i1;
              if (i1 == j) {
                boolean bool;
                this.m = 0;
                if (n == k) {
                  bool = true;
                } else {
                  bool = false;
                } 
                jj2.e(bool);
                this.n = 0;
              } 
              break;
            } 
            m++;
            continue;
          } 
          j = n - 1;
          if (j != 0) {
            arrayOfShort = this.l;
            k = this.b;
            System.arraycopy(arrayOfShort, j * k, arrayOfShort, 0, (n - j) * k);
            this.s -= j;
          } 
          break;
        } 
        break;
      } 
    } 
  }
  
  private final void l(int paramInt) {
    int i = this.r;
    int j = this.i;
    if (i + paramInt > j) {
      paramInt = j + j / 2 + paramInt;
      this.i = paramInt;
      this.j = Arrays.copyOf(this.j, paramInt * this.b);
    } 
  }
  
  private final void m(int paramInt) {
    int i = this.q;
    int j = this.g;
    if (i + paramInt > j) {
      paramInt = j + j / 2 + paramInt;
      this.g = paramInt;
      this.h = Arrays.copyOf(this.h, paramInt * this.b);
    } 
  }
  
  public final void a(float paramFloat) {
    this.o = paramFloat;
  }
  
  public final void c(float paramFloat) {
    this.p = paramFloat;
  }
  
  public final void e(ShortBuffer paramShortBuffer) {
    int i = paramShortBuffer.remaining();
    int j = this.b;
    i /= j;
    m(i);
    paramShortBuffer.get(this.h, this.q * this.b, (j * i << 1) / 2);
    this.q += i;
    k();
  }
  
  public final void g(ShortBuffer paramShortBuffer) {
    int i = Math.min(paramShortBuffer.remaining() / this.b, this.r);
    paramShortBuffer.put(this.j, 0, this.b * i);
    int j = this.r - i;
    this.r = j;
    short[] arrayOfShort = this.j;
    int k = this.b;
    System.arraycopy(arrayOfShort, i * k, arrayOfShort, 0, j * k);
  }
  
  public final void i() {
    int i = this.q;
    float f1 = this.o;
    float f2 = this.p;
    f1 /= f2;
    int j = this.r + (int)((i / f1 + this.s) / f2 + 0.5F);
    m(this.e * 2 + i);
    byte b = 0;
    while (true) {
      int k = this.e;
      int m = this.b;
      if (b < k * 2 * m) {
        this.h[m * i + b] = (short)0;
        b++;
        continue;
      } 
      this.q += k * 2;
      k();
      if (this.r > j)
        this.r = j; 
      this.q = 0;
      this.t = 0;
      this.s = 0;
      return;
    } 
  }
  
  public final int j() {
    return this.r;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ud2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */