package com.google.android.gms.internal.ads;

abstract class h72<T, B> {
  abstract void a(B paramB, int paramInt, long paramLong);
  
  abstract void b(B paramB, int paramInt, zzejr paramzzejr);
  
  abstract void c(B paramB, int paramInt, T paramT);
  
  abstract void d(T paramT, w72 paramw72);
  
  abstract boolean e(j62 paramj62);
  
  final boolean f(B paramB, j62 paramj62) {
    int i = paramj62.getTag();
    int j = i >>> 3;
    i &= 0x7;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5) {
                o(paramB, j, paramj62.v());
                return true;
              } 
              throw zzelo.zzbjf();
            } 
            return false;
          } 
          B b = n();
          do {
          
          } while (paramj62.r() != Integer.MAX_VALUE && f(b, paramj62));
          if ((0x4 | j << 3) == paramj62.getTag()) {
            c(paramB, j, h(b));
            return true;
          } 
          throw zzelo.zzbje();
        } 
        b(paramB, j, paramj62.n());
        return true;
      } 
      l(paramB, j, paramj62.p());
      return true;
    } 
    a(paramB, j, paramj62.e());
    return true;
  }
  
  abstract void g(Object paramObject);
  
  abstract T h(B paramB);
  
  abstract int i(T paramT);
  
  abstract T j(Object paramObject);
  
  abstract B k(Object paramObject);
  
  abstract void l(B paramB, int paramInt, long paramLong);
  
  abstract int m(T paramT);
  
  abstract B n();
  
  abstract void o(B paramB, int paramInt1, int paramInt2);
  
  abstract void p(T paramT, w72 paramw72);
  
  abstract void q(Object paramObject, T paramT);
  
  abstract void r(Object paramObject, B paramB);
  
  abstract T s(T paramT1, T paramT2);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */