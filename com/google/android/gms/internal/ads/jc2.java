package com.google.android.gms.internal.ads;

import android.util.Log;

final class jc2 {
  public final kh2 a;
  
  public final Object b;
  
  public final int c;
  
  public final uh2[] d;
  
  private final boolean[] e;
  
  public final long f;
  
  public int g;
  
  public long h;
  
  public boolean i;
  
  public boolean j;
  
  public boolean k;
  
  public jc2 l;
  
  public pi2 m;
  
  private final pc2[] n;
  
  private final tc2[] o;
  
  private final ni2 p;
  
  private final oc2 q;
  
  private final mh2 r;
  
  private pi2 s;
  
  public jc2(pc2[] paramArrayOfpc2, tc2[] paramArrayOftc2, long paramLong1, ni2 paramni2, oc2 paramoc2, mh2 parammh2, Object paramObject, int paramInt1, int paramInt2, boolean paramBoolean, long paramLong2) {
    this.n = paramArrayOfpc2;
    this.o = paramArrayOftc2;
    this.f = paramLong1;
    this.p = paramni2;
    this.q = paramoc2;
    this.r = parammh2;
    this.b = jj2.d(paramObject);
    this.c = paramInt1;
    this.g = paramInt2;
    this.i = paramBoolean;
    this.h = paramLong2;
    this.d = new uh2[paramArrayOfpc2.length];
    this.e = new boolean[paramArrayOfpc2.length];
    this.a = parammh2.a(paramInt2, paramoc2.d());
  }
  
  public final void a() {
    try {
      this.r.b(this.a);
      return;
    } catch (RuntimeException runtimeException) {
      Log.e("ExoPlayerImplInternal", "Period release failed.", runtimeException);
      return;
    } 
  }
  
  public final long b(long paramLong, boolean paramBoolean, boolean[] paramArrayOfboolean) {
    oi2 oi2 = this.m.b;
    byte b = 0;
    while (true) {
      int i = oi2.a;
      boolean bool = true;
      if (b < i) {
        boolean[] arrayOfBoolean = this.e;
        if (paramBoolean || !this.m.a(this.s, b))
          bool = false; 
        arrayOfBoolean[b] = bool;
        b++;
        continue;
      } 
      paramLong = this.a.p(oi2.b(), this.e, this.d, paramArrayOfboolean, paramLong);
      this.s = this.m;
      this.k = false;
      b = 0;
      while (true) {
        uh2[] arrayOfUh2 = this.d;
        if (b < arrayOfUh2.length) {
          if (arrayOfUh2[b] != null) {
            if (oi2.a(b) != null) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            } 
            jj2.e(paramBoolean);
            this.k = true;
          } else {
            if (oi2.a(b) == null) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            } 
            jj2.e(paramBoolean);
          } 
          b++;
          continue;
        } 
        this.q.e(this.n, this.m.a, oi2);
        return paramLong;
      } 
      break;
    } 
  }
  
  public final long c(long paramLong, boolean paramBoolean) {
    return b(paramLong, false, new boolean[this.n.length]);
  }
  
  public final void d(int paramInt, boolean paramBoolean) {
    this.g = paramInt;
    this.i = paramBoolean;
  }
  
  public final long e() {
    return this.f - this.h;
  }
  
  public final boolean f() {
    return (this.j && (!this.k || this.a.h() == Long.MIN_VALUE));
  }
  
  public final boolean g() {
    pi2 pi21 = this.p.b(this.o, this.a.l());
    pi2 pi22 = this.s;
    if (pi22 != null) {
      byte b = 0;
      while (true) {
        if (b < pi21.b.a) {
          if (pi21.a(pi22, b)) {
            b++;
            continue;
          } 
        } else {
          b = 1;
          break;
        } 
        b = 0;
        break;
      } 
      if (b != 0)
        return false; 
      this.m = pi21;
      return true;
    } 
    boolean bool = false;
    break;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */