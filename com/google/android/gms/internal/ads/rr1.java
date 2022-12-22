package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class rr1 {
  public static <F, T> List<T> a(List<F> paramList, kq1<? super F, ? extends T> paramkq1) {
    return (List<T>)((paramList instanceof java.util.RandomAccess) ? new zzdxk<F, T>(paramList, paramkq1) : new zzdxm<F, T>(paramList, paramkq1));
  }
  
  public static <E> ArrayList<E> b(int paramInt) {
    ir1.b(paramInt, "initialArraySize");
    return new ArrayList<E>(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */