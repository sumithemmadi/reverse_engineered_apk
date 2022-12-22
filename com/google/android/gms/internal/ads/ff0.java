package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamic.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class ff0 extends p00 {
  private final s21 A;
  
  private final Executor h;
  
  private final pf0 i;
  
  private final xf0 j;
  
  private final lg0 k;
  
  private final tf0 l;
  
  private final ag0 m;
  
  private final t82<vj0> n;
  
  private final t82<tj0> o;
  
  private final t82<yj0> p;
  
  private final t82<oj0> q;
  
  private final t82<xj0> r;
  
  private jh0 s;
  
  private boolean t;
  
  private boolean u = false;
  
  private final zj v;
  
  private final p12 w;
  
  private final zzazn x;
  
  private final Context y;
  
  private final of0 z;
  
  public ff0(s00 params00, Executor paramExecutor, pf0 parampf0, xf0 paramxf0, lg0 paramlg0, tf0 paramtf0, ag0 paramag0, t82<vj0> paramt82, t82<tj0> paramt821, t82<yj0> paramt822, t82<oj0> paramt823, t82<xj0> paramt824, zj paramzj, p12 paramp12, zzazn paramzzazn, Context paramContext, of0 paramof0, s21 params21) {
    super(params00);
    this.h = paramExecutor;
    this.i = parampf0;
    this.j = paramxf0;
    this.k = paramlg0;
    this.l = paramtf0;
    this.m = paramag0;
    this.n = paramt82;
    this.o = paramt821;
    this.p = paramt822;
    this.q = paramt823;
    this.r = paramt824;
    this.v = paramzj;
    this.w = paramp12;
    this.x = paramzzazn;
    this.y = paramContext;
    this.z = paramof0;
    this.A = params21;
  }
  
  private final void B(jh0 paramjh0) {
    this.s = paramjh0;
    this.k.b(paramjh0);
    this.j.a(paramjh0.t9(), paramjh0.J7(), paramjh0.r8(), paramjh0, paramjh0);
    x<Boolean> x = m0.S1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      xr1 xr1 = this.w.h();
      if (xr1 != null)
        xr1.b(paramjh0.t9()); 
    } 
    if (paramjh0.Q6() != null)
      paramjh0.Q6().d(this.v); 
  }
  
  private final void E(jh0 paramjh0) {
    this.j.d(paramjh0.t9(), paramjh0.u6());
    if (paramjh0.j2() != null) {
      paramjh0.j2().setClickable(false);
      paramjh0.j2().removeAllViews();
    } 
    if (paramjh0.Q6() != null)
      paramjh0.Q6().e(this.v); 
    this.s = null;
  }
  
  public static boolean N(View paramView) {
    return (paramView.isShown() && paramView.getGlobalVisibleRect(new Rect(), null));
  }
  
  public final void A(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Z
    //   6: istore #5
    //   8: iload #5
    //   10: ifeq -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: iload #4
    //   18: ifeq -> 52
    //   21: aload_0
    //   22: getfield k : Lcom/google/android/gms/internal/ads/lg0;
    //   25: aload_0
    //   26: getfield s : Lcom/google/android/gms/internal/ads/jh0;
    //   29: invokevirtual h : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   32: aload_0
    //   33: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   36: aload_1
    //   37: aload_2
    //   38: aload_3
    //   39: invokeinterface h : (Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield t : Z
    //   49: aload_0
    //   50: monitorexit
    //   51: return
    //   52: iload #4
    //   54: ifne -> 176
    //   57: getstatic com/google/android/gms/internal/ads/m0.A2 : Lcom/google/android/gms/internal/ads/x;
    //   60: astore #6
    //   62: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   65: aload #6
    //   67: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   70: checkcast java/lang/Boolean
    //   73: invokevirtual booleanValue : ()Z
    //   76: ifeq -> 176
    //   79: aload_2
    //   80: ifnull -> 176
    //   83: aload_2
    //   84: invokeinterface entrySet : ()Ljava/util/Set;
    //   89: invokeinterface iterator : ()Ljava/util/Iterator;
    //   94: astore #6
    //   96: aload #6
    //   98: invokeinterface hasNext : ()Z
    //   103: ifeq -> 176
    //   106: aload #6
    //   108: invokeinterface next : ()Ljava/lang/Object;
    //   113: checkcast java/util/Map$Entry
    //   116: invokeinterface getValue : ()Ljava/lang/Object;
    //   121: checkcast java/lang/ref/WeakReference
    //   124: invokevirtual get : ()Ljava/lang/Object;
    //   127: checkcast android/view/View
    //   130: astore #7
    //   132: aload #7
    //   134: ifnull -> 96
    //   137: aload #7
    //   139: invokestatic N : (Landroid/view/View;)Z
    //   142: ifeq -> 96
    //   145: aload_0
    //   146: getfield k : Lcom/google/android/gms/internal/ads/lg0;
    //   149: aload_0
    //   150: getfield s : Lcom/google/android/gms/internal/ads/jh0;
    //   153: invokevirtual h : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   156: aload_0
    //   157: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   160: aload_1
    //   161: aload_2
    //   162: aload_3
    //   163: invokeinterface h : (Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    //   168: aload_0
    //   169: iconst_1
    //   170: putfield t : Z
    //   173: aload_0
    //   174: monitorexit
    //   175: return
    //   176: aload_0
    //   177: monitorexit
    //   178: return
    //   179: astore_1
    //   180: aload_0
    //   181: monitorexit
    //   182: goto -> 187
    //   185: aload_1
    //   186: athrow
    //   187: goto -> 185
    // Exception table:
    //   from	to	target	type
    //   2	8	179	finally
    //   21	49	179	finally
    //   57	79	179	finally
    //   83	96	179	finally
    //   96	132	179	finally
    //   137	173	179	finally
  }
  
  public final void D(jh0 paramjh0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.y1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_2
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_2
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 45
    //   22: getstatic com/google/android/gms/ads/internal/util/h1.a : Lcom/google/android/gms/internal/ads/xp1;
    //   25: astore_3
    //   26: new com/google/android/gms/internal/ads/if0
    //   29: astore_2
    //   30: aload_2
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ff0;Lcom/google/android/gms/internal/ads/jh0;)V
    //   36: aload_3
    //   37: aload_2
    //   38: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   41: pop
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: aload_1
    //   47: invokespecial E : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	53	finally
    //   45	50	53	finally
  }
  
  public final void G(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface e : (Landroid/os/Bundle;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void I(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface o : (Ljava/lang/String;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void J(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface b : (Landroid/os/Bundle;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final boolean K(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iconst_1
    //   14: ireturn
    //   15: aload_0
    //   16: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   19: aload_1
    //   20: invokeinterface n : (Landroid/os/Bundle;)Z
    //   25: istore_2
    //   26: aload_0
    //   27: iload_2
    //   28: putfield t : Z
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_2
    //   34: ireturn
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	35	finally
    //   15	31	35	finally
  }
  
  public final void L(String paramString, boolean paramBoolean) {
    boolean bool2;
    if (!this.l.a())
      return; 
    tq tq1 = this.i.G();
    tq tq2 = this.i.F();
    if (tq1 == null && tq2 == null)
      return; 
    boolean bool1 = false;
    if (tq1 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (tq2 != null)
      bool1 = true; 
    String str1 = null;
    if (!bool2)
      if (bool1) {
        str1 = "javascript";
        tq1 = tq2;
      } else {
        str1 = null;
        String str = str1;
        if (str1.getWebView() == null) {
          cm.i("Webview is null in InternalNativeAd");
          return;
        } 
      }  
    String str2 = str1;
    tq tq3 = tq1;
    if (tq3.getWebView() == null) {
      cm.i("Webview is null in InternalNativeAd");
      return;
    } 
  }
  
  public final void M() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: invokeinterface B0 : ()V
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Ljava/util/concurrent/Executor;
    //   6: astore_1
    //   7: new com/google/android/gms/internal/ads/gf0
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ff0;)V
    //   16: aload_1
    //   17: aload_2
    //   18: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   23: aload_0
    //   24: invokespecial a : ()V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	30	finally
  }
  
  public final void b() {
    this.h.execute(new ef0(this));
    if (this.i.A() != 7) {
      Executor executor = this.h;
      xf0 xf01 = this.j;
      xf01.getClass();
      executor.execute(hf0.a(xf01));
    } 
    super.b();
  }
  
  public final void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: invokeinterface r0 : ()V
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
  
  public final boolean h() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: invokeinterface n1 : ()Z
    //   11: istore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: ireturn
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield s : Lcom/google/android/gms/internal/ads/jh0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull -> 20
    //   11: ldc_w 'Ad should be associated with an ad view before calling recordCustomClickGesture()'
    //   14: invokestatic e : (Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_1
    //   21: instanceof com/google/android/gms/internal/ads/kg0
    //   24: istore_2
    //   25: aload_0
    //   26: getfield h : Ljava/util/concurrent/Executor;
    //   29: astore_1
    //   30: new com/google/android/gms/internal/ads/mf0
    //   33: astore_3
    //   34: aload_3
    //   35: aload_0
    //   36: iload_2
    //   37: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ff0;Z)V
    //   40: aload_1
    //   41: aload_3
    //   42: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	50	finally
    //   11	17	50	finally
    //   20	47	50	finally
  }
  
  public final void j(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface c : (Landroid/view/View;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final JSONObject k(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: aload_2
    //   8: aload_3
    //   9: invokeinterface i : (Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONObject;
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: areturn
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	19	finally
  }
  
  public final void l(View paramView1, MotionEvent paramMotionEvent, View paramView2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: aload_2
    //   8: aload_3
    //   9: invokeinterface f : (Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public final void m(View paramView1, View paramView2, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Lcom/google/android/gms/internal/ads/lg0;
    //   6: aload_0
    //   7: getfield s : Lcom/google/android/gms/internal/ads/jh0;
    //   10: invokevirtual g : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   13: aload_0
    //   14: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   17: aload_1
    //   18: aload_2
    //   19: aload_3
    //   20: aload #4
    //   22: iload #5
    //   24: invokeinterface g : (Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    //   29: aload_0
    //   30: getfield u : Z
    //   33: ifeq -> 98
    //   36: getstatic com/google/android/gms/internal/ads/m0.t2 : Lcom/google/android/gms/internal/ads/x;
    //   39: astore_1
    //   40: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   43: aload_1
    //   44: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   47: checkcast java/lang/Boolean
    //   50: invokevirtual booleanValue : ()Z
    //   53: ifeq -> 98
    //   56: aload_0
    //   57: getfield i : Lcom/google/android/gms/internal/ads/pf0;
    //   60: invokevirtual F : ()Lcom/google/android/gms/internal/ads/tq;
    //   63: ifnonnull -> 69
    //   66: goto -> 98
    //   69: aload_0
    //   70: getfield i : Lcom/google/android/gms/internal/ads/pf0;
    //   73: invokevirtual F : ()Lcom/google/android/gms/internal/ads/tq;
    //   76: astore_2
    //   77: new b/e/a
    //   80: astore_1
    //   81: aload_1
    //   82: invokespecial <init> : ()V
    //   85: aload_2
    //   86: ldc_w 'onSdkAdUserInteractionClick'
    //   89: aload_1
    //   90: invokeinterface B : (Ljava/lang/String;Ljava/util/Map;)V
    //   95: aload_0
    //   96: monitorexit
    //   97: return
    //   98: aload_0
    //   99: monitorexit
    //   100: return
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    // Exception table:
    //   from	to	target	type
    //   2	66	101	finally
    //   69	95	101	finally
  }
  
  public final void n(i5 parami5) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface G0 : (Lcom/google/android/gms/internal/ads/i5;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void o(jh0 paramjh0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.y1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_2
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_2
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 45
    //   22: getstatic com/google/android/gms/ads/internal/util/h1.a : Lcom/google/android/gms/internal/ads/xp1;
    //   25: astore_3
    //   26: new com/google/android/gms/internal/ads/jf0
    //   29: astore_2
    //   30: aload_2
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ff0;Lcom/google/android/gms/internal/ads/jh0;)V
    //   36: aload_3
    //   37: aload_2
    //   38: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   41: pop
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: aload_1
    //   47: invokespecial B : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	53	finally
    //   45	50	53	finally
  }
  
  public final void p(us2 paramus2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface o0 : (Lcom/google/android/gms/internal/ads/us2;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void q(ys2 paramys2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   6: aload_1
    //   7: invokeinterface R0 : (Lcom/google/android/gms/internal/ads/ys2;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void r(gt2 paramgt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield A : Lcom/google/android/gms/internal/ads/s21;
    //   6: aload_1
    //   7: invokevirtual a : (Lcom/google/android/gms/internal/ads/gt2;)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	13	finally
  }
  
  public final void s(View paramView) {
    boolean bool;
    a a = this.i.H();
    if (this.i.G() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (this.l.a() && a != null && bool && paramView != null)
      q.r().f(a, paramView); 
  }
  
  public final void t(View paramView) {
    a a = this.i.H();
    if (this.l.a() && a != null && paramView != null)
      q.r().j(a, paramView); 
  }
  
  public final void u() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield j : Lcom/google/android/gms/internal/ads/xf0;
    //   18: invokeinterface k : ()V
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	26	finally
    //   14	23	26	finally
  }
  
  public final boolean v() {
    return this.l.d();
  }
  
  public final boolean w() {
    return this.l.a();
  }
  
  public final of0 x() {
    return this.z;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ff0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */