package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class kb2 implements Callable {
  private final String a = getClass().getSimpleName();
  
  protected final z92 b;
  
  private final String c;
  
  private final String d;
  
  protected final zzcf$zza.a e;
  
  protected Method f;
  
  private final int g;
  
  private final int h;
  
  public kb2(z92 paramz92, String paramString1, String paramString2, zzcf$zza.a parama, int paramInt1, int paramInt2) {
    this.b = paramz92;
    this.c = paramString1;
    this.d = paramString2;
    this.e = parama;
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  protected abstract void a();
  
  public Void b() {
    try {
      long l = System.nanoTime();
      Method method = this.b.e(this.c, this.d);
      this.f = method;
      if (method == null)
        return null; 
      a();
      lq1 lq1 = this.b.w();
      if (lq1 != null) {
        int i = this.g;
        if (i != Integer.MIN_VALUE)
          lq1.b(this.h, i, (System.nanoTime() - l) / 1000L); 
      } 
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {}
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */