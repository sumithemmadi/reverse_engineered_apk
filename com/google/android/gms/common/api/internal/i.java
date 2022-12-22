package com.google.android.gms.common.api.internal;

public final class i<L> {
  private final L a;
  
  private final String b;
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof i))
      return false; 
    paramObject = paramObject;
    return (this.a == ((i)paramObject).a && this.b.equals(((i)paramObject).b));
  }
  
  public final int hashCode() {
    return System.identityHashCode(this.a) * 31 + this.b.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */