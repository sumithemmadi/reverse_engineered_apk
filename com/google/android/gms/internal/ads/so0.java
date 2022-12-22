package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class so0 extends ro0 {
  private final ym1 g;
  
  public so0(Executor paramExecutor, em paramem, ym1 paramym1, an1 paraman1) {
    super(paramExecutor, paramem, paraman1);
    this.g = paramym1;
    super.a();
  }
  
  protected final void a() {
    this.g.a(this.b);
  }
  
  public final Map<String, String> d() {
    return new HashMap<String, String>(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/so0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */