package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class jw implements m40, b50, f50, d60, bq2 {
  private final Context b;
  
  private final Executor c;
  
  private final ScheduledExecutorService d;
  
  private final ci1 e;
  
  private final nh1 f;
  
  private final hn1 g;
  
  private final ni1 h;
  
  private final p12 i;
  
  private final n1 j;
  
  private final r1 k;
  
  private final WeakReference<View> l;
  
  private boolean m;
  
  private boolean n;
  
  public jw(Context paramContext, Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService, ci1 paramci1, nh1 paramnh1, hn1 paramhn1, ni1 paramni1, View paramView, p12 paramp12, n1 paramn1, r1 paramr1) {
    this.b = paramContext;
    this.c = paramExecutor;
    this.d = paramScheduledExecutorService;
    this.e = paramci1;
    this.f = paramnh1;
    this.g = paramhn1;
    this.h = paramni1;
    this.i = paramp12;
    this.l = new WeakReference<View>(paramView);
    this.j = paramn1;
    this.k = paramr1;
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {
    ni1 ni11 = this.h;
    hn1 hn11 = this.g;
    nh1 nh11 = this.f;
    ni11.c(hn11.b(nh11, nh11.h, paramkh));
  }
  
  public final void I() {
    ni1 ni11 = this.h;
    hn1 hn11 = this.g;
    ci1 ci11 = this.e;
    nh1 nh11 = this.f;
    ni11.c(hn11.c(ci11, nh11, nh11.g));
  }
  
  public final void K() {
    ni1 ni11 = this.h;
    hn1 hn11 = this.g;
    ci1 ci11 = this.e;
    nh1 nh11 = this.f;
    ni11.c(hn11.c(ci11, nh11, nh11.i));
  }
  
  public final void L() {}
  
  public final void O() {}
  
  public final void S() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield n : Z
    //   6: ifne -> 259
    //   9: getstatic com/google/android/gms/internal/ads/m0.h2 : Lcom/google/android/gms/internal/ads/x;
    //   12: astore_1
    //   13: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   16: aload_1
    //   17: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   20: checkcast java/lang/Boolean
    //   23: invokevirtual booleanValue : ()Z
    //   26: istore_2
    //   27: aconst_null
    //   28: astore_1
    //   29: iload_2
    //   30: ifeq -> 61
    //   33: aload_0
    //   34: getfield i : Lcom/google/android/gms/internal/ads/p12;
    //   37: invokevirtual h : ()Lcom/google/android/gms/internal/ads/xr1;
    //   40: aload_0
    //   41: getfield b : Landroid/content/Context;
    //   44: aload_0
    //   45: getfield l : Ljava/lang/ref/WeakReference;
    //   48: invokevirtual get : ()Ljava/lang/Object;
    //   51: checkcast android/view/View
    //   54: aconst_null
    //   55: invokeinterface e : (Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    //   60: astore_1
    //   61: getstatic com/google/android/gms/internal/ads/m0.h0 : Lcom/google/android/gms/internal/ads/x;
    //   64: astore_3
    //   65: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   68: aload_3
    //   69: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   72: checkcast java/lang/Boolean
    //   75: invokevirtual booleanValue : ()Z
    //   78: ifeq -> 103
    //   81: aload_0
    //   82: getfield e : Lcom/google/android/gms/internal/ads/ci1;
    //   85: getfield b : Lcom/google/android/gms/internal/ads/ai1;
    //   88: getfield b : Lcom/google/android/gms/internal/ads/sh1;
    //   91: getfield g : Z
    //   94: ifeq -> 103
    //   97: iconst_1
    //   98: istore #4
    //   100: goto -> 106
    //   103: iconst_0
    //   104: istore #4
    //   106: iload #4
    //   108: ifne -> 207
    //   111: getstatic com/google/android/gms/internal/ads/g2.b : Lcom/google/android/gms/internal/ads/t1;
    //   114: invokevirtual a : ()Ljava/lang/Object;
    //   117: checkcast java/lang/Boolean
    //   120: invokevirtual booleanValue : ()Z
    //   123: ifne -> 129
    //   126: goto -> 207
    //   129: aload_0
    //   130: getfield k : Lcom/google/android/gms/internal/ads/r1;
    //   133: aload_0
    //   134: getfield b : Landroid/content/Context;
    //   137: invokeinterface a : (Landroid/content/Context;)Lcom/google/android/gms/internal/ads/ot1;
    //   142: invokestatic H : (Lcom/google/android/gms/internal/ads/ot1;)Lcom/google/android/gms/internal/ads/ys1;
    //   145: astore_3
    //   146: getstatic com/google/android/gms/internal/ads/m0.F0 : Lcom/google/android/gms/internal/ads/x;
    //   149: astore #5
    //   151: aload_3
    //   152: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   155: aload #5
    //   157: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   160: checkcast java/lang/Long
    //   163: invokevirtual longValue : ()J
    //   166: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   169: aload_0
    //   170: getfield d : Ljava/util/concurrent/ScheduledExecutorService;
    //   173: invokevirtual C : (JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/ys1;
    //   176: astore_3
    //   177: new com/google/android/gms/internal/ads/lw
    //   180: astore #5
    //   182: aload #5
    //   184: aload_0
    //   185: aload_1
    //   186: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jw;Ljava/lang/String;)V
    //   189: aload_3
    //   190: aload #5
    //   192: aload_0
    //   193: getfield c : Ljava/util/concurrent/Executor;
    //   196: invokestatic g : (Lcom/google/android/gms/internal/ads/ot1;Lcom/google/android/gms/internal/ads/et1;Ljava/util/concurrent/Executor;)V
    //   199: aload_0
    //   200: iconst_1
    //   201: putfield n : Z
    //   204: goto -> 259
    //   207: aload_0
    //   208: getfield h : Lcom/google/android/gms/internal/ads/ni1;
    //   211: astore_3
    //   212: aload_0
    //   213: getfield g : Lcom/google/android/gms/internal/ads/hn1;
    //   216: astore #6
    //   218: aload_0
    //   219: getfield e : Lcom/google/android/gms/internal/ads/ci1;
    //   222: astore #5
    //   224: aload_0
    //   225: getfield f : Lcom/google/android/gms/internal/ads/nh1;
    //   228: astore #7
    //   230: aload_3
    //   231: aload #6
    //   233: aload #5
    //   235: aload #7
    //   237: iconst_0
    //   238: aload_1
    //   239: aconst_null
    //   240: aload #7
    //   242: getfield d : Ljava/util/List;
    //   245: invokevirtual d : (Lcom/google/android/gms/internal/ads/ci1;Lcom/google/android/gms/internal/ads/nh1;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    //   248: invokevirtual c : (Ljava/util/List;)V
    //   251: aload_0
    //   252: iconst_1
    //   253: putfield n : Z
    //   256: aload_0
    //   257: monitorexit
    //   258: return
    //   259: aload_0
    //   260: monitorexit
    //   261: return
    //   262: astore_1
    //   263: aload_0
    //   264: monitorexit
    //   265: aload_1
    //   266: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	262	finally
    //   33	61	262	finally
    //   61	97	262	finally
    //   111	126	262	finally
    //   129	204	262	finally
    //   207	256	262	finally
  }
  
  public final void Y() {}
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Z
    //   6: ifeq -> 67
    //   9: new java/util/ArrayList
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getfield f : Lcom/google/android/gms/internal/ads/nh1;
    //   18: getfield d : Ljava/util/List;
    //   21: invokespecial <init> : (Ljava/util/Collection;)V
    //   24: aload_1
    //   25: aload_0
    //   26: getfield f : Lcom/google/android/gms/internal/ads/nh1;
    //   29: getfield f : Ljava/util/List;
    //   32: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   37: pop
    //   38: aload_0
    //   39: getfield h : Lcom/google/android/gms/internal/ads/ni1;
    //   42: aload_0
    //   43: getfield g : Lcom/google/android/gms/internal/ads/hn1;
    //   46: aload_0
    //   47: getfield e : Lcom/google/android/gms/internal/ads/ci1;
    //   50: aload_0
    //   51: getfield f : Lcom/google/android/gms/internal/ads/nh1;
    //   54: iconst_1
    //   55: aconst_null
    //   56: aconst_null
    //   57: aload_1
    //   58: invokevirtual d : (Lcom/google/android/gms/internal/ads/ci1;Lcom/google/android/gms/internal/ads/nh1;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    //   61: invokevirtual c : (Ljava/util/List;)V
    //   64: goto -> 141
    //   67: aload_0
    //   68: getfield h : Lcom/google/android/gms/internal/ads/ni1;
    //   71: astore_2
    //   72: aload_0
    //   73: getfield g : Lcom/google/android/gms/internal/ads/hn1;
    //   76: astore_1
    //   77: aload_0
    //   78: getfield e : Lcom/google/android/gms/internal/ads/ci1;
    //   81: astore_3
    //   82: aload_0
    //   83: getfield f : Lcom/google/android/gms/internal/ads/nh1;
    //   86: astore #4
    //   88: aload_2
    //   89: aload_1
    //   90: aload_3
    //   91: aload #4
    //   93: aload #4
    //   95: getfield m : Ljava/util/List;
    //   98: invokevirtual c : (Lcom/google/android/gms/internal/ads/ci1;Lcom/google/android/gms/internal/ads/nh1;Ljava/util/List;)Ljava/util/List;
    //   101: invokevirtual c : (Ljava/util/List;)V
    //   104: aload_0
    //   105: getfield h : Lcom/google/android/gms/internal/ads/ni1;
    //   108: astore_3
    //   109: aload_0
    //   110: getfield g : Lcom/google/android/gms/internal/ads/hn1;
    //   113: astore_2
    //   114: aload_0
    //   115: getfield e : Lcom/google/android/gms/internal/ads/ci1;
    //   118: astore_1
    //   119: aload_0
    //   120: getfield f : Lcom/google/android/gms/internal/ads/nh1;
    //   123: astore #4
    //   125: aload_3
    //   126: aload_2
    //   127: aload_1
    //   128: aload #4
    //   130: aload #4
    //   132: getfield f : Ljava/util/List;
    //   135: invokevirtual c : (Lcom/google/android/gms/internal/ads/ci1;Lcom/google/android/gms/internal/ads/nh1;Ljava/util/List;)Ljava/util/List;
    //   138: invokevirtual c : (Ljava/util/List;)V
    //   141: aload_0
    //   142: iconst_1
    //   143: putfield m : Z
    //   146: aload_0
    //   147: monitorexit
    //   148: return
    //   149: astore_1
    //   150: aload_0
    //   151: monitorexit
    //   152: aload_1
    //   153: athrow
    // Exception table:
    //   from	to	target	type
    //   2	64	149	finally
    //   67	141	149	finally
    //   141	146	149	finally
  }
  
  public final void r(zzvg paramzzvg) {
    x<Boolean> x = m0.u1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      List<String> list = hn1.a(2, paramzzvg.b, this.f.n);
      this.h.c(this.g.c(this.e, this.f, list));
    } 
  }
  
  public final void x() {
    int i;
    x<Boolean> x = m0.h0;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && this.e.b.b.g) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i || !((Boolean)g2.a.a()).booleanValue()) {
      ni1 ni11 = this.h;
      hn1 hn11 = this.g;
      ci1 ci11 = this.e;
      nh1 nh11 = this.f;
      List<String> list = hn11.c(ci11, nh11, nh11.c);
      q.c();
      if (h1.O(this.b)) {
        i = qu0.b;
      } else {
        i = qu0.a;
      } 
      ni11.a(list, i);
      return;
    } 
    ys1<String> ys1 = ys1.H(this.k.b(this.b, this.j.b(), this.j.c()));
    x<Long> x1 = m0.F0;
    dt1.g(ys1.C(((Long)er2.e().<Long>c(x1)).longValue(), TimeUnit.MILLISECONDS, this.d), new iw(this), this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */