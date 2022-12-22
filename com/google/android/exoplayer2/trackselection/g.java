package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;

public final class g {
  public final int a;
  
  private final f[] b;
  
  private int c;
  
  public g(f... paramVarArgs) {
    this.b = paramVarArgs;
    this.a = paramVarArgs.length;
  }
  
  public f a(int paramInt) {
    return this.b[paramInt];
  }
  
  public f[] b() {
    return (f[])this.b.clone();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || g.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals((Object[])this.b, (Object[])((g)paramObject).b);
  }
  
  public int hashCode() {
    if (this.c == 0)
      this.c = 527 + Arrays.hashCode((Object[])this.b); 
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */