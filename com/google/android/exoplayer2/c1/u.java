package com.google.android.exoplayer2.c1;

public final class u {
  public static final u a = new u(0L, 0L);
  
  public final long b;
  
  public final long c;
  
  public u(long paramLong1, long paramLong2) {
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || u.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((u)paramObject).b || this.c != ((u)paramObject).c)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (int)this.b * 31 + (int)this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[timeUs=");
    stringBuilder.append(this.b);
    stringBuilder.append(", position=");
    stringBuilder.append(this.c);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */