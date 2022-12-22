package com.google.android.exoplayer2.c1.z;

import com.google.android.exoplayer2.c1.a;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.m;
import com.google.android.exoplayer2.util.l;

final class c extends a {
  public c(l paraml, int paramInt, long paramLong1, long paramLong2) {
    super(new b(paraml), new b(paraml, paramInt, null), paraml.h(), 0L, paraml.j, paramLong1, paramLong2, paraml.e(), Math.max(6, paraml.c));
  }
  
  private static final class b implements a.f {
    private final l a;
    
    private final int b;
    
    private final m.a c;
    
    private b(l param1l, int param1Int) {
      this.a = param1l;
      this.b = param1Int;
      this.c = new m.a();
    }
    
    private long c(i param1i) {
      while (param1i.d() < param1i.getLength() - 6L && !m.h(param1i, this.a, this.b, this.c))
        param1i.e(1); 
      if (param1i.d() >= param1i.getLength() - 6L) {
        param1i.e((int)(param1i.getLength() - param1i.d()));
        return this.a.j;
      } 
      return this.c.a;
    }
    
    public a.e b(i param1i, long param1Long) {
      long l1 = param1i.a();
      long l2 = c(param1i);
      long l3 = param1i.d();
      param1i.e(Math.max(6, this.a.c));
      long l4 = c(param1i);
      long l5 = param1i.d();
      return (l2 <= param1Long && l4 > param1Long) ? a.e.e(l3) : ((l4 <= param1Long) ? a.e.f(l4, l5) : a.e.d(l2, l1));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/z/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */