package com.google.android.gms.internal.ads;

import java.util.List;

abstract class e52 {
  private static final e52 a = new h52(null);
  
  private static final e52 b = new f52(null);
  
  private e52() {}
  
  static e52 d() {
    return a;
  }
  
  static e52 e() {
    return b;
  }
  
  abstract <L> List<L> a(Object paramObject, long paramLong);
  
  abstract <L> void b(Object paramObject1, Object paramObject2, long paramLong);
  
  abstract void c(Object paramObject, long paramLong);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */