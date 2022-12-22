package com.google.android.gms.common.util;

import b.e.a;
import b.e.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f {
  @Deprecated
  public static <T> List<T> a() {
    return Collections.emptyList();
  }
  
  @Deprecated
  public static <T> List<T> b(T paramT) {
    return Collections.singletonList(paramT);
  }
  
  @Deprecated
  public static <T> List<T> c(T... paramVarArgs) {
    int i = paramVarArgs.length;
    return (i != 0) ? ((i != 1) ? Collections.unmodifiableList(Arrays.asList(paramVarArgs)) : b(paramVarArgs[0])) : a();
  }
  
  public static <K, V> Map<K, V> d(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3) {
    Map<?, ?> map = i(3, false);
    map.put(paramK1, paramV1);
    map.put(paramK2, paramV2);
    map.put(paramK3, paramV3);
    return Collections.unmodifiableMap((Map)map);
  }
  
  public static <K, V> Map<K, V> e(K[] paramArrayOfK, V[] paramArrayOfV) {
    if (paramArrayOfK.length == paramArrayOfV.length) {
      int k = paramArrayOfK.length;
      if (k != 0) {
        byte b = 0;
        if (k != 1) {
          Map<?, ?> map = i(paramArrayOfK.length, false);
          while (b < paramArrayOfK.length) {
            map.put(paramArrayOfK[b], paramArrayOfV[b]);
            b++;
          } 
          return Collections.unmodifiableMap((Map)map);
        } 
        return Collections.singletonMap(paramArrayOfK[0], paramArrayOfV[0]);
      } 
      return Collections.emptyMap();
    } 
    int j = paramArrayOfK.length;
    int i = paramArrayOfV.length;
    StringBuilder stringBuilder = new StringBuilder(66);
    stringBuilder.append("Key and values array lengths not equal: ");
    stringBuilder.append(j);
    stringBuilder.append(" != ");
    stringBuilder.append(i);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  @Deprecated
  public static <T> Set<T> f(T paramT1, T paramT2, T paramT3) {
    Set<?> set = h(3, false);
    set.add(paramT1);
    set.add(paramT2);
    set.add(paramT3);
    return Collections.unmodifiableSet((Set)set);
  }
  
  @Deprecated
  public static <T> Set<T> g(T... paramVarArgs) {
    int i = paramVarArgs.length;
    if (i != 0) {
      T t;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              Set<?> set2 = h(paramVarArgs.length, false);
              Collections.addAll(set2, (Object[])paramVarArgs);
              return Collections.unmodifiableSet((Set)set2);
            } 
            T t3 = paramVarArgs[0];
            T t4 = paramVarArgs[1];
            T t2 = paramVarArgs[2];
            t = paramVarArgs[3];
            Set<?> set1 = h(4, false);
            set1.add(t3);
            set1.add(t4);
            set1.add(t2);
            set1.add(t);
            return Collections.unmodifiableSet((Set)set1);
          } 
          return f(t[0], t[1], t[2]);
        } 
        T t1 = t[0];
        t = t[1];
        Set<?> set = h(2, false);
        set.add(t1);
        set.add(t);
        return Collections.unmodifiableSet((Set)set);
      } 
      return Collections.singleton(t[0]);
    } 
    return Collections.emptySet();
  }
  
  private static <T> Set<T> h(int paramInt, boolean paramBoolean) {
    float f1;
    char c;
    if (paramBoolean) {
      f1 = 0.75F;
    } else {
      f1 = 1.0F;
    } 
    if (paramBoolean) {
      c = '';
    } else {
      c = 'Ā';
    } 
    return (Set<T>)((paramInt <= c) ? new b(paramInt) : new HashSet<T>(paramInt, f1));
  }
  
  private static <K, V> Map<K, V> i(int paramInt, boolean paramBoolean) {
    return (Map<K, V>)((paramInt <= 256) ? new a(paramInt) : new HashMap<K, V>(paramInt, 1.0F));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */