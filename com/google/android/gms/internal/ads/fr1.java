package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

abstract class fr1<E> extends bs1<E> {
  private final int b;
  
  private int c;
  
  protected fr1(int paramInt1, int paramInt2) {
    xq1.i(paramInt2, paramInt1);
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  protected abstract E a(int paramInt);
  
  public final boolean hasNext() {
    return (this.c < this.b);
  }
  
  public final boolean hasPrevious() {
    return (this.c > 0);
  }
  
  public final E next() {
    if (hasNext()) {
      int i = this.c;
      this.c = i + 1;
      return a(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int nextIndex() {
    return this.c;
  }
  
  public final E previous() {
    if (hasPrevious()) {
      int i = this.c - 1;
      this.c = i;
      return a(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    return this.c - 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */