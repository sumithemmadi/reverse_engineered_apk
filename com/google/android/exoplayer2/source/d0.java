package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.y0;

public final class d0 extends y0 {
  private static final Object b = new Object();
  
  private final long c;
  
  private final long d;
  
  private final long e;
  
  private final long f;
  
  private final long g;
  
  private final long h;
  
  private final boolean i;
  
  private final boolean j;
  
  private final boolean k;
  
  private final Object l;
  
  private final Object m;
  
  public d0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject1, Object paramObject2) {
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramLong4;
    this.g = paramLong5;
    this.h = paramLong6;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.k = paramBoolean3;
    this.m = paramObject1;
    this.l = paramObject2;
  }
  
  public d0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject1, Object paramObject2) {
    this(-9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramLong4, paramBoolean1, paramBoolean2, paramBoolean3, paramObject1, paramObject2);
  }
  
  public d0(long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject1, Object paramObject2) {
    this(paramLong, paramLong, 0L, 0L, paramBoolean1, paramBoolean2, paramBoolean3, paramObject1, paramObject2);
  }
  
  public int b(Object paramObject) {
    byte b;
    if (b.equals(paramObject)) {
      b = 0;
    } else {
      b = -1;
    } 
    return b;
  }
  
  public y0.b g(int paramInt, y0.b paramb, boolean paramBoolean) {
    Object object;
    e.c(paramInt, 0, 1);
    if (paramBoolean) {
      object = b;
    } else {
      object = null;
    } 
    return paramb.o(null, object, 0, this.e, -this.g);
  }
  
  public int i() {
    return 1;
  }
  
  public Object m(int paramInt) {
    e.c(paramInt, 0, 1);
    return b;
  }
  
  public y0.c o(int paramInt, y0.c paramc, long paramLong) {
    e.c(paramInt, 0, 1);
    long l1 = this.h;
    boolean bool = this.j;
    long l2 = l1;
    if (bool) {
      l2 = l1;
      if (paramLong != 0L) {
        long l = this.f;
        if (l == -9223372036854775807L) {
          paramLong = -9223372036854775807L;
          return paramc.e(y0.c.a, this.l, this.m, this.c, this.d, this.i, bool, this.k, paramLong, this.f, 0, 0, this.g);
        } 
        paramLong = l1 + paramLong;
        l2 = paramLong;
        if (paramLong > l) {
          paramLong = -9223372036854775807L;
          return paramc.e(y0.c.a, this.l, this.m, this.c, this.d, this.i, bool, this.k, paramLong, this.f, 0, 0, this.g);
        } 
      } 
    } 
    paramLong = l2;
    return paramc.e(y0.c.a, this.l, this.m, this.c, this.d, this.i, bool, this.k, paramLong, this.f, 0, 0, this.g);
  }
  
  public int p() {
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */