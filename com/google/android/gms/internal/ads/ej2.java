package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class ej2 {
  private final ExecutorService a;
  
  private gj2<? extends fj2> b;
  
  private IOException c;
  
  public ej2(String paramString) {
    this.a = wj2.i(paramString);
  }
  
  public final boolean a() {
    return (this.b != null);
  }
  
  public final <T extends fj2> long b(T paramT, cj2<T> paramcj2, int paramInt) {
    boolean bool;
    Looper looper = Looper.myLooper();
    if (looper != null) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    long l = SystemClock.elapsedRealtime();
    (new gj2<fj2>(this, looper, (fj2)paramT, paramcj2, paramInt, l)).d(0L);
    return l;
  }
  
  public final void f(Runnable paramRunnable) {
    gj2<? extends fj2> gj21 = this.b;
    if (gj21 != null)
      gj21.e(true); 
    this.a.execute(paramRunnable);
    this.a.shutdown();
  }
  
  public final void h(int paramInt) {
    gj2<? extends fj2> gj21;
    IOException iOException = this.c;
    if (iOException == null) {
      gj21 = this.b;
      if (gj21 != null)
        gj21.c(gj21.d); 
      return;
    } 
    throw gj21;
  }
  
  public final void i() {
    this.b.e(false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ej2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */