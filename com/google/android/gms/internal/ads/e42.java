package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class e42<T extends f42<T>> {
  private static final e42 a = new e42(true);
  
  final t62<T, Object> b = t62.o(16);
  
  private boolean c;
  
  private boolean d;
  
  private e42() {}
  
  private e42(t62<T, Object> paramt62) {
    n();
  }
  
  private e42(boolean paramBoolean) {
    this(t62.o(0));
    n();
  }
  
  static int e(zzeos paramzzeos, int paramInt, Object paramObject) {
    int i = zzekl.e0(paramInt);
    paramInt = i;
    if (paramzzeos == zzeos.k) {
      m42.h((u52)paramObject);
      paramInt = i << 1;
    } 
    return paramInt + l(paramzzeos, paramObject);
  }
  
  private final Object f(T paramT) {
    u52 u52;
    Object object = this.b.get(paramT);
    paramT = (T)object;
    if (object instanceof w42) {
      w42 w42 = (w42)object;
      u52 = w42.e();
    } 
    return u52;
  }
  
  private final void h(T paramT, Object paramObject) {
    if (paramT.j()) {
      if (paramObject instanceof List) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List)paramObject);
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          paramObject = arrayList.get(b);
          b++;
          i(paramT.g(), paramObject);
        } 
        paramObject = arrayList;
      } else {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      } 
    } else {
      i(paramT.g(), paramObject);
    } 
    if (paramObject instanceof w42)
      this.d = true; 
    this.b.d(paramT, paramObject);
  }
  
  private static void i(zzeos paramzzeos, Object paramObject) {
    boolean bool2;
    m42.a(paramObject);
    int i = d42.a[paramzzeos.zzbli().ordinal()];
    boolean bool1 = true;
    switch (i) {
      default:
        bool2 = false;
        break;
      case 9:
        bool2 = bool1;
        if (!(paramObject instanceof u52)) {
          if (paramObject instanceof w42) {
            bool2 = bool1;
            break;
          } 
        } else {
          break;
        } 
      case 8:
        bool2 = bool1;
        if (!(paramObject instanceof Integer)) {
          if (paramObject instanceof p42) {
            bool2 = bool1;
            break;
          } 
        } else {
          break;
        } 
      case 7:
        bool2 = bool1;
        if (!(paramObject instanceof zzejr)) {
          if (paramObject instanceof byte[]) {
            bool2 = bool1;
            break;
          } 
        } else {
          break;
        } 
      case 6:
        bool2 = paramObject instanceof String;
        break;
      case 5:
        bool2 = paramObject instanceof Boolean;
        break;
      case 4:
        bool2 = paramObject instanceof Double;
        break;
      case 3:
        bool2 = paramObject instanceof Float;
        break;
      case 2:
        bool2 = paramObject instanceof Long;
        break;
      case 1:
        bool2 = paramObject instanceof Integer;
        break;
    } 
    if (bool2)
      return; 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    throw illegalArgumentException;
  }
  
  private static Object j(Object paramObject) {
    if (paramObject instanceof y52)
      return ((y52)paramObject).o(); 
    if (paramObject instanceof byte[]) {
      paramObject = paramObject;
      byte[] arrayOfByte = new byte[paramObject.length];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, paramObject.length);
      return arrayOfByte;
    } 
    return paramObject;
  }
  
  public static int k(f42<?> paramf42, Object paramObject) {
    zzeos zzeos = paramf42.g();
    int i = paramf42.zzv();
    if (paramf42.j()) {
      boolean bool = paramf42.o();
      boolean bool1 = false;
      int j = 0;
      if (bool) {
        Iterator iterator1 = ((List)paramObject).iterator();
        while (iterator1.hasNext())
          j += l(zzeos, iterator1.next()); 
        return zzekl.e0(i) + j + zzekl.o0(j);
      } 
      Iterator iterator = ((List)paramObject).iterator();
      for (j = bool1; iterator.hasNext(); j += e(zzeos, i, iterator.next()));
      return j;
    } 
    return e(zzeos, i, paramObject);
  }
  
  private static int l(zzeos paramzzeos, Object paramObject) {
    switch (d42.b[paramzzeos.ordinal()]) {
      default:
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
      case 18:
        return (paramObject instanceof p42) ? zzekl.m0(((p42)paramObject).zzv()) : zzekl.m0(((Integer)paramObject).intValue());
      case 17:
        return zzekl.U(((Long)paramObject).longValue());
      case 16:
        return zzekl.h0(((Integer)paramObject).intValue());
      case 15:
        return zzekl.W(((Long)paramObject).longValue());
      case 14:
        return zzekl.l0(((Integer)paramObject).intValue());
      case 13:
        return zzekl.g0(((Integer)paramObject).intValue());
      case 12:
        return (paramObject instanceof zzejr) ? zzekl.t((zzejr)paramObject) : zzekl.E0((byte[])paramObject);
      case 11:
        return (paramObject instanceof zzejr) ? zzekl.t((zzejr)paramObject) : zzekl.u0((String)paramObject);
      case 10:
        return (paramObject instanceof w42) ? zzekl.d((w42)paramObject) : zzekl.j0((u52)paramObject);
      case 9:
        return zzekl.r0((u52)paramObject);
      case 8:
        return zzekl.G(((Boolean)paramObject).booleanValue());
      case 7:
        return zzekl.i0(((Integer)paramObject).intValue());
      case 6:
        return zzekl.V(((Long)paramObject).longValue());
      case 5:
        return zzekl.f0(((Integer)paramObject).intValue());
      case 4:
        return zzekl.T(((Long)paramObject).longValue());
      case 3:
        return zzekl.S(((Long)paramObject).longValue());
      case 2:
        return zzekl.Y(((Float)paramObject).floatValue());
      case 1:
        break;
    } 
    return zzekl.L(((Double)paramObject).doubleValue());
  }
  
  private static <T extends f42<T>> boolean m(Map.Entry<T, Object> paramEntry) {
    f42 f42 = (f42)paramEntry.getKey();
    if (f42.h() == zzeov.j) {
      Iterator<u52> iterator;
      if (f42.j()) {
        iterator = ((List)paramEntry.getValue()).iterator();
        while (iterator.hasNext()) {
          if (!((u52)iterator.next()).isInitialized())
            return false; 
        } 
      } else {
        iterator = iterator.getValue();
        if (iterator instanceof u52) {
          if (!((u52)iterator).isInitialized())
            return false; 
        } else {
          if (iterator instanceof w42)
            return true; 
          throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } 
      } 
    } 
    return true;
  }
  
  public static <T extends f42<T>> e42<T> o() {
    return a;
  }
  
  private final void q(Map.Entry<T, Object> paramEntry) {
    f42 f42 = (f42)paramEntry.getKey();
    Object object2 = paramEntry.getValue();
    Object object1 = object2;
    if (object2 instanceof w42) {
      object1 = object2;
      object1 = w42.e();
    } 
    if (f42.j()) {
      object = f((T)f42);
      object2 = object;
      if (object == null)
        object2 = new ArrayList(); 
      for (Object object : object1)
        ((List<Object>)object2).add(j(object)); 
      this.b.d((T)f42, object2);
      return;
    } 
    if (f42.h() == zzeov.j) {
      object2 = f((T)f42);
      if (object2 == null) {
        this.b.d((T)f42, j(object1));
        return;
      } 
      if (object2 instanceof y52) {
        object1 = f42.p((y52)object2, (y52)object1);
      } else {
        object1 = f42.d(((u52)object2).f(), (u52)object1).h();
      } 
      this.b.d((T)f42, object1);
      return;
    } 
    this.b.d((T)f42, j(object1));
  }
  
  private static int r(Map.Entry<T, Object> paramEntry) {
    f42<?> f42 = (f42)paramEntry.getKey();
    Object object = paramEntry.getValue();
    return (f42.h() == zzeov.j && !f42.j() && !f42.o()) ? ((object instanceof w42) ? zzekl.x(((f42)paramEntry.getKey()).zzv(), (w42)object) : zzekl.y(((f42)paramEntry.getKey()).zzv(), (u52)object)) : k(f42, object);
  }
  
  final Iterator<Map.Entry<T, Object>> a() {
    return this.d ? new a52<T>(this.b.j().iterator()) : this.b.j().iterator();
  }
  
  public final boolean b() {
    return this.c;
  }
  
  public final boolean c() {
    for (byte b = 0; b < this.b.h(); b++) {
      if (!m(this.b.p(b)))
        return false; 
    } 
    Iterator<Map.Entry<f42, Object>> iterator = this.b.i().iterator();
    while (iterator.hasNext()) {
      if (!m(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final Iterator<Map.Entry<T, Object>> d() {
    return this.d ? new a52<T>(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof e42))
      return false; 
    paramObject = paramObject;
    return this.b.equals(((e42)paramObject).b);
  }
  
  public final void g(e42<T> parame42) {
    for (byte b = 0; b < parame42.b.h(); b++)
      q(parame42.b.p(b)); 
    Iterator<Map.Entry<T, Object>> iterator = parame42.b.i().iterator();
    while (iterator.hasNext())
      q(iterator.next()); 
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final void n() {
    if (this.c)
      return; 
    this.b.g();
    this.c = true;
  }
  
  public final int p() {
    byte b = 0;
    int i = 0;
    while (b < this.b.h()) {
      i += r(this.b.p(b));
      b++;
    } 
    Iterator<Map.Entry<T, Object>> iterator = this.b.i().iterator();
    while (iterator.hasNext())
      i += r(iterator.next()); 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */