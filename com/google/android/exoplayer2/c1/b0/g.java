package com.google.android.exoplayer2.c1.b0;

import com.google.android.exoplayer2.c1.r;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.u;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;

final class g implements f {
  private final long[] a;
  
  private final long[] b;
  
  private final long c;
  
  private final long d;
  
  private g(long[] paramArrayOflong1, long[] paramArrayOflong2, long paramLong1, long paramLong2) {
    this.a = paramArrayOflong1;
    this.b = paramArrayOflong2;
    this.c = paramLong1;
    this.d = paramLong2;
  }
  
  public static g a(long paramLong1, long paramLong2, r paramr, v paramv) {
    paramv.N(10);
    int i = paramv.k();
    if (i <= 0)
      return null; 
    int j = paramr.k;
    long l1 = i;
    if (j >= 32000) {
      i = 1152;
    } else {
      i = 576;
    } 
    long l2 = h0.l0(l1, 1000000L * i, j);
    int k = paramv.F();
    j = paramv.F();
    int m = paramv.F();
    paramv.N(2);
    l1 = paramLong2 + paramr.j;
    long[] arrayOfLong2 = new long[k];
    long[] arrayOfLong1 = new long[k];
    for (byte b = 0; b < k; b++) {
      arrayOfLong2[b] = b * l2 / k;
      arrayOfLong1[b] = Math.max(paramLong2, l1);
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 4)
              return null; 
            i = paramv.D();
          } else {
            i = paramv.C();
          } 
        } else {
          i = paramv.F();
        } 
      } else {
        i = paramv.z();
      } 
      paramLong2 += (i * j);
    } 
    if (paramLong1 != -1L && paramLong1 != paramLong2) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("VBRI data size mismatch: ");
      stringBuilder.append(paramLong1);
      stringBuilder.append(", ");
      stringBuilder.append(paramLong2);
      o.f("VbriSeeker", stringBuilder.toString());
    } 
    return new g(arrayOfLong2, arrayOfLong1, l2, paramLong2);
  }
  
  public boolean b() {
    return true;
  }
  
  public long c() {
    return this.c;
  }
  
  public long d() {
    return this.d;
  }
  
  public long f(long paramLong) {
    return this.a[h0.f(this.b, paramLong, true, true)];
  }
  
  public t.a j(long paramLong) {
    int i = h0.f(this.a, paramLong, true, true);
    u u = new u(this.a[i], this.b[i]);
    if (u.b >= paramLong || i == this.a.length - 1)
      return new t.a(u); 
    long[] arrayOfLong = this.a;
    return new t.a(u, new u(arrayOfLong[++i], this.b[i]));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/b0/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */