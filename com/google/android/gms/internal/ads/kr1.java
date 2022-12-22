package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class kr1 implements xr1 {
  protected static volatile z92 b;
  
  protected MotionEvent c;
  
  protected LinkedList<MotionEvent> d = new LinkedList<MotionEvent>();
  
  protected long e = 0L;
  
  protected long f = 0L;
  
  protected long g = 0L;
  
  protected long h = 0L;
  
  protected long i = 0L;
  
  protected long j = 0L;
  
  protected long k = 0L;
  
  protected double l;
  
  private double m;
  
  private double n;
  
  protected float o;
  
  protected float p;
  
  protected float q;
  
  protected float r;
  
  private boolean s = false;
  
  protected boolean t = false;
  
  protected DisplayMetrics u;
  
  protected kr1(Context paramContext) {
    try {
      x<Boolean> x = m0.Y1;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        e41.f();
      } else {
        ca2.a(b);
      } 
      this.u = paramContext.getResources().getDisplayMetrics();
    } finally {}
  }
  
  private final String j(Context paramContext, String paramString, int paramInt, View paramView, Activity paramActivity, byte[] paramArrayOfbyte) {
    zzcf$zza.a a1;
    zzcf$zza.a a2;
    lq1 lq11;
    lq1 lq12;
    long l = System.currentTimeMillis();
    x<Boolean> x1 = m0.O1;
    boolean bool = ((Boolean)er2.e().<Boolean>c(x1)).booleanValue();
    x<Boolean> x2 = null;
    if (bool) {
      if (b != null) {
        lq1 lq1 = b.w();
      } else {
        x1 = null;
      } 
      lq11 = (lq1)m0.Y1;
      if (((Boolean)er2.e().<Boolean>c((x<Boolean>)lq11)).booleanValue()) {
        String str = "be";
        lq12 = (lq1)x1;
      } else {
        String str = "te";
        lq12 = (lq1)x1;
      } 
    } else {
      lq12 = null;
      lq11 = lq12;
    } 
    x1 = x2;
    try {
      zzcf$zza.a a;
      char c;
      if (paramInt == t92.c) {
        x1 = x2;
        a = k(paramContext, paramView, paramActivity);
        a2 = a;
        this.s = true;
        c = 'Ϫ';
      } else {
        x1 = x2;
        if (paramInt == t92.b) {
          x1 = x2;
          a = n((Context)a, paramView, paramActivity);
          c = 'ϰ';
        } else {
          x1 = x2;
          a = i((Context)a, null);
          c = 'Ϩ';
        } 
      } 
      a1 = a;
      if (bool) {
        a1 = a;
        if (lq12 != null) {
          a2 = a;
          lq12.c(c, -1, System.currentTimeMillis() - l, (String)lq11);
          a1 = a;
        } 
      } 
    } catch (Exception exception) {
      a1 = a2;
      if (bool) {
        a1 = a2;
        if (lq12 != null) {
          byte b;
          if (paramInt == t92.c) {
            b = 1003;
          } else if (paramInt == t92.b) {
            b = 1009;
          } else if (paramInt == t92.a) {
            b = 1001;
          } else {
            b = -1;
          } 
          lq12.d(b, -1, System.currentTimeMillis() - l, (String)lq11, exception);
          a1 = a2;
        } 
      } 
    } 
    l = System.currentTimeMillis();
    if (a1 != null) {
      String str;
      try {
        if (((zzcf$zza)a1.h()).b() == 0)
          return Integer.toString(5); 
        paramString = e41.h((zzcf$zza)a1.h(), paramString);
        str = paramString;
        if (bool) {
          str = paramString;
          if (lq12 != null) {
            byte b;
            if (paramInt == t92.c) {
              b = 1006;
            } else if (paramInt == t92.b) {
              b = 1010;
            } else if (paramInt == t92.a) {
              b = 1004;
            } else {
              b = -1;
            } 
            lq12.c(b, -1, System.currentTimeMillis() - l, (String)lq11);
            str = paramString;
          } 
        } 
      } catch (Exception exception) {
        paramString = Integer.toString(7);
        str = paramString;
        if (bool) {
          str = paramString;
          if (lq12 != null) {
            if (paramInt == t92.c) {
              paramInt = 1007;
            } else if (paramInt == t92.b) {
              paramInt = 1011;
            } else if (paramInt == t92.a) {
              paramInt = 1005;
            } else {
              paramInt = -1;
            } 
            lq12.d(paramInt, -1, System.currentTimeMillis() - l, (String)lq11, exception);
            str = paramString;
          } 
        } 
      } 
      return str;
    } 
    return Integer.toString(5);
  }
  
  private final void m() {
    this.i = 0L;
    this.e = 0L;
    this.f = 0L;
    this.g = 0L;
    this.h = 0L;
    this.j = 0L;
    this.k = 0L;
    if (this.d.size() > 0) {
      Iterator<MotionEvent> iterator = this.d.iterator();
      while (iterator.hasNext())
        ((MotionEvent)iterator.next()).recycle(); 
      this.d.clear();
    } else {
      MotionEvent motionEvent = this.c;
      if (motionEvent != null)
        motionEvent.recycle(); 
    } 
    this.c = null;
  }
  
  public final String a(Context paramContext, String paramString, View paramView) {
    return g(paramContext, paramString, paramView, null);
  }
  
  public void c(int paramInt1, int paramInt2, int paramInt3) {
    if (this.c != null) {
      x<Boolean> x = m0.M1;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        m();
      } else {
        this.c.recycle();
      } 
    } 
    DisplayMetrics displayMetrics = this.u;
    if (displayMetrics != null) {
      long l = paramInt3;
      float f1 = paramInt1;
      float f2 = displayMetrics.density;
      this.c = MotionEvent.obtain(0L, l, 1, f1 * f2, paramInt2 * f2, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    } else {
      this.c = null;
    } 
    this.t = false;
  }
  
  public String d(Context paramContext) {
    if (!ea2.a())
      return j(paramContext, null, t92.a, null, null, null); 
    throw new IllegalStateException("The caller must not be called from the UI thread.");
  }
  
  public String e(Context paramContext, View paramView, Activity paramActivity) {
    return j(paramContext, null, t92.b, paramView, paramActivity, null);
  }
  
  public void f(MotionEvent paramMotionEvent) {
    Throwable throwable;
    boolean bool = this.s;
    boolean bool1 = false;
    if (bool) {
      m();
      this.s = false;
    } 
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i == 1 || i == 2) {
        double d1 = paramMotionEvent.getRawX();
        double d2 = paramMotionEvent.getRawY();
        double d3 = this.m;
        Double.isNaN(d1);
        d3 = d1 - d3;
        double d4 = this.n;
        Double.isNaN(d2);
        d4 = d2 - d4;
        this.l += Math.sqrt(d3 * d3 + d4 * d4);
        this.m = d1;
        this.n = d2;
      } 
    } else {
      this.l = 0.0D;
      this.m = paramMotionEvent.getRawX();
      this.n = paramMotionEvent.getRawY();
    } 
    i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3)
            this.h++; 
        } else {
          this.f += (paramMotionEvent.getHistorySize() + 1);
          try {
            fa2 fa2 = l(paramMotionEvent);
            if (fa2 != null && fa2.e != null && fa2.h != null) {
              i = 1;
            } else {
              i = 0;
            } 
            if (i != 0)
              this.j += fa2.e.longValue() + fa2.h.longValue(); 
            i = bool1;
            if (this.u != null) {
              i = bool1;
              if (fa2 != null) {
                i = bool1;
                if (fa2.f != null) {
                  i = bool1;
                  if (fa2.i != null)
                    i = 1; 
                } 
              } 
            } 
            if (i != 0)
              this.k += fa2.f.longValue() + fa2.i.longValue(); 
          } catch (zzev null) {}
        } 
      } else {
        MotionEvent motionEvent = MotionEvent.obtain((MotionEvent)throwable);
        this.c = motionEvent;
        this.d.add(motionEvent);
        if (this.d.size() > 6)
          ((MotionEvent)this.d.remove()).recycle(); 
        this.g++;
        throwable = new Throwable();
        this();
        this.i = h(throwable.getStackTrace());
      } 
    } else {
      this.o = throwable.getX();
      this.p = throwable.getY();
      this.q = throwable.getRawX();
      this.r = throwable.getRawY();
      this.e++;
    } 
    this.t = true;
  }
  
  public String g(Context paramContext, String paramString, View paramView, Activity paramActivity) {
    return j(paramContext, paramString, t92.c, paramView, paramActivity, null);
  }
  
  protected abstract long h(StackTraceElement[] paramArrayOfStackTraceElement);
  
  protected abstract zzcf$zza.a i(Context paramContext, ie0 paramie0);
  
  protected abstract zzcf$zza.a k(Context paramContext, View paramView, Activity paramActivity);
  
  protected abstract fa2 l(MotionEvent paramMotionEvent);
  
  protected abstract zzcf$zza.a n(Context paramContext, View paramView, Activity paramActivity);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */