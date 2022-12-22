package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.a;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;

final class e0 extends a {
  public e0(com.google.android.exoplayer2.util.e0 parame0, long paramLong1, long paramLong2, int paramInt) {
    super((a.d)new a.b(), new a(paramInt, parame0), paramLong1, 0L, paramLong1 + 1L, 0L, paramLong2, 188L, 940);
  }
  
  private static final class a implements a.f {
    private final com.google.android.exoplayer2.util.e0 a;
    
    private final v b;
    
    private final int c;
    
    public a(int param1Int, com.google.android.exoplayer2.util.e0 param1e0) {
      this.c = param1Int;
      this.a = param1e0;
      this.b = new v();
    }
    
    private a.e c(v param1v, long param1Long1, long param1Long2) {
      int i = param1v.d();
      long l1 = -1L;
      long l2 = -1L;
      long l3;
      for (l3 = -9223372036854775807L; param1v.a() >= 188; l3 = l5) {
        int j = i0.a(param1v.a, param1v.c(), i);
        int k = j + 188;
        if (k > i)
          break; 
        l1 = i0.b(param1v, j, this.c);
        long l4 = l2;
        long l5 = l3;
        if (l1 != -9223372036854775807L) {
          l5 = this.a.b(l1);
          if (l5 > param1Long1)
            return (l3 == -9223372036854775807L) ? a.e.d(l5, param1Long2) : a.e.e(param1Long2 + l2); 
          if (100000L + l5 > param1Long1)
            return a.e.e(param1Long2 + j); 
          l4 = j;
        } 
        param1v.M(k);
        l1 = k;
        l2 = l4;
      } 
      return (l3 != -9223372036854775807L) ? a.e.f(l3, param1Long2 + l1) : a.e.a;
    }
    
    public void a() {
      this.b.J(h0.f);
    }
    
    public a.e b(i param1i, long param1Long) {
      long l = param1i.a();
      int j = (int)Math.min(112800L, param1i.getLength() - l);
      this.b.I(j);
      param1i.k(this.b.a, 0, j);
      return c(this.b, param1Long, l);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */