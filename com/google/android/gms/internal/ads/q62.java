package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class q62 {
  private static final Class<?> a = y();
  
  private static final h72<?, ?> b = A(false);
  
  private static final h72<?, ?> c = A(true);
  
  private static final h72<?, ?> d = new i72();
  
  private static h72<?, ?> A(boolean paramBoolean) {
    try {
      return (clazz == null) ? null : clazz.getConstructor(new Class[] { boolean.class }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
    } finally {
      Exception exception = null;
    } 
  }
  
  static int B(int paramInt, Object paramObject, o62 paramo62) {
    return (paramObject instanceof z42) ? zzekl.c(paramInt, (z42)paramObject) : zzekl.z(paramInt, (u52)paramObject, paramo62);
  }
  
  static int C(int paramInt, List<?> paramList) {
    Object object;
    int i = paramList.size();
    byte b1 = 0;
    byte b2 = 0;
    if (i == 0)
      return 0; 
    int j = zzekl.e0(paramInt) * i;
    paramInt = j;
    if (paramList instanceof b52) {
      b52 b52 = (b52)paramList;
      paramInt = j;
      b1 = b2;
      while (true) {
        j = paramInt;
        if (b1 < i) {
          object = b52.u(b1);
          if (object instanceof zzejr) {
            j = zzekl.t((zzejr)object);
          } else {
            j = zzekl.u0((String)object);
          } 
          paramInt += j;
          b1++;
          continue;
        } 
        break;
      } 
    } else {
      while (true) {
        j = paramInt;
        if (b1 < i) {
          zzejr zzejr = (zzejr)object.get(b1);
          if (zzejr instanceof zzejr) {
            j = zzekl.t(zzejr);
          } else {
            j = zzekl.u0((String)zzejr);
          } 
          paramInt += j;
          b1++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int D(int paramInt, List<?> paramList, o62 paramo62) {
    int i = paramList.size();
    int j = 0;
    if (i == 0)
      return 0; 
    int k = zzekl.e0(paramInt) * i;
    for (paramInt = j; paramInt < i; paramInt++) {
      Object object = paramList.get(paramInt);
      if (object instanceof z42) {
        j = zzekl.d((z42)object);
      } else {
        j = zzekl.e((u52)object, paramo62);
      } 
      k += j;
    } 
    return k;
  }
  
  public static void E(int paramInt, List<Long> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.m(paramInt, paramList, paramBoolean); 
  }
  
  static int F(int paramInt, List<zzejr> paramList) {
    int i = paramList.size();
    int j = 0;
    if (i == 0)
      return 0; 
    i *= zzekl.e0(paramInt);
    paramInt = j;
    j = i;
    while (paramInt < paramList.size()) {
      j += zzekl.t(paramList.get(paramInt));
      paramInt++;
    } 
    return j;
  }
  
  static int G(int paramInt, List<u52> paramList, o62 paramo62) {
    int i = paramList.size();
    byte b = 0;
    if (i == 0)
      return 0; 
    int j = 0;
    while (b < i) {
      j += zzekl.J(paramInt, paramList.get(b), paramo62);
      b++;
    } 
    return j;
  }
  
  public static void H(int paramInt, List<Long> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.C(paramInt, paramList, paramBoolean); 
  }
  
  public static void I(int paramInt, List<Long> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.A(paramInt, paramList, paramBoolean); 
  }
  
  public static void J(int paramInt, List<Long> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.x(paramInt, paramList, paramBoolean); 
  }
  
  public static void K(int paramInt, List<Long> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.n(paramInt, paramList, paramBoolean); 
  }
  
  public static void L(int paramInt, List<Integer> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.g(paramInt, paramList, paramBoolean); 
  }
  
  static boolean M(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static void N(int paramInt, List<Integer> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.t(paramInt, paramList, paramBoolean); 
  }
  
  public static void O(Class<?> paramClass) {
    if (!k42.class.isAssignableFrom(paramClass)) {
      Class<?> clazz = a;
      if (clazz != null && !clazz.isAssignableFrom(paramClass))
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite"); 
    } 
  }
  
  public static void P(int paramInt, List<Integer> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.D(paramInt, paramList, paramBoolean); 
  }
  
  public static void Q(int paramInt, List<Integer> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.q(paramInt, paramList, paramBoolean); 
  }
  
  public static void R(int paramInt, List<Integer> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.u(paramInt, paramList, paramBoolean); 
  }
  
  public static void S(int paramInt, List<Integer> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.h(paramInt, paramList, paramBoolean); 
  }
  
  public static void T(int paramInt, List<Boolean> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.c(paramInt, paramList, paramBoolean); 
  }
  
  static int U(int paramInt, List<Long> paramList, boolean paramBoolean) {
    return (paramList.size() == 0) ? 0 : (i(paramList) + paramList.size() * zzekl.e0(paramInt));
  }
  
  static int V(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (j(paramList) + i * zzekl.e0(paramInt));
  }
  
  static int W(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (k(paramList) + i * zzekl.e0(paramInt));
  }
  
  static int X(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (l(paramList) + i * zzekl.e0(paramInt));
  }
  
  static int Y(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (m(paramList) + i * zzekl.e0(paramInt));
  }
  
  static int Z(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (n(paramList) + i * zzekl.e0(paramInt));
  }
  
  static <UT, UB> UB a(int paramInt1, int paramInt2, UB paramUB, h72<UT, UB> paramh72) {
    UB uB = paramUB;
    if (paramUB == null)
      uB = paramh72.n(); 
    paramh72.a(uB, paramInt1, paramInt2);
    return uB;
  }
  
  static int a0(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (o(paramList) + i * zzekl.e0(paramInt));
  }
  
  static <UT, UB> UB b(int paramInt, List<Integer> paramList, r42 paramr42, UB paramUB, h72<UT, UB> paramh72) {
    UB uB;
    if (paramr42 == null)
      return paramUB; 
    if (paramList instanceof java.util.RandomAccess) {
      int i = paramList.size();
      byte b1 = 0;
      byte b2 = 0;
      while (b1 < i) {
        int j = ((Integer)paramList.get(b1)).intValue();
        if (paramr42.a(j)) {
          if (b1 != b2)
            paramList.set(b2, Integer.valueOf(j)); 
          b2++;
        } else {
          paramUB = a(paramInt, j, paramUB, paramh72);
        } 
        b1++;
      } 
      uB = paramUB;
      if (b2 != i) {
        paramList.subList(b2, i).clear();
        uB = paramUB;
      } 
    } else {
      Iterator<Integer> iterator = paramList.iterator();
      while (true) {
        uB = paramUB;
        if (iterator.hasNext()) {
          int i = ((Integer)iterator.next()).intValue();
          if (!paramr42.a(i)) {
            paramUB = a(paramInt, i, paramUB, paramh72);
            iterator.remove();
          } 
          continue;
        } 
        break;
      } 
    } 
    return uB;
  }
  
  static int b0(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * zzekl.s(paramInt, 0));
  }
  
  public static void c(int paramInt, List<String> paramList, w72 paramw72) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.N(paramInt, paramList); 
  }
  
  static int c0(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * zzekl.B0(paramInt, 0L));
  }
  
  public static void d(int paramInt, List<?> paramList, w72 paramw72, o62 paramo62) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.i(paramInt, paramList, paramo62); 
  }
  
  static int d0(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * zzekl.q0(paramInt, true));
  }
  
  public static void e(int paramInt, List<Double> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.G(paramInt, paramList, paramBoolean); 
  }
  
  static <T, FT extends f42<FT>> void f(a42<FT> parama42, T paramT1, T paramT2) {
    e42<FT> e42 = parama42.g(paramT2);
    if (!e42.b.isEmpty())
      parama42.h(paramT1).g(e42); 
  }
  
  static <T> void g(o52 paramo52, T paramT1, T paramT2, long paramLong) {
    m72.f(paramT1, paramLong, paramo52.e(m72.G(paramT1, paramLong), m72.G(paramT2, paramLong)));
  }
  
  static <T, UT, UB> void h(h72<UT, UB> paramh72, T paramT1, T paramT2) {
    paramh72.q(paramT1, paramh72.s(paramh72.j(paramT1), paramh72.j(paramT2)));
  }
  
  static int i(List<Long> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof j52) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.S(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.S(((Long)paramList.get(k)).longValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int j(List<Long> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof j52) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.T(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.T(((Long)paramList.get(k)).longValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int k(List<Long> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof j52) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.U(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.U(((Long)paramList.get(k)).longValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int l(List<Integer> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof n42) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.m0(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.m0(((Integer)paramList.get(k)).intValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int m(List<Integer> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof n42) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.f0(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.f0(((Integer)paramList.get(k)).intValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int n(List<Integer> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof n42) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.g0(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.g0(((Integer)paramList.get(k)).intValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int o(List<Integer> paramList) {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0)
      return 0; 
    if (paramList instanceof n42) {
      paramList = paramList;
      int m = 0;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.h0(paramList.c(k));
          k++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      k = j;
      while (true) {
        j = m;
        if (k < i) {
          m += zzekl.h0(((Integer)paramList.get(k)).intValue());
          k++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int p(List<?> paramList) {
    return paramList.size() << 2;
  }
  
  static int q(List<?> paramList) {
    return paramList.size() << 3;
  }
  
  static int r(List<?> paramList) {
    return paramList.size();
  }
  
  public static void s(int paramInt, List<zzejr> paramList, w72 paramw72) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.J(paramInt, paramList); 
  }
  
  public static void t(int paramInt, List<?> paramList, w72 paramw72, o62 paramo62) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.I(paramInt, paramList, paramo62); 
  }
  
  public static void u(int paramInt, List<Float> paramList, w72 paramw72, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramw72.L(paramInt, paramList, paramBoolean); 
  }
  
  public static h72<?, ?> v() {
    return b;
  }
  
  public static h72<?, ?> w() {
    return c;
  }
  
  public static h72<?, ?> x() {
    return d;
  }
  
  private static Class<?> y() {
    try {
      return Class.forName("com.google.protobuf.GeneratedMessage");
    } finally {
      Exception exception = null;
    } 
  }
  
  private static Class<?> z() {
    try {
      return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */