package com.google.android.gms.internal.ads;

import java.util.List;

public final class ob0 implements lb0 {
  private final List<String> a;
  
  private final jn1 b;
  
  private boolean c;
  
  public ob0(nh1 paramnh1, jn1 paramjn1) {
    this.a = paramnh1.o;
    this.b = paramjn1;
  }
  
  public final void a() {
    if (!this.c) {
      this.b.c(this.a);
      this.c = true;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ob0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */