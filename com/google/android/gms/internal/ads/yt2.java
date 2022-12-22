package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.doubleclick.a;
import com.google.android.gms.ads.doubleclick.c;
import com.google.android.gms.ads.doubleclick.d;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.y.a;
import com.google.android.gms.ads.y.d;

public final class yt2 {
  private final nb a = new nb();
  
  private final Context b;
  
  private final lq2 c;
  
  private b d;
  
  private bq2 e;
  
  private xr2 f;
  
  private String g;
  
  private a h;
  
  private a i;
  
  private c j;
  
  private d k;
  
  private boolean l;
  
  private Boolean m;
  
  private o n;
  
  public yt2(Context paramContext) {
    this(paramContext, lq2.a, null);
  }
  
  private yt2(Context paramContext, lq2 paramlq2, d paramd) {
    this.b = paramContext;
    this.c = paramlq2;
  }
  
  private final void k(String paramString) {
    if (this.f != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 63);
    stringBuilder.append("The ad unit ID must be set on InterstitialAd before ");
    stringBuilder.append(paramString);
    stringBuilder.append(" is called.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final Bundle a() {
    try {
      xr2 xr21 = this.f;
      if (xr21 != null)
        return xr21.H(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
    } 
    return new Bundle();
  }
  
  public final boolean b() {
    try {
      xr2 xr21 = this.f;
      return (xr21 == null) ? false : xr21.m();
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return false;
    } 
  }
  
  public final void c(b paramb) {
    try {
      this.d = paramb;
      xr2 xr21 = this.f;
      if (xr21 != null) {
        if (paramb != null) {
          eq2 eq22 = new eq2();
          this(paramb);
          eq2 eq21 = eq22;
        } else {
          paramb = null;
        } 
        xr21.U6((jr2)paramb);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void d(a parama) {
    try {
      this.h = parama;
      xr2 xr21 = this.f;
      if (xr21 != null) {
        if (parama != null) {
          hq2 hq22 = new hq2();
          this(parama);
          hq2 hq21 = hq22;
        } else {
          parama = null;
        } 
        xr21.b1((es2)parama);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void e(String paramString) {
    if (this.g == null) {
      this.g = paramString;
      return;
    } 
    throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
  }
  
  public final void f(boolean paramBoolean) {
    try {
      this.m = Boolean.valueOf(paramBoolean);
      xr2 xr21 = this.f;
      if (xr21 != null)
        xr21.o(paramBoolean); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void g(d paramd) {
    try {
      this.k = paramd;
      xr2 xr21 = this.f;
      if (xr21 != null) {
        if (paramd != null) {
          bi bi2 = new bi();
          this(paramd);
          bi bi1 = bi2;
        } else {
          paramd = null;
        } 
        xr21.K0((uh)paramd);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void h() {
    try {
      k("show");
      this.f.showInterstitial();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void i(bq2 parambq2) {
    try {
      this.e = parambq2;
      xr2 xr21 = this.f;
      if (xr21 != null) {
        if (parambq2 != null) {
          aq2 aq22 = new aq2();
          this(parambq2);
          aq2 aq21 = aq22;
        } else {
          parambq2 = null;
        } 
        xr21.i4((ir2)parambq2);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void j(ut2 paramut2) {
    try {
      if (this.f == null) {
        zzvs zzvs;
        if (this.g == null)
          k("loadAd"); 
        if (this.l) {
          zzvs = zzvs.s0();
        } else {
          zzvs = new zzvs();
        } 
        xr2 xr21 = er2.b().i(this.b, zzvs, this.g, this.a);
        this.f = xr21;
        if (this.d != null) {
          eq2 eq2 = new eq2();
          this(this.d);
          xr21.U6(eq2);
        } 
        if (this.e != null) {
          xr2 xr22 = this.f;
          aq2 aq2 = new aq2();
          this(this.e);
          xr22.i4(aq2);
        } 
        if (this.h != null) {
          xr21 = this.f;
          hq2 hq2 = new hq2();
          this(this.h);
          xr21.b1(hq2);
        } 
        if (this.i != null) {
          xr2 xr22 = this.f;
          pq2 pq2 = new pq2();
          this(this.i);
          xr22.y6(pq2);
        } 
        if (this.j != null) {
          xr2 xr22 = this.f;
          j1 j1 = new j1();
          this(this.j);
          xr22.d9(j1);
        } 
        if (this.k != null) {
          xr2 xr22 = this.f;
          bi bi = new bi();
          this(this.k);
          xr22.K0(bi);
        } 
        xr21 = this.f;
        o o1 = new o();
        this(this.n);
        xr21.U(o1);
        Boolean bool = this.m;
        if (bool != null)
          this.f.o(bool.booleanValue()); 
      } 
      if (this.f.o7(lq2.a(this.b, paramut2)))
        this.a.V9(paramut2.p()); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void l(boolean paramBoolean) {
    this.l = true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */