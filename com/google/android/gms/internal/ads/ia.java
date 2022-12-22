package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ia {
  private final Object a = new Object();
  
  private final Object b = new Object();
  
  private ra c;
  
  private ra d;
  
  private static Context c(Context paramContext) {
    Context context = paramContext.getApplicationContext();
    return (context == null) ? paramContext : context;
  }
  
  public final ra a(Context paramContext, zzazn paramzzazn) {
    synchronized (this.b) {
      if (this.d == null) {
        ra ra1 = new ra();
        this(c(paramContext), paramzzazn, n2.b.a());
        this.d = ra1;
      } 
      return this.d;
    } 
  }
  
  public final ra b(Context paramContext, zzazn paramzzazn) {
    synchronized (this.a) {
      if (this.c == null) {
        ra ra1 = new ra();
        paramContext = c(paramContext);
        x<String> x = m0.a;
        this(paramContext, paramzzazn, er2.e().<String>c(x));
        this.c = ra1;
      } 
      return this.c;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */