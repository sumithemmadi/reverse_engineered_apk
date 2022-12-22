package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class c52 extends a32<String> implements b52, RandomAccess {
  private static final c52 c;
  
  private static final b52 d;
  
  private final List<Object> e;
  
  static {
    c52 c521 = new c52();
    c = c521;
    c521.G();
    d = c521;
  }
  
  public c52() {
    this(10);
  }
  
  public c52(int paramInt) {
    this(new ArrayList(paramInt));
  }
  
  private c52(ArrayList<Object> paramArrayList) {
    this.e = paramArrayList;
  }
  
  private static String c(Object paramObject) {
    return (paramObject instanceof String) ? (String)paramObject : ((paramObject instanceof zzejr) ? ((zzejr)paramObject).zzbgi() : m42.j((byte[])paramObject));
  }
  
  public final void L(zzejr paramzzejr) {
    a();
    this.e.add(paramzzejr);
    this.modCount++;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection) {
    a();
    Collection<? extends String> collection = paramCollection;
    if (paramCollection instanceof b52)
      collection = (Collection)((b52)paramCollection).o(); 
    boolean bool = this.e.addAll(paramInt, collection);
    this.modCount++;
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection) {
    return super.addAll(size(), paramCollection);
  }
  
  public final void clear() {
    a();
    this.e.clear();
    this.modCount++;
  }
  
  public final List<?> o() {
    return Collections.unmodifiableList(this.e);
  }
  
  public final int size() {
    return this.e.size();
  }
  
  public final Object u(int paramInt) {
    return this.e.get(paramInt);
  }
  
  public final b52 z() {
    return (b52)(super.x() ? new l72(this) : this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */