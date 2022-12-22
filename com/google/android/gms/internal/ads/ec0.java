package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

public final class ec0 extends p00 {
  private final Context h;
  
  private final WeakReference<tq> i;
  
  private final ta0 j;
  
  private final od0 k;
  
  private final n10 l;
  
  private final eo1 m;
  
  private final t40 n;
  
  private boolean o = false;
  
  ec0(s00 params00, Context paramContext, tq paramtq, ta0 paramta0, od0 paramod0, n10 paramn10, eo1 parameo1, t40 paramt40) {
    super(params00);
    this.h = paramContext;
    this.i = new WeakReference<tq>(paramtq);
    this.j = paramta0;
    this.k = paramod0;
    this.l = paramn10;
    this.m = parameo1;
    this.n = paramt40;
  }
  
  public final void finalize() {
    try {
      tq tq = this.i.get();
      x<Boolean> x = m0.n5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        if (!this.o && tq != null)
          fm.e.execute(dc0.a(tq)); 
      } else if (tq != null) {
        tq.destroy();
      } 
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public final boolean g() {
    return this.l.a();
  }
  
  public final boolean h(boolean paramBoolean, Activity paramActivity) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/m0.m0 : Lcom/google/android/gms/internal/ads/x;
    //   3: astore_3
    //   4: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   7: aload_3
    //   8: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   11: checkcast java/lang/Boolean
    //   14: invokevirtual booleanValue : ()Z
    //   17: ifeq -> 89
    //   20: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   23: pop
    //   24: aload_0
    //   25: getfield h : Landroid/content/Context;
    //   28: invokestatic B : (Landroid/content/Context;)Z
    //   31: ifeq -> 89
    //   34: ldc 'Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies'
    //   36: invokestatic i : (Ljava/lang/String;)V
    //   39: aload_0
    //   40: getfield n : Lcom/google/android/gms/internal/ads/t40;
    //   43: invokevirtual Q0 : ()V
    //   46: getstatic com/google/android/gms/internal/ads/m0.n0 : Lcom/google/android/gms/internal/ads/x;
    //   49: astore_3
    //   50: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   53: aload_3
    //   54: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   57: checkcast java/lang/Boolean
    //   60: invokevirtual booleanValue : ()Z
    //   63: ifeq -> 102
    //   66: aload_0
    //   67: getfield m : Lcom/google/android/gms/internal/ads/eo1;
    //   70: aload_0
    //   71: getfield a : Lcom/google/android/gms/internal/ads/ci1;
    //   74: getfield b : Lcom/google/android/gms/internal/ads/ai1;
    //   77: getfield b : Lcom/google/android/gms/internal/ads/sh1;
    //   80: getfield b : Ljava/lang/String;
    //   83: invokevirtual a : (Ljava/lang/String;)V
    //   86: goto -> 102
    //   89: aload_0
    //   90: getfield o : Z
    //   93: ifne -> 102
    //   96: iconst_1
    //   97: istore #4
    //   99: goto -> 105
    //   102: iconst_0
    //   103: istore #4
    //   105: iload #4
    //   107: ifne -> 112
    //   110: iconst_0
    //   111: ireturn
    //   112: aload_0
    //   113: getfield j : Lcom/google/android/gms/internal/ads/ta0;
    //   116: invokevirtual c1 : ()V
    //   119: aload_2
    //   120: astore_3
    //   121: aload_2
    //   122: ifnonnull -> 130
    //   125: aload_0
    //   126: getfield h : Landroid/content/Context;
    //   129: astore_3
    //   130: aload_0
    //   131: getfield k : Lcom/google/android/gms/internal/ads/od0;
    //   134: iload_1
    //   135: aload_3
    //   136: invokeinterface a : (ZLandroid/content/Context;)V
    //   141: aload_0
    //   142: getfield j : Lcom/google/android/gms/internal/ads/ta0;
    //   145: invokevirtual b1 : ()V
    //   148: aload_0
    //   149: iconst_1
    //   150: putfield o : Z
    //   153: iconst_1
    //   154: ireturn
    //   155: astore_2
    //   156: aload_0
    //   157: getfield n : Lcom/google/android/gms/internal/ads/t40;
    //   160: aload_2
    //   161: invokevirtual Y : (Lcom/google/android/gms/internal/ads/zzcaf;)V
    //   164: iconst_0
    //   165: ireturn
    // Exception table:
    //   from	to	target	type
    //   130	148	155	com/google/android/gms/internal/ads/zzcaf
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ec0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */