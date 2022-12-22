package com.google.android.gms.internal.ads;

final class i52 implements r62 {
  private static final r52 a = new l52();
  
  private final r52 b;
  
  public i52() {
    this(new k52(new r52[] { l42.c(), c() }));
  }
  
  private i52(r52 paramr52) {
    this.b = m42.<r52>d(paramr52, "messageInfoFactory");
  }
  
  private static boolean b(s52 params52) {
    return (params52.b() == e62.a);
  }
  
  private static r52 c() {
    try {
      return (r52)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    } catch (Exception exception) {
      return a;
    } 
  }
  
  public final <T> o62<T> a(Class<T> paramClass) {
    q62.O(paramClass);
    s52 s52 = this.b.a(paramClass);
    return (o62<T>)(s52.c() ? (k42.class.isAssignableFrom(paramClass) ? z52.k(q62.x(), b42.b(), s52.a()) : z52.k(q62.v(), b42.c(), s52.a())) : (k42.class.isAssignableFrom(paramClass) ? (b(s52) ? x52.p(paramClass, s52, d62.b(), e52.e(), q62.x(), b42.b(), p52.b()) : x52.p(paramClass, s52, d62.b(), e52.e(), q62.x(), null, p52.b())) : (b(s52) ? x52.p(paramClass, s52, d62.a(), e52.d(), q62.v(), b42.c(), p52.a()) : x52.p(paramClass, s52, d62.a(), e52.d(), q62.w(), null, p52.a()))));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */