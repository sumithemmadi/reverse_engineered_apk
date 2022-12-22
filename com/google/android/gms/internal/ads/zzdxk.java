package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class zzdxk<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
  private final List<F> zzhyb;
  
  final kq1<? super F, ? extends T> zzhyc;
  
  zzdxk(List<F> paramList, kq1<? super F, ? extends T> paramkq1) {
    this.zzhyb = xq1.<List<F>>b(paramList);
    this.zzhyc = xq1.<kq1<? super F, ? extends T>>b(paramkq1);
  }
  
  public final void clear() {
    this.zzhyb.clear();
  }
  
  public final T get(int paramInt) {
    return this.zzhyc.a(this.zzhyb.get(paramInt));
  }
  
  public final boolean isEmpty() {
    return this.zzhyb.isEmpty();
  }
  
  public final Iterator<T> iterator() {
    return listIterator();
  }
  
  public final ListIterator<T> listIterator(int paramInt) {
    return new sr1(this, this.zzhyb.listIterator(paramInt));
  }
  
  public final T remove(int paramInt) {
    return this.zzhyc.a(this.zzhyb.remove(paramInt));
  }
  
  public final int size() {
    return this.zzhyb.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */