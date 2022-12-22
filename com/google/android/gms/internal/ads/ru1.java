package com.google.android.gms.internal.ads;

public abstract class ru1<KeyFormatProtoT extends u52, KeyT> {
  private final Class<KeyFormatProtoT> a;
  
  public ru1(Class<KeyFormatProtoT> paramClass) {
    this.a = paramClass;
  }
  
  public final Class<KeyFormatProtoT> a() {
    return this.a;
  }
  
  public abstract void b(KeyFormatProtoT paramKeyFormatProtoT);
  
  public abstract KeyT c(KeyFormatProtoT paramKeyFormatProtoT);
  
  public abstract KeyFormatProtoT d(zzejr paramzzejr);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ru1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */