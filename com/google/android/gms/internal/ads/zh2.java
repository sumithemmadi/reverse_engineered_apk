package com.google.android.gms.internal.ads;

public final class zh2 extends vc2 {
  private static final Object b = new Object();
  
  private final long c;
  
  private final long d;
  
  private final long e;
  
  private final long f;
  
  private final boolean g;
  
  private final boolean h;
  
  private zh2(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2) {
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = 0L;
    this.f = 0L;
    this.g = paramBoolean1;
    this.h = false;
  }
  
  public zh2(long paramLong, boolean paramBoolean) {
    this(paramLong, paramLong, 0L, 0L, paramBoolean, false);
  }
  
  public final wc2 d(int paramInt, wc2 paramwc2, boolean paramBoolean, long paramLong) {
    jj2.g(paramInt, 0, 1);
    paramBoolean = this.g;
    paramLong = this.d;
    paramwc2.a = null;
    paramwc2.b = -9223372036854775807L;
    paramwc2.c = -9223372036854775807L;
    paramwc2.d = paramBoolean;
    paramwc2.e = false;
    paramwc2.h = 0L;
    paramwc2.i = paramLong;
    paramwc2.f = 0;
    paramwc2.g = 0;
    paramwc2.j = 0L;
    return paramwc2;
  }
  
  public final xc2 e(int paramInt, xc2 paramxc2, boolean paramBoolean) {
    Object object;
    jj2.g(paramInt, 0, 1);
    if (paramBoolean) {
      object = b;
    } else {
      object = null;
    } 
    return paramxc2.a(object, object, 0, this.c, 0L, false);
  }
  
  public final int f(Object paramObject) {
    return b.equals(paramObject) ? 0 : -1;
  }
  
  public final int g() {
    return 1;
  }
  
  public final int h() {
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */