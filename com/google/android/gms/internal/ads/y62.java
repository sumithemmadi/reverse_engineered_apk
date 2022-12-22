package com.google.android.gms.internal.ads;

import java.util.Map;

final class y62 implements Comparable<y62>, Map.Entry<K, V> {
  private final K b;
  
  private V c;
  
  y62(t62 paramt62, K paramK, V paramV) {
    this.b = paramK;
    this.c = paramV;
  }
  
  y62(t62 paramt62, Map.Entry<K, V> paramEntry) {
    this(paramt62, paramEntry.getKey(), paramEntry.getValue());
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof Map.Entry))
      return false; 
    paramObject = paramObject;
    return (a(this.b, paramObject.getKey()) && a(this.c, paramObject.getValue()));
  }
  
  public final V getValue() {
    return this.c;
  }
  
  public final int hashCode() {
    int j;
    K k = this.b;
    int i = 0;
    if (k == null) {
      j = 0;
    } else {
      j = k.hashCode();
    } 
    V v = this.c;
    if (v != null)
      i = v.hashCode(); 
    return j ^ i;
  }
  
  public final V setValue(V paramV) {
    t62.e(this.d);
    V v = this.c;
    this.c = paramV;
    return v;
  }
  
  public final String toString() {
    String str1 = String.valueOf(this.b);
    String str2 = String.valueOf(this.c);
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 1 + str2.length());
    stringBuilder.append(str1);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */