package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class h52 extends e52 {
  private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private h52() {
    super(null);
  }
  
  private static <L> List<L> f(Object<?> paramObject, long paramLong, int paramInt) {
    Object<?> object;
    List<?> list = g(paramObject, paramLong);
    if (list.isEmpty()) {
      ArrayList arrayList;
      if (list instanceof b52) {
        c52 c52 = new c52(paramInt);
      } else if (list instanceof g62 && list instanceof u42) {
        u42 u42 = ((u42)list).a0(paramInt);
      } else {
        arrayList = new ArrayList(paramInt);
      } 
      m72.f(paramObject, paramLong, arrayList);
    } else {
      if (c.isAssignableFrom(list.getClass())) {
        ArrayList<?> arrayList = new ArrayList(list.size() + paramInt);
        arrayList.addAll(list);
        m72.f(paramObject, paramLong, arrayList);
        paramObject = (Object<?>)arrayList;
      } else if (list instanceof l72) {
        c52 c52 = new c52(list.size() + paramInt);
        c52.addAll(list);
        m72.f(paramObject, paramLong, c52);
        paramObject = (Object<?>)c52;
      } else {
        List<?> list1 = list;
        if (list instanceof g62) {
          list1 = list;
          if (list instanceof u42) {
            u42<?> u42 = (u42)list;
            list1 = list;
            if (!u42.x()) {
              list1 = u42.a0(list.size() + paramInt);
              m72.f(paramObject, paramLong, list1);
            } 
          } 
        } 
        return (List)list1;
      } 
      object = paramObject;
    } 
    return (List)object;
  }
  
  private static <E> List<E> g(Object paramObject, long paramLong) {
    return (List<E>)m72.G(paramObject, paramLong);
  }
  
  final <L> List<L> a(Object paramObject, long paramLong) {
    return f(paramObject, paramLong, 10);
  }
  
  final <E> void b(Object paramObject1, Object<?> paramObject2, long paramLong) {
    paramObject2 = g(paramObject2, paramLong);
    List<?> list = f(paramObject1, paramLong, paramObject2.size());
    int i = list.size();
    int j = paramObject2.size();
    if (i > 0 && j > 0)
      list.addAll((Collection<?>)paramObject2); 
    if (i > 0)
      paramObject2 = (Object<?>)list; 
    m72.f(paramObject1, paramLong, paramObject2);
  }
  
  final void c(Object paramObject, long paramLong) {
    List<?> list = (List)m72.G(paramObject, paramLong);
    if (list instanceof b52) {
      list = ((b52)list).z();
    } else {
      if (c.isAssignableFrom(list.getClass()))
        return; 
      if (list instanceof g62 && list instanceof u42) {
        paramObject = list;
        if (paramObject.x())
          paramObject.G(); 
        return;
      } 
      list = Collections.unmodifiableList(list);
    } 
    m72.f(paramObject, paramLong, list);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */