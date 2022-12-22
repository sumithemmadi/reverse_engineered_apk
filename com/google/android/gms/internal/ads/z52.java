package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class z52<T> implements o62<T> {
  private final u52 a;
  
  private final h72<?, ?> b;
  
  private final boolean c;
  
  private final a42<?> d;
  
  private z52(h72<?, ?> paramh72, a42<?> parama42, u52 paramu52) {
    this.b = paramh72;
    this.c = parama42.j(paramu52);
    this.d = parama42;
    this.a = paramu52;
  }
  
  static <T> z52<T> k(h72<?, ?> paramh72, a42<?> parama42, u52 paramu52) {
    return new z52<T>(paramh72, parama42, paramu52);
  }
  
  public final boolean a(T paramT) {
    return this.d.g(paramT).c();
  }
  
  public final void b(T paramT, w72 paramw72) {
    Iterator<Map.Entry> iterator = this.d.g(paramT).d();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      f42 f42 = (f42)entry.getKey();
      if (f42.h() == zzeov.j && !f42.j() && !f42.o()) {
        if (entry instanceof x42) {
          paramw72.a(f42.zzv(), ((x42)entry).a().a());
          continue;
        } 
        paramw72.a(f42.zzv(), entry.getValue());
        continue;
      } 
      throw new IllegalStateException("Found invalid MessageSet item.");
    } 
    h72<?, ?> h721 = this.b;
    h721.p(h721.j(paramT), paramw72);
  }
  
  public final void c(T paramT1, T paramT2) {
    q62.h(this.b, paramT1, paramT2);
    if (this.c)
      q62.f(this.d, paramT1, paramT2); 
  }
  
  public final void d(T paramT, j62 paramj62, y32 paramy32) {
    h72<?, ?> h721 = this.b;
    a42<?> a421 = this.d;
    Object object = h721.k(paramT);
    e42<?> e42 = a421.h(paramT);
    try {
      while (true) {
        int i = paramj62.r();
        if (i == Integer.MAX_VALUE)
          return; 
        i = paramj62.getTag();
        if (i != 11) {
          if ((i & 0x7) == 2) {
            Object object1 = a421.b(paramy32, this.a, i >>> 3);
            if (object1 != null) {
              a421.e(paramj62, object1, paramy32, e42);
            } else {
              boolean bool1 = h721.f(object, paramj62);
              if (!bool1)
                return; 
            } 
          } else {
            boolean bool1 = paramj62.m();
            if (!bool1)
              return; 
          } 
        } else {
          i = 0;
          Object object1 = null;
          zzejr zzejr = null;
          while (paramj62.r() != Integer.MAX_VALUE) {
            int j = paramj62.getTag();
            if (j == 16) {
              i = paramj62.t();
              object1 = a421.b(paramy32, this.a, i);
              continue;
            } 
            if (j == 26) {
              if (object1 != null) {
                a421.e(paramj62, object1, paramy32, e42);
                continue;
              } 
              zzejr = paramj62.n();
              continue;
            } 
            if (!paramj62.m())
              break; 
          } 
          if (paramj62.getTag() == 12) {
            if (zzejr != null)
              if (object1 != null) {
                a421.d(zzejr, object1, paramy32, e42);
              } else {
                h721.b(object, i, zzejr);
              }  
          } else {
            throw zzelo.zzbje();
          } 
        } 
        boolean bool = true;
        if (!bool)
          return; 
      } 
    } finally {
      h721.r(paramT, object);
    } 
  }
  
  public final void e(T paramT) {
    this.b.g(paramT);
    this.d.i(paramT);
  }
  
  public final int f(T paramT) {
    h72<?, ?> h721 = this.b;
    int i = h721.m(h721.j(paramT)) + 0;
    int j = i;
    if (this.c)
      j = i + this.d.g(paramT).p(); 
    return j;
  }
  
  public final boolean g(T paramT1, T paramT2) {
    return !this.b.j(paramT1).equals(this.b.j(paramT2)) ? false : (this.c ? this.d.g(paramT1).equals(this.d.g(paramT2)) : true);
  }
  
  public final void h(T paramT, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, b32 paramb32) {
    k42 k42 = (k42)paramT;
    j72 j721 = k42.zziqk;
    j72 j722 = j721;
    if (j721 == j72.h()) {
      j722 = j72.i();
      k42.zziqk = j722;
    } 
    ((k42.d)paramT).J();
    paramT = null;
    while (paramInt1 < paramInt2) {
      k42.f f;
      zzejr zzejr;
      paramInt1 = c32.h(paramArrayOfbyte, paramInt1, paramb32);
      int i = paramb32.a;
      if (i != 11) {
        if ((i & 0x7) == 2) {
          f = (k42.f)this.d.b(paramb32.d, this.a, i >>> 3);
          if (f == null) {
            paramInt1 = c32.c(i, paramArrayOfbyte, paramInt1, paramInt2, j722, paramb32);
            continue;
          } 
          i62.b();
          throw new NoSuchMethodError();
        } 
        paramInt1 = c32.a(i, paramArrayOfbyte, paramInt1, paramInt2, paramb32);
        continue;
      } 
      int j = 0;
      j721 = null;
      while (true) {
        i = paramInt1;
        if (paramInt1 < paramInt2) {
          paramInt1 = c32.h(paramArrayOfbyte, paramInt1, paramb32);
          int k = paramb32.a;
          i = k >>> 3;
          int m = k & 0x7;
          if (i != 2) {
            if (i == 3)
              if (f == null) {
                if (m == 2) {
                  paramInt1 = c32.m(paramArrayOfbyte, paramInt1, paramb32);
                  zzejr = (zzejr)paramb32.c;
                  continue;
                } 
              } else {
                i62.b();
                throw new NoSuchMethodError();
              }  
          } else if (m == 0) {
            paramInt1 = c32.h(paramArrayOfbyte, paramInt1, paramb32);
            j = paramb32.a;
            f = (k42.f)this.d.b(paramb32.d, this.a, j);
            continue;
          } 
          i = paramInt1;
          if (k != 12) {
            paramInt1 = c32.a(k, paramArrayOfbyte, paramInt1, paramInt2, paramb32);
            continue;
          } 
        } 
        break;
      } 
      if (zzejr != null)
        j722.k(j << 3 | 0x2, zzejr); 
      paramInt1 = i;
    } 
    if (paramInt1 == paramInt2)
      return; 
    zzelo zzelo = zzelo.zzbjh();
    throw zzelo;
  }
  
  public final T i() {
    return (T)this.a.k().d();
  }
  
  public final int j(T paramT) {
    int i = this.b.j(paramT).hashCode();
    int j = i;
    if (this.c)
      j = i * 53 + this.d.g(paramT).hashCode(); 
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */