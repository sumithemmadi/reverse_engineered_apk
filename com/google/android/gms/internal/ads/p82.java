package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class p82<E> extends AbstractList<E> {
  private static final r82 b = r82.b(p82.class);
  
  List<E> c;
  
  Iterator<E> d;
  
  public p82(List<E> paramList, Iterator<E> paramIterator) {
    this.c = paramList;
    this.d = paramIterator;
  }
  
  public E get(int paramInt) {
    if (this.c.size() > paramInt)
      return this.c.get(paramInt); 
    if (this.d.hasNext()) {
      this.c.add(this.d.next());
      return get(paramInt);
    } 
    throw new NoSuchElementException();
  }
  
  public Iterator<E> iterator() {
    return new s82(this);
  }
  
  public int size() {
    r82 r821 = b;
    r821.a("potentially expensive size() call");
    r821.a("blowup running");
    while (this.d.hasNext())
      this.c.add(this.d.next()); 
    return this.c.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */