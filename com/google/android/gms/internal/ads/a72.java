package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class a72 extends AbstractSet<Map.Entry<K, V>> {
  private a72(t62 paramt62) {}
  
  public void clear() {
    this.b.clear();
  }
  
  public boolean contains(Object paramObject) {
    Map.Entry entry = (Map.Entry)paramObject;
    paramObject = this.b.get(entry.getKey());
    entry = (Map.Entry)entry.getValue();
    return (paramObject == entry || (paramObject != null && paramObject.equals(entry)));
  }
  
  public Iterator<Map.Entry<K, V>> iterator() {
    return new b72(this.b, null);
  }
  
  public boolean remove(Object paramObject) {
    paramObject = paramObject;
    if (contains(paramObject)) {
      this.b.remove(paramObject.getKey());
      return true;
    } 
    return false;
  }
  
  public int size() {
    return this.b.size();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */