package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.e;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class w {
  private final int a;
  
  private final int b;
  
  private final float c;
  
  private final float d;
  
  private final float e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  private final short[] i;
  
  private short[] j;
  
  private int k;
  
  private short[] l;
  
  private int m;
  
  private short[] n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  public w(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramInt1 / paramInt3;
    this.f = paramInt1 / 400;
    paramInt1 /= 65;
    this.g = paramInt1;
    paramInt1 *= 2;
    this.h = paramInt1;
    this.i = new short[paramInt1];
    this.j = new short[paramInt1 * paramInt2];
    this.l = new short[paramInt1 * paramInt2];
    this.n = new short[paramInt1 * paramInt2];
  }
  
  private void a(float paramFloat, int paramInt) {
    if (this.m == paramInt)
      return; 
    int i = this.a;
    int j = (int)(i / paramFloat);
    while (true) {
      if (j > 16384 || i > 16384) {
        j /= 2;
        i /= 2;
        continue;
      } 
      n(paramInt);
      paramInt = 0;
      while (true) {
        int k = this.o;
        boolean bool = true;
        if (paramInt < k - 1) {
          while (true) {
            int m = this.p;
            k = this.q;
            if ((m + 1) * j > k * i) {
              this.l = f(this.l, this.m, 1);
              k = 0;
              while (true) {
                m = this.b;
                if (k < m) {
                  this.l[this.m * m + k] = m(this.n, m * paramInt + k, i, j);
                  k++;
                  continue;
                } 
                this.q++;
                this.m++;
              } 
            } 
            this.p = ++m;
            if (m == i) {
              this.p = 0;
              if (k != j)
                bool = false; 
              e.f(bool);
              this.q = 0;
            } 
            break;
          } 
          paramInt++;
          continue;
        } 
        t(k - 1);
        return;
      } 
      break;
    } 
  }
  
  private void b(float paramFloat) {
    int i = this.k;
    if (i < this.h)
      return; 
    int j = 0;
    while (true) {
      if (this.r > 0) {
        k = c(j);
      } else {
        k = g(this.j, j);
        if (paramFloat > 1.0D) {
          k += v(this.j, j, paramFloat, k);
        } else {
          k = l(this.j, j, paramFloat, k);
        } 
      } 
      int k = j + k;
      j = k;
      if (this.h + k > i) {
        u(k);
        return;
      } 
    } 
  }
  
  private int c(int paramInt) {
    int i = Math.min(this.h, this.r);
    d(this.j, paramInt, i);
    this.r -= i;
    return i;
  }
  
  private void d(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    short[] arrayOfShort = f(this.l, this.m, paramInt2);
    this.l = arrayOfShort;
    int i = this.b;
    System.arraycopy(paramArrayOfshort, paramInt1 * i, arrayOfShort, this.m * i, i * paramInt2);
    this.m += paramInt2;
  }
  
  private void e(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    int i = this.h / paramInt2;
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
      this.i[paramInt2] = (short)(short)m;
    } 
  }
  
  private short[] f(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    int i = paramArrayOfshort.length;
    int j = this.b;
    i /= j;
    return (paramInt1 + paramInt2 <= i) ? paramArrayOfshort : Arrays.copyOf(paramArrayOfshort, (i * 3 / 2 + paramInt2) * j);
  }
  
  private int g(short[] paramArrayOfshort, int paramInt) {
    int i = this.a;
    if (i > 4000) {
      i /= 4000;
    } else {
      i = 1;
    } 
    if (this.b == 1 && i == 1) {
      paramInt = h(paramArrayOfshort, paramInt, this.f, this.g);
    } else {
      e(paramArrayOfshort, paramInt, i);
      int j = h(this.i, 0, this.f / i, this.g / i);
      if (i != 1) {
        int k = j * i;
        i *= 4;
        j = k - i;
        k += i;
        int m = this.f;
        i = j;
        if (j < m)
          i = m; 
        m = this.g;
        j = k;
        if (k > m)
          j = m; 
        if (this.b == 1) {
          paramInt = h(paramArrayOfshort, paramInt, i, j);
        } else {
          e(paramArrayOfshort, paramInt, 1);
          paramInt = h(this.i, 0, i, j);
        } 
      } else {
        paramInt = j;
      } 
    } 
    if (p(this.u, this.v)) {
      i = this.s;
    } else {
      i = paramInt;
    } 
    this.t = this.u;
    this.s = paramInt;
    return i;
  }
  
  private int h(short[] paramArrayOfshort, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 * this.b;
    int j = 1;
    int k = 255;
    int m = 0;
    int n;
    for (n = 0; paramInt2 <= paramInt3; n = i3) {
      int i1 = 0;
      paramInt1 = 0;
      while (i1 < paramInt2) {
        paramInt1 += Math.abs(paramArrayOfshort[i + i1] - paramArrayOfshort[i + paramInt2 + i1]);
        i1++;
      } 
      int i2 = j;
      i1 = m;
      if (paramInt1 * m < j * paramInt2) {
        i1 = paramInt2;
        i2 = paramInt1;
      } 
      m = k;
      int i3 = n;
      if (paramInt1 * k > n * paramInt2) {
        m = paramInt2;
        i3 = paramInt1;
      } 
      paramInt2++;
      j = i2;
      k = m;
      m = i1;
    } 
    this.u = j / m;
    this.v = n / k;
    return m;
  }
  
  private int l(short[] paramArrayOfshort, int paramInt1, float paramFloat, int paramInt2) {
    int i;
    if (paramFloat < 0.5F) {
      i = (int)(paramInt2 * paramFloat / (1.0F - paramFloat));
    } else {
      this.r = (int)(paramInt2 * (2.0F * paramFloat - 1.0F) / (1.0F - paramFloat));
      i = paramInt2;
    } 
    short[] arrayOfShort = this.l;
    int j = this.m;
    int k = paramInt2 + i;
    arrayOfShort = f(arrayOfShort, j, k);
    this.l = arrayOfShort;
    j = this.b;
    System.arraycopy(paramArrayOfshort, paramInt1 * j, arrayOfShort, this.m * j, j * paramInt2);
    o(i, this.b, this.l, this.m + paramInt2, paramArrayOfshort, paramInt1 + paramInt2, paramArrayOfshort, paramInt1);
    this.m += k;
    return i;
  }
  
  private short m(short[] paramArrayOfshort, int paramInt1, int paramInt2, int paramInt3) {
    short s = paramArrayOfshort[paramInt1];
    paramInt1 = paramArrayOfshort[paramInt1 + this.b];
    int i = this.q;
    int j = this.p;
    int k = (j + 1) * paramInt3;
    paramInt2 = k - i * paramInt2;
    paramInt3 = k - j * paramInt3;
    return (short)((s * paramInt2 + (paramInt3 - paramInt2) * paramInt1) / paramInt3);
  }
  
  private void n(int paramInt) {
    int i = this.m - paramInt;
    short[] arrayOfShort1 = f(this.n, this.o, i);
    this.n = arrayOfShort1;
    short[] arrayOfShort2 = this.l;
    int j = this.b;
    System.arraycopy(arrayOfShort2, paramInt * j, arrayOfShort1, this.o * j, j * i);
    this.m = paramInt;
    this.o += i;
  }
  
  private static void o(int paramInt1, int paramInt2, short[] paramArrayOfshort1, int paramInt3, short[] paramArrayOfshort2, int paramInt4, short[] paramArrayOfshort3, int paramInt5) {
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
  
  private boolean p(int paramInt1, int paramInt2) {
    return (paramInt1 == 0 || this.s == 0) ? false : ((paramInt2 > paramInt1 * 3) ? false : (!(paramInt1 * 2 <= this.t * 3)));
  }
  
  private void q() {
    int i = this.m;
    float f1 = this.c;
    float f2 = this.d;
    f1 /= f2;
    f2 = this.e * f2;
    double d = f1;
    if (d > 1.00001D || d < 0.99999D) {
      b(f1);
    } else {
      d(this.j, 0, this.k);
      this.k = 0;
    } 
    if (f2 != 1.0F)
      a(f2, i); 
  }
  
  private void t(int paramInt) {
    if (paramInt == 0)
      return; 
    short[] arrayOfShort = this.n;
    int i = this.b;
    System.arraycopy(arrayOfShort, paramInt * i, arrayOfShort, 0, (this.o - paramInt) * i);
    this.o -= paramInt;
  }
  
  private void u(int paramInt) {
    int i = this.k - paramInt;
    short[] arrayOfShort = this.j;
    int j = this.b;
    System.arraycopy(arrayOfShort, paramInt * j, arrayOfShort, 0, j * i);
    this.k = i;
  }
  
  private int v(short[] paramArrayOfshort, int paramInt1, float paramFloat, int paramInt2) {
    int i;
    if (paramFloat >= 2.0F) {
      i = (int)(paramInt2 / (paramFloat - 1.0F));
    } else {
      this.r = (int)(paramInt2 * (2.0F - paramFloat) / (paramFloat - 1.0F));
      i = paramInt2;
    } 
    short[] arrayOfShort = f(this.l, this.m, i);
    this.l = arrayOfShort;
    o(i, this.b, arrayOfShort, this.m, paramArrayOfshort, paramInt1, paramArrayOfshort, paramInt1 + paramInt2);
    this.m += i;
    return i;
  }
  
  public void i() {
    this.k = 0;
    this.m = 0;
    this.o = 0;
    this.p = 0;
    this.q = 0;
    this.r = 0;
    this.s = 0;
    this.t = 0;
    this.u = 0;
    this.v = 0;
  }
  
  public void j(ShortBuffer paramShortBuffer) {
    int i = Math.min(paramShortBuffer.remaining() / this.b, this.m);
    paramShortBuffer.put(this.l, 0, this.b * i);
    int j = this.m - i;
    this.m = j;
    short[] arrayOfShort = this.l;
    int k = this.b;
    System.arraycopy(arrayOfShort, i * k, arrayOfShort, 0, j * k);
  }
  
  public int k() {
    return this.m * this.b * 2;
  }
  
  public void r() {
    int i = this.k;
    float f1 = this.c;
    float f2 = this.d;
    float f3 = f1 / f2;
    f1 = this.e;
    int j = this.m + (int)((i / f3 + this.o) / f1 * f2 + 0.5F);
    this.j = f(this.j, i, this.h * 2 + i);
    byte b = 0;
    while (true) {
      int k = this.h;
      int m = this.b;
      if (b < k * 2 * m) {
        this.j[m * i + b] = (short)0;
        b++;
        continue;
      } 
      this.k += k * 2;
      q();
      if (this.m > j)
        this.m = j; 
      this.k = 0;
      this.r = 0;
      this.o = 0;
      return;
    } 
  }
  
  public void s(ShortBuffer paramShortBuffer) {
    int i = paramShortBuffer.remaining();
    int j = this.b;
    i /= j;
    short[] arrayOfShort = f(this.j, this.k, i);
    this.j = arrayOfShort;
    paramShortBuffer.get(arrayOfShort, this.k * this.b, j * i * 2 / 2);
    this.k += i;
    q();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */