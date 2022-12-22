package com.google.android.gms.internal.ads;

import java.util.Iterator;

public abstract class lr1<E> {
  public lr1<E> a(Iterator<? extends E> paramIterator) {
    while (paramIterator.hasNext())
      b(paramIterator.next()); 
    return this;
  }
  
  public abstract lr1<E> b(E paramE);
  
  public lr1<E> c(Iterable<? extends E> paramIterable) {
    Iterator<? extends E> iterator = paramIterable.iterator();
    while (iterator.hasNext())
      b(iterator.next()); 
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */