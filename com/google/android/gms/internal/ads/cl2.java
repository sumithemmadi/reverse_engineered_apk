package com.google.android.gms.internal.ads;

public final class cl2 implements n8 {
  private int a = 2500;
  
  private int b;
  
  private final int c = 1;
  
  private final float d = 1.0F;
  
  public cl2() {
    this(2500, 1, 1.0F);
  }
  
  private cl2(int paramInt1, int paramInt2, float paramFloat) {}
  
  public final void a(zzap paramzzap) {
    int i = this.b;
    boolean bool = true;
    int j = i + 1;
    this.b = j;
    i = this.a;
    this.a = i + (int)(i * this.d);
    if (j > this.c)
      bool = false; 
    if (bool)
      return; 
    throw paramzzap;
  }
  
  public final int b() {
    return this.a;
  }
  
  public final int c() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */