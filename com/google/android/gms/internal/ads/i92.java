package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class i92<T> implements a92<Set<T>> {
  private static final a92<Set<Object>> a = d92.a(Collections.emptySet());
  
  private final List<m92<T>> b;
  
  private final List<m92<Collection<T>>> c;
  
  private i92(List<m92<T>> paramList, List<m92<Collection<T>>> paramList1) {
    this.b = paramList;
    this.c = paramList1;
  }
  
  public static <T> k92<T> a(int paramInt1, int paramInt2) {
    return new k92<T>(paramInt1, paramInt2, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */