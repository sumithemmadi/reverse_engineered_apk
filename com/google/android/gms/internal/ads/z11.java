package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import com.google.android.gms.ads.doubleclick.a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class z11 implements a, m40, r40, b50, f50, d60, v60, d70, bq2 {
  private final AtomicReference<jr2> b = new AtomicReference<jr2>();
  
  private final AtomicReference<fs2> c = new AtomicReference<fs2>();
  
  private final AtomicReference<gt2> d = new AtomicReference<gt2>();
  
  private final AtomicReference<or2> e = new AtomicReference<or2>();
  
  private final AtomicReference<ns2> f = new AtomicReference<ns2>();
  
  private final AtomicBoolean g = new AtomicBoolean(true);
  
  private final pm1 h;
  
  private final BlockingQueue<Pair<String, String>> i;
  
  public z11(pm1 parampm1) {
    x<Integer> x = m0.g6;
    this.i = new ArrayBlockingQueue<Pair<String, String>>(((Integer)er2.e().<Integer>c(x)).intValue());
    this.h = parampm1;
  }
  
  public final jr2 B() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/concurrent/atomic/AtomicReference;
    //   6: invokevirtual get : ()Ljava/lang/Object;
    //   9: checkcast com/google/android/gms/internal/ads/jr2
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	17	finally
  }
  
  public final fs2 C() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/concurrent/atomic/AtomicReference;
    //   6: invokevirtual get : ()Ljava/lang/Object;
    //   9: checkcast com/google/android/gms/internal/ads/fs2
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	17	finally
  }
  
  public final void D(fs2 paramfs2) {
    this.c.set(paramfs2);
  }
  
  public final void E(zzvg paramzzvg) {
    se1.a(this.b, new h21(paramzzvg));
    se1.a(this.b, new k21(paramzzvg));
    se1.a(this.e, new j21(paramzzvg));
    this.g.set(false);
    this.i.clear();
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {}
  
  public final void I() {}
  
  public final void J(zzatq paramzzatq) {}
  
  public final void K() {}
  
  public final void L() {
    se1.a(this.b, n21.a);
    se1.a(this.f, q21.a);
  }
  
  public final void O() {
    se1.a(this.b, m21.a);
  }
  
  public final void S() {
    se1.a(this.b, e21.a);
  }
  
  public final void Y() {
    se1.a(this.b, y11.a);
    se1.a(this.f, c21.a);
  }
  
  public final void g0(ns2 paramns2) {
    this.f.set(paramns2);
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/concurrent/atomic/AtomicReference;
    //   6: getstatic com/google/android/gms/internal/ads/l21.a : Lcom/google/android/gms/internal/ads/re1;
    //   9: invokestatic a : (Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/re1;)V
    //   12: aload_0
    //   13: getfield e : Ljava/util/concurrent/atomic/AtomicReference;
    //   16: getstatic com/google/android/gms/internal/ads/o21.a : Lcom/google/android/gms/internal/ads/re1;
    //   19: invokestatic a : (Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/re1;)V
    //   22: aload_0
    //   23: getfield i : Ljava/util/concurrent/BlockingQueue;
    //   26: invokeinterface iterator : ()Ljava/util/Iterator;
    //   31: astore_1
    //   32: aload_1
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 76
    //   41: aload_1
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast android/util/Pair
    //   50: astore_2
    //   51: aload_0
    //   52: getfield c : Ljava/util/concurrent/atomic/AtomicReference;
    //   55: astore_3
    //   56: new com/google/android/gms/internal/ads/i21
    //   59: astore #4
    //   61: aload #4
    //   63: aload_2
    //   64: invokespecial <init> : (Landroid/util/Pair;)V
    //   67: aload_3
    //   68: aload #4
    //   70: invokestatic a : (Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/re1;)V
    //   73: goto -> 32
    //   76: aload_0
    //   77: getfield i : Ljava/util/concurrent/BlockingQueue;
    //   80: invokeinterface clear : ()V
    //   85: aload_0
    //   86: getfield g : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   89: iconst_0
    //   90: invokevirtual set : (Z)V
    //   93: aload_0
    //   94: monitorexit
    //   95: return
    //   96: astore_3
    //   97: aload_0
    //   98: monitorexit
    //   99: goto -> 104
    //   102: aload_3
    //   103: athrow
    //   104: goto -> 102
    // Exception table:
    //   from	to	target	type
    //   2	32	96	finally
    //   32	73	96	finally
    //   76	93	96	finally
  }
  
  public final void i0(ci1 paramci1) {
    this.g.set(true);
  }
  
  public final void k0(gt2 paramgt2) {
    this.d.set(paramgt2);
  }
  
  public final void l0(jr2 paramjr2) {
    this.b.set(paramjr2);
  }
  
  @TargetApi(5)
  public final void n(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual get : ()Z
    //   9: ifeq -> 80
    //   12: aload_0
    //   13: getfield i : Ljava/util/concurrent/BlockingQueue;
    //   16: astore_3
    //   17: new android/util/Pair
    //   20: astore #4
    //   22: aload #4
    //   24: aload_1
    //   25: aload_2
    //   26: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   29: aload_3
    //   30: aload #4
    //   32: invokeinterface offer : (Ljava/lang/Object;)Z
    //   37: ifne -> 77
    //   40: ldc 'The queue for app events is full, dropping the new event.'
    //   42: invokestatic e : (Ljava/lang/String;)V
    //   45: aload_0
    //   46: getfield h : Lcom/google/android/gms/internal/ads/pm1;
    //   49: astore_3
    //   50: aload_3
    //   51: ifnull -> 77
    //   54: aload_3
    //   55: ldc 'dae_action'
    //   57: invokestatic d : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rm1;
    //   60: ldc 'dae_name'
    //   62: aload_1
    //   63: invokevirtual i : (Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rm1;
    //   66: ldc 'dae_data'
    //   68: aload_2
    //   69: invokevirtual i : (Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rm1;
    //   72: invokeinterface b : (Lcom/google/android/gms/internal/ads/rm1;)V
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: aload_0
    //   81: getfield c : Ljava/util/concurrent/atomic/AtomicReference;
    //   84: astore #4
    //   86: new com/google/android/gms/internal/ads/g21
    //   89: astore_3
    //   90: aload_3
    //   91: aload_1
    //   92: aload_2
    //   93: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   96: aload #4
    //   98: aload_3
    //   99: invokestatic a : (Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/re1;)V
    //   102: aload_0
    //   103: monitorexit
    //   104: return
    //   105: astore_1
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_1
    //   109: athrow
    // Exception table:
    //   from	to	target	type
    //   2	50	105	finally
    //   54	77	105	finally
    //   80	102	105	finally
  }
  
  public final void r(zzvg paramzzvg) {
    se1.a(this.f, new f21(paramzzvg));
  }
  
  public final void t(zzvu paramzzvu) {
    se1.a(this.d, new d21(paramzzvu));
  }
  
  public final void x() {
    se1.a(this.b, a21.a);
  }
  
  public final void y(or2 paramor2) {
    this.e.set(paramor2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */