package b.b.a.b;

import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {
  private HashMap<K, b.c<K, V>> f = new HashMap<K, b.c<K, V>>();
  
  public boolean contains(K paramK) {
    return this.f.containsKey(paramK);
  }
  
  protected b.c<K, V> f(K paramK) {
    return this.f.get(paramK);
  }
  
  public V l(K paramK, V paramV) {
    b.c<K, V> c = f(paramK);
    if (c != null)
      return c.c; 
    this.f.put(paramK, k(paramK, paramV));
    return null;
  }
  
  public V m(K paramK) {
    V v = super.m(paramK);
    this.f.remove(paramK);
    return v;
  }
  
  public Map.Entry<K, V> n(K paramK) {
    return contains(paramK) ? ((b.c)this.f.get(paramK)).e : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/b/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */