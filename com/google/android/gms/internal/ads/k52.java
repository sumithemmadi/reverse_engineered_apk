package com.google.android.gms.internal.ads;

final class k52 implements r52 {
  private r52[] a;
  
  k52(r52... paramVarArgs) {
    this.a = paramVarArgs;
  }
  
  public final s52 a(Class<?> paramClass) {
    for (r52 r521 : this.a) {
      if (r521.b(paramClass))
        return r521.a(paramClass); 
    } 
    String str = paramClass.getName();
    if (str.length() != 0) {
      str = "No factory is available for message type: ".concat(str);
    } else {
      str = new String("No factory is available for message type: ");
    } 
    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(str);
    throw unsupportedOperationException;
  }
  
  public final boolean b(Class<?> paramClass) {
    r52[] arrayOfR52 = this.a;
    int i = arrayOfR52.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfR52[b].b(paramClass))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */