package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class t62<K extends Comparable<K>, V> extends AbstractMap<K, V> {
  private final int b;
  
  private List<y62> c;
  
  private Map<K, V> d;
  
  private boolean e;
  
  private volatile a72 f;
  
  private Map<K, V> g;
  
  private volatile u62 h;
  
  private t62(int paramInt) {
    this.b = paramInt;
    this.c = Collections.emptyList();
    this.d = Collections.emptyMap();
    this.g = Collections.emptyMap();
  }
  
  private final int b(K paramK) {
    int i = this.c.size() - 1;
    if (i >= 0) {
      int k = paramK.compareTo((Comparable)((y62)this.c.get(i)).getKey());
      if (k > 0)
        return -(i + 2); 
      if (k == 0)
        return i; 
    } 
    int j = 0;
    while (j <= i) {
      int k = (j + i) / 2;
      int m = paramK.compareTo((Comparable)((y62)this.c.get(k)).getKey());
      if (m < 0) {
        i = k - 1;
        continue;
      } 
      if (m > 0) {
        j = k + 1;
        continue;
      } 
      return k;
    } 
    return -(j + 1);
  }
  
  private final void k() {
    if (!this.e)
      return; 
    throw new UnsupportedOperationException();
  }
  
  private final SortedMap<K, V> l() {
    k();
    if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
      TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
      this.d = (Map)treeMap;
      this.g = (Map)treeMap.descendingMap();
    } 
    return (SortedMap<K, V>)this.d;
  }
  
  static <FieldDescriptorType extends f42<FieldDescriptorType>> t62<FieldDescriptorType, Object> o(int paramInt) {
    return new s62(paramInt);
  }
  
  private final V q(int paramInt) {
    k();
    V v = ((y62)this.c.remove(paramInt)).getValue();
    if (!this.d.isEmpty()) {
      Iterator<Map.Entry<K, V>> iterator = l().entrySet().iterator();
      this.c.add(new y62(this, iterator.next()));
      iterator.remove();
    } 
    return v;
  }
  
  public final boolean a() {
    return this.e;
  }
  
  public void clear() {
    k();
    if (!this.c.isEmpty())
      this.c.clear(); 
    if (!this.d.isEmpty())
      this.d.clear(); 
  }
  
  public boolean containsKey(Object paramObject) {
    paramObject = paramObject;
    return (b((K)paramObject) >= 0 || this.d.containsKey(paramObject));
  }
  
  public final V d(K paramK, V paramV) {
    k();
    int i = b(paramK);
    if (i >= 0)
      return ((y62)this.c.get(i)).setValue(paramV); 
    k();
    if (this.c.isEmpty() && !(this.c instanceof ArrayList))
      this.c = new ArrayList<y62>(this.b); 
    int j = -(i + 1);
    if (j >= this.b)
      return l().put(paramK, paramV); 
    i = this.c.size();
    int k = this.b;
    if (i == k) {
      y62 y62 = this.c.remove(k - 1);
      l().put((K)y62.getKey(), y62.getValue());
    } 
    this.c.add(j, new y62(this, paramK, paramV));
    return null;
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    if (this.f == null)
      this.f = new a72(this, null); 
    return this.f;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof t62))
      return super.equals(paramObject); 
    paramObject = paramObject;
    int i = size();
    if (i != paramObject.size())
      return false; 
    int j = h();
    if (j != paramObject.h())
      return entrySet().equals(paramObject.entrySet()); 
    for (byte b = 0; b < j; b++) {
      if (!p(b).equals(paramObject.p(b)))
        return false; 
    } 
    return (j != i) ? this.d.equals(((t62)paramObject).d) : true;
  }
  
  public void g() {
    if (!this.e) {
      Map<?, ?> map;
      if (this.d.isEmpty()) {
        map = Collections.emptyMap();
      } else {
        map = Collections.unmodifiableMap(this.d);
      } 
      this.d = (Map)map;
      if (this.g.isEmpty()) {
        map = Collections.emptyMap();
      } else {
        map = Collections.unmodifiableMap(this.g);
      } 
      this.g = (Map)map;
      this.e = true;
    } 
  }
  
  public V get(Object paramObject) {
    paramObject = paramObject;
    int i = b((K)paramObject);
    return (i >= 0) ? ((y62)this.c.get(i)).getValue() : this.d.get(paramObject);
  }
  
  public final int h() {
    return this.c.size();
  }
  
  public int hashCode() {
    int i = h();
    int j = 0;
    int k = 0;
    while (j < i) {
      k += ((y62)this.c.get(j)).hashCode();
      j++;
    } 
    j = k;
    if (this.d.size() > 0)
      j = k + this.d.hashCode(); 
    return j;
  }
  
  public final Iterable<Map.Entry<K, V>> i() {
    return this.d.isEmpty() ? x62.a() : this.d.entrySet();
  }
  
  final Set<Map.Entry<K, V>> j() {
    if (this.h == null)
      this.h = new u62(this, null); 
    return this.h;
  }
  
  public final Map.Entry<K, V> p(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public V remove(Object paramObject) {
    k();
    paramObject = paramObject;
    int i = b((K)paramObject);
    return (i >= 0) ? q(i) : (this.d.isEmpty() ? null : this.d.remove(paramObject));
  }
  
  public int size() {
    return this.c.size() + this.d.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */