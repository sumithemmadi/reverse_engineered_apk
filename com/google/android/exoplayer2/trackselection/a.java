package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.e0.e;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f;
import java.util.ArrayList;
import java.util.List;

public class a extends b {
  private final b g;
  
  private final long h;
  
  private final long i;
  
  private final long j;
  
  private final float k;
  
  private final long l;
  
  private final f m;
  
  private float n;
  
  private int o;
  
  private int p;
  
  private long q;
  
  private a(TrackGroup paramTrackGroup, int[] paramArrayOfint, b paramb, long paramLong1, long paramLong2, long paramLong3, float paramFloat, long paramLong4, f paramf) {
    super(paramTrackGroup, paramArrayOfint);
    this.g = paramb;
    this.h = paramLong1 * 1000L;
    this.i = paramLong2 * 1000L;
    this.j = paramLong3 * 1000L;
    this.k = paramFloat;
    this.l = paramLong4;
    this.m = paramf;
    this.n = 1.0F;
    this.p = 0;
    this.q = -9223372036854775807L;
  }
  
  private static void A(long[][][] paramArrayOflong, int paramInt, long[][] paramArrayOflong1, int[] paramArrayOfint) {
    long l = 0L;
    byte b1;
    for (b1 = 0; b1 < paramArrayOflong.length; b1++) {
      paramArrayOflong[b1][paramInt][1] = paramArrayOflong1[b1][paramArrayOfint[b1]];
      l += paramArrayOflong[b1][paramInt][1];
    } 
    int i = paramArrayOflong.length;
    for (b1 = 0; b1 < i; b1++)
      paramArrayOflong[b1][paramInt][0] = l; 
  }
  
  private static int t(double[][] paramArrayOfdouble) {
    int i = paramArrayOfdouble.length;
    byte b1 = 0;
    int j = 0;
    while (b1 < i) {
      j += (paramArrayOfdouble[b1]).length;
      b1++;
    } 
    return j;
  }
  
  private int u(long paramLong) {
    long l = this.g.a();
    byte b1 = 0;
    byte b2 = 0;
    while (b1 < this.b) {
      if (paramLong == Long.MIN_VALUE || !q(b1, paramLong)) {
        Format format = d(b1);
        if (s(format, format.f, this.n, l))
          return b1; 
        b2 = b1;
      } 
      b1++;
    } 
    return b2;
  }
  
  private static long[][][] w(long[][] paramArrayOflong) {
    double[][] arrayOfDouble1 = x(paramArrayOflong);
    double[][] arrayOfDouble2 = y(arrayOfDouble1);
    int i = t(arrayOfDouble2) + 3;
    long[][][] arrayOfLong = new long[arrayOfDouble1.length][i][2];
    int[] arrayOfInt = new int[arrayOfDouble1.length];
    A(arrayOfLong, 1, paramArrayOflong, arrayOfInt);
    int j = 2;
    while (true) {
      int k = i - 1;
      if (j < k) {
        double d = Double.MAX_VALUE;
        byte b2 = 0;
        k = 0;
        while (b2 < arrayOfDouble1.length) {
          double d1;
          if (arrayOfInt[b2] + 1 == (arrayOfDouble1[b2]).length) {
            d1 = d;
          } else {
            double d2 = arrayOfDouble2[b2][arrayOfInt[b2]];
            d1 = d;
            if (d2 < d) {
              k = b2;
              d1 = d2;
            } 
          } 
          b2++;
          d = d1;
        } 
        arrayOfInt[k] = arrayOfInt[k] + 1;
        A(arrayOfLong, j, paramArrayOflong, arrayOfInt);
        j++;
        continue;
      } 
      j = arrayOfLong.length;
      for (byte b1 = 0; b1 < j; b1++) {
        long[][] arrayOfLong2 = arrayOfLong[b1];
        long[] arrayOfLong1 = arrayOfLong2[k];
        int m = i - 2;
        arrayOfLong1[0] = arrayOfLong2[m][0] * 2L;
        arrayOfLong2[k][1] = arrayOfLong2[m][1] * 2L;
      } 
      return arrayOfLong;
    } 
  }
  
  private static double[][] x(long[][] paramArrayOflong) {
    double[][] arrayOfDouble = new double[paramArrayOflong.length][];
    for (byte b1 = 0; b1 < paramArrayOflong.length; b1++) {
      arrayOfDouble[b1] = new double[(paramArrayOflong[b1]).length];
      for (byte b2 = 0; b2 < (paramArrayOflong[b1]).length; b2++) {
        double d;
        double[] arrayOfDouble1 = arrayOfDouble[b1];
        if (paramArrayOflong[b1][b2] == -1L) {
          d = 0.0D;
        } else {
          d = Math.log(paramArrayOflong[b1][b2]);
        } 
        arrayOfDouble1[b2] = d;
      } 
    } 
    return arrayOfDouble;
  }
  
  private static double[][] y(double[][] paramArrayOfdouble) {
    double[][] arrayOfDouble = new double[paramArrayOfdouble.length][];
    for (byte b1 = 0; b1 < paramArrayOfdouble.length; b1++) {
      arrayOfDouble[b1] = new double[(paramArrayOfdouble[b1]).length - 1];
      if ((arrayOfDouble[b1]).length != 0) {
        double d = paramArrayOfdouble[b1][(paramArrayOfdouble[b1]).length - 1] - paramArrayOfdouble[b1][0];
        int i;
        for (i = 0; i < (paramArrayOfdouble[b1]).length - 1; i = j) {
          double d1 = paramArrayOfdouble[b1][i];
          double[] arrayOfDouble1 = paramArrayOfdouble[b1];
          int j = i + 1;
          double d2 = arrayOfDouble1[j];
          arrayOfDouble1 = arrayOfDouble[b1];
          if (d == 0.0D) {
            d2 = 1.0D;
          } else {
            d2 = ((d1 + d2) * 0.5D - paramArrayOfdouble[b1][0]) / d;
          } 
          arrayOfDouble1[i] = d2;
        } 
      } 
    } 
    return arrayOfDouble;
  }
  
  private long z(long paramLong) {
    boolean bool;
    if (paramLong != -9223372036854775807L && paramLong <= this.h) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      paramLong = (long)((float)paramLong * this.k);
    } else {
      paramLong = this.h;
    } 
    return paramLong;
  }
  
  public int b() {
    return this.o;
  }
  
  public void e() {
    this.q = -9223372036854775807L;
  }
  
  public void g(long paramLong1, long paramLong2, long paramLong3, List<? extends com.google.android.exoplayer2.source.e0.d> paramList, e[] paramArrayOfe) {
    paramLong1 = this.m.b();
    if (this.p == 0) {
      this.p = 1;
      this.o = u(paramLong1);
      return;
    } 
    int i = this.o;
    int j = u(paramLong1);
    this.o = j;
    if (j == i)
      return; 
    if (!q(i, paramLong1)) {
      Format format1 = d(i);
      Format format2 = d(this.o);
      if (format2.f > format1.f && paramLong2 < z(paramLong3)) {
        this.o = i;
      } else if (format2.f < format1.f && paramLong2 >= this.i) {
        this.o = i;
      } 
    } 
    if (this.o != i)
      this.p = 3; 
  }
  
  public int j() {
    return this.p;
  }
  
  public void k(float paramFloat) {
    this.n = paramFloat;
  }
  
  public Object l() {
    return null;
  }
  
  protected boolean s(Format paramFormat, int paramInt, float paramFloat, long paramLong) {
    boolean bool;
    if (Math.round(paramInt * paramFloat) <= paramLong) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void v(long[][] paramArrayOflong) {
    ((c)this.g).b(paramArrayOflong);
  }
  
  private static interface b {
    long a();
  }
  
  private static final class c implements b {
    private final f a;
    
    private final float b;
    
    private final long c;
    
    private long[][] d;
    
    c(f param1f, float param1Float, long param1Long) {
      this.a = param1f;
      this.b = param1Float;
      this.c = param1Long;
    }
    
    public long a() {
      long[][] arrayOfLong;
      long l = Math.max(0L, (long)((float)this.a.e() * this.b) - this.c);
      if (this.d == null)
        return l; 
      byte b1 = 1;
      while (true) {
        arrayOfLong = this.d;
        if (b1 < arrayOfLong.length - 1 && arrayOfLong[b1][0] < l) {
          b1++;
          continue;
        } 
        break;
      } 
      long[] arrayOfLong2 = arrayOfLong[b1 - 1];
      long[] arrayOfLong1 = arrayOfLong[b1];
      float f1 = (float)(l - arrayOfLong2[0]) / (float)(arrayOfLong1[0] - arrayOfLong2[0]);
      return arrayOfLong2[1] + (long)(f1 * (float)(arrayOfLong1[1] - arrayOfLong2[1]));
    }
    
    void b(long[][] param1ArrayOflong) {
      boolean bool;
      if (param1ArrayOflong.length >= 2) {
        bool = true;
      } else {
        bool = false;
      } 
      e.a(bool);
      this.d = param1ArrayOflong;
    }
  }
  
  public static class d implements f.b {
    private final f a;
    
    private final int b;
    
    private final int c;
    
    private final int d;
    
    private final float e;
    
    private final float f;
    
    private final long g;
    
    private final f h;
    
    @Deprecated
    public d(f param1f) {
      this(param1f, 10000, 25000, 25000, 0.7F, 0.75F, 2000L, f.a);
    }
    
    @Deprecated
    public d(f param1f, int param1Int1, int param1Int2, int param1Int3, float param1Float1, float param1Float2, long param1Long, f param1f1) {
      this.a = param1f;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Float1;
      this.f = param1Float2;
      this.g = param1Long;
      this.h = param1f1;
    }
    
    public final f[] a(f.a[] param1ArrayOfa, f param1f) {
      f f1 = this.a;
      if (f1 != null)
        param1f = f1; 
      f[] arrayOfF = new f[param1ArrayOfa.length];
      boolean bool = false;
      byte b1 = 0;
      int i;
      for (i = 0; b1 < param1ArrayOfa.length; i = j) {
        f.a a1 = param1ArrayOfa[b1];
        int j = i;
        if (a1 != null) {
          int[] arrayOfInt = a1.b;
          j = i;
          if (arrayOfInt.length == 1) {
            arrayOfF[b1] = new c(a1.a, arrayOfInt[0], a1.c, a1.d);
            int k = (a1.a.a(a1.b[0])).f;
            j = i;
            if (k != -1)
              j = i + k; 
          } 
        } 
        b1++;
      } 
      ArrayList<a> arrayList = new ArrayList();
      for (b1 = 0; b1 < param1ArrayOfa.length; b1++) {
        f.a a1 = param1ArrayOfa[b1];
        if (a1 != null) {
          int[] arrayOfInt = a1.b;
          if (arrayOfInt.length > 1) {
            a a2 = b(a1.a, param1f, arrayOfInt, i);
            arrayList.add(a2);
            arrayOfF[b1] = a2;
          } 
        } 
      } 
      if (arrayList.size() > 1) {
        long[][] arrayOfLong1 = new long[arrayList.size()][];
        for (i = 0; i < arrayList.size(); i++) {
          a a1 = arrayList.get(i);
          arrayOfLong1[i] = new long[a1.length()];
          for (b1 = 0; b1 < a1.length(); b1++)
            arrayOfLong1[i][b1] = (a1.d(a1.length() - b1 - 1)).f; 
        } 
        long[][][] arrayOfLong = a.r(arrayOfLong1);
        for (i = bool; i < arrayList.size(); i++)
          ((a)arrayList.get(i)).v(arrayOfLong[i]); 
      } 
      return arrayOfF;
    }
    
    protected a b(TrackGroup param1TrackGroup, f param1f, int[] param1ArrayOfint, int param1Int) {
      return new a(param1TrackGroup, param1ArrayOfint, new a.c(param1f, this.e, param1Int), this.b, this.c, this.d, this.f, this.g, this.h, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */