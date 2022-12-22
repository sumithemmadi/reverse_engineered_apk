package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class ga2 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
  private static final Handler b = new Handler(Looper.getMainLooper());
  
  private final Context c;
  
  private Application d;
  
  private final PowerManager e;
  
  private final KeyguardManager f;
  
  private BroadcastReceiver g;
  
  private final zzfa h;
  
  private WeakReference<ViewTreeObserver> i;
  
  private WeakReference<View> j;
  
  private i42 k;
  
  private byte l = (byte)-1;
  
  private int m = -1;
  
  private long n = -3L;
  
  public ga2(Context paramContext, zzfa paramzzfa) {
    paramContext = paramContext.getApplicationContext();
    this.c = paramContext;
    this.h = paramzzfa;
    this.e = (PowerManager)paramContext.getSystemService("power");
    this.f = (KeyguardManager)paramContext.getSystemService("keyguard");
    if (paramContext instanceof Application) {
      this.d = (Application)paramContext;
      this.k = new i42((Application)paramContext, this);
    } 
    g(null);
  }
  
  private final View a() {
    WeakReference<View> weakReference = this.j;
    return (weakReference != null) ? weakReference.get() : null;
  }
  
  private final void b(Activity paramActivity, int paramInt) {
    if (this.j == null)
      return; 
    Window window = paramActivity.getWindow();
    if (window == null)
      return; 
    View view2 = window.peekDecorView();
    View view1 = a();
    if (view1 != null && view2 != null && view1.getRootView() == view2.getRootView())
      this.m = paramInt; 
  }
  
  private final void d() {
    b.post(new ja2(this));
  }
  
  private final void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/lang/ref/WeakReference;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial a : ()Landroid/view/View;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnonnull -> 31
    //   17: aload_0
    //   18: ldc2_w -3
    //   21: putfield n : J
    //   24: aload_0
    //   25: iconst_m1
    //   26: i2b
    //   27: putfield l : B
    //   30: return
    //   31: aload_1
    //   32: invokevirtual getVisibility : ()I
    //   35: istore_2
    //   36: iconst_1
    //   37: istore_3
    //   38: iload_2
    //   39: ifeq -> 47
    //   42: iconst_1
    //   43: istore_2
    //   44: goto -> 49
    //   47: iconst_0
    //   48: istore_2
    //   49: iload_2
    //   50: istore #4
    //   52: aload_1
    //   53: invokevirtual isShown : ()Z
    //   56: ifne -> 65
    //   59: iload_2
    //   60: iconst_2
    //   61: ior
    //   62: i2b
    //   63: istore #4
    //   65: aload_0
    //   66: getfield e : Landroid/os/PowerManager;
    //   69: astore #5
    //   71: iload #4
    //   73: istore_2
    //   74: aload #5
    //   76: ifnull -> 96
    //   79: iload #4
    //   81: istore_2
    //   82: aload #5
    //   84: invokevirtual isScreenOn : ()Z
    //   87: ifne -> 96
    //   90: iload #4
    //   92: iconst_4
    //   93: ior
    //   94: i2b
    //   95: istore_2
    //   96: iload_3
    //   97: istore #6
    //   99: aload_0
    //   100: getfield h : Lcom/google/android/gms/internal/ads/zzfa;
    //   103: invokevirtual a : ()Z
    //   106: ifne -> 203
    //   109: aload_0
    //   110: getfield f : Landroid/app/KeyguardManager;
    //   113: astore #5
    //   115: aload #5
    //   117: ifnull -> 200
    //   120: aload #5
    //   122: invokevirtual inKeyguardRestrictedInputMode : ()Z
    //   125: ifeq -> 200
    //   128: aload_1
    //   129: invokestatic g : (Landroid/view/View;)Landroid/app/Activity;
    //   132: astore #5
    //   134: aload #5
    //   136: ifnull -> 186
    //   139: aload #5
    //   141: invokevirtual getWindow : ()Landroid/view/Window;
    //   144: astore #5
    //   146: aload #5
    //   148: ifnonnull -> 157
    //   151: aconst_null
    //   152: astore #5
    //   154: goto -> 164
    //   157: aload #5
    //   159: invokevirtual getAttributes : ()Landroid/view/WindowManager$LayoutParams;
    //   162: astore #5
    //   164: aload #5
    //   166: ifnull -> 186
    //   169: aload #5
    //   171: getfield flags : I
    //   174: ldc 524288
    //   176: iand
    //   177: ifeq -> 186
    //   180: iconst_1
    //   181: istore #4
    //   183: goto -> 189
    //   186: iconst_0
    //   187: istore #4
    //   189: iload #4
    //   191: ifeq -> 200
    //   194: iload_3
    //   195: istore #6
    //   197: goto -> 203
    //   200: iconst_0
    //   201: istore #6
    //   203: iload_2
    //   204: istore #4
    //   206: iload #6
    //   208: ifne -> 218
    //   211: iload_2
    //   212: bipush #8
    //   214: ior
    //   215: i2b
    //   216: istore #4
    //   218: iload #4
    //   220: istore #6
    //   222: aload_1
    //   223: new android/graphics/Rect
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   233: ifne -> 244
    //   236: iload #4
    //   238: bipush #16
    //   240: ior
    //   241: i2b
    //   242: istore #6
    //   244: iload #6
    //   246: istore_2
    //   247: aload_1
    //   248: new android/graphics/Rect
    //   251: dup
    //   252: invokespecial <init> : ()V
    //   255: invokevirtual getLocalVisibleRect : (Landroid/graphics/Rect;)Z
    //   258: ifne -> 268
    //   261: iload #6
    //   263: bipush #32
    //   265: ior
    //   266: i2b
    //   267: istore_2
    //   268: aload_1
    //   269: invokevirtual getWindowVisibility : ()I
    //   272: istore #4
    //   274: aload_0
    //   275: getfield m : I
    //   278: istore #6
    //   280: iload #6
    //   282: iconst_m1
    //   283: if_icmpeq -> 290
    //   286: iload #6
    //   288: istore #4
    //   290: iload_2
    //   291: istore #6
    //   293: iload #4
    //   295: ifeq -> 305
    //   298: iload_2
    //   299: bipush #64
    //   301: ior
    //   302: i2b
    //   303: istore #6
    //   305: aload_0
    //   306: getfield l : B
    //   309: iload #6
    //   311: if_icmpeq -> 349
    //   314: aload_0
    //   315: iload #6
    //   317: i2b
    //   318: putfield l : B
    //   321: iload #6
    //   323: ifne -> 334
    //   326: invokestatic elapsedRealtime : ()J
    //   329: lstore #7
    //   331: goto -> 343
    //   334: ldc2_w -3
    //   337: iload #6
    //   339: i2l
    //   340: lsub
    //   341: lstore #7
    //   343: aload_0
    //   344: lload #7
    //   346: putfield n : J
    //   349: return
  }
  
  private final void h(View paramView) {
    ViewTreeObserver viewTreeObserver = paramView.getViewTreeObserver();
    if (viewTreeObserver.isAlive()) {
      this.i = new WeakReference<ViewTreeObserver>(viewTreeObserver);
      viewTreeObserver.addOnScrollChangedListener(this);
      viewTreeObserver.addOnGlobalLayoutListener(this);
    } 
    if (this.g == null) {
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("android.intent.action.SCREEN_ON");
      intentFilter.addAction("android.intent.action.SCREEN_OFF");
      intentFilter.addAction("android.intent.action.USER_PRESENT");
      ia2 ia2 = new ia2(this);
      this.g = ia2;
      this.c.registerReceiver(ia2, intentFilter);
    } 
    Application application = this.d;
    if (application != null)
      try {
        application.registerActivityLifecycleCallbacks(this.k);
      } catch (Exception exception) {} 
  }
  
  private final void i(View paramView) {
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
    } catch (Exception exception) {}
    try {
      ViewTreeObserver viewTreeObserver = paramView.getViewTreeObserver();
      if (viewTreeObserver.isAlive()) {
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
      } 
    } catch (Exception exception) {}
    BroadcastReceiver broadcastReceiver = this.g;
    if (broadcastReceiver != null) {
      try {
        this.c.unregisterReceiver(broadcastReceiver);
      } catch (Exception exception) {}
      this.g = null;
    } 
    Application application = this.d;
    if (application != null)
      try {
        application.unregisterActivityLifecycleCallbacks(this.k);
      } catch (Exception exception) {} 
  }
  
  public final long e() {
    if (this.n <= -2L && a() == null)
      this.n = -3L; 
    return this.n;
  }
  
  final void g(View paramView) {
    View view = a();
    if (view != null) {
      view.removeOnAttachStateChangeListener(this);
      i(view);
    } 
    this.j = new WeakReference<View>(paramView);
    if (paramView != null) {
      boolean bool;
      if (paramView.getWindowToken() != null || paramView.getWindowVisibility() != 8) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        h(paramView); 
      paramView.addOnAttachStateChangeListener(this);
      this.n = -2L;
      return;
    } 
    this.n = -3L;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    b(paramActivity, 0);
    f();
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {
    f();
  }
  
  public final void onActivityPaused(Activity paramActivity) {
    b(paramActivity, 4);
    f();
  }
  
  public final void onActivityResumed(Activity paramActivity) {
    b(paramActivity, 0);
    f();
    d();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {
    f();
  }
  
  public final void onActivityStarted(Activity paramActivity) {
    b(paramActivity, 0);
    f();
  }
  
  public final void onActivityStopped(Activity paramActivity) {
    f();
  }
  
  public final void onGlobalLayout() {
    f();
  }
  
  public final void onScrollChanged() {
    f();
  }
  
  public final void onViewAttachedToWindow(View paramView) {
    this.m = -1;
    h(paramView);
    f();
  }
  
  public final void onViewDetachedFromWindow(View paramView) {
    this.m = -1;
    f();
    d();
    i(paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ga2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */