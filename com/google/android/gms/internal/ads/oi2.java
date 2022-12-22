package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class oi2 {
  public final int a;
  
  private final mi2[] b;
  
  private int c;
  
  public oi2(mi2... paramVarArgs) {
    this.b = paramVarArgs;
    this.a = paramVarArgs.length;
  }
  
  public final mi2 a(int paramInt) {
    return this.b[paramInt];
  }
  
  public final mi2[] b() {
    return (mi2[])this.b.clone();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || oi2.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals((Object[])this.b, (Object[])((oi2)paramObject).b);
  }
  
  public final int hashCode() {
    if (this.c == 0)
      this.c = Arrays.hashCode((Object[])this.b) + 527; 
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */