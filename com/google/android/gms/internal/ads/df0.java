package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class df0 extends k3 {
  private final pf0 b;
  
  private a c;
  
  public df0(pf0 parampf0) {
    this.b = parampf0;
  }
  
  private final float S9() {
    try {
      return this.b.n().k0();
    } catch (RemoteException remoteException) {
      cm.c("Remote exception getting video controller aspect ratio.", (Throwable)remoteException);
      return 0.0F;
    } 
  }
  
  private static float T9(a parama) {
    float f1 = 0.0F;
    if (parama == null)
      return 0.0F; 
    Drawable drawable = (Drawable)b.o1(parama);
    float f2 = f1;
    if (drawable != null) {
      f2 = f1;
      if (drawable.getIntrinsicWidth() != -1) {
        f2 = f1;
        if (drawable.getIntrinsicHeight() != -1)
          f2 = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight(); 
      } 
    } 
    return f2;
  }
  
  public final void H3(z4 paramz4) {
    x<Boolean> x = m0.T4;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return; 
    if (this.b.n() instanceof lr)
      ((lr)this.b.n()).H3(paramz4); 
  }
  
  public final boolean O2() {
    x<Boolean> x = m0.T4;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? false : ((this.b.n() != null));
  }
  
  public final float P0() {
    x<Boolean> x = m0.T4;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? 0.0F : ((this.b.n() != null) ? this.b.n().P0() : 0.0F);
  }
  
  public final float getDuration() {
    x<Boolean> x = m0.T4;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? 0.0F : ((this.b.n() != null) ? this.b.n().getDuration() : 0.0F);
  }
  
  public final nt2 getVideoController() {
    x<Boolean> x = m0.T4;
    return !((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? null : this.b.n();
  }
  
  public final float k0() {
    float f;
    x<Boolean> x = m0.S4;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return 0.0F; 
    if (this.b.i() != 0.0F)
      return this.b.i(); 
    if (this.b.n() != null)
      return S9(); 
    a a1 = this.c;
    if (a1 != null)
      return T9(a1); 
    m3 m3 = this.b.C();
    if (m3 == null)
      return 0.0F; 
    if (m3.getWidth() != -1 && m3.getHeight() != -1) {
      f = m3.getWidth() / m3.getHeight();
    } else {
      f = 0.0F;
    } 
    return (f != 0.0F) ? f : T9(m3.D9());
  }
  
  public final a l6() {
    a a1 = this.c;
    if (a1 != null)
      return a1; 
    m3 m3 = this.b.C();
    return (m3 == null) ? null : m3.D9();
  }
  
  public final void n2(a parama) {
    x<Boolean> x = m0.v2;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      this.c = parama; 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/df0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */