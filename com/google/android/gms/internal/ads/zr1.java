package com.google.android.gms.internal.ads;

import java.util.ListIterator;

abstract class zr1<F, T> extends wr1<F, T> implements ListIterator<T> {
  zr1(ListIterator<? extends F> paramListIterator) {
    super(paramListIterator);
  }
  
  public void add(T paramT) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean hasPrevious() {
    return ((ListIterator)this.b).hasPrevious();
  }
  
  public final int nextIndex() {
    return ((ListIterator)this.b).nextIndex();
  }
  
  public final T previous() {
    return a(((ListIterator)this.b).previous());
  }
  
  public final int previousIndex() {
    return ((ListIterator)this.b).previousIndex();
  }
  
  public void set(T paramT) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */