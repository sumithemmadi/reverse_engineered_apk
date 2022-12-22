package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzdxm<F, T> extends AbstractSequentialList<T> implements Serializable {
  private final List<F> zzhyb;
  
  final kq1<? super F, ? extends T> zzhyc;
  
  zzdxm(List<F> paramList, kq1<? super F, ? extends T> paramkq1) {
    this.zzhyb = xq1.<List<F>>b(paramList);
    this.zzhyc = xq1.<kq1<? super F, ? extends T>>b(paramkq1);
  }
  
  public final void clear() {
    this.zzhyb.clear();
  }
  
  public final ListIterator<T> listIterator(int paramInt) {
    return new ur1(this, this.zzhyb.listIterator(paramInt));
  }
  
  public final int size() {
    return this.zzhyb.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */