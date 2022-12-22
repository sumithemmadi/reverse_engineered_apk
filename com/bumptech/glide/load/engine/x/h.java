package com.bumptech.glide.load.engine.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class h<K extends m, V> {
  private final a<K, V> a = new a<K, V>();
  
  private final Map<K, a<K, V>> b = new HashMap<K, a<K, V>>();
  
  private void b(a<K, V> parama) {
    e(parama);
    a<K, V> a1 = this.a;
    parama.d = a1;
    parama.c = a1.c;
    g(parama);
  }
  
  private void c(a<K, V> parama) {
    e(parama);
    a<K, V> a1 = this.a;
    parama.d = a1.d;
    parama.c = a1;
    g(parama);
  }
  
  private static <K, V> void e(a<K, V> parama) {
    a<K, V> a1 = parama.d;
    a1.c = parama.c;
    parama.c.d = a1;
  }
  
  private static <K, V> void g(a<K, V> parama) {
    parama.c.d = parama;
    parama.d.c = parama;
  }
  
  public V a(K paramK) {
    a<K, Object> a1;
    a<K, Object> a2 = (a)this.b.get(paramK);
    if (a2 == null) {
      a2 = new a<K, Object>(paramK);
      this.b.put(paramK, a2);
      a1 = a2;
    } else {
      a1.a();
      a1 = a2;
    } 
    b((a)a1);
    return (V)a1.b();
  }
  
  public void d(K paramK, V paramV) {
    a<K, Object> a1;
    a<K, Object> a2 = (a)this.b.get(paramK);
    if (a2 == null) {
      a2 = new a<K, Object>(paramK);
      c((a)a2);
      this.b.put(paramK, a2);
      a1 = a2;
    } else {
      a1.a();
      a1 = a2;
    } 
    a1.a(paramV);
  }
  
  public V f() {
    for (a<K, V> a1 = this.a.d; !a1.equals(this.a); a1 = a1.d) {
      V v = a1.b();
      if (v != null)
        return v; 
      e(a1);
      this.b.remove(a1.a);
      ((m)a1.a).a();
    } 
    return null;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
    a<K, V> a1 = this.a.c;
    boolean bool = false;
    while (!a1.equals(this.a)) {
      bool = true;
      stringBuilder.append('{');
      stringBuilder.append(a1.a);
      stringBuilder.append(':');
      stringBuilder.append(a1.c());
      stringBuilder.append("}, ");
      a1 = a1.c;
    } 
    if (bool)
      stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()); 
    stringBuilder.append(" )");
    return stringBuilder.toString();
  }
  
  private static class a<K, V> {
    final K a;
    
    private List<V> b;
    
    a<K, V> c = this;
    
    a<K, V> d = this;
    
    a() {
      this(null);
    }
    
    a(K param1K) {
      this.a = param1K;
    }
    
    public void a(V param1V) {
      if (this.b == null)
        this.b = new ArrayList<V>(); 
      this.b.add(param1V);
    }
    
    public V b() {
      V v;
      int i = c();
      if (i > 0) {
        V v1 = this.b.remove(i - 1);
      } else {
        v = null;
      } 
      return v;
    }
    
    public int c() {
      boolean bool;
      List<V> list = this.b;
      if (list != null) {
        bool = list.size();
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */