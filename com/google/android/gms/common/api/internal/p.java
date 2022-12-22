package com.google.android.gms.common.api.internal;

import android.app.Activity;
import b.e.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.t;

public class p extends p0 {
  private final b<b<?>> g = new b();
  
  private f h;
  
  private p(h paramh) {
    super(paramh);
    this.b.b("ConnectionlessLifecycleHelper", this);
  }
  
  public static void q(Activity paramActivity, f paramf, b<?> paramb) {
    h h = LifecycleCallback.c(paramActivity);
    p p2 = h.<p>d("ConnectionlessLifecycleHelper", p.class);
    p p1 = p2;
    if (p2 == null)
      p1 = new p(h); 
    p1.h = paramf;
    t.k(paramb, "ApiKey cannot be null");
    p1.g.add(paramb);
    paramf.f(p1);
  }
  
  private final void s() {
    if (!this.g.isEmpty())
      this.h.f(this); 
  }
  
  public void h() {
    super.h();
    s();
  }
  
  public void j() {
    super.j();
    s();
  }
  
  public void k() {
    super.k();
    this.h.j(this);
  }
  
  protected final void m(ConnectionResult paramConnectionResult, int paramInt) {
    this.h.c(paramConnectionResult, paramInt);
  }
  
  protected final void o() {
    this.h.w();
  }
  
  final b<b<?>> r() {
    return this.g;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */