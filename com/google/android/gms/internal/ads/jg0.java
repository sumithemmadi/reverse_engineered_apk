package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class jg0 extends p3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, jh0 {
  public static final String[] b = new String[] { "2011", "1009", "3010" };
  
  private final String c;
  
  private Map<String, WeakReference<View>> d = new HashMap<String, WeakReference<View>>();
  
  private FrameLayout e;
  
  private FrameLayout f;
  
  private nt1 g;
  
  private View h;
  
  private final int i;
  
  private ff0 j;
  
  private uk2 k;
  
  private a l = null;
  
  private i3 m;
  
  private boolean n;
  
  private boolean o = false;
  
  public jg0(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2, int paramInt) {
    this.e = paramFrameLayout1;
    this.f = paramFrameLayout2;
    this.i = 204204000;
    String str = paramFrameLayout1.getClass().getCanonicalName();
    if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(str)) {
      str = "1007";
    } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(str)) {
      str = "2009";
    } else {
      "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(str);
      str = "3012";
    } 
    this.c = str;
    q.z();
    an.a((View)paramFrameLayout1, this);
    q.z();
    an.b((View)paramFrameLayout1, this);
    this.g = fm.e;
    this.k = new uk2(this.e.getContext(), (View)this.e);
    paramFrameLayout1.setOnTouchListener(this);
    paramFrameLayout1.setOnClickListener(this);
  }
  
  private final void T9() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Lcom/google/android/gms/internal/ads/nt1;
    //   6: astore_1
    //   7: new com/google/android/gms/internal/ads/mg0
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jg0;)V
    //   16: aload_1
    //   17: aload_2
    //   18: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	26	finally
  }
  
  public final void C1(a parama, int paramInt) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jg0}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jg0}} */
  }
  
  public final Map<String, WeakReference<View>> J7() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/Map;
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
  
  public final void K3(String paramString, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   8: checkcast android/view/View
    //   11: iconst_1
    //   12: invokevirtual q2 : (Ljava/lang/String;Landroid/view/View;Z)V
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
  
  public final void P4(a parama) {
    MotionEvent motionEvent = (MotionEvent)b.o1(parama);
    onTouch((View)this.e, motionEvent);
  }
  
  public final uk2 Q6() {
    return this.k;
  }
  
  public final a W6(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual j3 : (Ljava/lang/String;)Landroid/view/View;
    //   7: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: areturn
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
  
  public final JSONObject Y0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 32
    //   11: aload_1
    //   12: aload_0
    //   13: getfield e : Landroid/widget/FrameLayout;
    //   16: aload_0
    //   17: invokevirtual u6 : ()Ljava/util/Map;
    //   20: aload_0
    //   21: invokevirtual J7 : ()Ljava/util/Map;
    //   24: invokevirtual k : (Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONObject;
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: areturn
    //   32: aload_0
    //   33: monitorexit
    //   34: aconst_null
    //   35: areturn
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	36	finally
    //   11	28	36	finally
  }
  
  public final a b8() {
    return this.l;
  }
  
  public final void d1(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_1
    //   15: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: instanceof com/google/android/gms/internal/ads/ff0
    //   23: ifne -> 34
    //   26: ldc 'Not an instance of native engine. This is most likely a transient error'
    //   28: invokestatic i : (Ljava/lang/String;)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull -> 48
    //   43: aload_3
    //   44: aload_0
    //   45: invokevirtual D : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   48: aload_0
    //   49: invokespecial T9 : ()V
    //   52: aload_1
    //   53: checkcast com/google/android/gms/internal/ads/ff0
    //   56: astore_1
    //   57: aload_0
    //   58: aload_1
    //   59: putfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   62: aload_1
    //   63: aload_0
    //   64: invokevirtual o : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   67: aload_0
    //   68: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   71: aload_0
    //   72: getfield e : Landroid/widget/FrameLayout;
    //   75: invokevirtual s : (Landroid/view/View;)V
    //   78: aload_0
    //   79: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   82: aload_0
    //   83: getfield f : Landroid/widget/FrameLayout;
    //   86: invokevirtual t : (Landroid/view/View;)V
    //   89: aload_0
    //   90: getfield n : Z
    //   93: ifeq -> 110
    //   96: aload_0
    //   97: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   100: invokevirtual x : ()Lcom/google/android/gms/internal/ads/of0;
    //   103: aload_0
    //   104: getfield m : Lcom/google/android/gms/internal/ads/i3;
    //   107: invokevirtual a : (Lcom/google/android/gms/internal/ads/i3;)V
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	113	finally
    //   14	31	113	finally
    //   34	39	113	finally
    //   43	48	113	finally
    //   48	110	113	finally
  }
  
  public final void destroy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull -> 33
    //   23: aload_2
    //   24: aload_0
    //   25: invokevirtual D : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   28: aload_0
    //   29: aconst_null
    //   30: putfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   33: aload_0
    //   34: getfield d : Ljava/util/Map;
    //   37: invokeinterface clear : ()V
    //   42: aload_0
    //   43: getfield e : Landroid/widget/FrameLayout;
    //   46: invokevirtual removeAllViews : ()V
    //   49: aload_0
    //   50: getfield f : Landroid/widget/FrameLayout;
    //   53: invokevirtual removeAllViews : ()V
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield d : Ljava/util/Map;
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield e : Landroid/widget/FrameLayout;
    //   66: aload_0
    //   67: aconst_null
    //   68: putfield f : Landroid/widget/FrameLayout;
    //   71: aload_0
    //   72: aconst_null
    //   73: putfield h : Landroid/view/View;
    //   76: aload_0
    //   77: aconst_null
    //   78: putfield k : Lcom/google/android/gms/internal/ads/uk2;
    //   81: aload_0
    //   82: iconst_1
    //   83: putfield o : Z
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: astore_2
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_2
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	89	finally
    //   14	19	89	finally
    //   23	33	89	finally
    //   33	86	89	finally
  }
  
  public final void i0(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   6: aload_1
    //   7: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   10: checkcast android/view/View
    //   13: invokevirtual j : (Landroid/view/View;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally
  }
  
  public final FrameLayout j2() {
    return this.f;
  }
  
  public final View j3(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: aload_0
    //   16: getfield d : Ljava/util/Map;
    //   19: aload_1
    //   20: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast java/lang/ref/WeakReference
    //   28: astore_1
    //   29: aload_1
    //   30: ifnonnull -> 37
    //   33: aload_0
    //   34: monitorexit
    //   35: aconst_null
    //   36: areturn
    //   37: aload_1
    //   38: invokevirtual get : ()Ljava/lang/Object;
    //   41: checkcast android/view/View
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: areturn
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	49	finally
    //   15	29	49	finally
    //   37	45	49	finally
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 36
    //   11: aload_2
    //   12: invokevirtual g : ()V
    //   15: aload_0
    //   16: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   19: aload_1
    //   20: aload_0
    //   21: getfield e : Landroid/widget/FrameLayout;
    //   24: aload_0
    //   25: invokevirtual u6 : ()Ljava/util/Map;
    //   28: aload_0
    //   29: invokevirtual J7 : ()Ljava/util/Map;
    //   32: iconst_0
    //   33: invokevirtual m : (Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	39	finally
    //   11	36	39	finally
  }
  
  public final void onGlobalLayout() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 34
    //   11: aload_1
    //   12: aload_0
    //   13: getfield e : Landroid/widget/FrameLayout;
    //   16: aload_0
    //   17: invokevirtual u6 : ()Ljava/util/Map;
    //   20: aload_0
    //   21: invokevirtual J7 : ()Ljava/util/Map;
    //   24: aload_0
    //   25: getfield e : Landroid/widget/FrameLayout;
    //   28: invokestatic N : (Landroid/view/View;)Z
    //   31: invokevirtual A : (Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   11	34	37	finally
  }
  
  public final void onScrollChanged() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 34
    //   11: aload_1
    //   12: aload_0
    //   13: getfield e : Landroid/widget/FrameLayout;
    //   16: aload_0
    //   17: invokevirtual u6 : ()Ljava/util/Map;
    //   20: aload_0
    //   21: invokevirtual J7 : ()Ljava/util/Map;
    //   24: aload_0
    //   25: getfield e : Landroid/widget/FrameLayout;
    //   28: invokestatic N : (Landroid/view/View;)Z
    //   31: invokevirtual A : (Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   11	34	37	finally
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 21
    //   11: aload_3
    //   12: aload_1
    //   13: aload_2
    //   14: aload_0
    //   15: getfield e : Landroid/widget/FrameLayout;
    //   18: invokevirtual l : (Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    //   21: aload_0
    //   22: monitorexit
    //   23: iconst_0
    //   24: ireturn
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	25	finally
    //   11	21	25	finally
  }
  
  public final void q2(String paramString, View paramView, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_2
    //   15: ifnonnull -> 32
    //   18: aload_0
    //   19: getfield d : Ljava/util/Map;
    //   22: aload_1
    //   23: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   28: pop
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_0
    //   33: getfield d : Ljava/util/Map;
    //   36: astore #4
    //   38: new java/lang/ref/WeakReference
    //   41: astore #5
    //   43: aload #5
    //   45: aload_2
    //   46: invokespecial <init> : (Ljava/lang/Object;)V
    //   49: aload #4
    //   51: aload_1
    //   52: aload #5
    //   54: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   59: pop
    //   60: ldc_w '1098'
    //   63: aload_1
    //   64: invokevirtual equals : (Ljava/lang/Object;)Z
    //   67: ifne -> 111
    //   70: ldc_w '3011'
    //   73: aload_1
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 83
    //   80: goto -> 111
    //   83: aload_0
    //   84: getfield i : I
    //   87: invokestatic k : (I)Z
    //   90: ifeq -> 98
    //   93: aload_2
    //   94: aload_0
    //   95: invokevirtual setOnTouchListener : (Landroid/view/View$OnTouchListener;)V
    //   98: aload_2
    //   99: iconst_1
    //   100: invokevirtual setClickable : (Z)V
    //   103: aload_2
    //   104: aload_0
    //   105: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   108: aload_0
    //   109: monitorexit
    //   110: return
    //   111: aload_0
    //   112: monitorexit
    //   113: return
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	114	finally
    //   18	29	114	finally
    //   32	80	114	finally
    //   83	98	114	finally
    //   98	108	114	finally
  }
  
  public final void r6(i3 parami3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield n : Z
    //   19: aload_0
    //   20: aload_1
    //   21: putfield m : Lcom/google/android/gms/internal/ads/i3;
    //   24: aload_0
    //   25: getfield j : Lcom/google/android/gms/internal/ads/ff0;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull -> 41
    //   33: aload_3
    //   34: invokevirtual x : ()Lcom/google/android/gms/internal/ads/of0;
    //   37: aload_1
    //   38: invokevirtual a : (Lcom/google/android/gms/internal/ads/i3;)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	44	finally
    //   14	29	44	finally
    //   33	41	44	finally
  }
  
  public final Map<String, WeakReference<View>> r8() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jg0}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jg0}} */
    return null;
  }
  
  public final Map<String, WeakReference<View>> u6() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/Map;
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
  
  public final String w9() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/lang/String;
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
  
  public final void y3(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: putfield l : Lcom/google/android/gms/dynamic/a;
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
    //   14	19	22	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */