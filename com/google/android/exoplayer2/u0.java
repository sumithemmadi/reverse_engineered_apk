package com.google.android.exoplayer2;

public final class u0 {
  public static final u0 a = new u0(0);
  
  public final int b;
  
  public u0(int paramInt) {
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || u0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((u0)paramObject).b)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */