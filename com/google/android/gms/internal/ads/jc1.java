package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.y;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

public final class jc1 extends as2 implements y, i60, lm2 {
  private final ss b;
  
  private final Context c;
  
  private final ViewGroup d;
  
  private AtomicBoolean e = new AtomicBoolean();
  
  private final String f;
  
  private final hc1 g;
  
  private final yc1 h;
  
  private final zzazn i;
  
  private long j = -1L;
  
  private kx k;
  
  protected by l;
  
  public jc1(ss paramss, Context paramContext, String paramString, hc1 paramhc1, yc1 paramyc1, zzazn paramzzazn) {
    this.d = (ViewGroup)new FrameLayout(paramContext);
    this.b = paramss;
    this.c = paramContext;
    this.f = paramString;
    this.g = paramhc1;
    this.h = paramyc1;
    paramyc1.c(this);
    this.i = paramzzazn;
  }
  
  private final zzp U9(by paramby) {
    int j;
    boolean bool = paramby.i();
    x<Integer> x = m0.w3;
    int i = ((Integer)er2.e().<Integer>c(x)).intValue();
    r r = new r();
    r.e = 50;
    if (bool) {
      j = i;
    } else {
      j = 0;
    } 
    r.a = j;
    if (bool) {
      j = 0;
    } else {
      j = i;
    } 
    r.b = j;
    r.c = 0;
    r.d = i;
    return new zzp(this.c, r, this);
  }
  
  private final zzvs W9() {
    return ki1.b(this.c, Collections.singletonList(this.l.m()));
  }
  
  private static RelativeLayout.LayoutParams Z9(by paramby) {
    byte b;
    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
    layoutParams.addRule(10);
    if (paramby.i()) {
      b = 11;
    } else {
      b = 9;
    } 
    layoutParams.addRule(b);
    return layoutParams;
  }
  
  private final void da(by paramby) {
    paramby.g(this);
  }
  
  private final void ga(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_0
    //   7: iconst_1
    //   8: invokevirtual compareAndSet : (ZZ)Z
    //   11: ifeq -> 131
    //   14: aload_0
    //   15: getfield l : Lcom/google/android/gms/internal/ads/by;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull -> 44
    //   23: aload_2
    //   24: invokevirtual p : ()Lcom/google/android/gms/internal/ads/um2;
    //   27: ifnull -> 44
    //   30: aload_0
    //   31: getfield h : Lcom/google/android/gms/internal/ads/yc1;
    //   34: aload_0
    //   35: getfield l : Lcom/google/android/gms/internal/ads/by;
    //   38: invokevirtual p : ()Lcom/google/android/gms/internal/ads/um2;
    //   41: invokevirtual h : (Lcom/google/android/gms/internal/ads/um2;)V
    //   44: aload_0
    //   45: getfield h : Lcom/google/android/gms/internal/ads/yc1;
    //   48: invokevirtual a : ()V
    //   51: aload_0
    //   52: getfield d : Landroid/view/ViewGroup;
    //   55: invokevirtual removeAllViews : ()V
    //   58: aload_0
    //   59: getfield k : Lcom/google/android/gms/internal/ads/kx;
    //   62: astore_2
    //   63: aload_2
    //   64: ifnull -> 74
    //   67: invokestatic f : ()Lcom/google/android/gms/internal/ads/ol2;
    //   70: aload_2
    //   71: invokevirtual e : (Lcom/google/android/gms/internal/ads/pl2;)V
    //   74: aload_0
    //   75: getfield l : Lcom/google/android/gms/internal/ads/by;
    //   78: ifnull -> 127
    //   81: aload_0
    //   82: getfield j : J
    //   85: lstore_3
    //   86: ldc2_w -1
    //   89: lstore #5
    //   91: lload_3
    //   92: ldc2_w -1
    //   95: lcmp
    //   96: ifne -> 102
    //   99: goto -> 117
    //   102: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   105: invokeinterface b : ()J
    //   110: aload_0
    //   111: getfield j : J
    //   114: lsub
    //   115: lstore #5
    //   117: aload_0
    //   118: getfield l : Lcom/google/android/gms/internal/ads/by;
    //   121: lload #5
    //   123: iload_1
    //   124: invokevirtual q : (JI)V
    //   127: aload_0
    //   128: invokevirtual destroy : ()V
    //   131: aload_0
    //   132: monitorexit
    //   133: return
    //   134: astore_2
    //   135: aload_0
    //   136: monitorexit
    //   137: aload_2
    //   138: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	134	finally
    //   23	44	134	finally
    //   44	63	134	finally
    //   67	74	134	finally
    //   74	86	134	finally
    //   102	117	134	finally
    //   117	127	134	finally
    //   127	131	134	finally
  }
  
  public final void B6(zzzi paramzzzi) {}
  
  public final String E8() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Ljava/lang/String;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final void G8() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
  }
  
  public final Bundle H() {
    return new Bundle();
  }
  
  public final void J() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'resume must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public final void K0(uh paramuh) {}
  
  public final void K2(zzaau paramzzaau) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
  }
  
  public final zzvs L9() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'getAdSize must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield l : Lcom/google/android/gms/internal/ads/by;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 35
    //   16: aload_0
    //   17: getfield c : Landroid/content/Context;
    //   20: aload_1
    //   21: invokevirtual m : ()Lcom/google/android/gms/internal/ads/qh1;
    //   24: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   27: invokestatic b : (Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzvs;
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: areturn
    //   35: aload_0
    //   36: monitorexit
    //   37: aconst_null
    //   38: areturn
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	39	finally
    //   16	31	39	finally
  }
  
  public final void M2() {
    ga(qx.c);
  }
  
  public final void O4(ns2 paramns2) {}
  
  public final void R6(String paramString) {}
  
  public final void U(gt2 paramgt2) {}
  
  public final void U4(zzvl paramzzvl, or2 paramor2) {}
  
  public final void U6(jr2 paramjr2) {}
  
  public final String X0() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    return null;
  }
  
  public final a Z2() {
    t.e("getAdFrame must be called on the main UI thread.");
    return b.a2(this.d);
  }
  
  public final void Z3(qf paramqf, String paramString) {}
  
  public final void Z7(zzvx paramzzvx) {
    this.g.g(paramzzvx);
  }
  
  public final String a() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    return null;
  }
  
  public final void b1(es2 parames2) {}
  
  public final fs2 b7() {
    return null;
  }
  
  public final void c2(boolean paramBoolean) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
  }
  
  public final void d9(i1 parami1) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
  }
  
  public final void destroy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 'destroy must be called on the main UI thread.'
    //   5: invokestatic e : (Ljava/lang/String;)V
    //   8: aload_0
    //   9: getfield l : Lcom/google/android/gms/internal/ads/by;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnull -> 21
    //   17: aload_1
    //   18: invokevirtual a : ()V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	24	finally
    //   17	21	24	finally
  }
  
  public final void f6() {}
  
  public final void g8(kf paramkf) {}
  
  public final nt2 getVideoController() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    return null;
  }
  
  public final void h3(tm2 paramtm2) {
    this.h.g(paramtm2);
  }
  
  public final void i1() {
    ga(qx.d);
  }
  
  public final void i4(ir2 paramir2) {}
  
  public final boolean m() {
    return false;
  }
  
  public final void n5(zzvs paramzzvs) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 'setAdSize must be called on the main UI thread.'
    //   5: invokestatic e : (Ljava/lang/String;)V
    //   8: aload_0
    //   9: monitorexit
    //   10: return
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
  }
  
  public final void o(boolean paramBoolean) {}
  
  public final void o1() {
    if (this.l == null)
      return; 
    this.j = q.j().b();
    int i = this.l.j();
    if (i <= 0)
      return; 
    kx kx1 = new kx(this.b.g(), q.j());
    this.k = kx1;
    kx1.b(i, new lc1(this));
  }
  
  public final boolean o7(zzvl paramzzvl) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 'loadAd must be called on the main UI thread.'
    //   5: invokestatic e : (Ljava/lang/String;)V
    //   8: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   11: pop
    //   12: aload_0
    //   13: getfield c : Landroid/content/Context;
    //   16: invokestatic K : (Landroid/content/Context;)Z
    //   19: ifeq -> 54
    //   22: aload_1
    //   23: getfield t : Lcom/google/android/gms/internal/ads/zzve;
    //   26: ifnonnull -> 54
    //   29: ldc_w 'Failed to load the ad because app ID is missing.'
    //   32: invokestatic g : (Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield h : Lcom/google/android/gms/internal/ads/yc1;
    //   39: getstatic com/google/android/gms/internal/ads/zzdom.e : Lcom/google/android/gms/internal/ads/zzdom;
    //   42: aconst_null
    //   43: aconst_null
    //   44: invokestatic b : (Lcom/google/android/gms/internal/ads/zzdom;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvg;)Lcom/google/android/gms/internal/ads/zzvg;
    //   47: invokevirtual E : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   50: aload_0
    //   51: monitorexit
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_0
    //   55: invokevirtual r : ()Z
    //   58: istore_2
    //   59: iload_2
    //   60: ifeq -> 67
    //   63: aload_0
    //   64: monitorexit
    //   65: iconst_0
    //   66: ireturn
    //   67: new java/util/concurrent/atomic/AtomicBoolean
    //   70: astore_3
    //   71: aload_3
    //   72: invokespecial <init> : ()V
    //   75: aload_0
    //   76: aload_3
    //   77: putfield e : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   80: new com/google/android/gms/internal/ads/kc1
    //   83: astore_3
    //   84: aload_3
    //   85: aload_0
    //   86: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jc1;)V
    //   89: aload_0
    //   90: getfield g : Lcom/google/android/gms/internal/ads/hc1;
    //   93: astore #4
    //   95: aload_0
    //   96: getfield f : Ljava/lang/String;
    //   99: astore #5
    //   101: new com/google/android/gms/internal/ads/oc1
    //   104: astore #6
    //   106: aload #6
    //   108: aload_0
    //   109: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jc1;)V
    //   112: aload #4
    //   114: aload_1
    //   115: aload #5
    //   117: aload_3
    //   118: aload #6
    //   120: invokevirtual a : (Lcom/google/android/gms/internal/ads/zzvl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/e31;Lcom/google/android/gms/internal/ads/h31;)Z
    //   123: istore_2
    //   124: aload_0
    //   125: monitorexit
    //   126: iload_2
    //   127: ireturn
    //   128: astore_1
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    // Exception table:
    //   from	to	target	type
    //   2	50	128	finally
    //   54	59	128	finally
    //   67	124	128	finally
  }
  
  public final ht2 p() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    return null;
  }
  
  public final void p0(a parama) {}
  
  public final void pause() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 'pause must be called on the main UI thread.'
    //   5: invokestatic e : (Ljava/lang/String;)V
    //   8: aload_0
    //   9: monitorexit
    //   10: return
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
  }
  
  public final void q3(ls2 paramls2) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jc1}} */
  }
  
  public final boolean r() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Lcom/google/android/gms/internal/ads/hc1;
    //   6: invokevirtual r : ()Z
    //   9: istore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: iload_1
    //   13: ireturn
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
  
  public final void showInterstitial() {}
  
  public final jr2 t3() {
    return null;
  }
  
  public final void y0(String paramString) {}
  
  public final void y6(fs2 paramfs2) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */