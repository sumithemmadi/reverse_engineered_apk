package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.util.h0;

public abstract class a {
  protected final a a;
  
  protected final f b;
  
  protected c c;
  
  private final int d;
  
  protected a(d paramd, f paramf, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt) {
    this.b = paramf;
    this.d = paramInt;
    this.a = new a(paramd, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6);
  }
  
  protected c a(long paramLong) {
    return new c(paramLong, this.a.k(paramLong), a.a(this.a), a.e(this.a), a.g(this.a), a.h(this.a), a.i(this.a));
  }
  
  public final t b() {
    return this.a;
  }
  
  public int c(i parami, s params) {
    f f1 = (f)com.google.android.exoplayer2.util.e.e(this.b);
    while (true) {
      c c1 = (c)com.google.android.exoplayer2.util.e.e(this.c);
      long l1 = c.b(c1);
      long l2 = c.c(c1);
      long l3 = c.d(c1);
      if (l2 - l1 <= this.d) {
        e(false, l1);
        return g(parami, l1, params);
      } 
      if (!i(parami, l3))
        return g(parami, l3, params); 
      parami.h();
      e e = f1.b(parami, c.e(c1));
      int j = e.a(e);
      if (j != -3) {
        if (j != -2) {
          if (j != -1) {
            if (j == 0) {
              e(true, e.c(e));
              i(parami, e.c(e));
              return g(parami, e.c(e), params);
            } 
            throw new IllegalStateException("Invalid case");
          } 
          c.f(c1, e.b(e), e.c(e));
          continue;
        } 
        c.g(c1, e.b(e), e.c(e));
        continue;
      } 
      e(false, l3);
      return g(parami, l3, params);
    } 
  }
  
  public final boolean d() {
    boolean bool;
    if (this.c != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected final void e(boolean paramBoolean, long paramLong) {
    this.c = null;
    this.b.a();
    f(paramBoolean, paramLong);
  }
  
  protected void f(boolean paramBoolean, long paramLong) {}
  
  protected final int g(i parami, long paramLong, s params) {
    if (paramLong == parami.a())
      return 0; 
    params.a = paramLong;
    return 1;
  }
  
  public final void h(long paramLong) {
    c c1 = this.c;
    if (c1 != null && c.a(c1) == paramLong)
      return; 
    this.c = a(paramLong);
  }
  
  protected final boolean i(i parami, long paramLong) {
    paramLong -= parami.a();
    if (paramLong >= 0L && paramLong <= 262144L) {
      parami.i((int)paramLong);
      return true;
    } 
    return false;
  }
  
  public static class a implements t {
    private final a.d a;
    
    private final long b;
    
    private final long c;
    
    private final long d;
    
    private final long e;
    
    private final long f;
    
    private final long g;
    
    public a(a.d param1d, long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5, long param1Long6) {
      this.a = param1d;
      this.b = param1Long1;
      this.c = param1Long2;
      this.d = param1Long3;
      this.e = param1Long4;
      this.f = param1Long5;
      this.g = param1Long6;
    }
    
    public boolean b() {
      return true;
    }
    
    public long c() {
      return this.b;
    }
    
    public t.a j(long param1Long) {
      return new t.a(new u(param1Long, a.c.h(this.a.a(param1Long), this.c, this.d, this.e, this.f, this.g)));
    }
    
    public long k(long param1Long) {
      return this.a.a(param1Long);
    }
  }
  
  public static final class b implements d {
    public long a(long param1Long) {
      return param1Long;
    }
  }
  
  protected static class c {
    private final long a;
    
    private final long b;
    
    private final long c;
    
    private long d;
    
    private long e;
    
    private long f;
    
    private long g;
    
    private long h;
    
    protected c(long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5, long param1Long6, long param1Long7) {
      this.a = param1Long1;
      this.b = param1Long2;
      this.d = param1Long3;
      this.e = param1Long4;
      this.f = param1Long5;
      this.g = param1Long6;
      this.c = param1Long7;
      this.h = h(param1Long2, param1Long3, param1Long4, param1Long5, param1Long6, param1Long7);
    }
    
    protected static long h(long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5, long param1Long6) {
      if (param1Long4 + 1L >= param1Long5 || param1Long2 + 1L >= param1Long3)
        return param1Long4; 
      float f = (float)(param1Long5 - param1Long4) / (float)(param1Long3 - param1Long2);
      param1Long1 = (long)((float)(param1Long1 - param1Long2) * f);
      return h0.o(param1Long1 + param1Long4 - param1Long6 - param1Long1 / 20L, param1Long4, param1Long5 - 1L);
    }
    
    private long i() {
      return this.g;
    }
    
    private long j() {
      return this.f;
    }
    
    private long k() {
      return this.h;
    }
    
    private long l() {
      return this.a;
    }
    
    private long m() {
      return this.b;
    }
    
    private void n() {
      this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
    }
    
    private void o(long param1Long1, long param1Long2) {
      this.e = param1Long1;
      this.g = param1Long2;
      n();
    }
    
    private void p(long param1Long1, long param1Long2) {
      this.d = param1Long1;
      this.f = param1Long2;
      n();
    }
  }
  
  protected static interface d {
    long a(long param1Long);
  }
  
  public static final class e {
    public static final e a = new e(-3, -9223372036854775807L, -1L);
    
    private final int b;
    
    private final long c;
    
    private final long d;
    
    private e(int param1Int, long param1Long1, long param1Long2) {
      this.b = param1Int;
      this.c = param1Long1;
      this.d = param1Long2;
    }
    
    public static e d(long param1Long1, long param1Long2) {
      return new e(-1, param1Long1, param1Long2);
    }
    
    public static e e(long param1Long) {
      return new e(0, -9223372036854775807L, param1Long);
    }
    
    public static e f(long param1Long1, long param1Long2) {
      return new e(-2, param1Long1, param1Long2);
    }
  }
  
  protected static interface f {
    void a();
    
    a.e b(i param1i, long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */