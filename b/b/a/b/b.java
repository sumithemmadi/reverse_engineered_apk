package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
  c<K, V> b;
  
  private c<K, V> c;
  
  private WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<f<K, V>, Boolean>();
  
  private int e = 0;
  
  public Iterator<Map.Entry<K, V>> a() {
    b<K, V> b1 = new b<K, V>(this.c, this.b);
    this.d.put(b1, Boolean.FALSE);
    return b1;
  }
  
  public Map.Entry<K, V> c() {
    return this.b;
  }
  
  public boolean equals(Object<Map.Entry<K, V>> paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    b b1 = (b)paramObject;
    if (size() != b1.size())
      return false; 
    paramObject = (Object<Map.Entry<K, V>>)iterator();
    Iterator<Object> iterator = b1.iterator();
    while (paramObject.hasNext() && iterator.hasNext()) {
      Map.Entry entry = paramObject.next();
      Object object = iterator.next();
      if ((entry == null && object != null) || (entry != null && !entry.equals(object)))
        return false; 
    } 
    if (paramObject.hasNext() || iterator.hasNext())
      bool = false; 
    return bool;
  }
  
  protected c<K, V> f(K paramK) {
    c<K, V> c1;
    for (c1 = this.b; c1 != null && !c1.b.equals(paramK); c1 = c1.d);
    return c1;
  }
  
  public int hashCode() {
    Iterator<Map.Entry<K, V>> iterator = iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += ((Map.Entry)iterator.next()).hashCode());
    return i;
  }
  
  public d i() {
    d d = new d(this);
    this.d.put(d, Boolean.FALSE);
    return d;
  }
  
  public Iterator<Map.Entry<K, V>> iterator() {
    a<K, V> a = new a<K, V>(this.b, this.c);
    this.d.put(a, Boolean.FALSE);
    return a;
  }
  
  public Map.Entry<K, V> j() {
    return this.c;
  }
  
  protected c<K, V> k(K paramK, V paramV) {
    c<K, V> c2 = new c<K, V>(paramK, paramV);
    this.e++;
    c<K, V> c1 = this.c;
    if (c1 == null) {
      this.b = c2;
      this.c = c2;
      return c2;
    } 
    c1.d = c2;
    c2.e = c1;
    this.c = c2;
    return c2;
  }
  
  public V l(K paramK, V paramV) {
    c<K, V> c1 = f(paramK);
    if (c1 != null)
      return c1.c; 
    k(paramK, paramV);
    return null;
  }
  
  public V m(K paramK) {
    c<K, V> c1 = f(paramK);
    if (c1 == null)
      return null; 
    this.e--;
    if (!this.d.isEmpty()) {
      Iterator<f<K, V>> iterator = this.d.keySet().iterator();
      while (iterator.hasNext())
        ((f<K, V>)iterator.next()).a(c1); 
    } 
    c<K, V> c3 = c1.e;
    if (c3 != null) {
      c3.d = c1.d;
    } else {
      this.b = c1.d;
    } 
    c<K, V> c2 = c1.d;
    if (c2 != null) {
      c2.e = c3;
    } else {
      this.c = c3;
    } 
    c1.d = null;
    c1.e = null;
    return c1.c;
  }
  
  public int size() {
    return this.e;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    Iterator<Map.Entry<K, V>> iterator = iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(((Map.Entry)iterator.next()).toString());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static class a<K, V> extends e<K, V> {
    a(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      super(param1c1, param1c2);
    }
    
    b.c<K, V> c(b.c<K, V> param1c) {
      return param1c.e;
    }
    
    b.c<K, V> d(b.c<K, V> param1c) {
      return param1c.d;
    }
  }
  
  private static class b<K, V> extends e<K, V> {
    b(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      super(param1c1, param1c2);
    }
    
    b.c<K, V> c(b.c<K, V> param1c) {
      return param1c.d;
    }
    
    b.c<K, V> d(b.c<K, V> param1c) {
      return param1c.e;
    }
  }
  
  static class c<K, V> implements Map.Entry<K, V> {
    final K b;
    
    final V c;
    
    c<K, V> d;
    
    c<K, V> e;
    
    c(K param1K, V param1V) {
      this.b = param1K;
      this.c = param1V;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof c))
        return false; 
      param1Object = param1Object;
      if (!this.b.equals(((c)param1Object).b) || !this.c.equals(((c)param1Object).c))
        bool = false; 
      return bool;
    }
    
    public K getKey() {
      return this.b;
    }
    
    public V getValue() {
      return this.c;
    }
    
    public int hashCode() {
      return this.b.hashCode() ^ this.c.hashCode();
    }
    
    public V setValue(V param1V) {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b);
      stringBuilder.append("=");
      stringBuilder.append(this.c);
      return stringBuilder.toString();
    }
  }
  
  private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
    private b.c<K, V> b;
    
    private boolean c = true;
    
    d(b this$0) {}
    
    public void a(b.c<K, V> param1c) {
      b.c<K, V> c1 = this.b;
      if (param1c == c1) {
        boolean bool;
        param1c = c1.e;
        this.b = param1c;
        if (param1c == null) {
          bool = true;
        } else {
          bool = false;
        } 
        this.c = bool;
      } 
    }
    
    public Map.Entry<K, V> c() {
      if (this.c) {
        this.c = false;
        this.b = this.d.b;
      } else {
        b.c<K, V> c1 = this.b;
        if (c1 != null) {
          c1 = c1.d;
        } else {
          c1 = null;
        } 
        this.b = c1;
      } 
      return this.b;
    }
    
    public boolean hasNext() {
      boolean bool = this.c;
      boolean bool1 = true;
      boolean bool2 = true;
      if (bool) {
        if (this.d.b == null)
          bool2 = false; 
        return bool2;
      } 
      b.c<K, V> c1 = this.b;
      if (c1 != null && c1.d != null) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      return bool2;
    }
  }
  
  private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
    b.c<K, V> b;
    
    b.c<K, V> c;
    
    e(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      this.b = param1c2;
      this.c = param1c1;
    }
    
    private b.c<K, V> f() {
      b.c<K, V> c1 = this.c;
      b.c<K, V> c2 = this.b;
      return (c1 == c2 || c2 == null) ? null : d(c1);
    }
    
    public void a(b.c<K, V> param1c) {
      if (this.b == param1c && param1c == this.c) {
        this.c = null;
        this.b = null;
      } 
      b.c<K, V> c1 = this.b;
      if (c1 == param1c)
        this.b = c(c1); 
      if (this.c == param1c)
        this.c = f(); 
    }
    
    abstract b.c<K, V> c(b.c<K, V> param1c);
    
    abstract b.c<K, V> d(b.c<K, V> param1c);
    
    public Map.Entry<K, V> e() {
      b.c<K, V> c1 = this.c;
      this.c = f();
      return c1;
    }
    
    public boolean hasNext() {
      boolean bool;
      if (this.c != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  static interface f<K, V> {
    void a(b.c<K, V> param1c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/b/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */