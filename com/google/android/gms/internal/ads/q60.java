package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class q60 extends j90<v60> implements f50, i60 {
  private final nh1 c;
  
  private AtomicBoolean d = new AtomicBoolean();
  
  public q60(Set<gb0<v60>> paramSet, nh1 paramnh1) {
    super(paramSet);
    this.c = paramnh1;
  }
  
  private final void c1() {
    x<Boolean> x = m0.x5;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && this.d.compareAndSet(false, true)) {
      zzvu zzvu = this.c.Z;
      if (zzvu != null && zzvu.b == 3)
        X0(new t60(this)); 
    } 
  }
  
  public final void S() {
    int i = this.c.b;
    if (i == 2 || i == 5 || i == 4)
      c1(); 
  }
  
  public final void o1() {
    if (this.c.b == 1)
      c1(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */