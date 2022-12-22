package com.google.android.gms.internal.ads;

public final class ks {
  private final int a;
  
  public final int b;
  
  public final int c;
  
  private ks(int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.c = paramInt2;
    this.b = paramInt3;
  }
  
  public static ks b() {
    return new ks(0, 0, 0);
  }
  
  public static ks c() {
    return new ks(4, 0, 0);
  }
  
  public static ks d() {
    return new ks(5, 0, 0);
  }
  
  public static ks i(zzvs paramzzvs) {
    return paramzzvs.e ? new ks(3, 0, 0) : (paramzzvs.j ? new ks(2, 0, 0) : (paramzzvs.i ? b() : j(paramzzvs.g, paramzzvs.d)));
  }
  
  public static ks j(int paramInt1, int paramInt2) {
    return new ks(1, paramInt1, paramInt2);
  }
  
  public final boolean a() {
    return (this.a == 2);
  }
  
  public final boolean e() {
    return (this.a == 3);
  }
  
  public final boolean f() {
    return (this.a == 0);
  }
  
  public final boolean g() {
    return (this.a == 4);
  }
  
  public final boolean h() {
    return (this.a == 5);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */