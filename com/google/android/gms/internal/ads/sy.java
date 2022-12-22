package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.b;
import java.util.concurrent.Executor;

final class sy extends qy {
  private final Context h;
  
  private final View i;
  
  private final tq j;
  
  private final qh1 k;
  
  private final q00 l;
  
  private final ag0 m;
  
  private final kb0 n;
  
  private final t82<t11> o;
  
  private final Executor p;
  
  private zzvs q;
  
  sy(s00 params00, Context paramContext, qh1 paramqh1, View paramView, tq paramtq, q00 paramq00, ag0 paramag0, kb0 paramkb0, t82<t11> paramt82, Executor paramExecutor) {
    super(params00);
    this.h = paramContext;
    this.i = paramView;
    this.j = paramtq;
    this.k = paramqh1;
    this.l = paramq00;
    this.m = paramag0;
    this.n = paramkb0;
    this.o = paramt82;
    this.p = paramExecutor;
  }
  
  public final void b() {
    this.p.execute(new wy(this));
    super.b();
  }
  
  public final nt2 g() {
    try {
      return this.l.getVideoController();
    } catch (zzdnt zzdnt) {
      return null;
    } 
  }
  
  public final void h(ViewGroup paramViewGroup, zzvs paramzzvs) {
    if (paramViewGroup != null) {
      tq tq1 = this.j;
      if (tq1 != null) {
        tq1.P(ks.i(paramzzvs));
        paramViewGroup.setMinimumHeight(paramzzvs.d);
        paramViewGroup.setMinimumWidth(paramzzvs.g);
        this.q = paramzzvs;
      } 
    } 
  }
  
  public final qh1 i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Lcom/google/android/gms/internal/ads/zzvs;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 14
    //   9: aload_1
    //   10: invokestatic c : (Lcom/google/android/gms/internal/ads/zzvs;)Lcom/google/android/gms/internal/ads/qh1;
    //   13: areturn
    //   14: aload_0
    //   15: getfield b : Lcom/google/android/gms/internal/ads/nh1;
    //   18: astore_1
    //   19: aload_1
    //   20: getfield W : Z
    //   23: ifeq -> 102
    //   26: aload_1
    //   27: getfield a : Ljava/util/List;
    //   30: invokeinterface iterator : ()Ljava/util/Iterator;
    //   35: astore_2
    //   36: aload_2
    //   37: invokeinterface hasNext : ()Z
    //   42: ifeq -> 73
    //   45: aload_2
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast java/lang/String
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull -> 36
    //   59: aload_1
    //   60: ldc 'FirstParty'
    //   62: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   65: ifeq -> 36
    //   68: iconst_1
    //   69: istore_3
    //   70: goto -> 75
    //   73: iconst_0
    //   74: istore_3
    //   75: iload_3
    //   76: ifne -> 102
    //   79: new com/google/android/gms/internal/ads/qh1
    //   82: dup
    //   83: aload_0
    //   84: getfield i : Landroid/view/View;
    //   87: invokevirtual getWidth : ()I
    //   90: aload_0
    //   91: getfield i : Landroid/view/View;
    //   94: invokevirtual getHeight : ()I
    //   97: iconst_0
    //   98: invokespecial <init> : (IIZ)V
    //   101: areturn
    //   102: aload_0
    //   103: getfield b : Lcom/google/android/gms/internal/ads/nh1;
    //   106: getfield q : Ljava/util/List;
    //   109: aload_0
    //   110: getfield k : Lcom/google/android/gms/internal/ads/qh1;
    //   113: invokestatic a : (Ljava/util/List;Lcom/google/android/gms/internal/ads/qh1;)Lcom/google/android/gms/internal/ads/qh1;
    //   116: areturn
  }
  
  public final View j() {
    return this.i;
  }
  
  public final qh1 k() {
    return this.k;
  }
  
  public final int l() {
    x<Boolean> x = m0.y5;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && this.b.b0) {
      x = m0.z5;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
        return 0; 
    } 
    return this.a.b.b.c;
  }
  
  public final void m() {
    this.n.b1();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */