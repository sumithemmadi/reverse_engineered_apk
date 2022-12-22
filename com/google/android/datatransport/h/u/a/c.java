package com.google.android.datatransport.h.u.a;

public final class c<T> implements b<T> {
  private static final c<Object> a = new c(null);
  
  private final T b;
  
  private c(T paramT) {
    this.b = paramT;
  }
  
  public static <T> b<T> a(T paramT) {
    return new c<T>(d.c(paramT, "instance cannot be null"));
  }
  
  public T get() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/u/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */