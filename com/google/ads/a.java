package com.google.ads;

import com.google.android.gms.ads.f;

@Deprecated
public final class a {
  public static final a a = new a(-1, -2, "mb");
  
  public static final a b = new a(320, 50, "mb");
  
  public static final a c = new a(300, 250, "as");
  
  public static final a d = new a(468, 60, "as");
  
  public static final a e = new a(728, 90, "as");
  
  public static final a f = new a(160, 600, "as");
  
  private final f g;
  
  private a(int paramInt1, int paramInt2, String paramString) {
    this(new f(paramInt1, paramInt2));
  }
  
  public a(f paramf) {
    this.g = paramf;
  }
  
  public final int a() {
    return this.g.a();
  }
  
  public final int b() {
    return this.g.c();
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return this.g.equals(((a)paramObject).g);
  }
  
  public final int hashCode() {
    return this.g.hashCode();
  }
  
  public final String toString() {
    return this.g.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */