package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

final class fv1 implements dv1.b {
  fv1(nu1 paramnu1) {}
  
  public final <Q> mu1<Q> a(Class<Q> paramClass) {
    try {
      return new lu1<Q, u52>(this.a, paramClass);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new GeneralSecurityException("Primitive type not supported", illegalArgumentException);
    } 
  }
  
  public final Set<Class<?>> b() {
    return this.a.e();
  }
  
  public final mu1<?> c() {
    nu1<u52> nu11 = this.a;
    return new lu1<Object, u52>(nu11, nu11.f());
  }
  
  public final Class<?> d() {
    return this.a.getClass();
  }
  
  public final Class<?> e() {
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */