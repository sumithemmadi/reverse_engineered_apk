package com.google.android.gms.internal.ads;

import java.util.List;

final class f52 extends e52 {
  private f52() {
    super(null);
  }
  
  private static <E> u42<E> f(Object paramObject, long paramLong) {
    return (u42<E>)m72.G(paramObject, paramLong);
  }
  
  final <L> List<L> a(Object paramObject, long paramLong) {
    u42<?> u421 = f(paramObject, paramLong);
    u42<?> u422 = u421;
    if (!u421.x()) {
      int i = u421.size();
      if (i == 0) {
        i = 10;
      } else {
        i <<= 1;
      } 
      u422 = u421.a0(i);
      m72.f(paramObject, paramLong, u422);
    } 
    return (List)u422;
  }
  
  final <E> void b(Object paramObject1, Object<?> paramObject2, long paramLong) {
    Object<?> object;
    u42<?> u421 = f(paramObject1, paramLong);
    u42<?> u422 = f(paramObject2, paramLong);
    int i = u421.size();
    int j = u422.size();
    paramObject2 = (Object<?>)u421;
    if (i > 0) {
      paramObject2 = (Object<?>)u421;
      if (j > 0) {
        paramObject2 = (Object<?>)u421;
        if (!u421.x())
          paramObject2 = (Object<?>)u421.a0(j + i); 
        paramObject2.addAll(u422);
      } 
    } 
    u421 = u422;
    if (i > 0)
      object = paramObject2; 
    m72.f(paramObject1, paramLong, object);
  }
  
  final void c(Object paramObject, long paramLong) {
    f(paramObject, paramLong).G();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */