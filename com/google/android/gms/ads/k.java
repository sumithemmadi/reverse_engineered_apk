package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.y.a;
import com.google.android.gms.ads.y.d;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.yt2;

@Deprecated
public final class k {
  private final yt2 a;
  
  public k(Context paramContext) {
    this.a = new yt2(paramContext);
    t.k(paramContext, "Context cannot be null");
  }
  
  public final Bundle a() {
    return this.a.a();
  }
  
  public final boolean b() {
    return this.a.b();
  }
  
  public final void c(e parame) {
    this.a.j(parame.a());
  }
  
  public final void d(b paramb) {
    this.a.c(paramb);
    if (paramb != null && paramb instanceof bq2) {
      this.a.i((bq2)paramb);
      return;
    } 
    if (paramb == null)
      this.a.i(null); 
  }
  
  public final void e(a parama) {
    this.a.d(parama);
  }
  
  public final void f(String paramString) {
    this.a.e(paramString);
  }
  
  public final void g(boolean paramBoolean) {
    this.a.f(paramBoolean);
  }
  
  public final void h(d paramd) {
    this.a.g(paramd);
  }
  
  public final void i() {
    this.a.h();
  }
  
  public final void j(boolean paramBoolean) {
    this.a.l(true);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */