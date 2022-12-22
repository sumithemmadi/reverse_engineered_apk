package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class l72 extends AbstractList<String> implements b52, RandomAccess {
  private final b52 b;
  
  public l72(b52 paramb52) {
    this.b = paramb52;
  }
  
  public final void L(zzejr paramzzejr) {
    throw new UnsupportedOperationException();
  }
  
  public final Iterator<String> iterator() {
    return new n72(this);
  }
  
  public final ListIterator<String> listIterator(int paramInt) {
    return new k72(this, paramInt);
  }
  
  public final List<?> o() {
    return this.b.o();
  }
  
  public final int size() {
    return this.b.size();
  }
  
  public final Object u(int paramInt) {
    return this.b.u(paramInt);
  }
  
  public final b52 z() {
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */