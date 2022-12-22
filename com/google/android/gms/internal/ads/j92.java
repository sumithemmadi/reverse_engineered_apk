package com.google.android.gms.internal.ads;

public final class j92<T> implements m92<T> {
  private static final Object a = new Object();
  
  private volatile m92<T> b;
  
  private volatile Object c = a;
  
  private j92(m92<T> paramm92) {
    this.b = paramm92;
  }
  
  public static <P extends m92<T>, T> m92<T> a(P paramP) {
    return (m92<T>)((paramP instanceof j92 || paramP instanceof b92) ? (Object)paramP : new j92<T>(g92.<m92<T>>a((m92<T>)paramP)));
  }
  
  public final T get() {
    Object<T> object1 = (Object<T>)this.c;
    Object<T> object2 = object1;
    if (object1 == a) {
      object2 = (Object<T>)this.b;
      if (object2 == null) {
        object2 = (Object<T>)this.c;
      } else {
        object2 = (Object<T>)object2.get();
        this.c = object2;
        this.b = null;
      } 
    } 
    return (T)object2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */