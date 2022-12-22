package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.util.e;

public abstract class y0 {
  public static final y0 a = new a();
  
  public int a(boolean paramBoolean) {
    boolean bool;
    if (q()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public abstract int b(Object paramObject);
  
  public int c(boolean paramBoolean) {
    int i;
    if (q()) {
      i = -1;
    } else {
      i = p() - 1;
    } 
    return i;
  }
  
  public final int d(int paramInt1, b paramb, c paramc, int paramInt2, boolean paramBoolean) {
    int i = (f(paramInt1, paramb)).c;
    if ((n(i, paramc)).k == paramInt1) {
      paramInt1 = e(i, paramInt2, paramBoolean);
      return (paramInt1 == -1) ? -1 : (n(paramInt1, paramc)).j;
    } 
    return paramInt1 + 1;
  }
  
  public int e(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2) {
          if (paramInt1 == c(paramBoolean)) {
            paramInt1 = a(paramBoolean);
          } else {
            paramInt1++;
          } 
          return paramInt1;
        } 
        throw new IllegalStateException();
      } 
      return paramInt1;
    } 
    if (paramInt1 == c(paramBoolean)) {
      paramInt1 = -1;
    } else {
      paramInt1++;
    } 
    return paramInt1;
  }
  
  public final b f(int paramInt, b paramb) {
    return g(paramInt, paramb, false);
  }
  
  public abstract b g(int paramInt, b paramb, boolean paramBoolean);
  
  public b h(Object paramObject, b paramb) {
    return g(b(paramObject), paramb, true);
  }
  
  public abstract int i();
  
  public final Pair<Object, Long> j(c paramc, b paramb, int paramInt, long paramLong) {
    return (Pair<Object, Long>)e.e(k(paramc, paramb, paramInt, paramLong, 0L));
  }
  
  public final Pair<Object, Long> k(c paramc, b paramb, int paramInt, long paramLong1, long paramLong2) {
    e.c(paramInt, 0, p());
    o(paramInt, paramc, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L) {
      paramLong1 = paramc.b();
      paramLong2 = paramLong1;
      if (paramLong1 == -9223372036854775807L)
        return null; 
    } 
    paramInt = paramc.j;
    paramLong1 = paramc.d() + paramLong2;
    for (paramLong2 = g(paramInt, paramb, true).h(); paramLong2 != -9223372036854775807L && paramLong1 >= paramLong2 && paramInt < paramc.k; paramLong2 = g(++paramInt, paramb, true).h())
      paramLong1 -= paramLong2; 
    return Pair.create(e.e(paramb.b), Long.valueOf(paramLong1));
  }
  
  public int l(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2) {
          if (paramInt1 == a(paramBoolean)) {
            paramInt1 = c(paramBoolean);
          } else {
            paramInt1--;
          } 
          return paramInt1;
        } 
        throw new IllegalStateException();
      } 
      return paramInt1;
    } 
    if (paramInt1 == a(paramBoolean)) {
      paramInt1 = -1;
    } else {
      paramInt1--;
    } 
    return paramInt1;
  }
  
  public abstract Object m(int paramInt);
  
  public final c n(int paramInt, c paramc) {
    return o(paramInt, paramc, 0L);
  }
  
  public abstract c o(int paramInt, c paramc, long paramLong);
  
  public abstract int p();
  
  public final boolean q() {
    boolean bool;
    if (p() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean r(int paramInt1, b paramb, c paramc, int paramInt2, boolean paramBoolean) {
    if (d(paramInt1, paramb, paramc, paramInt2, paramBoolean) == -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  static final class a extends y0 {
    public int b(Object param1Object) {
      return -1;
    }
    
    public y0.b g(int param1Int, y0.b param1b, boolean param1Boolean) {
      throw new IndexOutOfBoundsException();
    }
    
    public int i() {
      return 0;
    }
    
    public Object m(int param1Int) {
      throw new IndexOutOfBoundsException();
    }
    
    public y0.c o(int param1Int, y0.c param1c, long param1Long) {
      throw new IndexOutOfBoundsException();
    }
    
    public int p() {
      return 0;
    }
  }
  
  public static final class b {
    public Object a;
    
    public Object b;
    
    public int c;
    
    public long d;
    
    private long e;
    
    private a f = a.a;
    
    public int a(int param1Int) {
      return (this.f.d[param1Int]).a;
    }
    
    public long b(int param1Int1, int param1Int2) {
      long l;
      a.a a1 = this.f.d[param1Int1];
      if (a1.a != -1) {
        l = a1.d[param1Int2];
      } else {
        l = -9223372036854775807L;
      } 
      return l;
    }
    
    public int c() {
      return this.f.b;
    }
    
    public int d(long param1Long) {
      return this.f.a(param1Long, this.d);
    }
    
    public int e(long param1Long) {
      return this.f.b(param1Long);
    }
    
    public long f(int param1Int) {
      return this.f.c[param1Int];
    }
    
    public long g() {
      return this.f.e;
    }
    
    public long h() {
      return this.d;
    }
    
    public int i(int param1Int) {
      return this.f.d[param1Int].a();
    }
    
    public int j(int param1Int1, int param1Int2) {
      return this.f.d[param1Int1].b(param1Int2);
    }
    
    public long k() {
      return v.b(this.e);
    }
    
    public long l() {
      return this.e;
    }
    
    public boolean m(int param1Int) {
      return this.f.d[param1Int].c() ^ true;
    }
    
    public boolean n(int param1Int1, int param1Int2) {
      boolean bool;
      a.a a1 = this.f.d[param1Int1];
      if (a1.a != -1 && a1.c[param1Int2] != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public b o(Object param1Object1, Object param1Object2, int param1Int, long param1Long1, long param1Long2) {
      return p(param1Object1, param1Object2, param1Int, param1Long1, param1Long2, a.a);
    }
    
    public b p(Object param1Object1, Object param1Object2, int param1Int, long param1Long1, long param1Long2, a param1a) {
      this.a = param1Object1;
      this.b = param1Object2;
      this.c = param1Int;
      this.d = param1Long1;
      this.e = param1Long2;
      this.f = param1a;
      return this;
    }
  }
  
  public static final class c {
    public static final Object a = new Object();
    
    public Object b = a;
    
    public Object c;
    
    public Object d;
    
    public long e;
    
    public long f;
    
    public boolean g;
    
    public boolean h;
    
    public boolean i;
    
    public int j;
    
    public int k;
    
    public long l;
    
    public long m;
    
    public long n;
    
    public long a() {
      return v.b(this.l);
    }
    
    public long b() {
      return this.l;
    }
    
    public long c() {
      return v.b(this.m);
    }
    
    public long d() {
      return this.n;
    }
    
    public c e(Object param1Object1, Object param1Object2, Object param1Object3, long param1Long1, long param1Long2, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, long param1Long3, long param1Long4, int param1Int1, int param1Int2, long param1Long5) {
      this.b = param1Object1;
      this.c = param1Object2;
      this.d = param1Object3;
      this.e = param1Long1;
      this.f = param1Long2;
      this.g = param1Boolean1;
      this.h = param1Boolean2;
      this.i = param1Boolean3;
      this.l = param1Long3;
      this.m = param1Long4;
      this.j = param1Int1;
      this.k = param1Int2;
      this.n = param1Long5;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */