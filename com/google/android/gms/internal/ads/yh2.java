package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class yh2 {
  public final int a;
  
  private final zzht[] b;
  
  private int c;
  
  public yh2(zzht... paramVarArgs) {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    this.b = paramVarArgs;
    this.a = paramVarArgs.length;
  }
  
  public final zzht a(int paramInt) {
    return this.b[paramInt];
  }
  
  public final int b(zzht paramzzht) {
    byte b = 0;
    while (true) {
      zzht[] arrayOfZzht = this.b;
      if (b < arrayOfZzht.length) {
        if (paramzzht == arrayOfZzht[b])
          return b; 
        b++;
        continue;
      } 
      return -1;
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && yh2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((yh2)paramObject).a && Arrays.equals((Object[])this.b, (Object[])((yh2)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.c == 0)
      this.c = Arrays.hashCode((Object[])this.b) + 527; 
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */