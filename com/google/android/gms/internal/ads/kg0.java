package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamic.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class kg0 extends w3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, jh0 {
  private final WeakReference<View> b;
  
  private final Map<String, WeakReference<View>> c = new HashMap<String, WeakReference<View>>();
  
  private final Map<String, WeakReference<View>> d = new HashMap<String, WeakReference<View>>();
  
  private final Map<String, WeakReference<View>> e = new HashMap<String, WeakReference<View>>();
  
  private ff0 f;
  
  private uk2 g;
  
  public kg0(View paramView, HashMap<String, View> paramHashMap1, HashMap<String, View> paramHashMap2) {
    paramView.setOnTouchListener(this);
    paramView.setOnClickListener(this);
    q.z();
    an.a(paramView, this);
    q.z();
    an.b(paramView, this);
    this.b = new WeakReference<View>(paramView);
    for (Map.Entry<String, View> entry : paramHashMap1.entrySet()) {
      String str = (String)entry.getKey();
      View view = (View)entry.getValue();
      if (view != null) {
        this.c.put(str, new WeakReference<View>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
          view.setOnTouchListener(this);
          view.setClickable(true);
          view.setOnClickListener(this);
        } 
      } 
    } 
    this.e.putAll(this.c);
    for (Map.Entry<String, View> entry : paramHashMap2.entrySet()) {
      View view = (View)entry.getValue();
      if (view != null) {
        this.d.put((String)entry.getKey(), new WeakReference<View>(view));
        view.setOnTouchListener(this);
        view.setClickable(false);
      } 
    } 
    this.e.putAll(this.d);
    this.g = new uk2(paramView.getContext(), paramView);
  }
  
  public final Map<String, WeakReference<View>> J7() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
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
  
  public final uk2 Q6() {
    return this.g;
  }
  
  public final JSONObject Y0() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/kg0}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/kg0}} */
    return null;
  }
  
  public final void Y7() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 21
    //   11: aload_1
    //   12: aload_0
    //   13: invokevirtual D : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield f : Lcom/google/android/gms/internal/ads/ff0;
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
    //   2	7	24	finally
    //   11	21	24	finally
  }
  
  public final a b8() {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/kg0}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/kg0}} */
    return null;
  }
  
  public final void d1(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: instanceof com/google/android/gms/internal/ads/ff0
    //   11: ifne -> 22
    //   14: ldc 'Not an instance of InternalNativeAd. This is most likely a transient error'
    //   16: invokestatic i : (Ljava/lang/String;)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   26: astore_2
    //   27: aload_2
    //   28: ifnull -> 36
    //   31: aload_2
    //   32: aload_0
    //   33: invokevirtual D : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   36: aload_1
    //   37: checkcast com/google/android/gms/internal/ads/ff0
    //   40: invokevirtual v : ()Z
    //   43: ifeq -> 75
    //   46: aload_1
    //   47: checkcast com/google/android/gms/internal/ads/ff0
    //   50: astore_1
    //   51: aload_0
    //   52: aload_1
    //   53: putfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   56: aload_1
    //   57: aload_0
    //   58: invokevirtual o : (Lcom/google/android/gms/internal/ads/jh0;)V
    //   61: aload_0
    //   62: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   65: aload_0
    //   66: invokevirtual t9 : ()Landroid/view/View;
    //   69: invokevirtual s : (Landroid/view/View;)V
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: ldc 'Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.'
    //   77: invokestatic g : (Ljava/lang/String;)V
    //   80: aload_0
    //   81: monitorexit
    //   82: return
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	83	finally
    //   22	27	83	finally
    //   31	36	83	finally
    //   36	72	83	finally
    //   75	80	83	finally
  }
  
  public final void i0(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   6: ifnull -> 37
    //   9: aload_1
    //   10: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   13: astore_1
    //   14: aload_1
    //   15: instanceof android/view/View
    //   18: ifne -> 26
    //   21: ldc 'Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object'
    //   23: invokestatic i : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   30: aload_1
    //   31: checkcast android/view/View
    //   34: invokevirtual j : (Landroid/view/View;)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	40	finally
    //   26	37	40	finally
  }
  
  public final FrameLayout j2() {
    return null;
  }
  
  public final View j3(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast java/lang/ref/WeakReference
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload_1
    //   25: invokevirtual get : ()Ljava/lang/Object;
    //   28: checkcast android/view/View
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	36	finally
    //   24	32	36	finally
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 29
    //   11: aload_2
    //   12: aload_1
    //   13: aload_0
    //   14: invokevirtual t9 : ()Landroid/view/View;
    //   17: aload_0
    //   18: invokevirtual u6 : ()Ljava/util/Map;
    //   21: aload_0
    //   22: invokevirtual J7 : ()Ljava/util/Map;
    //   25: iconst_1
    //   26: invokevirtual m : (Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	32	finally
    //   11	29	32	finally
  }
  
  public final void onGlobalLayout() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 34
    //   11: aload_1
    //   12: aload_0
    //   13: invokevirtual t9 : ()Landroid/view/View;
    //   16: aload_0
    //   17: invokevirtual u6 : ()Ljava/util/Map;
    //   20: aload_0
    //   21: invokevirtual J7 : ()Ljava/util/Map;
    //   24: aload_0
    //   25: invokevirtual t9 : ()Landroid/view/View;
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
    //   3: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 34
    //   11: aload_1
    //   12: aload_0
    //   13: invokevirtual t9 : ()Landroid/view/View;
    //   16: aload_0
    //   17: invokevirtual u6 : ()Ljava/util/Map;
    //   20: aload_0
    //   21: invokevirtual J7 : ()Ljava/util/Map;
    //   24: aload_0
    //   25: invokevirtual t9 : ()Landroid/view/View;
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
    //   3: getfield f : Lcom/google/android/gms/internal/ads/ff0;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 21
    //   11: aload_3
    //   12: aload_1
    //   13: aload_2
    //   14: aload_0
    //   15: invokevirtual t9 : ()Landroid/view/View;
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
    //   2: aload_2
    //   3: ifnonnull -> 42
    //   6: aload_0
    //   7: getfield e : Ljava/util/Map;
    //   10: aload_1
    //   11: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_0
    //   18: getfield c : Ljava/util/Map;
    //   21: aload_1
    //   22: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   27: pop
    //   28: aload_0
    //   29: getfield d : Ljava/util/Map;
    //   32: aload_1
    //   33: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: pop
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: aload_0
    //   43: getfield e : Ljava/util/Map;
    //   46: astore #4
    //   48: new java/lang/ref/WeakReference
    //   51: astore #5
    //   53: aload #5
    //   55: aload_2
    //   56: invokespecial <init> : (Ljava/lang/Object;)V
    //   59: aload #4
    //   61: aload_1
    //   62: aload #5
    //   64: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: ldc '1098'
    //   72: aload_1
    //   73: invokevirtual equals : (Ljava/lang/Object;)Z
    //   76: ifne -> 137
    //   79: ldc '3011'
    //   81: aload_1
    //   82: invokevirtual equals : (Ljava/lang/Object;)Z
    //   85: ifeq -> 91
    //   88: goto -> 137
    //   91: aload_0
    //   92: getfield c : Ljava/util/Map;
    //   95: astore #4
    //   97: new java/lang/ref/WeakReference
    //   100: astore #5
    //   102: aload #5
    //   104: aload_2
    //   105: invokespecial <init> : (Ljava/lang/Object;)V
    //   108: aload #4
    //   110: aload_1
    //   111: aload #5
    //   113: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   118: pop
    //   119: aload_2
    //   120: iconst_1
    //   121: invokevirtual setClickable : (Z)V
    //   124: aload_2
    //   125: aload_0
    //   126: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   129: aload_2
    //   130: aload_0
    //   131: invokevirtual setOnTouchListener : (Landroid/view/View$OnTouchListener;)V
    //   134: aload_0
    //   135: monitorexit
    //   136: return
    //   137: aload_0
    //   138: monitorexit
    //   139: return
    //   140: astore_1
    //   141: aload_0
    //   142: monitorexit
    //   143: aload_1
    //   144: athrow
    // Exception table:
    //   from	to	target	type
    //   6	39	140	finally
    //   42	88	140	finally
    //   91	134	140	finally
  }
  
  public final Map<String, WeakReference<View>> r8() {
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
  
  public final View t9() {
    return this.b.get();
  }
  
  public final Map<String, WeakReference<View>> u6() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/util/Map;
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
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/kg0}} */
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/kg0}} */
    return "1007";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */