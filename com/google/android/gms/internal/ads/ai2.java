package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ai2 {
  public static final ai2 a = new ai2(new yh2[0]);
  
  public final int b;
  
  private final yh2[] c;
  
  private int d;
  
  public ai2(yh2... paramVarArgs) {
    this.c = paramVarArgs;
    this.b = paramVarArgs.length;
  }
  
  public final int a(yh2 paramyh2) {
    for (byte b = 0; b < this.b; b++) {
      if (this.c[b] == paramyh2)
        return b; 
    } 
    return -1;
  }
  
  public final yh2 b(int paramInt) {
    return this.c[paramInt];
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && ai2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((ai2)paramObject).b && Arrays.equals((Object[])this.c, (Object[])((ai2)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.d == 0)
      this.d = Arrays.hashCode((Object[])this.c); 
    return this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ai2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */