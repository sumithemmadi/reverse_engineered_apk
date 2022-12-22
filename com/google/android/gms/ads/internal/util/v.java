package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.r;

public final class v {
  public final String a;
  
  private final double b;
  
  private final double c;
  
  public final double d;
  
  public final int e;
  
  public v(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    this.a = paramString;
    this.c = paramDouble1;
    this.b = paramDouble2;
    this.d = paramDouble3;
    this.e = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof v))
      return false; 
    paramObject = paramObject;
    return (r.a(this.a, ((v)paramObject).a) && this.b == ((v)paramObject).b && this.c == ((v)paramObject).c && this.e == ((v)paramObject).e && Double.compare(this.d, ((v)paramObject).d) == 0);
  }
  
  public final int hashCode() {
    return r.b(new Object[] { this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e) });
  }
  
  public final String toString() {
    return r.c(this).a("name", this.a).a("minBound", Double.valueOf(this.c)).a("maxBound", Double.valueOf(this.b)).a("percent", Double.valueOf(this.d)).a("count", Integer.valueOf(this.e)).toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */