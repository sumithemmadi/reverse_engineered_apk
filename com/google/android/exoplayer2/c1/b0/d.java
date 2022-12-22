package com.google.android.exoplayer2.c1.b0;

import android.util.Pair;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.u;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.v;

final class d implements f {
  private final long[] a;
  
  private final long[] b;
  
  private final long c;
  
  private d(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    this.a = paramArrayOflong1;
    this.b = paramArrayOflong2;
    this.c = v.a(paramArrayOflong2[paramArrayOflong2.length - 1]);
  }
  
  public static d a(long paramLong, MlltFrame paramMlltFrame) {
    int i = paramMlltFrame.f.length;
    int j = i + 1;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    arrayOfLong1[0] = paramLong;
    long l1 = 0L;
    arrayOfLong2[0] = 0L;
    j = 1;
    long l2 = paramLong;
    paramLong = l1;
    while (j <= i) {
      int k = paramMlltFrame.d;
      int[] arrayOfInt = paramMlltFrame.f;
      int m = j - 1;
      l2 += (k + arrayOfInt[m]);
      paramLong += (paramMlltFrame.e + paramMlltFrame.g[m]);
      arrayOfLong1[j] = l2;
      arrayOfLong2[j] = paramLong;
      j++;
    } 
    return new d(arrayOfLong1, arrayOfLong2);
  }
  
  private static Pair<Long, Long> e(long paramLong, long[] paramArrayOflong1, long[] paramArrayOflong2) {
    double d1;
    int i = h0.f(paramArrayOflong1, paramLong, true, true);
    long l1 = paramArrayOflong1[i];
    long l2 = paramArrayOflong2[i];
    if (++i == paramArrayOflong1.length)
      return Pair.create(Long.valueOf(l1), Long.valueOf(l2)); 
    long l3 = paramArrayOflong1[i];
    long l4 = paramArrayOflong2[i];
    if (l3 == l1) {
      d1 = 0.0D;
    } else {
      double d3 = paramLong;
      d1 = l1;
      Double.isNaN(d3);
      Double.isNaN(d1);
      double d4 = (l3 - l1);
      Double.isNaN(d4);
      d1 = (d3 - d1) / d4;
    } 
    double d2 = (l4 - l2);
    Double.isNaN(d2);
    return Pair.create(Long.valueOf(paramLong), Long.valueOf((long)(d1 * d2) + l2));
  }
  
  public boolean b() {
    return true;
  }
  
  public long c() {
    return this.c;
  }
  
  public long d() {
    return -1L;
  }
  
  public long f(long paramLong) {
    return v.a(((Long)(e(paramLong, this.a, this.b)).second).longValue());
  }
  
  public t.a j(long paramLong) {
    Pair<Long, Long> pair = e(v.b(h0.o(paramLong, 0L, this.c)), this.b, this.a);
    return new t.a(new u(v.a(((Long)pair.first).longValue()), ((Long)pair.second).longValue()));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/b0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */