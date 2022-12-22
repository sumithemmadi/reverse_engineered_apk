package com.google.android.gms.internal.ads;

final class d62 {
  private static final b62 a = c();
  
  private static final b62 b = new a62();
  
  static b62 a() {
    return a;
  }
  
  static b62 b() {
    return b;
  }
  
  private static b62 c() {
    try {
      return Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */