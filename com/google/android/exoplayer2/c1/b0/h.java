package com.google.android.exoplayer2.c1.b0;

import com.google.android.exoplayer2.c1.r;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;

final class h implements f {
  private final long a;
  
  private final int b;
  
  private final long c;
  
  private final long d;
  
  private final long e;
  
  private final long[] f;
  
  private h(long paramLong1, int paramInt, long paramLong2) {
    this(paramLong1, paramInt, paramLong2, -1L, null);
  }
  
  private h(long paramLong1, int paramInt, long paramLong2, long paramLong3, long[] paramArrayOflong) {
    this.a = paramLong1;
    this.b = paramInt;
    this.c = paramLong2;
    this.f = paramArrayOflong;
    this.d = paramLong3;
    paramLong2 = -1L;
    if (paramLong3 == -1L) {
      paramLong1 = paramLong2;
    } else {
      paramLong1 += paramLong3;
    } 
    this.e = paramLong1;
  }
  
  public static h a(long paramLong1, long paramLong2, r paramr, v paramv) {
    int i = paramr.n;
    int j = paramr.k;
    int k = paramv.k();
    if ((k & 0x1) == 1) {
      int m = paramv.D();
      if (m != 0) {
        long l1 = h0.l0(m, i * 1000000L, j);
        if ((k & 0x6) != 6)
          return new h(paramLong2, paramr.j, l1); 
        long l2 = paramv.D();
        long[] arrayOfLong = new long[100];
        for (i = 0; i < 100; i++)
          arrayOfLong[i] = paramv.z(); 
        if (paramLong1 != -1L) {
          long l = paramLong2 + l2;
          if (paramLong1 != l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("XING data size mismatch: ");
            stringBuilder.append(paramLong1);
            stringBuilder.append(", ");
            stringBuilder.append(l);
            o.f("XingSeeker", stringBuilder.toString());
          } 
        } 
        return new h(paramLong2, paramr.j, l1, l2, arrayOfLong);
      } 
    } 
    return null;
  }
  
  private long e(int paramInt) {
    return this.c * paramInt / 100L;
  }
  
  public boolean b() {
    boolean bool;
    if (this.f != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public long c() {
    return this.c;
  }
  
  public long d() {
    return this.e;
  }
  
  public long f(long paramLong) {
    paramLong -= this.a;
    if (!b() || paramLong <= this.b)
      return 0L; 
    long[] arrayOfLong = (long[])e.e(this.f);
    double d1 = paramLong;
    Double.isNaN(d1);
    double d2 = this.d;
    Double.isNaN(d2);
    d2 = d1 * 256.0D / d2;
    int i = h0.f(arrayOfLong, (long)d2, true, true);
    long l1 = e(i);
    long l2 = arrayOfLong[i];
    int j = i + 1;
    long l3 = e(j);
    if (i == 99) {
      paramLong = 256L;
    } else {
      paramLong = arrayOfLong[j];
    } 
    if (l2 == paramLong) {
      d2 = 0.0D;
    } else {
      d1 = l2;
      Double.isNaN(d1);
      double d = (paramLong - l2);
      Double.isNaN(d);
      d2 = (d2 - d1) / d;
    } 
    d1 = (l3 - l1);
    Double.isNaN(d1);
    return l1 + Math.round(d2 * d1);
  }
  
  public t.a j(long paramLong) {
    if (!b())
      return new t.a(new u(0L, this.a + this.b)); 
    long l = h0.o(paramLong, 0L, this.c);
    double d1 = l;
    Double.isNaN(d1);
    double d2 = this.c;
    Double.isNaN(d2);
    d1 = d1 * 100.0D / d2;
    d2 = 0.0D;
    if (d1 > 0.0D)
      if (d1 >= 100.0D) {
        d2 = 256.0D;
      } else {
        int i = (int)d1;
        long[] arrayOfLong = (long[])e.e(this.f);
        double d3 = arrayOfLong[i];
        if (i == 99) {
          d2 = 256.0D;
        } else {
          d2 = arrayOfLong[i + 1];
        } 
        double d4 = i;
        Double.isNaN(d4);
        Double.isNaN(d3);
        Double.isNaN(d3);
        d2 = d3 + (d1 - d4) * (d2 - d3);
      }  
    d1 = d2 / 256.0D;
    d2 = this.d;
    Double.isNaN(d2);
    paramLong = h0.o(Math.round(d1 * d2), this.b, this.d - 1L);
    return new t.a(new u(l, this.a + paramLong));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/b0/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */