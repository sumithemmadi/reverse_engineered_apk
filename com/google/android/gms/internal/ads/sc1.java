package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

public abstract class sc1<AppOpenAd extends p00, AppOpenRequestComponent extends yx<AppOpenAd>, AppOpenRequestComponentBuilder extends x30<AppOpenRequestComponent>> implements f31<AppOpenAd> {
  private final Context a;
  
  private final Executor b;
  
  protected final ss c;
  
  private final yc1 d;
  
  private final cf1<AppOpenRequestComponent, AppOpenAd> e;
  
  private final ViewGroup f;
  
  private final ii1 g;
  
  private ot1<AppOpenAd> h;
  
  protected sc1(Context paramContext, Executor paramExecutor, ss paramss, cf1<AppOpenRequestComponent, AppOpenAd> paramcf1, yc1 paramyc1, ii1 paramii1) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = paramss;
    this.e = paramcf1;
    this.d = paramyc1;
    this.g = paramii1;
    this.f = (ViewGroup)new FrameLayout(paramContext);
  }
  
  private final AppOpenRequestComponentBuilder d(bf1 parambf1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: checkcast com/google/android/gms/internal/ads/vc1
    //   6: astore_1
    //   7: getstatic com/google/android/gms/internal/ads/m0.K5 : Lcom/google/android/gms/internal/ads/x;
    //   10: astore_2
    //   11: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   14: aload_2
    //   15: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   18: checkcast java/lang/Boolean
    //   21: invokevirtual booleanValue : ()Z
    //   24: ifeq -> 89
    //   27: new com/google/android/gms/internal/ads/py
    //   30: astore_2
    //   31: aload_2
    //   32: aload_0
    //   33: getfield f : Landroid/view/ViewGroup;
    //   36: invokespecial <init> : (Landroid/view/ViewGroup;)V
    //   39: new com/google/android/gms/internal/ads/w30$a
    //   42: astore_3
    //   43: aload_3
    //   44: invokespecial <init> : ()V
    //   47: aload_3
    //   48: aload_0
    //   49: getfield a : Landroid/content/Context;
    //   52: invokevirtual g : (Landroid/content/Context;)Lcom/google/android/gms/internal/ads/w30$a;
    //   55: aload_1
    //   56: getfield a : Lcom/google/android/gms/internal/ads/gi1;
    //   59: invokevirtual c : (Lcom/google/android/gms/internal/ads/gi1;)Lcom/google/android/gms/internal/ads/w30$a;
    //   62: invokevirtual d : ()Lcom/google/android/gms/internal/ads/w30;
    //   65: astore_3
    //   66: new com/google/android/gms/internal/ads/k90$a
    //   69: astore_1
    //   70: aload_1
    //   71: invokespecial <init> : ()V
    //   74: aload_0
    //   75: aload_2
    //   76: aload_3
    //   77: aload_1
    //   78: invokevirtual n : ()Lcom/google/android/gms/internal/ads/k90;
    //   81: invokevirtual b : (Lcom/google/android/gms/internal/ads/py;Lcom/google/android/gms/internal/ads/w30;Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/x30;
    //   84: astore_1
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_1
    //   88: areturn
    //   89: aload_0
    //   90: getfield d : Lcom/google/android/gms/internal/ads/yc1;
    //   93: invokestatic e : (Lcom/google/android/gms/internal/ads/yc1;)Lcom/google/android/gms/internal/ads/yc1;
    //   96: astore_3
    //   97: new com/google/android/gms/internal/ads/k90$a
    //   100: astore_2
    //   101: aload_2
    //   102: invokespecial <init> : ()V
    //   105: aload_2
    //   106: aload_3
    //   107: aload_0
    //   108: getfield b : Ljava/util/concurrent/Executor;
    //   111: invokevirtual d : (Lcom/google/android/gms/internal/ads/r40;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;
    //   114: pop
    //   115: aload_2
    //   116: aload_3
    //   117: aload_0
    //   118: getfield b : Ljava/util/concurrent/Executor;
    //   121: invokevirtual h : (Lcom/google/android/gms/internal/ads/i60;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;
    //   124: pop
    //   125: aload_2
    //   126: aload_3
    //   127: aload_0
    //   128: getfield b : Ljava/util/concurrent/Executor;
    //   131: invokevirtual b : (Lcom/google/android/gms/ads/internal/overlay/p;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;
    //   134: pop
    //   135: aload_2
    //   136: aload_3
    //   137: invokevirtual k : (Lcom/google/android/gms/internal/ads/ze1;)Lcom/google/android/gms/internal/ads/k90$a;
    //   140: pop
    //   141: new com/google/android/gms/internal/ads/py
    //   144: astore #4
    //   146: aload #4
    //   148: aload_0
    //   149: getfield f : Landroid/view/ViewGroup;
    //   152: invokespecial <init> : (Landroid/view/ViewGroup;)V
    //   155: new com/google/android/gms/internal/ads/w30$a
    //   158: astore_3
    //   159: aload_3
    //   160: invokespecial <init> : ()V
    //   163: aload_0
    //   164: aload #4
    //   166: aload_3
    //   167: aload_0
    //   168: getfield a : Landroid/content/Context;
    //   171: invokevirtual g : (Landroid/content/Context;)Lcom/google/android/gms/internal/ads/w30$a;
    //   174: aload_1
    //   175: getfield a : Lcom/google/android/gms/internal/ads/gi1;
    //   178: invokevirtual c : (Lcom/google/android/gms/internal/ads/gi1;)Lcom/google/android/gms/internal/ads/w30$a;
    //   181: invokevirtual d : ()Lcom/google/android/gms/internal/ads/w30;
    //   184: aload_2
    //   185: invokevirtual n : ()Lcom/google/android/gms/internal/ads/k90;
    //   188: invokevirtual b : (Lcom/google/android/gms/internal/ads/py;Lcom/google/android/gms/internal/ads/w30;Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/x30;
    //   191: astore_1
    //   192: aload_0
    //   193: monitorexit
    //   194: aload_1
    //   195: areturn
    //   196: astore_1
    //   197: aload_0
    //   198: monitorexit
    //   199: aload_1
    //   200: athrow
    // Exception table:
    //   from	to	target	type
    //   2	85	196	finally
    //   89	192	196	finally
  }
  
  public final boolean a(zzvl paramzzvl, String paramString, e31 parame31, h31<? super AppOpenAd> paramh31) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'loadAd must be called on the main UI thread.'
    //   4: invokestatic e : (Ljava/lang/String;)V
    //   7: aload_2
    //   8: ifnonnull -> 41
    //   11: ldc 'Ad unit ID should not be null for app open ad.'
    //   13: invokestatic g : (Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield b : Ljava/util/concurrent/Executor;
    //   20: astore_2
    //   21: new com/google/android/gms/internal/ads/rc1
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial <init> : (Lcom/google/android/gms/internal/ads/sc1;)V
    //   30: aload_2
    //   31: aload_1
    //   32: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   37: aload_0
    //   38: monitorexit
    //   39: iconst_0
    //   40: ireturn
    //   41: aload_0
    //   42: getfield h : Lcom/google/android/gms/internal/ads/ot1;
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull -> 54
    //   50: aload_0
    //   51: monitorexit
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_0
    //   55: getfield a : Landroid/content/Context;
    //   58: aload_1
    //   59: getfield g : Z
    //   62: invokestatic b : (Landroid/content/Context;Z)V
    //   65: aload_0
    //   66: getfield g : Lcom/google/android/gms/internal/ads/ii1;
    //   69: aload_2
    //   70: invokevirtual A : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ii1;
    //   73: invokestatic t0 : ()Lcom/google/android/gms/internal/ads/zzvs;
    //   76: invokevirtual z : (Lcom/google/android/gms/internal/ads/zzvs;)Lcom/google/android/gms/internal/ads/ii1;
    //   79: aload_1
    //   80: invokevirtual C : (Lcom/google/android/gms/internal/ads/zzvl;)Lcom/google/android/gms/internal/ads/ii1;
    //   83: invokevirtual e : ()Lcom/google/android/gms/internal/ads/gi1;
    //   86: astore_2
    //   87: new com/google/android/gms/internal/ads/vc1
    //   90: astore_1
    //   91: aload_1
    //   92: aconst_null
    //   93: invokespecial <init> : (Lcom/google/android/gms/internal/ads/tc1;)V
    //   96: aload_1
    //   97: aload_2
    //   98: putfield a : Lcom/google/android/gms/internal/ads/gi1;
    //   101: aload_0
    //   102: getfield e : Lcom/google/android/gms/internal/ads/cf1;
    //   105: astore #5
    //   107: new com/google/android/gms/internal/ads/df1
    //   110: astore_2
    //   111: aload_2
    //   112: aload_1
    //   113: invokespecial <init> : (Lcom/google/android/gms/internal/ads/bf1;)V
    //   116: new com/google/android/gms/internal/ads/uc1
    //   119: astore_3
    //   120: aload_3
    //   121: aload_0
    //   122: invokespecial <init> : (Lcom/google/android/gms/internal/ads/sc1;)V
    //   125: aload #5
    //   127: aload_2
    //   128: aload_3
    //   129: invokeinterface b : (Lcom/google/android/gms/internal/ads/df1;Lcom/google/android/gms/internal/ads/ef1;)Lcom/google/android/gms/internal/ads/ot1;
    //   134: astore_3
    //   135: aload_0
    //   136: aload_3
    //   137: putfield h : Lcom/google/android/gms/internal/ads/ot1;
    //   140: new com/google/android/gms/internal/ads/tc1
    //   143: astore_2
    //   144: aload_2
    //   145: aload_0
    //   146: aload #4
    //   148: aload_1
    //   149: invokespecial <init> : (Lcom/google/android/gms/internal/ads/sc1;Lcom/google/android/gms/internal/ads/h31;Lcom/google/android/gms/internal/ads/vc1;)V
    //   152: aload_3
    //   153: aload_2
    //   154: aload_0
    //   155: getfield b : Ljava/util/concurrent/Executor;
    //   158: invokestatic g : (Lcom/google/android/gms/internal/ads/ot1;Lcom/google/android/gms/internal/ads/et1;Ljava/util/concurrent/Executor;)V
    //   161: aload_0
    //   162: monitorexit
    //   163: iconst_1
    //   164: ireturn
    //   165: astore_1
    //   166: aload_0
    //   167: monitorexit
    //   168: aload_1
    //   169: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	165	finally
    //   11	37	165	finally
    //   41	46	165	finally
    //   54	161	165	finally
  }
  
  protected abstract AppOpenRequestComponentBuilder b(py parampy, w30 paramw30, k90 paramk90);
  
  public final void g(zzvx paramzzvx) {
    this.g.j(paramzzvx);
  }
  
  public final boolean r() {
    ot1<AppOpenAd> ot11 = this.h;
    return (ot11 != null && !ot11.isDone());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */