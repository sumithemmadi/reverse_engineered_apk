package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.a;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.doubleclick.a;
import com.google.android.gms.ads.doubleclick.c;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.s;
import com.google.android.gms.ads.t;
import com.google.android.gms.ads.u;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.concurrent.atomic.AtomicBoolean;

public final class wt2 {
  private final nb a = new nb();
  
  private final lq2 b;
  
  private final AtomicBoolean c;
  
  private final t d = new t();
  
  private final gr2 e = new vt2(this);
  
  private bq2 f;
  
  private b g;
  
  private f[] h;
  
  private a i;
  
  private a j;
  
  private xr2 k;
  
  private c l;
  
  private u m;
  
  private String n;
  
  private ViewGroup o;
  
  private int p;
  
  private boolean q;
  
  private o r;
  
  public wt2(ViewGroup paramViewGroup) {
    this(paramViewGroup, null, false, lq2.a, 0);
  }
  
  public wt2(ViewGroup paramViewGroup, int paramInt) {
    this(paramViewGroup, null, false, lq2.a, paramInt);
  }
  
  public wt2(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean) {
    this(paramViewGroup, paramAttributeSet, paramBoolean, lq2.a, 0);
  }
  
  public wt2(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, int paramInt) {
    this(paramViewGroup, paramAttributeSet, false, lq2.a, paramInt);
  }
  
  private wt2(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, lq2 paramlq2, int paramInt) {
    this(paramViewGroup, paramAttributeSet, paramBoolean, paramlq2, null, paramInt);
  }
  
  private wt2(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, lq2 paramlq2, xr2 paramxr2, int paramInt) {
    this.o = paramViewGroup;
    this.b = paramlq2;
    this.k = null;
    this.c = new AtomicBoolean(false);
    this.p = paramInt;
    if (paramAttributeSet != null) {
      Context context = paramViewGroup.getContext();
      try {
        zzvz zzvz = new zzvz();
        this(context, paramAttributeSet);
        this.h = zzvz.c(paramBoolean);
        this.n = zzvz.a();
        if (paramViewGroup.isInEditMode()) {
          zzvs zzvs;
          sl sl = er2.a();
          f f1 = this.h[0];
          paramInt = this.p;
          if (f1.equals(f.i)) {
            zzvs = zzvs.u0();
          } else {
            zzvs = new zzvs(context, (f)zzvs);
            zzvs.k = B(paramInt);
          } 
          sl.e(paramViewGroup, zzvs, "Ads by Google");
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        er2.a().g(paramViewGroup, new zzvs(context, f.a), illegalArgumentException.getMessage(), illegalArgumentException.getMessage());
      } 
    } 
  }
  
  private static boolean B(int paramInt) {
    return (paramInt == 1);
  }
  
  private static zzvs w(Context paramContext, f[] paramArrayOff, int paramInt) {
    int i = paramArrayOff.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (paramArrayOff[b1].equals(f.i))
        return zzvs.u0(); 
    } 
    zzvs zzvs = new zzvs(paramContext, paramArrayOff);
    zzvs.k = B(paramInt);
    return zzvs;
  }
  
  public final void A(f... paramVarArgs) {
    this.h = paramVarArgs;
    try {
      xr2 xr21 = this.k;
      if (xr21 != null)
        xr21.n5(w(this.o.getContext(), this.h, this.p)); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
    } 
    this.o.requestLayout();
  }
  
  public final nt2 C() {
    xr2 xr21 = this.k;
    if (xr21 == null)
      return null; 
    try {
      return xr21.getVideoController();
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final a D() {
    return this.j;
  }
  
  public final void a() {
    try {
      xr2 xr21 = this.k;
      if (xr21 != null)
        xr21.destroy(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final b b() {
    return this.g;
  }
  
  public final f c() {
    try {
      xr2 xr21 = this.k;
      if (xr21 != null) {
        zzvs zzvs = xr21.L9();
        if (zzvs != null)
          return zzvs.v0(); 
      } 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
    } 
    f[] arrayOfF = this.h;
    return (arrayOfF != null) ? arrayOfF[0] : null;
  }
  
  public final f[] d() {
    return this.h;
  }
  
  public final String e() {
    if (this.n == null) {
      xr2 xr21 = this.k;
      if (xr21 != null)
        try {
          this.n = xr21.E8();
        } catch (RemoteException remoteException) {
          cm.f("#007 Could not call remote method.", (Throwable)remoteException);
        }  
    } 
    return this.n;
  }
  
  public final a f() {
    return this.i;
  }
  
  public final String g() {
    try {
      xr2 xr21 = this.k;
      if (xr21 != null)
        return xr21.X0(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
    } 
    return null;
  }
  
  public final c h() {
    return this.l;
  }
  
  public final s i() {
    ht2 ht22;
    ht2 ht21 = null;
    try {
      xr2 xr21 = this.k;
      ht22 = ht21;
      if (xr21 != null)
        ht22 = xr21.p(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      ht22 = ht21;
    } 
    return s.c(ht22);
  }
  
  public final t j() {
    return this.d;
  }
  
  public final u k() {
    return this.m;
  }
  
  public final void l() {
    try {
      xr2 xr21 = this.k;
      if (xr21 != null)
        xr21.pause(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void m() {
    try {
      xr2 xr21 = this.k;
      if (xr21 != null)
        xr21.J(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void n(b paramb) {
    this.g = paramb;
    this.e.L(paramb);
  }
  
  public final void o(f... paramVarArgs) {
    if (this.h == null) {
      A(paramVarArgs);
      return;
    } 
    throw new IllegalStateException("The ad size can only be set once on AdView.");
  }
  
  public final void p(String paramString) {
    if (this.n == null) {
      this.n = paramString;
      return;
    } 
    throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
  }
  
  public final void q(a parama) {
    try {
      this.i = parama;
      xr2 xr21 = this.k;
      if (xr21 != null) {
        if (parama != null) {
          jl2 jl22 = new jl2();
          this(parama);
          jl2 jl21 = jl22;
        } else {
          parama = null;
        } 
        xr21.y6((fs2)parama);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void r(boolean paramBoolean) {
    this.q = paramBoolean;
    try {
      xr2 xr21 = this.k;
      if (xr21 != null)
        xr21.c2(paramBoolean); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void s(c paramc) {
    this.l = paramc;
    try {
      xr2 xr21 = this.k;
      if (xr21 != null) {
        if (paramc != null) {
          j1 j12 = new j1();
          this(paramc);
          j1 j11 = j12;
        } else {
          paramc = null;
        } 
        xr21.d9((i1)paramc);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void t(o paramo) {
    try {
      this.r = paramo;
      xr2 xr21 = this.k;
      if (xr21 != null) {
        o o1 = new o();
        this(paramo);
        xr21.U(o1);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#008 Must be called on the main UI thread.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void u(u paramu) {
    this.m = paramu;
    try {
      xr2 xr21 = this.k;
      if (xr21 != null) {
        zzaau zzaau;
        if (paramu == null) {
          paramu = null;
        } else {
          zzaau = new zzaau(paramu);
        } 
        xr21.K2(zzaau);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void x(a parama) {
    try {
      this.j = parama;
      xr2 xr21 = this.k;
      if (xr21 != null) {
        if (parama != null) {
          pq2 pq2 = new pq2();
          this(this.j);
        } else {
          parama = null;
        } 
        xr21.y6((fs2)parama);
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void y(bq2 parambq2) {
    try {
      this.f = parambq2;
      xr2 xr21 = this.k;
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
  
  public final void z(ut2 paramut2) {
    try {
      IllegalStateException illegalStateException;
      xr2 xr21 = this.k;
      if (xr21 == null)
        if ((this.h != null && this.n != null) || xr21 != null) {
          xr2 xr22;
          Context context = this.o.getContext();
          zzvs zzvs = w(context, this.h, this.p);
          if ("search_v2".equals(zzvs.b)) {
            sq2 sq2 = er2.b();
            String str = this.n;
            xq2 xq2 = new xq2();
            this(sq2, context, zzvs, str);
            xr22 = xq2.b(context, false);
          } else {
            sq2 sq2 = er2.b();
            String str = this.n;
            nb nb1 = this.a;
            rq2 rq2 = new rq2();
            this(sq2, context, (zzvs)xr22, str, nb1);
            xr22 = rq2.b(context, false);
          } 
          this.k = xr22;
          eq2 eq2 = new eq2();
          this(this.e);
          xr22.U6(eq2);
          if (this.f != null) {
            xr2 xr24 = this.k;
            aq2 aq2 = new aq2();
            this(this.f);
            xr24.i4(aq2);
          } 
          if (this.i != null) {
            xr22 = this.k;
            jl2 jl2 = new jl2();
            this(this.i);
            xr22.y6(jl2);
          } 
          if (this.j != null) {
            xr22 = this.k;
            pq2 pq2 = new pq2();
            this(this.j);
            xr22.y6(pq2);
          } 
          if (this.l != null) {
            xr2 xr24 = this.k;
            j1 j1 = new j1();
            this(this.l);
            xr24.d9(j1);
          } 
          if (this.m != null) {
            xr22 = this.k;
            zzaau zzaau = new zzaau();
            this(this.m);
            xr22.K2(zzaau);
          } 
          xr2 xr23 = this.k;
          o o1 = new o();
          this(this.r);
          xr23.U(o1);
          this.k.c2(this.q);
          try {
            a a1 = this.k.Z2();
            if (a1 != null)
              this.o.addView((View)b.o1(a1)); 
          } catch (RemoteException remoteException) {
            cm.f("#007 Could not call remote method.", (Throwable)remoteException);
          } 
        } else {
          illegalStateException = new IllegalStateException();
          this("The ad size and ad unit ID must be set before loadAd is called.");
          throw illegalStateException;
        }  
      if (this.k.o7(lq2.a(this.o.getContext(), (ut2)illegalStateException)))
        this.a.V9(illegalStateException.p()); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */