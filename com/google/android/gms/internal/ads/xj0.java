package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b.e.a;
import b.e.g;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class xj0 extends h4 {
  private final Context b;
  
  private final pf0 c;
  
  private lg0 d;
  
  private ff0 e;
  
  public xj0(Context paramContext, pf0 parampf0, lg0 paramlg0, ff0 paramff0) {
    this.b = paramContext;
    this.c = parampf0;
    this.d = paramlg0;
    this.e = paramff0;
  }
  
  public final List<String> F5() {
    byte b4;
    byte b5;
    g<String, a3> g = this.c.I();
    g<String, String> g1 = this.c.K();
    String[] arrayOfString = new String[g.size() + g1.size()];
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    while (true) {
      b4 = b1;
      b5 = b3;
      if (b2 < g.size()) {
        arrayOfString[b3] = (String)g.i(b2);
        b2++;
        b3++;
        continue;
      } 
      break;
    } 
    while (b4 < g1.size()) {
      arrayOfString[b5] = (String)g1.i(b4);
      b4++;
      b5++;
    } 
    return Arrays.asList(arrayOfString);
  }
  
  public final boolean K5() {
    a a = this.c.H();
    if (a != null) {
      q.r().g(a);
      x<Boolean> x = m0.J3;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && this.c.G() != null)
        this.c.G().B("onSdkLoaded", (Map<String, ?>)new a()); 
      return true;
    } 
    cm.i("Trying to start OMID session before creation.");
    return false;
  }
  
  public final m3 K8(String paramString) {
    return (m3)this.c.I().get(paramString);
  }
  
  public final void O6(String paramString) {
    ff0 ff01 = this.e;
    if (ff01 != null)
      ff01.I(paramString); 
  }
  
  public final void d4(a parama) {
    Object object = b.o1(parama);
    if (!(object instanceof View))
      return; 
    if (this.c.H() == null)
      return; 
    ff0 ff01 = this.e;
    if (ff01 != null)
      ff01.s((View)object); 
  }
  
  public final void destroy() {
    ff0 ff01 = this.e;
    if (ff01 != null)
      ff01.a(); 
    this.e = null;
    this.d = null;
  }
  
  public final String f3(String paramString) {
    return (String)this.c.K().get(paramString);
  }
  
  public final boolean f7() {
    ff0 ff01 = this.e;
    return (ff01 != null && !ff01.w()) ? false : ((this.c.G() == null) ? false : (!(this.c.F() != null)));
  }
  
  public final nt2 getVideoController() {
    return this.c.n();
  }
  
  public final boolean h5(a parama) {
    boolean bool;
    Object object = b.o1(parama);
    if (!(object instanceof ViewGroup))
      return false; 
    lg0 lg01 = this.d;
    if (lg01 != null && lg01.c((ViewGroup)object)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      return false; 
    this.c.F().R(new wj0(this));
    return true;
  }
  
  public final a h8() {
    return b.a2(this.b);
  }
  
  public final void q() {
    ff0 ff01 = this.e;
    if (ff01 != null)
      ff01.u(); 
  }
  
  public final void q4() {
    String str = this.c.J();
    if ("Google".equals(str)) {
      cm.i("Illegal argument specified for omid partner name.");
      return;
    } 
    ff0 ff01 = this.e;
    if (ff01 != null)
      ff01.L(str, false); 
  }
  
  public final String u0() {
    return this.c.e();
  }
  
  public final a v() {
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */