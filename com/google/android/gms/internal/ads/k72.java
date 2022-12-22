package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class k72 implements ListIterator<String> {
  private ListIterator<String> b;
  
  k72(l72 paraml72, int paramInt) {
    this.b = l72.a(paraml72).listIterator(paramInt);
  }
  
  public final boolean hasNext() {
    return this.b.hasNext();
  }
  
  public final boolean hasPrevious() {
    return this.b.hasPrevious();
  }
  
  public final int nextIndex() {
    return this.b.nextIndex();
  }
  
  public final int previousIndex() {
    return this.b.previousIndex();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */