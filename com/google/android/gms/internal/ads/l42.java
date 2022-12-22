package com.google.android.gms.internal.ads;

final class l42 implements r52 {
  private static final l42 a = new l42();
  
  public static l42 c() {
    return a;
  }
  
  public final s52 a(Class<?> paramClass) {
    String str;
    if (!k42.class.isAssignableFrom(paramClass)) {
      str = paramClass.getName();
      if (str.length() != 0) {
        str = "Unsupported message type: ".concat(str);
      } else {
        str = new String("Unsupported message type: ");
      } 
      throw new IllegalArgumentException(str);
    } 
    try {
      return (s52)k42.<k42<?, ?>>I(str.asSubclass(k42.class)).x(k42.e.c, null, null);
    } catch (Exception exception) {
      str = str.getName();
      if (str.length() != 0) {
        str = "Unable to get message info for ".concat(str);
      } else {
        str = new String("Unable to get message info for ");
      } 
      throw new RuntimeException(str, exception);
    } 
  }
  
  public final boolean b(Class<?> paramClass) {
    return k42.class.isAssignableFrom(paramClass);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */