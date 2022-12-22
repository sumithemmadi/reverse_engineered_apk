package com.bumptech.glide.p;

import b.e.a;
import b.e.g;

public final class b<K, V> extends a<K, V> {
  private int j;
  
  public void clear() {
    this.j = 0;
    super.clear();
  }
  
  public int hashCode() {
    if (this.j == 0)
      this.j = super.hashCode(); 
    return this.j;
  }
  
  public void j(g<? extends K, ? extends V> paramg) {
    this.j = 0;
    super.j(paramg);
  }
  
  public V k(int paramInt) {
    this.j = 0;
    return (V)super.k(paramInt);
  }
  
  public V l(int paramInt, V paramV) {
    this.j = 0;
    return (V)super.l(paramInt, paramV);
  }
  
  public V put(K paramK, V paramV) {
    this.j = 0;
    return (V)super.put(paramK, paramV);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */