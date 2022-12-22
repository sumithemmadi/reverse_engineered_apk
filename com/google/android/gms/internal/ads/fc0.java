package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class fc0 {
  private final od0 a;
  
  private final tq b;
  
  public fc0(od0 paramod0) {
    this(paramod0, null);
  }
  
  public fc0(od0 paramod0, tq paramtq) {
    this.a = paramod0;
    this.b = paramtq;
  }
  
  public final tq a() {
    return this.b;
  }
  
  public final od0 b() {
    return this.a;
  }
  
  public final View c() {
    tq tq1 = this.b;
    return (View)((tq1 != null) ? tq1.getWebView() : null);
  }
  
  public final View d() {
    tq tq1 = this.b;
    return (View)((tq1 == null) ? null : tq1.getWebView());
  }
  
  public final gb0<r80> e(Executor paramExecutor) {
    return new gb0<r80>(new ic0(this.b), paramExecutor);
  }
  
  public Set<gb0<m40>> f(k30 paramk30) {
    return Collections.singleton(gb0.a(paramk30, fm.f));
  }
  
  public Set<gb0<ua0>> g(k30 paramk30) {
    return Collections.singleton(gb0.a(paramk30, fm.f));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */