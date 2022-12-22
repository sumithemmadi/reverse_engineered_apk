package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.dynamic.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class md1 extends as2 implements p, lm2 {
  private final ss b;
  
  private final Context c;
  
  private AtomicBoolean d = new AtomicBoolean();
  
  private final String e;
  
  private final kd1 f;
  
  private final yc1 g;
  
  private long h = -1L;
  
  private kx i;
  
  protected ly j;
  
  public md1(ss paramss, Context paramContext, String paramString, kd1 paramkd1, yc1 paramyc1) {
    this.b = paramss;
    this.c = paramContext;
    this.e = paramString;
    this.f = paramkd1;
    this.g = paramyc1;
    paramyc1.b(this);
  }
  
  private final void U9(ly paramly) {
    paramly.h(this);
  }
  
  private final void Y9(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_0
    //   7: iconst_1
    //   8: invokevirtual compareAndSet : (ZZ)Z
    //   11: ifeq -> 94
    //   14: aload_0
    //   15: getfield g : Lcom/google/android/gms/internal/ads/yc1;
    //   18: invokevirtual a : ()V
    //   21: aload_0
    //   22: getfield i : Lcom/google/android/gms/internal/ads/kx;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull -> 37
    //   30: invokestatic f : ()Lcom/google/android/gms/internal/ads/ol2;
    //   33: aload_2
    //   34: invokevirtual e : (Lcom/google/android/gms/internal/ads/pl2;)V
    //   37: aload_0
    //   38: getfield j : Lcom/google/android/gms/internal/ads/ly;
    //   41: ifnull -> 90
    //   44: aload_0
    //   45: getfield h : J
    //   48: lstore_3
    //   49: ldc2_w -1
    //   52: lstore #5
    //   54: lload_3
    //   55: ldc2_w -1
    //   58: lcmp
    //   59: ifne -> 65
    //   62: goto -> 80
    //   65: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   68: invokeinterface b : ()J
    //   73: aload_0
    //   74: getfield h : J
    //   77: lsub
    //   78: lstore #5
    //   80: aload_0
    //   81: getfield j : Lcom/google/android/gms/internal/ads/ly;
    //   84: lload #5
    //   86: iload_1
    //   87: invokevirtual j : (JI)V
    //   90: aload_0
    //   91: invokevirtual destroy : ()V
    //   94: aload_0
    //   95: monitorexit
    //   96: return
    //   97: astore_2
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_2
    //   101: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	97	finally
    //   30	37	97	finally
    //   37	49	97	finally
    //   65	80	97	finally
    //   80	90	97	finally
    //   90	94	97	finally
  }
  
  public final void B6(zzzi paramzzzi) {}
  
  public final String E8() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/lang/String;
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
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
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
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
  }
  
  public final zzvs L9() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    return null;
  }
  
  public final void M0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ly;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 31
    //   11: aload_1
    //   12: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   15: invokeinterface b : ()J
    //   20: aload_0
    //   21: getfield h : J
    //   24: lsub
    //   25: getstatic com/google/android/gms/internal/ads/qx.a : I
    //   28: invokevirtual j : (JI)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	34	finally
    //   11	31	34	finally
  }
  
  public final void M2() {
    Y9(qx.c);
  }
  
  public final void O4(ns2 paramns2) {}
  
  public final void R5(zzn paramzzn) {
    int i = qd1.a[paramzzn.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i == 4)
            Y9(qx.f); 
          return;
        } 
        Y9(qx.d);
        return;
      } 
      Y9(qx.b);
      return;
    } 
    Y9(qx.c);
  }
  
  public final void R6(String paramString) {}
  
  public final void U(gt2 paramgt2) {}
  
  public final void U4(zzvl paramzzvl, or2 paramor2) {}
  
  public final void U6(jr2 paramjr2) {}
  
  public final String X0() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    return null;
  }
  
  public final a Z2() {
    return null;
  }
  
  public final void Z3(qf paramqf, String paramString) {}
  
  public final void Z7(zzvx paramzzvx) {
    this.f.g(paramzzvx);
  }
  
  public final String a() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    return null;
  }
  
  public final void b1(es2 parames2) {}
  
  public final fs2 b7() {
    return null;
  }
  
  public final void c2(boolean paramBoolean) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
  }
  
  public final void d9(i1 parami1) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
  }
  
  public final void destroy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'destroy must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield j : Lcom/google/android/gms/internal/ads/ly;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 20
    //   16: aload_1
    //   17: invokevirtual a : ()V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	23	finally
    //   16	20	23	finally
  }
  
  public final void f6() {}
  
  public final void g8(kf paramkf) {}
  
  public final nt2 getVideoController() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    return null;
  }
  
  public final void h3(tm2 paramtm2) {
    this.g.g(paramtm2);
  }
  
  public final void i4(ir2 paramir2) {}
  
  public final boolean m() {
    return false;
  }
  
  public final void n5(zzvs paramzzvs) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'setAdSize must be called on the main UI thread.'
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
  
  public final void o(boolean paramBoolean) {}
  
  public final boolean o7(zzvl paramzzvl) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'loadAd must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   10: pop
    //   11: aload_0
    //   12: getfield c : Landroid/content/Context;
    //   15: invokestatic K : (Landroid/content/Context;)Z
    //   18: ifeq -> 52
    //   21: aload_1
    //   22: getfield t : Lcom/google/android/gms/internal/ads/zzve;
    //   25: ifnonnull -> 52
    //   28: ldc 'Failed to load the ad because app ID is missing.'
    //   30: invokestatic g : (Ljava/lang/String;)V
    //   33: aload_0
    //   34: getfield g : Lcom/google/android/gms/internal/ads/yc1;
    //   37: getstatic com/google/android/gms/internal/ads/zzdom.e : Lcom/google/android/gms/internal/ads/zzdom;
    //   40: aconst_null
    //   41: aconst_null
    //   42: invokestatic b : (Lcom/google/android/gms/internal/ads/zzdom;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvg;)Lcom/google/android/gms/internal/ads/zzvg;
    //   45: invokevirtual E : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   48: aload_0
    //   49: monitorexit
    //   50: iconst_0
    //   51: ireturn
    //   52: aload_0
    //   53: invokevirtual r : ()Z
    //   56: istore_2
    //   57: iload_2
    //   58: ifeq -> 65
    //   61: aload_0
    //   62: monitorexit
    //   63: iconst_0
    //   64: ireturn
    //   65: new java/util/concurrent/atomic/AtomicBoolean
    //   68: astore_3
    //   69: aload_3
    //   70: invokespecial <init> : ()V
    //   73: aload_0
    //   74: aload_3
    //   75: putfield d : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   78: new com/google/android/gms/internal/ads/od1
    //   81: astore_3
    //   82: aload_3
    //   83: aload_0
    //   84: invokespecial <init> : (Lcom/google/android/gms/internal/ads/md1;)V
    //   87: aload_0
    //   88: getfield f : Lcom/google/android/gms/internal/ads/kd1;
    //   91: astore #4
    //   93: aload_0
    //   94: getfield e : Ljava/lang/String;
    //   97: astore #5
    //   99: new com/google/android/gms/internal/ads/rd1
    //   102: astore #6
    //   104: aload #6
    //   106: aload_0
    //   107: invokespecial <init> : (Lcom/google/android/gms/internal/ads/md1;)V
    //   110: aload #4
    //   112: aload_1
    //   113: aload #5
    //   115: aload_3
    //   116: aload #6
    //   118: invokevirtual a : (Lcom/google/android/gms/internal/ads/zzvl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/e31;Lcom/google/android/gms/internal/ads/h31;)Z
    //   121: istore_2
    //   122: aload_0
    //   123: monitorexit
    //   124: iload_2
    //   125: ireturn
    //   126: astore_1
    //   127: aload_0
    //   128: monitorexit
    //   129: aload_1
    //   130: athrow
    // Exception table:
    //   from	to	target	type
    //   2	48	126	finally
    //   52	57	126	finally
    //   65	122	126	finally
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final ht2 p() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
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
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
  }
  
  public final boolean r() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/kd1;
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
  
  public final void showInterstitial() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/md1}} */
  }
  
  public final jr2 t3() {
    return null;
  }
  
  public final void u9() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ly;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   18: invokeinterface b : ()J
    //   23: putfield h : J
    //   26: aload_0
    //   27: getfield j : Lcom/google/android/gms/internal/ads/ly;
    //   30: invokevirtual i : ()I
    //   33: istore_2
    //   34: iload_2
    //   35: ifgt -> 41
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: new com/google/android/gms/internal/ads/kx
    //   44: astore_1
    //   45: aload_1
    //   46: aload_0
    //   47: getfield b : Lcom/google/android/gms/internal/ads/ss;
    //   50: invokevirtual g : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   53: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   56: invokespecial <init> : (Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/common/util/e;)V
    //   59: aload_0
    //   60: aload_1
    //   61: putfield i : Lcom/google/android/gms/internal/ads/kx;
    //   64: new com/google/android/gms/internal/ads/pd1
    //   67: astore_3
    //   68: aload_3
    //   69: aload_0
    //   70: invokespecial <init> : (Lcom/google/android/gms/internal/ads/md1;)V
    //   73: aload_1
    //   74: iload_2
    //   75: aload_3
    //   76: invokevirtual b : (ILjava/lang/Runnable;)V
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	82	finally
    //   14	34	82	finally
    //   41	79	82	finally
  }
  
  public final void y0(String paramString) {}
  
  public final void y6(fs2 paramfs2) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/md1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */