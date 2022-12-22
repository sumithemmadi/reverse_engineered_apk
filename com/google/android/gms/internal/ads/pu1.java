package com.google.android.gms.internal.ads;

public abstract class pu1<PrimitiveT, KeyT> {
  private final Class<PrimitiveT> a;
  
  public pu1(Class<PrimitiveT> paramClass) {
    this.a = paramClass;
  }
  
  public abstract PrimitiveT a(KeyT paramKeyT);
  
  final Class<PrimitiveT> b() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */