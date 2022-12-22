package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;

abstract class a32<E> extends AbstractList<E> implements u42<E> {
  private boolean b = true;
  
  public final void G() {
    this.b = false;
  }
  
  protected final void a() {
    if (this.b)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public boolean add(E paramE) {
    a();
    return super.add(paramE);
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
    a();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<? extends E> paramCollection) {
    a();
    return super.addAll(paramCollection);
  }
  
  public void clear() {
    a();
    super.clear();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof java.util.List))
      return false; 
    if (!(paramObject instanceof java.util.RandomAccess))
      return super.equals(paramObject); 
    paramObject = paramObject;
    int i = size();
    if (i != paramObject.size())
      return false; 
    for (byte b = 0; b < i; b++) {
      if (!get(b).equals(paramObject.get(b)))
        return false; 
    } 
    return true;
  }
  
  public int hashCode() {
    int i = size();
    int j = 1;
    for (byte b = 0; b < i; b++)
      j = j * 31 + get(b).hashCode(); 
    return j;
  }
  
  public abstract E remove(int paramInt);
  
  public boolean remove(Object paramObject) {
    a();
    int i = indexOf(paramObject);
    if (i == -1)
      return false; 
    remove(i);
    return true;
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    a();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    a();
    return super.retainAll(paramCollection);
  }
  
  public boolean x() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */