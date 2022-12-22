package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class s82 implements Iterator<E> {
  private int b = 0;
  
  s82(p82 paramp82) {}
  
  public final boolean hasNext() {
    return (this.b < this.c.c.size() || this.c.d.hasNext());
  }
  
  public final E next() {
    while (true) {
      if (this.b < this.c.c.size()) {
        List<E> list = this.c.c;
        int i = this.b;
        this.b = i + 1;
        return list.get(i);
      } 
      p82 p821 = this.c;
      p821.c.add(p821.d.next());
    } 
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */