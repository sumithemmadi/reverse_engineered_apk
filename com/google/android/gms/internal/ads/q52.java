package com.google.android.gms.internal.ads;

import java.util.Map;

final class q52 implements o52 {
  public final Map<?, ?> a(Object paramObject) {
    return (zzemi)paramObject;
  }
  
  public final boolean b(Object paramObject) {
    return !((zzemi)paramObject).isMutable();
  }
  
  public final Object c(Object paramObject) {
    ((zzemi)paramObject).zzbgf();
    return paramObject;
  }
  
  public final Object d(Object paramObject) {
    return zzemi.zzbjs().zzbjt();
  }
  
  public final Object e(Object paramObject1, Object paramObject2) {
    zzemi zzemi = (zzemi)paramObject1;
    paramObject2 = paramObject2;
    paramObject1 = zzemi;
    if (!paramObject2.isEmpty()) {
      paramObject1 = zzemi;
      if (!zzemi.isMutable())
        paramObject1 = zzemi.zzbjt(); 
      paramObject1.zza((zzemi)paramObject2);
    } 
    return paramObject1;
  }
  
  public final m52<?, ?> f(Object paramObject) {
    paramObject = paramObject;
    throw new NoSuchMethodError();
  }
  
  public final int g(int paramInt, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    if (paramObject1.isEmpty())
      return 0; 
    paramObject1 = paramObject1.entrySet().iterator();
    if (!paramObject1.hasNext())
      return 0; 
    paramObject1 = paramObject1.next();
    paramObject1.getKey();
    paramObject1.getValue();
    throw new NoSuchMethodError();
  }
  
  public final Map<?, ?> h(Object paramObject) {
    return (zzemi)paramObject;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */