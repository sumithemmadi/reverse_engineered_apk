package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

final class ev1 implements dv1.b {
  ev1(av1 paramav1, nu1 paramnu1) {}
  
  public final <Q> mu1<Q> a(Class<Q> paramClass) {
    try {
      return new bv1<Q, u52, u52>(this.a, this.b, paramClass);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new GeneralSecurityException("Primitive type not supported", illegalArgumentException);
    } 
  }
  
  public final Set<Class<?>> b() {
    return this.a.e();
  }
  
  public final mu1<?> c() {
    av1<u52, u52> av11 = this.a;
    return new bv1<Object, u52, u52>(av11, this.b, av11.f());
  }
  
  public final Class<?> d() {
    return this.a.getClass();
  }
  
  public final Class<?> e() {
    return this.b.getClass();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ev1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */