package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class ro0 {
  private final String a;
  
  protected final Map<String, String> b;
  
  private final Executor c;
  
  protected final em d;
  
  private final boolean e;
  
  private final an1 f;
  
  protected ro0(Executor paramExecutor, em paramem, an1 paraman1) {
    boolean bool;
    this.a = c2.b.a();
    this.b = new HashMap<String, String>();
    this.c = paramExecutor;
    this.d = paramem;
    x<Boolean> x = m0.D1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      x = m0.E1;
      bool = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    } else if (er2.h().nextFloat() <= ((Double)c2.a.a()).doubleValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.e = bool;
    this.f = paraman1;
  }
  
  protected abstract void a();
  
  public final void b(Map<String, String> paramMap) {
    String str = c(paramMap);
    if (this.e)
      this.c.execute(new uo0(this, str)); 
    b1.m(str);
  }
  
  protected final String c(Map<String, String> paramMap) {
    return this.f.a(paramMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ro0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */