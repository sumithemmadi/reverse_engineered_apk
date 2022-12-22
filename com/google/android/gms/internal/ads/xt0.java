package com.google.android.gms.internal.ads;

public final class xt0 implements r40, d60 {
  private static final Object b = new Object();
  
  private static int c;
  
  private final gu0 d;
  
  public xt0(gu0 paramgu0) {
    this.d = paramgu0;
  }
  
  private static boolean a() {
    synchronized (b) {
      boolean bool;
      int i = c;
      x<Integer> x = m0.Q4;
      if (i < ((Integer)er2.e().c((x)x)).intValue()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  private final void b(boolean paramBoolean) {
    x<Boolean> x = m0.P4;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return; 
    if (!a())
      return; 
    this.d.f(paramBoolean);
    synchronized (b) {
      c++;
      return;
    } 
  }
  
  public final void E(zzvg paramzzvg) {
    b(false);
  }
  
  public final void i() {
    b(true);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */