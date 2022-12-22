package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class pr1 extends yr1<T> {
  private boolean b;
  
  pr1(Object paramObject) {}
  
  public final boolean hasNext() {
    return !this.b;
  }
  
  public final T next() {
    if (!this.b) {
      this.b = true;
      return (T)this.c;
    } 
    throw new NoSuchElementException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */