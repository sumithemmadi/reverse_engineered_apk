package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.measurement.a.a;
import java.util.List;
import java.util.Map;

public final class eb extends ns {
  private final a b;
  
  eb(a parama) {
    this.b = parama;
  }
  
  public final Bundle B3(Bundle paramBundle) {
    return this.b.p(paramBundle);
  }
  
  public final void B9(String paramString) {
    this.b.c(paramString);
  }
  
  public final void F6(a parama, String paramString1, String paramString2) {
    a a1 = this.b;
    if (parama != null) {
      Activity activity = (Activity)b.o1(parama);
    } else {
      parama = null;
    } 
    a1.t((Activity)parama, paramString1, paramString2);
  }
  
  public final void L0(String paramString1, String paramString2, Bundle paramBundle) {
    this.b.n(paramString1, paramString2, paramBundle);
  }
  
  public final void N1(Bundle paramBundle) {
    this.b.o(paramBundle);
  }
  
  public final long O3() {
    return this.b.d();
  }
  
  public final Map T5(String paramString1, String paramString2, boolean paramBoolean) {
    return this.b.m(paramString1, paramString2, paramBoolean);
  }
  
  public final void X8(Bundle paramBundle) {
    this.b.s(paramBundle);
  }
  
  public final String Y3() {
    return this.b.i();
  }
  
  public final List a7(String paramString1, String paramString2) {
    return this.b.g(paramString1, paramString2);
  }
  
  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle) {
    this.b.b(paramString1, paramString2, paramBundle);
  }
  
  public final String e7() {
    return this.b.h();
  }
  
  public final String g6() {
    return this.b.e();
  }
  
  public final void h7(Bundle paramBundle) {
    this.b.r(paramBundle);
  }
  
  public final int k5(String paramString) {
    return this.b.l(paramString);
  }
  
  public final String m3() {
    return this.b.f();
  }
  
  public final String o6() {
    return this.b.j();
  }
  
  public final void p8(String paramString1, String paramString2, a parama) {
    a a1 = this.b;
    if (parama != null) {
      Object object = b.o1(parama);
    } else {
      parama = null;
    } 
    a1.u(paramString1, paramString2, parama);
  }
  
  public final void q8(String paramString) {
    this.b.a(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */