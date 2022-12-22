package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class xe2 {
  public final int a = 1;
  
  public final byte[] b;
  
  public xe2(int paramInt, byte[] paramArrayOfbyte) {
    this.b = paramArrayOfbyte;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && xe2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((xe2)paramObject).a && Arrays.equals(this.b, ((xe2)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a * 31 + Arrays.hashCode(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xe2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */