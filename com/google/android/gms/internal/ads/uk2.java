package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.util.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@TargetApi(14)
public final class uk2 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
  private static final long b;
  
  private final Context c;
  
  private Application d;
  
  private final WindowManager e;
  
  private final PowerManager f;
  
  private final KeyguardManager g;
  
  private BroadcastReceiver h;
  
  private WeakReference<ViewTreeObserver> i;
  
  private WeakReference<View> j;
  
  private bl2 k;
  
  private p0 l = new p0(b);
  
  private boolean m = false;
  
  private int n = -1;
  
  private final HashSet<yk2> o = new HashSet<yk2>();
  
  private final DisplayMetrics p;
  
  private final Rect q;
  
  static {
    x<Long> x = m0.i1;
    b = ((Long)er2.e().<Long>c(x)).longValue();
  }
  
  public uk2(Context paramContext, View paramView) {
    Context context = paramContext.getApplicationContext();
    this.c = context;
    WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
    this.e = windowManager;
    this.f = (PowerManager)context.getSystemService("power");
    this.g = (KeyguardManager)paramContext.getSystemService("keyguard");
    if (context instanceof Application) {
      this.d = (Application)context;
      this.k = new bl2((Application)context, this);
    } 
    this.p = paramContext.getResources().getDisplayMetrics();
    Rect rect = new Rect();
    this.q = rect;
    rect.right = windowManager.getDefaultDisplay().getWidth();
    rect.bottom = windowManager.getDefaultDisplay().getHeight();
    WeakReference<View> weakReference = this.j;
    if (weakReference != null) {
      View view = weakReference.get();
    } else {
      weakReference = null;
    } 
    if (weakReference != null) {
      weakReference.removeOnAttachStateChangeListener(this);
      k((View)weakReference);
    } 
    this.j = new WeakReference<View>(paramView);
    if (paramView != null) {
      if (q.e().b(paramView))
        j(paramView); 
      paramView.addOnAttachStateChangeListener(this);
    } 
  }
  
  private final Rect a(Rect paramRect) {
    return new Rect(g(paramRect.left), g(paramRect.top), g(paramRect.right), g(paramRect.bottom));
  }
  
  private final void b(Activity paramActivity, int paramInt) {
    if (this.j == null)
      return; 
    Window window = paramActivity.getWindow();
    if (window == null)
      return; 
    View view2 = window.peekDecorView();
    View view1 = this.j.get();
    if (view1 != null && view2 != null && view1.getRootView() == view2.getRootView())
      this.n = paramInt; 
  }
  
  private final void f(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : Ljava/util/HashSet;
    //   4: invokevirtual size : ()I
    //   7: ifne -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield j : Ljava/lang/ref/WeakReference;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull -> 21
    //   20: return
    //   21: aload_2
    //   22: invokevirtual get : ()Ljava/lang/Object;
    //   25: checkcast android/view/View
    //   28: astore_3
    //   29: iload_1
    //   30: iconst_1
    //   31: if_icmpne -> 40
    //   34: iconst_1
    //   35: istore #4
    //   37: goto -> 43
    //   40: iconst_0
    //   41: istore #4
    //   43: aload_3
    //   44: ifnonnull -> 53
    //   47: iconst_1
    //   48: istore #5
    //   50: goto -> 56
    //   53: iconst_0
    //   54: istore #5
    //   56: new android/graphics/Rect
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: astore #6
    //   65: new android/graphics/Rect
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: astore #7
    //   74: new android/graphics/Rect
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: astore #8
    //   83: new android/graphics/Rect
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: astore #9
    //   92: iconst_2
    //   93: newarray int
    //   95: astore_2
    //   96: iconst_2
    //   97: newarray int
    //   99: astore #10
    //   101: aload_3
    //   102: ifnull -> 201
    //   105: aload_3
    //   106: aload #7
    //   108: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   111: istore #11
    //   113: aload_3
    //   114: aload #8
    //   116: invokevirtual getLocalVisibleRect : (Landroid/graphics/Rect;)Z
    //   119: istore #12
    //   121: aload_3
    //   122: aload #9
    //   124: invokevirtual getHitRect : (Landroid/graphics/Rect;)V
    //   127: aload_3
    //   128: aload_2
    //   129: invokevirtual getLocationOnScreen : ([I)V
    //   132: aload_3
    //   133: aload #10
    //   135: invokevirtual getLocationInWindow : ([I)V
    //   138: goto -> 151
    //   141: astore #10
    //   143: ldc_w 'Failure getting view location.'
    //   146: aload #10
    //   148: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   151: aload_2
    //   152: iconst_0
    //   153: iaload
    //   154: istore #13
    //   156: aload #6
    //   158: iload #13
    //   160: putfield left : I
    //   163: aload #6
    //   165: aload_2
    //   166: iconst_1
    //   167: iaload
    //   168: putfield top : I
    //   171: aload #6
    //   173: iload #13
    //   175: aload_3
    //   176: invokevirtual getWidth : ()I
    //   179: iadd
    //   180: putfield right : I
    //   183: aload #6
    //   185: aload #6
    //   187: getfield top : I
    //   190: aload_3
    //   191: invokevirtual getHeight : ()I
    //   194: iadd
    //   195: putfield bottom : I
    //   198: goto -> 207
    //   201: iconst_0
    //   202: istore #11
    //   204: iconst_0
    //   205: istore #12
    //   207: getstatic com/google/android/gms/internal/ads/m0.l1 : Lcom/google/android/gms/internal/ads/x;
    //   210: astore_2
    //   211: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   214: aload_2
    //   215: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   218: checkcast java/lang/Boolean
    //   221: invokevirtual booleanValue : ()Z
    //   224: ifeq -> 240
    //   227: aload_3
    //   228: ifnull -> 240
    //   231: aload_0
    //   232: aload_3
    //   233: invokespecial l : (Landroid/view/View;)Ljava/util/List;
    //   236: astore_2
    //   237: goto -> 244
    //   240: invokestatic emptyList : ()Ljava/util/List;
    //   243: astore_2
    //   244: aload_3
    //   245: ifnull -> 257
    //   248: aload_3
    //   249: invokevirtual getWindowVisibility : ()I
    //   252: istore #13
    //   254: goto -> 261
    //   257: bipush #8
    //   259: istore #13
    //   261: aload_0
    //   262: getfield n : I
    //   265: istore #14
    //   267: iload #14
    //   269: iconst_m1
    //   270: if_icmpeq -> 277
    //   273: iload #14
    //   275: istore #13
    //   277: iload #5
    //   279: ifne -> 322
    //   282: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   285: pop
    //   286: aload_3
    //   287: aload_0
    //   288: getfield f : Landroid/os/PowerManager;
    //   291: aload_0
    //   292: getfield g : Landroid/app/KeyguardManager;
    //   295: invokestatic r : (Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z
    //   298: ifeq -> 322
    //   301: iload #11
    //   303: ifeq -> 322
    //   306: iload #12
    //   308: ifeq -> 322
    //   311: iload #13
    //   313: ifne -> 322
    //   316: iconst_1
    //   317: istore #15
    //   319: goto -> 325
    //   322: iconst_0
    //   323: istore #15
    //   325: iload #4
    //   327: ifeq -> 350
    //   330: aload_0
    //   331: getfield l : Lcom/google/android/gms/ads/internal/util/p0;
    //   334: invokevirtual a : ()Z
    //   337: ifne -> 350
    //   340: iload #15
    //   342: aload_0
    //   343: getfield m : Z
    //   346: if_icmpne -> 350
    //   349: return
    //   350: iload #15
    //   352: ifne -> 368
    //   355: aload_0
    //   356: getfield m : Z
    //   359: ifne -> 368
    //   362: iload_1
    //   363: iconst_1
    //   364: if_icmpne -> 368
    //   367: return
    //   368: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   371: invokeinterface b : ()J
    //   376: lstore #16
    //   378: aload_0
    //   379: getfield f : Landroid/os/PowerManager;
    //   382: invokevirtual isScreenOn : ()Z
    //   385: istore #18
    //   387: aload_3
    //   388: ifnull -> 407
    //   391: invokestatic e : ()Lcom/google/android/gms/ads/internal/util/p1;
    //   394: aload_3
    //   395: invokevirtual b : (Landroid/view/View;)Z
    //   398: ifeq -> 407
    //   401: iconst_1
    //   402: istore #19
    //   404: goto -> 410
    //   407: iconst_0
    //   408: istore #19
    //   410: aload_3
    //   411: ifnull -> 422
    //   414: aload_3
    //   415: invokevirtual getWindowVisibility : ()I
    //   418: istore_1
    //   419: goto -> 425
    //   422: bipush #8
    //   424: istore_1
    //   425: new com/google/android/gms/internal/ads/zk2
    //   428: dup
    //   429: lload #16
    //   431: iload #18
    //   433: iload #19
    //   435: iload_1
    //   436: aload_0
    //   437: aload_0
    //   438: getfield q : Landroid/graphics/Rect;
    //   441: invokespecial a : (Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   444: aload_0
    //   445: aload #6
    //   447: invokespecial a : (Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   450: aload_0
    //   451: aload #7
    //   453: invokespecial a : (Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   456: iload #11
    //   458: aload_0
    //   459: aload #8
    //   461: invokespecial a : (Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   464: iload #12
    //   466: aload_0
    //   467: aload #9
    //   469: invokespecial a : (Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   472: aload_0
    //   473: getfield p : Landroid/util/DisplayMetrics;
    //   476: getfield density : F
    //   479: iload #15
    //   481: aload_2
    //   482: invokespecial <init> : (JZZILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZLandroid/graphics/Rect;FZLjava/util/List;)V
    //   485: astore #8
    //   487: aload_0
    //   488: getfield o : Ljava/util/HashSet;
    //   491: invokevirtual iterator : ()Ljava/util/Iterator;
    //   494: astore_2
    //   495: aload_2
    //   496: invokeinterface hasNext : ()Z
    //   501: ifeq -> 523
    //   504: aload_2
    //   505: invokeinterface next : ()Ljava/lang/Object;
    //   510: checkcast com/google/android/gms/internal/ads/yk2
    //   513: aload #8
    //   515: invokeinterface k0 : (Lcom/google/android/gms/internal/ads/zk2;)V
    //   520: goto -> 495
    //   523: aload_0
    //   524: iload #15
    //   526: putfield m : Z
    //   529: return
    // Exception table:
    //   from	to	target	type
    //   127	138	141	java/lang/Exception
  }
  
  private final int g(int paramInt) {
    float f = this.p.density;
    return (int)(paramInt / f);
  }
  
  private final void h() {
    h1.a.post(new xk2(this));
  }
  
  private final void j(View paramView) {
    ViewTreeObserver viewTreeObserver = paramView.getViewTreeObserver();
    if (viewTreeObserver.isAlive()) {
      this.i = new WeakReference<ViewTreeObserver>(viewTreeObserver);
      viewTreeObserver.addOnScrollChangedListener(this);
      viewTreeObserver.addOnGlobalLayoutListener(this);
    } 
    if (this.h == null) {
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("android.intent.action.SCREEN_ON");
      intentFilter.addAction("android.intent.action.SCREEN_OFF");
      intentFilter.addAction("android.intent.action.USER_PRESENT");
      this.h = new wk2(this);
      q.x().c(this.c, this.h, intentFilter);
    } 
    Application application = this.d;
    if (application != null)
      try {
        application.registerActivityLifecycleCallbacks(this.k);
        return;
      } catch (Exception exception) {
        cm.c("Error registering activity lifecycle callbacks.", exception);
      }  
  }
  
  private final void k(View paramView) {
    try {
      WeakReference<ViewTreeObserver> weakReference = this.i;
      if (weakReference != null) {
        ViewTreeObserver viewTreeObserver = weakReference.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
          viewTreeObserver.removeOnScrollChangedListener(this);
          viewTreeObserver.removeGlobalOnLayoutListener(this);
        } 
        this.i = null;
      } 
    } catch (Exception exception) {
      cm.c("Error while unregistering listeners from the last ViewTreeObserver.", exception);
    } 
    try {
      ViewTreeObserver viewTreeObserver = paramView.getViewTreeObserver();
      if (viewTreeObserver.isAlive()) {
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
      } 
    } catch (Exception exception) {
      cm.c("Error while unregistering listeners from the ViewTreeObserver.", exception);
    } 
    if (this.h != null) {
      try {
        q.x().b(this.c, this.h);
      } catch (IllegalStateException illegalStateException) {
        cm.c("Failed trying to unregister the receiver", illegalStateException);
      } catch (Exception exception) {
        q.g().e(exception, "ActiveViewUnit.stopScreenStatusMonitoring");
      } 
      this.h = null;
    } 
    Application application = this.d;
    if (application != null)
      try {
        application.unregisterActivityLifecycleCallbacks(this.k);
        return;
      } catch (Exception exception) {
        cm.c("Error registering activity lifecycle callbacks.", exception);
      }  
  }
  
  private final List<Rect> l(View paramView) {
    try {
      ArrayList<Rect> arrayList = new ArrayList();
      this();
      for (ViewParent viewParent = paramView.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
        View view = (View)viewParent;
        Rect rect = new Rect();
        this();
        if (view.isScrollContainer() && view.getGlobalVisibleRect(rect))
          arrayList.add(a(rect)); 
      } 
      return arrayList;
    } catch (Exception exception) {
      q.g().e(exception, "PositionWatcher.getParentScrollViewRects");
      return Collections.emptyList();
    } 
  }
  
  public final void d(yk2 paramyk2) {
    this.o.add(paramyk2);
    f(3);
  }
  
  public final void e(yk2 paramyk2) {
    this.o.remove(paramyk2);
  }
  
  public final void i(long paramLong) {
    this.l.b(paramLong);
  }
  
  public final void m() {
    this.l.b(b);
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    b(paramActivity, 0);
    f(3);
    h();
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {
    f(3);
    h();
  }
  
  public final void onActivityPaused(Activity paramActivity) {
    b(paramActivity, 4);
    f(3);
    h();
  }
  
  public final void onActivityResumed(Activity paramActivity) {
    b(paramActivity, 0);
    f(3);
    h();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {
    f(3);
    h();
  }
  
  public final void onActivityStarted(Activity paramActivity) {
    b(paramActivity, 0);
    f(3);
    h();
  }
  
  public final void onActivityStopped(Activity paramActivity) {
    f(3);
    h();
  }
  
  public final void onGlobalLayout() {
    f(2);
    h();
  }
  
  public final void onScrollChanged() {
    f(1);
  }
  
  public final void onViewAttachedToWindow(View paramView) {
    this.n = -1;
    j(paramView);
    f(3);
  }
  
  public final void onViewDetachedFromWindow(View paramView) {
    this.n = -1;
    f(3);
    h();
    k(paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */