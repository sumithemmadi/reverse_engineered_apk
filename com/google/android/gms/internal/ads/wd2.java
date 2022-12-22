package com.google.android.gms.internal.ads;

public class wd2 {
  private int a;
  
  public void a() {
    this.a = 0;
  }
  
  public final void b(int paramInt) {
    this.a = paramInt;
  }
  
  public final void c(int paramInt) {
    this.a |= Integer.MIN_VALUE;
  }
  
  protected final boolean d(int paramInt) {
    return ((this.a & paramInt) == paramInt);
  }
  
  public final boolean e() {
    return d(-2147483648);
  }
  
  public final boolean f() {
    return d(4);
  }
  
  public final boolean g() {
    return d(1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */