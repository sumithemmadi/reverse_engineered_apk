package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

public final class ly extends p00 {
  private final tq h;
  
  private final int i;
  
  private final Context j;
  
  private final px k;
  
  private final od0 l;
  
  private boolean m = false;
  
  ly(s00 params00, Context paramContext, tq paramtq, int paramInt, px parampx, od0 paramod0) {
    super(params00);
    this.h = paramtq;
    this.j = paramContext;
    this.i = paramInt;
    this.k = parampx;
    this.l = paramod0;
  }
  
  public final void a() {
    super.a();
    tq tq1 = this.h;
    if (tq1 != null)
      tq1.destroy(); 
  }
  
  public final void g(Activity paramActivity, zm2 paramzm2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: astore #4
    //   3: aload_1
    //   4: ifnonnull -> 13
    //   7: aload_0
    //   8: getfield j : Landroid/content/Context;
    //   11: astore #4
    //   13: getstatic com/google/android/gms/internal/ads/m0.m0 : Lcom/google/android/gms/internal/ads/x;
    //   16: astore_1
    //   17: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   20: aload_1
    //   21: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   24: checkcast java/lang/Boolean
    //   27: invokevirtual booleanValue : ()Z
    //   30: istore #5
    //   32: iconst_0
    //   33: istore #6
    //   35: iload #5
    //   37: ifeq -> 136
    //   40: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   43: pop
    //   44: aload #4
    //   46: invokestatic B : (Landroid/content/Context;)Z
    //   49: ifeq -> 136
    //   52: ldc 'Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies'
    //   54: invokestatic i : (Ljava/lang/String;)V
    //   57: aload_2
    //   58: getstatic com/google/android/gms/internal/ads/zzdom.l : Lcom/google/android/gms/internal/ads/zzdom;
    //   61: aconst_null
    //   62: aconst_null
    //   63: invokestatic b : (Lcom/google/android/gms/internal/ads/zzdom;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvg;)Lcom/google/android/gms/internal/ads/zzvg;
    //   66: invokeinterface t0 : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   71: getstatic com/google/android/gms/internal/ads/m0.n0 : Lcom/google/android/gms/internal/ads/x;
    //   74: astore_1
    //   75: iload #6
    //   77: istore #7
    //   79: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   82: aload_1
    //   83: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   86: checkcast java/lang/Boolean
    //   89: invokevirtual booleanValue : ()Z
    //   92: ifeq -> 162
    //   95: new com/google/android/gms/internal/ads/eo1
    //   98: dup
    //   99: aload #4
    //   101: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   104: invokestatic q : ()Lcom/google/android/gms/ads/internal/util/l0;
    //   107: invokevirtual b : ()Landroid/os/Looper;
    //   110: invokespecial <init> : (Landroid/content/Context;Landroid/os/Looper;)V
    //   113: aload_0
    //   114: getfield a : Lcom/google/android/gms/internal/ads/ci1;
    //   117: getfield b : Lcom/google/android/gms/internal/ads/ai1;
    //   120: getfield b : Lcom/google/android/gms/internal/ads/sh1;
    //   123: getfield b : Ljava/lang/String;
    //   126: invokevirtual a : (Ljava/lang/String;)V
    //   129: iload #6
    //   131: istore #7
    //   133: goto -> 162
    //   136: aload_0
    //   137: getfield m : Z
    //   140: ifeq -> 148
    //   143: ldc 'App open interstitial ad is already visible.'
    //   145: invokestatic i : (Ljava/lang/String;)V
    //   148: iload #6
    //   150: istore #7
    //   152: aload_0
    //   153: getfield m : Z
    //   156: ifne -> 162
    //   159: iconst_1
    //   160: istore #7
    //   162: iload #7
    //   164: ifne -> 168
    //   167: return
    //   168: aload_0
    //   169: getfield l : Lcom/google/android/gms/internal/ads/od0;
    //   172: iload_3
    //   173: aload #4
    //   175: invokeinterface a : (ZLandroid/content/Context;)V
    //   180: aload_0
    //   181: iconst_1
    //   182: putfield m : Z
    //   185: return
    //   186: astore_1
    //   187: aload_2
    //   188: aload_1
    //   189: invokestatic d : (Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzvg;
    //   192: invokeinterface t0 : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   197: return
    // Exception table:
    //   from	to	target	type
    //   168	180	186	com/google/android/gms/internal/ads/zzcaf
  }
  
  public final void h(lm2 paramlm2) {
    tq tq1 = this.h;
    if (tq1 != null)
      tq1.u(paramlm2); 
  }
  
  public final int i() {
    return this.i;
  }
  
  public final void j(long paramLong, int paramInt) {
    this.k.a(paramLong, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */