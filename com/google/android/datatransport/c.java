package com.google.android.datatransport;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class c<T> {
  public static <T> c<T> d(T paramT) {
    return new a<T>(null, paramT, Priority.c);
  }
  
  public static <T> c<T> e(T paramT) {
    return new a<T>(null, paramT, Priority.d);
  }
  
  public abstract Integer a();
  
  public abstract T b();
  
  public abstract Priority c();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */