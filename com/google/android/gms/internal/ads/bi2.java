package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class bi2 implements mi2 {
  private final yh2 a;
  
  private final int b;
  
  private final int[] c;
  
  private final zzht[] d;
  
  private final long[] e;
  
  private int f;
  
  public bi2(yh2 paramyh2, int... paramVarArgs) {
    boolean bool;
    int i = paramVarArgs.length;
    int j = 0;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    this.a = jj2.<yh2>d(paramyh2);
    i = paramVarArgs.length;
    this.b = i;
    this.d = new zzht[i];
    for (i = 0; i < paramVarArgs.length; i++)
      this.d[i] = paramyh2.a(paramVarArgs[i]); 
    Arrays.sort(this.d, new di2(null));
    this.c = new int[this.b];
    i = j;
    while (true) {
      j = this.b;
      if (i < j) {
        this.c[i] = paramyh2.b(this.d[i]);
        i++;
        continue;
      } 
      this.e = new long[j];
      return;
    } 
  }
  
  public final int a(int paramInt) {
    return this.c[0];
  }
  
  public final yh2 b() {
    return this.a;
  }
  
  public final zzht c(int paramInt) {
    return this.d[paramInt];
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((bi2)paramObject).a && Arrays.equals(this.c, ((bi2)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    if (this.f == 0)
      this.f = System.identityHashCode(this.a) * 31 + Arrays.hashCode(this.c); 
    return this.f;
  }
  
  public final int length() {
    return this.c.length;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */