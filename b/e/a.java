package b.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {
  f<K, V> i;
  
  public a() {}
  
  public a(int paramInt) {
    super(paramInt);
  }
  
  public a(g<K, V> paramg) {
    super(paramg);
  }
  
  private f<K, V> n() {
    if (this.i == null)
      this.i = new a(this); 
    return this.i;
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    return n().l();
  }
  
  public Set<K> keySet() {
    return n().m();
  }
  
  public boolean o(Collection<?> paramCollection) {
    return f.p(this, paramCollection);
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap) {
    c(this.h + paramMap.size());
    for (Map.Entry<? extends K, ? extends V> entry : paramMap.entrySet())
      put((K)entry.getKey(), (V)entry.getValue()); 
  }
  
  public Collection<V> values() {
    return n().n();
  }
  
  class a extends f<K, V> {
    a(a this$0) {}
    
    protected void a() {
      this.d.clear();
    }
    
    protected Object b(int param1Int1, int param1Int2) {
      return this.d.g[(param1Int1 << 1) + param1Int2];
    }
    
    protected Map<K, V> c() {
      return this.d;
    }
    
    protected int d() {
      return this.d.h;
    }
    
    protected int e(Object param1Object) {
      return this.d.f(param1Object);
    }
    
    protected int f(Object param1Object) {
      return this.d.h(param1Object);
    }
    
    protected void g(K param1K, V param1V) {
      this.d.put(param1K, param1V);
    }
    
    protected void h(int param1Int) {
      this.d.k(param1Int);
    }
    
    protected V i(int param1Int, V param1V) {
      return (V)this.d.l(param1Int, param1V);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */