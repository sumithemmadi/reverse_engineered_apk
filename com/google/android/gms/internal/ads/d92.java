package com.google.android.gms.internal.ads;

public final class d92<T> implements t82<T>, a92<T> {
  private static final d92<Object> a = new d92(null);
  
  private final T b;
  
  private d92(T paramT) {
    this.b = paramT;
  }
  
  public static <T> a92<T> a(T paramT) {
    return new d92<T>(g92.b(paramT, "instance cannot be null"));
  }
  
  public static <T> a92<T> b(T paramT) {
    return (a92<T>)((paramT == null) ? a : new d92<T>(paramT));
  }
  
  public final T get() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */