package com.google.android.gms.internal.ads;

final class p52 {
  private static final o52 a = c();
  
  private static final o52 b = new q52();
  
  static o52 a() {
    return a;
  }
  
  static o52 b() {
    return b;
  }
  
  private static o52 c() {
    try {
      return Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */