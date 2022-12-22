package com.google.android.gms.internal.ads;

public final class ck1 implements ak1 {
  private final String a;
  
  public ck1(String paramString) {
    this.a = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof ck1))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((ck1)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ck1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */