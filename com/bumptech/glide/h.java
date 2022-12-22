package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.o.a;
import com.bumptech.glide.p.e;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.k;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.b;
import com.bumptech.glide.request.c;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.g;
import com.bumptech.glide.request.h.h;
import com.bumptech.glide.request.h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class h<TranscodeType> extends a<h<TranscodeType>> implements Cloneable {
  protected static final e B = (e)((e)((e)(new e()).l(h.c)).d0(Priority.e)).k0(true);
  
  private final Context C;
  
  private final i D;
  
  private final Class<TranscodeType> E;
  
  private final c F;
  
  private final e G;
  
  private j<?, ? super TranscodeType> H;
  
  private Object I;
  
  private List<d<TranscodeType>> J;
  
  private h<TranscodeType> K;
  
  private h<TranscodeType> L;
  
  private Float M;
  
  private boolean N = true;
  
  private boolean O;
  
  private boolean P;
  
  @SuppressLint({"CheckResult"})
  protected h(c paramc, i parami, Class<TranscodeType> paramClass, Context paramContext) {
    this.F = paramc;
    this.D = parami;
    this.E = paramClass;
    this.C = paramContext;
    this.H = parami.o(paramClass);
    this.G = paramc.i();
    y0(parami.m());
    r0((a<?>)parami.n());
  }
  
  private <Y extends h<TranscodeType>> Y A0(Y paramY, d<TranscodeType> paramd, a<?> parama, Executor paramExecutor) {
    j.d(paramY);
    if (this.O) {
      c c2 = s0((h<TranscodeType>)paramY, paramd, parama, paramExecutor);
      c c1 = paramY.f();
      if (c2.d(c1) && !D0(parama, c1)) {
        if (!((c)j.d(c1)).isRunning())
          c1.h(); 
        return paramY;
      } 
      this.D.l((h<?>)paramY);
      paramY.c(c2);
      this.D.y((h<?>)paramY, c2);
      return paramY;
    } 
    throw new IllegalArgumentException("You must call #load() before calling #into()");
  }
  
  private boolean D0(a<?> parama, c paramc) {
    boolean bool;
    if (!parama.L() && paramc.j()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private h<TranscodeType> I0(Object paramObject) {
    if (K())
      return v0().I0(paramObject); 
    this.I = paramObject;
    this.O = true;
    return (h<TranscodeType>)g0();
  }
  
  private c J0(Object paramObject, h<TranscodeType> paramh, d<TranscodeType> paramd, a<?> parama, RequestCoordinator paramRequestCoordinator, j<?, ? super TranscodeType> paramj, Priority paramPriority, int paramInt1, int paramInt2, Executor paramExecutor) {
    Context context = this.C;
    e e1 = this.G;
    return (c)SingleRequest.x(context, e1, paramObject, this.I, this.E, parama, paramInt1, paramInt2, paramPriority, paramh, paramd, this.J, paramRequestCoordinator, e1.f(), paramj.b(), paramExecutor);
  }
  
  private c s0(h<TranscodeType> paramh, d<TranscodeType> paramd, a<?> parama, Executor paramExecutor) {
    return t0(new Object(), paramh, paramd, null, this.H, parama.C(), parama.z(), parama.y(), parama, paramExecutor);
  }
  
  private c t0(Object paramObject, h<TranscodeType> paramh, d<TranscodeType> paramd, RequestCoordinator paramRequestCoordinator, j<?, ? super TranscodeType> paramj, Priority paramPriority, int paramInt1, int paramInt2, a<?> parama, Executor paramExecutor) {
    b b1;
    b b2;
    if (this.L != null) {
      b2 = new b(paramObject, paramRequestCoordinator);
      b1 = b2;
    } else {
      b b = null;
      b2 = b1;
      b1 = b;
    } 
    c c1 = u0(paramObject, paramh, paramd, (RequestCoordinator)b2, paramj, paramPriority, paramInt1, paramInt2, parama, paramExecutor);
    if (b1 == null)
      return c1; 
    int k = this.L.z();
    int m = this.L.y();
    int n = k;
    int i1 = m;
    if (k.s(paramInt1, paramInt2)) {
      n = k;
      i1 = m;
      if (!this.L.T()) {
        n = parama.z();
        i1 = parama.y();
      } 
    } 
    h<TranscodeType> h1 = this.L;
    b1.p(c1, h1.t0(paramObject, paramh, paramd, (RequestCoordinator)b1, h1.H, h1.C(), n, i1, this.L, paramExecutor));
    return (c)b1;
  }
  
  private c u0(Object paramObject, h<TranscodeType> paramh, d<TranscodeType> paramd, RequestCoordinator paramRequestCoordinator, j<?, ? super TranscodeType> paramj, Priority paramPriority, int paramInt1, int paramInt2, a<?> parama, Executor paramExecutor) {
    g g;
    c c1;
    h<TranscodeType> h1;
    h<TranscodeType> h2 = this.K;
    if (h2 != null) {
      if (!this.P) {
        Priority priority;
        j<?, ? super TranscodeType> j1 = h2.H;
        if (h2.N)
          j1 = paramj; 
        if (h2.M()) {
          priority = this.K.C();
        } else {
          priority = x0(paramPriority);
        } 
        int k = this.K.z();
        int m = this.K.y();
        int n = k;
        int i1 = m;
        if (k.s(paramInt1, paramInt2)) {
          n = k;
          i1 = m;
          if (!this.K.T()) {
            n = parama.z();
            i1 = parama.y();
          } 
        } 
        g = new g(paramObject, paramRequestCoordinator);
        c1 = J0(paramObject, paramh, paramd, parama, (RequestCoordinator)g, paramj, paramPriority, paramInt1, paramInt2, paramExecutor);
        this.P = true;
        h1 = this.K;
        paramObject = h1.t0(paramObject, paramh, paramd, (RequestCoordinator)g, j1, priority, n, i1, h1, paramExecutor);
        this.P = false;
        g.o(c1, (c)paramObject);
        return (c)g;
      } 
      throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
    } 
    if (this.M != null) {
      g = new g(paramObject, (RequestCoordinator)g);
      g.o(J0(paramObject, paramh, paramd, parama, (RequestCoordinator)g, (j<?, ? super TranscodeType>)c1, (Priority)h1, paramInt1, paramInt2, paramExecutor), J0(paramObject, paramh, paramd, parama.i().j0(this.M.floatValue()), (RequestCoordinator)g, (j<?, ? super TranscodeType>)c1, x0((Priority)h1), paramInt1, paramInt2, paramExecutor));
      return (c)g;
    } 
    return J0(paramObject, paramh, paramd, parama, (RequestCoordinator)g, (j<?, ? super TranscodeType>)c1, (Priority)h1, paramInt1, paramInt2, paramExecutor);
  }
  
  private Priority x0(Priority paramPriority) {
    int k = a.b[paramPriority.ordinal()];
    if (k != 1) {
      if (k != 2) {
        if (k == 3 || k == 4)
          return Priority.b; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unknown priority: ");
        stringBuilder.append(C());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return Priority.c;
    } 
    return Priority.d;
  }
  
  @SuppressLint({"CheckResult"})
  private void y0(List<d<Object>> paramList) {
    Iterator<d<Object>> iterator = paramList.iterator();
    while (iterator.hasNext())
      q0((d<TranscodeType>)iterator.next()); 
  }
  
  <Y extends h<TranscodeType>> Y B0(Y paramY, d<TranscodeType> paramd, Executor paramExecutor) {
    return A0(paramY, paramd, this, paramExecutor);
  }
  
  public i<ImageView, TranscodeType> C0(ImageView paramImageView) {
    k.a();
    j.d(paramImageView);
    if (!S() && Q() && paramImageView.getScaleType() != null) {
      a<?> a1;
      switch (a.a[paramImageView.getScaleType().ordinal()]) {
        case 6:
          a1 = super.i().W();
          return A0(this.G.a(paramImageView, this.E), null, a1, e.b());
        case 3:
        case 4:
        case 5:
          a1 = super.i().X();
          return A0(this.G.a(paramImageView, this.E), null, a1, e.b());
        case 2:
          a1 = super.i().W();
          return A0(this.G.a(paramImageView, this.E), null, a1, e.b());
        case 1:
          a1 = super.i().V();
          return A0(this.G.a(paramImageView, this.E), null, a1, e.b());
      } 
    } 
    h<?> h1 = this;
    return A0(this.G.a(paramImageView, this.E), null, h1, e.b());
  }
  
  public h<TranscodeType> E0(Uri paramUri) {
    return I0(paramUri);
  }
  
  public h<TranscodeType> F0(Integer paramInteger) {
    return I0(paramInteger).r0((a<?>)e.s0(a.c(this.C)));
  }
  
  public h<TranscodeType> G0(Object paramObject) {
    return I0(paramObject);
  }
  
  public h<TranscodeType> H0(String paramString) {
    return I0(paramString);
  }
  
  public h<TranscodeType> q0(d<TranscodeType> paramd) {
    if (K())
      return v0().q0(paramd); 
    if (paramd != null) {
      if (this.J == null)
        this.J = new ArrayList<d<TranscodeType>>(); 
      this.J.add(paramd);
    } 
    return (h<TranscodeType>)g0();
  }
  
  public h<TranscodeType> r0(a<?> parama) {
    j.d(parama);
    return (h<TranscodeType>)super.a(parama);
  }
  
  public h<TranscodeType> v0() {
    h<TranscodeType> h1 = (h)super.i();
    h1.H = (j<?, ? super TranscodeType>)h1.H.a();
    if (h1.J != null)
      h1.J = new ArrayList<d<TranscodeType>>(h1.J); 
    h<TranscodeType> h2 = h1.K;
    if (h2 != null)
      h1.K = h2.v0(); 
    h2 = h1.L;
    if (h2 != null)
      h1.L = h2.v0(); 
    return h1;
  }
  
  public h<TranscodeType> w0(h<TranscodeType> paramh) {
    if (K())
      return v0().w0(paramh); 
    this.L = paramh;
    return (h<TranscodeType>)g0();
  }
  
  public <Y extends h<TranscodeType>> Y z0(Y paramY) {
    return B0(paramY, null, e.b());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */