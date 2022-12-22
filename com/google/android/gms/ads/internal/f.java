package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.jp1;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.mp1;
import com.google.android.gms.internal.ads.pn1;
import com.google.android.gms.internal.ads.qm1;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.uy1;
import com.google.android.gms.internal.ads.vo1;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.xr1;
import com.google.android.gms.internal.ads.zy0;
import com.google.android.gms.internal.ads.zzazn;
import com.google.android.gms.internal.ads.zzgp;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public final class f implements xr1, Runnable {
  private final List<Object[]> b = new Vector();
  
  private final AtomicReference<xr1> c = new AtomicReference<xr1>();
  
  private final AtomicReference<xr1> d = new AtomicReference<xr1>();
  
  private int e;
  
  private final boolean f;
  
  private final boolean g;
  
  private final Executor h;
  
  private final pn1 i;
  
  private Context j;
  
  private final Context k;
  
  private zzazn l;
  
  private final zzazn m;
  
  private CountDownLatch n = new CountDownLatch(1);
  
  public f(Context paramContext, zzazn paramzzazn) {
    this.j = paramContext;
    this.k = paramContext;
    this.l = paramzzazn;
    this.m = paramzzazn;
    ExecutorService executorService = Executors.newCachedThreadPool();
    this.h = executorService;
    pn1 pn11 = pn1.a(paramContext, executorService);
    this.i = pn11;
    x x2 = m0.J1;
    this.g = ((Boolean)er2.e().c(x2)).booleanValue();
    x2 = m0.L1;
    int j = ((Integer)er2.e().c(x2)).intValue();
    if (j != 1 && j != 2) {
      this.e = zy0.a;
    } else {
      this.e = zy0.b;
    } 
    vo1 vo1 = new vo1(this.j, pn11);
    i i = new i(this);
    Context context = this.j;
    zzgp zzgp = vo1.d();
    x x3 = m0.K1;
    this.f = (new jp1(context, zzgp, i, ((Boolean)er2.e().c(x3)).booleanValue())).i(mp1.a);
    x x1 = m0.a2;
    if (((Boolean)er2.e().c(x1)).booleanValue()) {
      fm.a.execute(this);
      return;
    } 
    er2.a();
    if (sl.w()) {
      fm.a.execute(this);
      return;
    } 
    run();
  }
  
  private final void j(xr1 paramxr1) {
    this.c.set(paramxr1);
  }
  
  private final xr1 m() {
    return (q() == zy0.b) ? this.d.get() : this.c.get();
  }
  
  private static Context n(Context paramContext) {
    Context context = paramContext.getApplicationContext();
    return (context == null) ? paramContext : context;
  }
  
  private final boolean o() {
    try {
      this.n.await();
      return true;
    } catch (InterruptedException interruptedException) {
      cm.d("Interrupted during GADSignals creation.", interruptedException);
      return false;
    } 
  }
  
  private final void p() {
    xr1 xr11 = m();
    if (!this.b.isEmpty() && xr11 != null) {
      for (Object[] arrayOfObject : this.b) {
        if (arrayOfObject.length == 1) {
          xr11.f((MotionEvent)arrayOfObject[0]);
          continue;
        } 
        if (arrayOfObject.length == 3)
          xr11.c(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue()); 
      } 
      this.b.clear();
    } 
  }
  
  private final int q() {
    return (this.g && !this.f) ? zy0.a : this.e;
  }
  
  public final String a(Context paramContext, String paramString, View paramView) {
    return g(paramContext, paramString, paramView, null);
  }
  
  public final void b(View paramView) {
    xr1 xr11 = m();
    if (xr11 != null)
      xr11.b(paramView); 
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3) {
    xr1 xr11 = m();
    if (xr11 != null) {
      p();
      xr11.c(paramInt1, paramInt2, paramInt3);
      return;
    } 
    this.b.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final String d(Context paramContext) {
    if (o()) {
      xr1 xr11 = m();
      if (xr11 != null) {
        p();
        return xr11.d(n(paramContext));
      } 
    } 
    return "";
  }
  
  public final String e(Context paramContext, View paramView, Activity paramActivity) {
    xr1 xr11 = m();
    return (xr11 != null) ? xr11.e(paramContext, paramView, paramActivity) : "";
  }
  
  public final void f(MotionEvent paramMotionEvent) {
    xr1 xr11 = m();
    if (xr11 != null) {
      p();
      xr11.f(paramMotionEvent);
      return;
    } 
    this.b.add(new Object[] { paramMotionEvent });
  }
  
  public final String g(Context paramContext, String paramString, View paramView, Activity paramActivity) {
    if (o()) {
      xr1 xr11 = m();
      if (xr11 != null) {
        p();
        return xr11.g(n(paramContext), paramString, paramView, paramActivity);
      } 
    } 
    return "";
  }
  
  public final void run() {
    boolean bool = false;
    try {
      boolean bool1 = this.l.e;
      x x = m0.G0;
      boolean bool2 = bool;
      if (!((Boolean)er2.e().c(x)).booleanValue()) {
        bool2 = bool;
        if (bool1)
          bool2 = true; 
      } 
      if (q() == zy0.a) {
        j((xr1)uy1.z(this.l.b, n(this.j), bool2, this.e));
        if (this.e == zy0.b) {
          Executor executor = this.h;
          h h = new h();
          this(this, bool2);
          executor.execute(h);
        } 
      } else {
        long l = System.currentTimeMillis();
        try {
          qm1 qm1 = qm1.j(this.l.b, n(this.j), bool2);
          this.d.set(qm1);
        } catch (NullPointerException nullPointerException) {
          this.e = zy0.a;
          j((xr1)uy1.z(this.l.b, n(this.j), bool2, this.e));
          this.i.b(2031, System.currentTimeMillis() - l, nullPointerException);
        } 
      } 
      return;
    } finally {
      this.n.countDown();
      this.j = null;
      this.l = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */