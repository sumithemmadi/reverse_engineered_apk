package com.google.android.gms.internal.ads;

final class b42 {
  private static final a42<?> a = new c42();
  
  private static final a42<?> b = a();
  
  private static a42<?> a() {
    try {
      return Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  static a42<?> b() {
    return a;
  }
  
  static a42<?> c() {
    a42<?> a421 = b;
    if (a421 != null)
      return a421; 
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */