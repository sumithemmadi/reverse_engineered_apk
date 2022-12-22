package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class bq1<T> implements Iterator<T> {
  private int b = dq1.b;
  
  private T c;
  
  protected abstract T a();
  
  protected final T c() {
    this.b = dq1.c;
    return null;
  }
  
  public final boolean hasNext() {
    int k;
    int i = this.b;
    int j = dq1.d;
    if (i != j) {
      k = 1;
    } else {
      k = 0;
    } 
    if (k) {
      k = aq1.a[i - 1];
      if (k != 1) {
        if (k != 2) {
          this.b = j;
          this.c = a();
          if (this.b != dq1.c) {
            this.b = dq1.a;
            return true;
          } 
          return false;
        } 
        return true;
      } 
      return false;
    } 
    throw new IllegalStateException();
  }
  
  public final T next() {
    if (hasNext()) {
      this.b = dq1.b;
      T t = this.c;
      this.c = null;
      return t;
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */