package com.google.android.gms.internal.ads;

import java.util.Iterator;

abstract class wr1<F, T> implements Iterator<T> {
  final Iterator<? extends F> b;
  
  wr1(Iterator<? extends F> paramIterator) {
    this.b = xq1.<Iterator<? extends F>>b(paramIterator);
  }
  
  abstract T a(F paramF);
  
  public final boolean hasNext() {
    return this.b.hasNext();
  }
  
  public final T next() {
    return a(this.b.next());
  }
  
  public final void remove() {
    this.b.remove();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */