package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class nu1<KeyProtoT extends u52> {
  private final Class<KeyProtoT> a;
  
  private final Map<Class<?>, pu1<?, KeyProtoT>> b;
  
  private final Class<?> c;
  
  @SafeVarargs
  protected nu1(Class<KeyProtoT> paramClass, pu1<?, KeyProtoT>... paramVarArgs) {
    String str;
    this.a = paramClass;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      pu1<?, KeyProtoT> pu11 = paramVarArgs[b];
      if (hashMap.containsKey(pu11.b())) {
        str = String.valueOf(pu11.b().getCanonicalName());
        if (str.length() != 0) {
          str = "KeyTypeManager constructed with duplicate factories for primitive ".concat(str);
        } else {
          str = new String("KeyTypeManager constructed with duplicate factories for primitive ");
        } 
        throw new IllegalArgumentException(str);
      } 
      str.put(pu11.b(), pu11);
    } 
    if (paramVarArgs.length > 0) {
      this.c = paramVarArgs[0].b();
    } else {
      this.c = Void.class;
    } 
    this.b = Collections.unmodifiableMap((Map<? extends Class<?>, ? extends pu1<?, KeyProtoT>>)str);
  }
  
  public abstract String a();
  
  public final <P> P b(KeyProtoT paramKeyProtoT, Class<P> paramClass) {
    pu1<P, KeyProtoT> pu1 = (pu1)this.b.get(paramClass);
    if (pu1 != null)
      return pu1.a(paramKeyProtoT); 
    String str = paramClass.getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
    stringBuilder.append("Requested primitive class ");
    stringBuilder.append(str);
    stringBuilder.append(" not supported.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final Class<KeyProtoT> c() {
    return this.a;
  }
  
  public abstract zzegd.zza d();
  
  public final Set<Class<?>> e() {
    return this.b.keySet();
  }
  
  final Class<?> f() {
    return this.c;
  }
  
  public ru1<?, KeyProtoT> g() {
    throw new UnsupportedOperationException("Creating keys is not supported.");
  }
  
  public abstract void h(KeyProtoT paramKeyProtoT);
  
  public abstract KeyProtoT i(zzejr paramzzejr);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */