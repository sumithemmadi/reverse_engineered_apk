package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class z82 {
  public static <T> List<T> a(int paramInt) {
    return (paramInt == 0) ? Collections.emptyList() : new ArrayList<T>(paramInt);
  }
  
  static <T> HashSet<T> b(int paramInt) {
    return new HashSet<T>(d(paramInt));
  }
  
  public static <K, V> LinkedHashMap<K, V> c(int paramInt) {
    return new LinkedHashMap<K, V>(d(paramInt));
  }
  
  private static int d(int paramInt) {
    return (paramInt < 3) ? (paramInt + 1) : ((paramInt < 1073741824) ? (int)(paramInt / 0.75F + 1.0F) : Integer.MAX_VALUE);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */