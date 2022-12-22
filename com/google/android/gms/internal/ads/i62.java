package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class i62 {
  private static final i62 a = new i62();
  
  private final r62 b = new i52();
  
  private final ConcurrentMap<Class<?>, o62<?>> c = new ConcurrentHashMap<Class<?>, o62<?>>();
  
  public static i62 b() {
    return a;
  }
  
  public final <T> o62<T> a(T paramT) {
    return c((Class)paramT.getClass());
  }
  
  public final <T> o62<T> c(Class<T> paramClass) {
    m42.d(paramClass, "messageType");
    o62<T> o621 = (o62)this.c.get(paramClass);
    o62<T> o622 = o621;
    if (o621 == null) {
      o622 = this.b.a(paramClass);
      m42.d(paramClass, "messageType");
      m42.d(o622, "schema");
      o62<T> o62 = (o62)this.c.putIfAbsent(paramClass, o622);
      if (o62 != null)
        o622 = o62; 
    } 
    return o622;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */