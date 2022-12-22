package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.a;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;

final class x extends a {
  public x(e0 parame0, long paramLong1, long paramLong2) {
    super((a.d)new a.b(), new b(parame0, null), paramLong1, 0L, paramLong1 + 1L, 0L, paramLong2, 188L, 1000);
  }
  
  private static int k(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return paramArrayOfbyte[paramInt + 3] & 0xFF | (b1 & 0xFF) << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8;
  }
  
  private static final class b implements a.f {
    private final e0 a;
    
    private final v b;
    
    private b(e0 param1e0) {
      this.a = param1e0;
      this.b = new v();
    }
    
    private a.e c(v param1v, long param1Long1, long param1Long2) {
      int i = -1;
      long l = -9223372036854775807L;
      int j = -1;
      while (param1v.a() >= 4) {
        if (x.j(param1v.a, param1v.c()) != 442) {
          param1v.N(1);
          continue;
        } 
        param1v.N(4);
        long l1 = y.l(param1v);
        int k = j;
        long l2 = l;
        if (l1 != -9223372036854775807L) {
          l2 = this.a.b(l1);
          if (l2 > param1Long1)
            return (l == -9223372036854775807L) ? a.e.d(l2, param1Long2) : a.e.e(param1Long2 + j); 
          if (100000L + l2 > param1Long1)
            return a.e.e(param1Long2 + param1v.c()); 
          k = param1v.c();
        } 
        d(param1v);
        i = param1v.c();
        j = k;
        l = l2;
      } 
      return (l != -9223372036854775807L) ? a.e.f(l, param1Long2 + i) : a.e.a;
    }
    
    private static void d(v param1v) {
      int i = param1v.d();
      if (param1v.a() < 10) {
        param1v.M(i);
        return;
      } 
      param1v.N(9);
      int j = param1v.z() & 0x7;
      if (param1v.a() < j) {
        param1v.M(i);
        return;
      } 
      param1v.N(j);
      if (param1v.a() < 4) {
        param1v.M(i);
        return;
      } 
      if (x.j(param1v.a, param1v.c()) == 443) {
        param1v.N(4);
        j = param1v.F();
        if (param1v.a() < j) {
          param1v.M(i);
          return;
        } 
        param1v.N(j);
      } 
      while (param1v.a() >= 4) {
        j = x.j(param1v.a, param1v.c());
        if (j == 442 || j == 441 || j >>> 8 != 1)
          break; 
        param1v.N(4);
        if (param1v.a() < 2) {
          param1v.M(i);
          return;
        } 
        j = param1v.F();
        param1v.M(Math.min(param1v.d(), param1v.c() + j));
      } 
    }
    
    public void a() {
      this.b.J(h0.f);
    }
    
    public a.e b(i param1i, long param1Long) {
      long l = param1i.a();
      int j = (int)Math.min(20000L, param1i.getLength() - l);
      this.b.I(j);
      param1i.k(this.b.a, 0, j);
      return c(this.b, param1Long, l);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */