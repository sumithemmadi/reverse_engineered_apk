package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class lm1 implements mm1 {
  private final Executor a;
  
  private final em b;
  
  public lm1(Executor paramExecutor, em paramem) {
    this.a = paramExecutor;
    this.b = paramem;
  }
  
  public final void a(String paramString) {
    this.a.execute(new om1(this, paramString));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */