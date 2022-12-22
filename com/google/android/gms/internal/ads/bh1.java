package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;

public final class bh1 extends oi {
  private final tg1 b;
  
  private final xf1 c;
  
  private final String d;
  
  private final bi1 e;
  
  private final Context f;
  
  private vk0 g;
  
  private boolean h;
  
  public bh1(String paramString, tg1 paramtg1, Context paramContext, xf1 paramxf1, bi1 parambi1) {
    this.d = paramString;
    this.b = paramtg1;
    this.c = paramxf1;
    this.e = parambi1;
    this.f = paramContext;
    x<Boolean> x = m0.o0;
    this.h = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
  }
  
  private final void V9(zzvl paramzzvl, ti paramti, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc '#008 Must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield c : Lcom/google/android/gms/internal/ads/xf1;
    //   11: aload_2
    //   12: invokevirtual i0 : (Lcom/google/android/gms/internal/ads/ti;)V
    //   15: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   18: pop
    //   19: aload_0
    //   20: getfield f : Landroid/content/Context;
    //   23: invokestatic K : (Landroid/content/Context;)Z
    //   26: ifeq -> 59
    //   29: aload_1
    //   30: getfield t : Lcom/google/android/gms/internal/ads/zzve;
    //   33: ifnonnull -> 59
    //   36: ldc 'Failed to load the ad because app ID is missing.'
    //   38: invokestatic g : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield c : Lcom/google/android/gms/internal/ads/xf1;
    //   45: getstatic com/google/android/gms/internal/ads/zzdom.e : Lcom/google/android/gms/internal/ads/zzdom;
    //   48: aconst_null
    //   49: aconst_null
    //   50: invokestatic b : (Lcom/google/android/gms/internal/ads/zzdom;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvg;)Lcom/google/android/gms/internal/ads/zzvg;
    //   53: invokevirtual E : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: aload_0
    //   60: getfield g : Lcom/google/android/gms/internal/ads/vk0;
    //   63: astore_2
    //   64: aload_2
    //   65: ifnull -> 71
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: new com/google/android/gms/internal/ads/ug1
    //   74: astore #4
    //   76: aload #4
    //   78: aconst_null
    //   79: invokespecial <init> : (Ljava/lang/String;)V
    //   82: aload_0
    //   83: getfield b : Lcom/google/android/gms/internal/ads/tg1;
    //   86: iload_3
    //   87: invokevirtual i : (I)V
    //   90: aload_0
    //   91: getfield b : Lcom/google/android/gms/internal/ads/tg1;
    //   94: astore_2
    //   95: aload_0
    //   96: getfield d : Ljava/lang/String;
    //   99: astore #5
    //   101: new com/google/android/gms/internal/ads/dh1
    //   104: astore #6
    //   106: aload #6
    //   108: aload_0
    //   109: invokespecial <init> : (Lcom/google/android/gms/internal/ads/bh1;)V
    //   112: aload_2
    //   113: aload_1
    //   114: aload #5
    //   116: aload #4
    //   118: aload #6
    //   120: invokevirtual a : (Lcom/google/android/gms/internal/ads/zzvl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/e31;Lcom/google/android/gms/internal/ads/h31;)Z
    //   123: pop
    //   124: aload_0
    //   125: monitorexit
    //   126: return
    //   127: astore_1
    //   128: aload_0
    //   129: monitorexit
    //   130: aload_1
    //   131: athrow
    // Exception table:
    //   from	to	target	type
    //   2	56	127	finally
    //   59	64	127	finally
    //   71	124	127	finally
  }
  
  public final void A2(yi paramyi) {
    t.e("#008 Must be called on the main UI thread.");
    this.c.k0(paramyi);
  }
  
  public final void E1(bt2 parambt2) {
    if (parambt2 == null) {
      this.c.C(null);
      return;
    } 
    this.c.C(new eh1(this, parambt2));
  }
  
  public final void E7(zzawh paramzzawh) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc '#008 Must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield e : Lcom/google/android/gms/internal/ads/bi1;
    //   11: astore_2
    //   12: aload_2
    //   13: aload_1
    //   14: getfield b : Ljava/lang/String;
    //   17: putfield a : Ljava/lang/String;
    //   20: getstatic com/google/android/gms/internal/ads/m0.B0 : Lcom/google/android/gms/internal/ads/x;
    //   23: astore_3
    //   24: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   27: aload_3
    //   28: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   31: checkcast java/lang/Boolean
    //   34: invokevirtual booleanValue : ()Z
    //   37: ifeq -> 48
    //   40: aload_2
    //   41: aload_1
    //   42: getfield c : Ljava/lang/String;
    //   45: putfield b : Ljava/lang/String;
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   2	48	51	finally
  }
  
  public final Bundle H() {
    t.e("#008 Must be called on the main UI thread.");
    vk0 vk01 = this.g;
    return (vk01 != null) ? vk01.g() : new Bundle();
  }
  
  public final ki M7() {
    t.e("#008 Must be called on the main UI thread.");
    vk0 vk01 = this.g;
    return (vk01 != null) ? vk01.k() : null;
  }
  
  public final void M9(a parama, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc '#008 Must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield g : Lcom/google/android/gms/internal/ads/vk0;
    //   11: ifnonnull -> 37
    //   14: ldc 'Rewarded can not be shown before loaded'
    //   16: invokestatic i : (Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield c : Lcom/google/android/gms/internal/ads/xf1;
    //   23: getstatic com/google/android/gms/internal/ads/zzdom.j : Lcom/google/android/gms/internal/ads/zzdom;
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokestatic b : (Lcom/google/android/gms/internal/ads/zzdom;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvg;)Lcom/google/android/gms/internal/ads/zzvg;
    //   31: invokevirtual r : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: aload_1
    //   38: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   41: checkcast android/app/Activity
    //   44: astore_1
    //   45: aload_0
    //   46: getfield g : Lcom/google/android/gms/internal/ads/vk0;
    //   49: iload_2
    //   50: aload_1
    //   51: invokevirtual j : (ZLandroid/app/Activity;)Z
    //   54: pop
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Exception table:
    //   from	to	target	type
    //   2	34	58	finally
    //   37	55	58	finally
  }
  
  public final boolean O0() {
    t.e("#008 Must be called on the main UI thread.");
    vk0 vk01 = this.g;
    return (vk01 != null && !vk01.i());
  }
  
  public final void U(gt2 paramgt2) {
    t.e("setOnPaidEventListener must be called on the main UI thread.");
    this.c.l0(paramgt2);
  }
  
  public final String a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Lcom/google/android/gms/internal/ads/vk0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 33
    //   11: aload_1
    //   12: invokevirtual d : ()Lcom/google/android/gms/internal/ads/h40;
    //   15: ifnull -> 33
    //   18: aload_0
    //   19: getfield g : Lcom/google/android/gms/internal/ads/vk0;
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
  
  public final void d3(qi paramqi) {
    t.e("#008 Must be called on the main UI thread.");
    this.c.g0(paramqi);
  }
  
  public final void o(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'setImmersiveMode must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_0
    //   8: iload_1
    //   9: putfield h : Z
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
  
  public final ht2 p() {
    x<Boolean> x = m0.p5;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return null; 
    vk0 vk01 = this.g;
    return (vk01 != null) ? vk01.d() : null;
  }
  
  public final void p0(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_0
    //   5: getfield h : Z
    //   8: invokevirtual M9 : (Lcom/google/android/gms/dynamic/a;Z)V
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
  
  public final void v8(zzvl paramzzvl, ti paramti) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: getstatic com/google/android/gms/internal/ads/yh1.c : I
    //   8: invokespecial V9 : (Lcom/google/android/gms/internal/ads/zzvl;Lcom/google/android/gms/internal/ads/ti;I)V
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
  
  public final void w7(zzvl paramzzvl, ti paramti) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: getstatic com/google/android/gms/internal/ads/yh1.b : I
    //   8: invokespecial V9 : (Lcom/google/android/gms/internal/ads/zzvl;Lcom/google/android/gms/internal/ads/ti;I)V
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */