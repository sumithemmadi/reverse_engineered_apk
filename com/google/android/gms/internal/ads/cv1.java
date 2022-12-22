package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

final class cv1 implements dv1.b {
  cv1(mu1 parammu1) {}
  
  public final <Q> mu1<Q> a(Class<Q> paramClass) {
    if (this.a.a().equals(paramClass))
      return this.a; 
    throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
  }
  
  public final Set<Class<?>> b() {
    return Collections.singleton(this.a.a());
  }
  
  public final mu1<?> c() {
    return this.a;
  }
  
  public final Class<?> d() {
    return this.a.getClass();
  }
  
  public final Class<?> e() {
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */