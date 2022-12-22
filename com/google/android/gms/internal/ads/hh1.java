package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;

public final class hh1 extends qh {
  private final tg1 b;
  
  private final xf1 c;
  
  private final bi1 d;
  
  private vk0 e;
  
  private boolean f = false;
  
  public hh1(tg1 paramtg1, xf1 paramxf1, bi1 parambi1) {
    this.b = paramtg1;
    this.c = paramxf1;
    this.d = parambi1;
  }
  
  private final boolean V9() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 26
    //   11: aload_1
    //   12: invokevirtual h : ()Z
    //   15: istore_2
    //   16: iload_2
    //   17: ifne -> 26
    //   20: iconst_1
    //   21: istore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: iconst_0
    //   27: istore_2
    //   28: goto -> 22
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: goto -> 39
    //   37: aload_1
    //   38: athrow
    //   39: goto -> 37
    // Exception table:
    //   from	to	target	type
    //   2	7	31	finally
    //   11	16	31	finally
  }
  
  public final void B7(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'pause must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   11: ifnull -> 42
    //   14: aload_1
    //   15: ifnonnull -> 23
    //   18: aconst_null
    //   19: astore_1
    //   20: goto -> 31
    //   23: aload_1
    //   24: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   27: checkcast android/content/Context
    //   30: astore_1
    //   31: aload_0
    //   32: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   35: invokevirtual c : ()Lcom/google/android/gms/internal/ads/h50;
    //   38: aload_1
    //   39: invokevirtual c1 : (Landroid/content/Context;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	45	finally
    //   23	31	45	finally
    //   31	42	45	finally
  }
  
  public final void C7(String paramString) {}
  
  public final Bundle H() {
    t.e("getAdMetadata can only be called from the UI thread.");
    vk0 vk01 = this.e;
    return (vk01 != null) ? vk01.g() : new Bundle();
  }
  
  public final void J() {
    w6(null);
  }
  
  public final void K0(uh paramuh) {
    t.e("setRewardedVideoAdListener can only be called from the UI thread.");
    this.c.J(paramuh);
  }
  
  public final boolean O0() {
    t.e("isLoaded must be called on the main UI thread.");
    return V9();
  }
  
  public final void T0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: invokevirtual l7 : (Lcom/google/android/gms/dynamic/a;)V
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
  
  public final void Z1(ph paramph) {
    t.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
    this.c.D(paramph);
  }
  
  public final String a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 33
    //   11: aload_1
    //   12: invokevirtual d : ()Lcom/google/android/gms/internal/ads/h40;
    //   15: ifnull -> 33
    //   18: aload_0
    //   19: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   22: invokevirtual d : ()Lcom/google/android/gms/internal/ads/h40;
    //   25: invokevirtual a : ()Ljava/lang/String;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: aload_0
    //   34: monitorexit
    //   35: aconst_null
    //   36: areturn
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   11	29	37	finally
  }
  
  public final void a3(zzava paramzzava) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'loadAd must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_1
    //   8: getfield c : Ljava/lang/String;
    //   11: invokestatic a : (Ljava/lang/String;)Z
    //   14: istore_2
    //   15: iload_2
    //   16: ifeq -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: invokespecial V9 : ()Z
    //   26: ifeq -> 54
    //   29: getstatic com/google/android/gms/internal/ads/m0.Y3 : Lcom/google/android/gms/internal/ads/x;
    //   32: astore_3
    //   33: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   36: aload_3
    //   37: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   40: checkcast java/lang/Boolean
    //   43: invokevirtual booleanValue : ()Z
    //   46: istore_2
    //   47: iload_2
    //   48: ifne -> 54
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: new com/google/android/gms/internal/ads/ug1
    //   57: astore_3
    //   58: aload_3
    //   59: aconst_null
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: aload_0
    //   64: aconst_null
    //   65: putfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   68: aload_0
    //   69: getfield b : Lcom/google/android/gms/internal/ads/tg1;
    //   72: getstatic com/google/android/gms/internal/ads/yh1.a : I
    //   75: invokevirtual i : (I)V
    //   78: aload_0
    //   79: getfield b : Lcom/google/android/gms/internal/ads/tg1;
    //   82: astore #4
    //   84: aload_1
    //   85: getfield b : Lcom/google/android/gms/internal/ads/zzvl;
    //   88: astore #5
    //   90: aload_1
    //   91: getfield c : Ljava/lang/String;
    //   94: astore_1
    //   95: new com/google/android/gms/internal/ads/kh1
    //   98: astore #6
    //   100: aload #6
    //   102: aload_0
    //   103: invokespecial <init> : (Lcom/google/android/gms/internal/ads/hh1;)V
    //   106: aload #4
    //   108: aload #5
    //   110: aload_1
    //   111: aload_3
    //   112: aload #6
    //   114: invokevirtual a : (Lcom/google/android/gms/internal/ads/zzvl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/e31;Lcom/google/android/gms/internal/ads/h31;)Z
    //   117: pop
    //   118: aload_0
    //   119: monitorexit
    //   120: return
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	121	finally
    //   22	47	121	finally
    //   54	118	121	finally
  }
  
  public final void b1(es2 parames2) {
    t.e("setAdMetadataListener can only be called from the UI thread.");
    if (parames2 == null) {
      this.c.C(null);
      return;
    } 
    this.c.C(new jh1(this, parames2));
  }
  
  public final void destroy() {
    r9(null);
  }
  
  public final void l7(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'showAd must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnonnull -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_1
    //   20: ifnull -> 43
    //   23: aload_1
    //   24: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   27: astore_1
    //   28: aload_1
    //   29: instanceof android/app/Activity
    //   32: ifeq -> 43
    //   35: aload_1
    //   36: checkcast android/app/Activity
    //   39: astore_1
    //   40: goto -> 45
    //   43: aconst_null
    //   44: astore_1
    //   45: aload_0
    //   46: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   49: aload_0
    //   50: getfield f : Z
    //   53: aload_1
    //   54: invokevirtual j : (ZLandroid/app/Activity;)Z
    //   57: pop
    //   58: aload_0
    //   59: monitorexit
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	61	finally
    //   23	40	61	finally
    //   45	58	61	finally
  }
  
  public final void o(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'setImmersiveMode must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: iload_1
    //   9: putfield f : Z
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_2
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_2
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void o9(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.B0 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_2
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_2
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: istore_3
    //   20: iload_3
    //   21: ifne -> 27
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: ldc '#008 Must be called on the main UI thread.: setCustomData'
    //   29: invokestatic e : (Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield d : Lcom/google/android/gms/internal/ads/bi1;
    //   36: aload_1
    //   37: putfield b : Ljava/lang/String;
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	43	finally
    //   27	40	43	finally
  }
  
  public final ht2 p() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.p5 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_1
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_1
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: istore_2
    //   20: iload_2
    //   21: ifne -> 28
    //   24: aload_0
    //   25: monitorexit
    //   26: aconst_null
    //   27: areturn
    //   28: aload_0
    //   29: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnull -> 46
    //   37: aload_1
    //   38: invokevirtual d : ()Lcom/google/android/gms/internal/ads/h40;
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: areturn
    //   46: aload_0
    //   47: monitorexit
    //   48: aconst_null
    //   49: areturn
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	50	finally
    //   28	33	50	finally
    //   37	42	50	finally
  }
  
  public final void pause() {
    B7(null);
  }
  
  public final void r9(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'destroy must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield c : Lcom/google/android/gms/internal/ads/xf1;
    //   11: astore_2
    //   12: aconst_null
    //   13: astore_3
    //   14: aload_2
    //   15: aconst_null
    //   16: invokevirtual C : (Lcom/google/android/gms/ads/y/a;)V
    //   19: aload_0
    //   20: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   23: ifnull -> 54
    //   26: aload_1
    //   27: ifnonnull -> 35
    //   30: aload_3
    //   31: astore_1
    //   32: goto -> 43
    //   35: aload_1
    //   36: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   39: checkcast android/content/Context
    //   42: astore_1
    //   43: aload_0
    //   44: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   47: invokevirtual c : ()Lcom/google/android/gms/internal/ads/h50;
    //   50: aload_1
    //   51: invokevirtual e1 : (Landroid/content/Context;)V
    //   54: aload_0
    //   55: monitorexit
    //   56: return
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	57	finally
    //   14	26	57	finally
    //   35	43	57	finally
    //   43	54	57	finally
  }
  
  public final void w6(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'resume must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   11: ifnull -> 42
    //   14: aload_1
    //   15: ifnonnull -> 23
    //   18: aconst_null
    //   19: astore_1
    //   20: goto -> 31
    //   23: aload_1
    //   24: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   27: checkcast android/content/Context
    //   30: astore_1
    //   31: aload_0
    //   32: getfield e : Lcom/google/android/gms/internal/ads/vk0;
    //   35: invokevirtual c : ()Lcom/google/android/gms/internal/ads/h50;
    //   38: aload_1
    //   39: invokevirtual d1 : (Landroid/content/Context;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	45	finally
    //   23	31	45	finally
    //   31	42	45	finally
  }
  
  public final boolean x6() {
    vk0 vk01 = this.e;
    return (vk01 != null && vk01.l());
  }
  
  public final void y0(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'setUserId must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield d : Lcom/google/android/gms/internal/ads/bi1;
    //   11: aload_1
    //   12: putfield a : Ljava/lang/String;
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	18	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */