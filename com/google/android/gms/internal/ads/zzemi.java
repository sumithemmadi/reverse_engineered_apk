package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzemi<K, V> extends LinkedHashMap<K, V> {
  private static final zzemi b;
  
  private boolean zzilo = true;
  
  static {
    zzemi zzemi1 = new zzemi();
    b = zzemi1;
    zzemi1.zzilo = false;
  }
  
  private zzemi() {}
  
  private zzemi(Map<K, V> paramMap) {
    super(paramMap);
  }
  
  private static int a(Object paramObject) {
    if (paramObject instanceof byte[])
      return m42.b((byte[])paramObject); 
    if (!(paramObject instanceof p42))
      return paramObject.hashCode(); 
    throw new UnsupportedOperationException();
  }
  
  private final void b() {
    if (this.zzilo)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public static <K, V> zzemi<K, V> zzbjs() {
    return b;
  }
  
  public final void clear() {
    b();
    super.clear();
  }
  
  public final Set<Map.Entry<K, V>> entrySet() {
    return isEmpty() ? Collections.emptySet() : super.entrySet();
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/util/Map
    //   4: ifeq -> 171
    //   7: aload_1
    //   8: checkcast java/util/Map
    //   11: astore_2
    //   12: aload_0
    //   13: aload_2
    //   14: if_acmpeq -> 163
    //   17: aload_0
    //   18: invokeinterface size : ()I
    //   23: aload_2
    //   24: invokeinterface size : ()I
    //   29: if_icmpeq -> 37
    //   32: iconst_0
    //   33: istore_3
    //   34: goto -> 165
    //   37: aload_0
    //   38: invokeinterface entrySet : ()Ljava/util/Set;
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore_1
    //   49: aload_1
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 163
    //   58: aload_1
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast java/util/Map$Entry
    //   67: astore #4
    //   69: aload_2
    //   70: aload #4
    //   72: invokeinterface getKey : ()Ljava/lang/Object;
    //   77: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   82: ifne -> 88
    //   85: goto -> 32
    //   88: aload #4
    //   90: invokeinterface getValue : ()Ljava/lang/Object;
    //   95: astore #5
    //   97: aload_2
    //   98: aload #4
    //   100: invokeinterface getKey : ()Ljava/lang/Object;
    //   105: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: astore #4
    //   112: aload #5
    //   114: instanceof [B
    //   117: ifeq -> 146
    //   120: aload #4
    //   122: instanceof [B
    //   125: ifeq -> 146
    //   128: aload #5
    //   130: checkcast [B
    //   133: aload #4
    //   135: checkcast [B
    //   138: invokestatic equals : ([B[B)Z
    //   141: istore #6
    //   143: goto -> 155
    //   146: aload #5
    //   148: aload #4
    //   150: invokevirtual equals : (Ljava/lang/Object;)Z
    //   153: istore #6
    //   155: iload #6
    //   157: ifne -> 49
    //   160: goto -> 32
    //   163: iconst_1
    //   164: istore_3
    //   165: iload_3
    //   166: ifeq -> 171
    //   169: iconst_1
    //   170: ireturn
    //   171: iconst_0
    //   172: ireturn
  }
  
  public final int hashCode() {
    Iterator<Map.Entry> iterator = super.entrySet().iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += a(entry.getValue()) ^ j) {
      Map.Entry entry = iterator.next();
      int j = a(entry.getKey());
    } 
    return i;
  }
  
  public final boolean isMutable() {
    return this.zzilo;
  }
  
  public final V put(K paramK, V paramV) {
    b();
    m42.a(paramK);
    m42.a(paramV);
    return super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap) {
    b();
    for (K k : paramMap.keySet()) {
      m42.a(k);
      m42.a(paramMap.get(k));
    } 
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject) {
    b();
    return super.remove(paramObject);
  }
  
  public final void zza(zzemi<K, V> paramzzemi) {
    b();
    if (!paramzzemi.isEmpty())
      putAll(paramzzemi); 
  }
  
  public final void zzbgf() {
    this.zzilo = false;
  }
  
  public final zzemi<K, V> zzbjt() {
    return isEmpty() ? new zzemi() : new zzemi(this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzemi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */