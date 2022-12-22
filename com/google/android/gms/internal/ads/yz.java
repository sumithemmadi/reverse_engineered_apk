package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class yz extends qy {
  private final h5 h;
  
  private final Runnable i;
  
  private final Executor j;
  
  public yz(s00 params00, h5 paramh5, Runnable paramRunnable, Executor paramExecutor) {
    super(params00);
    this.h = paramh5;
    this.i = paramRunnable;
    this.j = paramExecutor;
  }
  
  public final void b() {
    b00 b00 = new b00(new AtomicReference<Runnable>(this.i));
    this.j.execute(new a00(this, b00));
  }
  
  public final nt2 g() {
    return null;
  }
  
  public final void h(ViewGroup paramViewGroup, zzvs paramzzvs) {}
  
  public final qh1 i() {
    return null;
  }
  
  public final View j() {
    return null;
  }
  
  public final qh1 k() {
    return null;
  }
  
  public final int l() {
    return 0;
  }
  
  public final void m() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */