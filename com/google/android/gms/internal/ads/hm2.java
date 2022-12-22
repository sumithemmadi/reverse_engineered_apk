package com.google.android.gms.internal.ads;

public final class hm2 {
  final long a;
  
  final String b;
  
  final int c;
  
  hm2(long paramLong, String paramString, int paramInt) {
    this.a = paramLong;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject instanceof hm2) {
      paramObject = paramObject;
      if (((hm2)paramObject).a == this.a && ((hm2)paramObject).c == this.c)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (int)this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */