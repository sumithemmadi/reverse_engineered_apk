package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.List;

public final class vj0 extends d4 {
  private final String b;
  
  private final ff0 c;
  
  private final pf0 d;
  
  public vj0(String paramString, ff0 paramff0, pf0 parampf0) {
    this.b = paramString;
    this.c = paramff0;
    this.d = parampf0;
  }
  
  public final String B() {
    return this.d.b();
  }
  
  public final void G(Bundle paramBundle) {
    this.c.G(paramBundle);
  }
  
  public final boolean T(Bundle paramBundle) {
    return this.c.K(paramBundle);
  }
  
  public final String a() {
    return this.b;
  }
  
  public final void c0(Bundle paramBundle) {
    this.c.J(paramBundle);
  }
  
  public final Bundle d() {
    return this.d.f();
  }
  
  public final void destroy() {
    this.c.a();
  }
  
  public final a e() {
    return this.d.c0();
  }
  
  public final String f() {
    return this.d.g();
  }
  
  public final f3 g() {
    return this.d.b0();
  }
  
  public final nt2 getVideoController() {
    return this.d.n();
  }
  
  public final String h() {
    return this.d.d();
  }
  
  public final String j() {
    return this.d.c();
  }
  
  public final List<?> k() {
    return this.d.h();
  }
  
  public final m3 k1() {
    return this.d.d0();
  }
  
  public final a v() {
    return b.a2(this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */