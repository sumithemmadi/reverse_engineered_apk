package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.util.z0;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.p;
import com.google.android.gms.dynamic.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class hr extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, tq {
  private String A = "";
  
  private lr B;
  
  private boolean C;
  
  private boolean D;
  
  private c3 E;
  
  private y2 F;
  
  private lm2 G;
  
  private int H;
  
  private int I;
  
  private x0 J;
  
  private x0 K;
  
  private x0 L;
  
  private a1 M;
  
  private WeakReference<View.OnClickListener> N;
  
  private int O;
  
  private f P;
  
  private boolean Q;
  
  private z0 R;
  
  private int S = -1;
  
  private int T = -1;
  
  private int U = -1;
  
  private int V = -1;
  
  private Map<String, up> W;
  
  private final WindowManager a0;
  
  private final is b;
  
  private final xn2 b0;
  
  private final p12 c;
  
  private final n1 d;
  
  private final zzazn e;
  
  private final l f;
  
  private final b g;
  
  private final DisplayMetrics h;
  
  private final float i;
  
  private nh1 j;
  
  private sh1 k;
  
  private boolean l = false;
  
  private boolean m = false;
  
  private wq n;
  
  private f o;
  
  private a p;
  
  private ks q;
  
  private String r;
  
  private boolean s;
  
  private boolean t;
  
  private boolean u;
  
  private boolean v;
  
  private Boolean w;
  
  private int x;
  
  private boolean y = true;
  
  private boolean z = false;
  
  private hr(is paramis, ks paramks, String paramString, boolean paramBoolean1, boolean paramBoolean2, p12 paramp12, n1 paramn1, zzazn paramzzazn, z0 paramz0, l paraml, b paramb, xn2 paramxn2, nh1 paramnh1, sh1 paramsh1) {
    super((Context)paramis);
    this.b = paramis;
    this.q = paramks;
    this.r = paramString;
    this.u = paramBoolean1;
    this.x = -1;
    this.c = paramp12;
    this.d = paramn1;
    this.e = paramzzazn;
    this.f = paraml;
    this.g = paramb;
    WindowManager windowManager = (WindowManager)getContext().getSystemService("window");
    this.a0 = windowManager;
    q.c();
    DisplayMetrics displayMetrics = h1.b(windowManager);
    this.h = displayMetrics;
    this.i = displayMetrics.density;
    this.b0 = paramxn2;
    this.j = paramnh1;
    this.k = paramsh1;
    setBackgroundColor(0);
    WebSettings webSettings = getSettings();
    webSettings.setAllowFileAccess(false);
    try {
      webSettings.setJavaScriptEnabled(true);
    } catch (NullPointerException nullPointerException) {
      cm.c("Unable to enable Javascript.", nullPointerException);
    } 
    webSettings.setSavePassword(false);
    webSettings.setSupportMultipleWindows(true);
    webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21)
      webSettings.setMixedContentMode(2); 
    webSettings.setUserAgentString(q.c().r0((Context)paramis, paramzzazn.b));
    q.e().i(getContext(), webSettings);
    setDownloadListener(this);
    f1();
    if (o.d())
      addJavascriptInterface(new pr<hr>(this, new tr(this)), "googleAdsJsInterface"); 
    removeJavascriptInterface("accessibility");
    removeJavascriptInterface("accessibilityTraversal");
    this.R = new z0(this.b.a(), (View)this, this, null);
    j1();
    a1 a11 = new a1(new z0(true, "make_wv", this.r));
    this.M = a11;
    a11.c().b(paramz0);
    x<Boolean> x = m0.D1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      sh1 sh11 = this.k;
      if (sh11 != null && sh11.b != null)
        this.M.c().d("gqi", this.k.b); 
    } 
    x0 x01 = u0.b(this.M.c());
    this.K = x01;
    this.M.a("native:view_create", x01);
    this.L = null;
    this.J = null;
    q.e().k((Context)paramis);
    q.g().o();
  }
  
  private final void Z0(Boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield w : Ljava/lang/Boolean;
    //   7: aload_0
    //   8: monitorexit
    //   9: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   12: aload_1
    //   13: invokevirtual d : (Ljava/lang/Boolean;)V
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	17	finally
    //   18	20	17	finally
  }
  
  @TargetApi(19)
  private final void a1(String paramString, ValueCallback<String> paramValueCallback) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifne -> 18
    //   9: aload_0
    //   10: aload_1
    //   11: aconst_null
    //   12: invokevirtual evaluateJavascript : (Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   21: invokestatic i : (Ljava/lang/String;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	27	finally
    //   18	24	27	finally
  }
  
  private final boolean c1() {
    int k;
    int m;
    boolean bool = this.n.E0();
    boolean bool1 = false;
    if (!bool && !this.n.I())
      return false; 
    er2.a();
    DisplayMetrics displayMetrics = this.h;
    int i = sl.i(displayMetrics, displayMetrics.widthPixels);
    er2.a();
    displayMetrics = this.h;
    int j = sl.i(displayMetrics, displayMetrics.heightPixels);
    Activity activity = this.b.a();
    if (activity == null || activity.getWindow() == null) {
      k = i;
      m = j;
    } else {
      q.c();
      int[] arrayOfInt = h1.f0(activity);
      er2.a();
      k = sl.i(this.h, arrayOfInt[0]);
      er2.a();
      m = sl.i(this.h, arrayOfInt[1]);
    } 
    int n = this.T;
    if (n == i && this.S == j && this.U == k && this.V == m)
      return false; 
    if (n != i || this.S != j)
      bool1 = true; 
    this.T = i;
    this.S = j;
    this.U = k;
    this.V = m;
    (new oe(this)).c(i, j, k, m, this.h.density, this.a0.getDefaultDisplay().getRotation());
    return bool1;
  }
  
  private final void d1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   5: invokevirtual m : ()Ljava/lang/Boolean;
    //   8: astore_1
    //   9: aload_0
    //   10: aload_1
    //   11: putfield w : Ljava/lang/Boolean;
    //   14: aload_1
    //   15: ifnonnull -> 44
    //   18: aload_0
    //   19: ldc_w '(function(){})()'
    //   22: aconst_null
    //   23: invokevirtual evaluateJavascript : (Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   26: aload_0
    //   27: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   30: invokespecial Z0 : (Ljava/lang/Boolean;)V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: astore_1
    //   37: aload_0
    //   38: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   41: invokespecial Z0 : (Ljava/lang/Boolean;)V
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	47	finally
    //   18	33	36	java/lang/IllegalStateException
    //   18	33	47	finally
    //   37	44	47	finally
  }
  
  private final void e1() {
    u0.a(this.M.c(), this.K, new String[] { "aeh2" });
  }
  
  private final void f1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield u : Z
    //   6: ifne -> 56
    //   9: aload_0
    //   10: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   13: invokevirtual e : ()Z
    //   16: ifeq -> 22
    //   19: goto -> 56
    //   22: getstatic android/os/Build$VERSION.SDK_INT : I
    //   25: bipush #18
    //   27: if_icmpge -> 43
    //   30: ldc_w 'Disabling hardware acceleration on an AdView.'
    //   33: invokestatic e : (Ljava/lang/String;)V
    //   36: aload_0
    //   37: invokespecial g1 : ()V
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: ldc_w 'Enabling hardware acceleration on an AdView.'
    //   46: invokestatic e : (Ljava/lang/String;)V
    //   49: aload_0
    //   50: invokespecial h1 : ()V
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: ldc_w 'Enabling hardware acceleration on an overlay.'
    //   59: invokestatic e : (Ljava/lang/String;)V
    //   62: aload_0
    //   63: invokespecial h1 : ()V
    //   66: aload_0
    //   67: monitorexit
    //   68: return
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	69	finally
    //   22	40	69	finally
    //   43	53	69	finally
    //   56	66	69	finally
  }
  
  private final void g1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield v : Z
    //   6: ifne -> 15
    //   9: aload_0
    //   10: iconst_1
    //   11: aconst_null
    //   12: invokevirtual setLayerType : (ILandroid/graphics/Paint;)V
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield v : Z
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	23	finally
    //   15	20	23	finally
  }
  
  private final void h1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield v : Z
    //   6: ifeq -> 15
    //   9: aload_0
    //   10: iconst_0
    //   11: aconst_null
    //   12: invokevirtual setLayerType : (ILandroid/graphics/Paint;)V
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield v : Z
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	23	finally
    //   15	20	23	finally
  }
  
  private final void i1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield W : Ljava/util/Map;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 47
    //   11: aload_1
    //   12: invokeinterface values : ()Ljava/util/Collection;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore_1
    //   23: aload_1
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 47
    //   32: aload_1
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast com/google/android/gms/internal/ads/up
    //   41: invokevirtual a : ()V
    //   44: goto -> 23
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield W : Ljava/util/Map;
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: goto -> 63
    //   61: aload_1
    //   62: athrow
    //   63: goto -> 61
    // Exception table:
    //   from	to	target	type
    //   2	7	55	finally
    //   11	23	55	finally
    //   23	44	55	finally
    //   47	52	55	finally
  }
  
  private final void j1() {
    a1 a11 = this.M;
    if (a11 == null)
      return; 
    z0 z01 = a11.c();
    if (z01 != null && q.g().l() != null)
      q.g().l().d(z01); 
  }
  
  private final void l1(boolean paramBoolean) {
    String str;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    if (paramBoolean) {
      str = "1";
    } else {
      str = "0";
    } 
    hashMap.put("isVisible", str);
    B("onAdVisibilityChanged", (Map)hashMap);
  }
  
  static hr m1(Context paramContext, ks paramks, String paramString, boolean paramBoolean1, boolean paramBoolean2, p12 paramp12, n1 paramn1, zzazn paramzzazn, z0 paramz0, l paraml, b paramb, xn2 paramxn2, nh1 paramnh1, sh1 paramsh1) {
    return new hr(new is(paramContext), paramks, paramString, paramBoolean1, paramBoolean2, paramp12, paramn1, paramzzazn, paramz0, paraml, paramb, paramxn2, paramnh1, paramsh1);
  }
  
  private final void n1(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifne -> 17
    //   9: aload_0
    //   10: aload_1
    //   11: invokevirtual loadUrl : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   20: invokestatic i : (Ljava/lang/String;)V
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
    //   2	14	26	finally
    //   17	23	26	finally
  }
  
  private final void o1(String paramString) {
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/hr}} */
    try {
      super.loadUrl(paramString);
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/hr}} */
      return;
    } catch (Exception exception) {
    
    } catch (NoClassDefFoundError noClassDefFoundError) {
    
    } catch (IncompatibleClassChangeError incompatibleClassChangeError) {
    
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
    
    } finally {}
    q.g().e((Throwable)paramString, "AdWebViewImpl.loadUrlUnsafe");
    cm.d("Could not call loadUrl. ", (Throwable)paramString);
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/hr}} */
  }
  
  private final void p1(String paramString) {
    if (o.f()) {
      if (q1() == null)
        d1(); 
      if (q1().booleanValue()) {
        a1(paramString, null);
        return;
      } 
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "javascript:".concat(paramString);
      } else {
        paramString = new String("javascript:");
      } 
      n1(paramString);
      return;
    } 
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "javascript:".concat(paramString);
    } else {
      paramString = new String("javascript:");
    } 
    n1(paramString);
  }
  
  private final Boolean q1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield w : Ljava/lang/Boolean;
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
  
  private final void r1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield Q : Z
    //   6: ifne -> 20
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield Q : Z
    //   14: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   17: invokevirtual p : ()V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	23	finally
  }
  
  public final boolean A(boolean paramBoolean, int paramInt) {
    destroy();
    this.b0.b(new kr(paramBoolean, paramInt));
    this.b0.a(zztw$zza$zza.U);
    return true;
  }
  
  public final void B(String paramString, Map<String, ?> paramMap) {
    try {
      JSONObject jSONObject = q.c().l0(paramMap);
      i(paramString, jSONObject);
      return;
    } catch (JSONException jSONException) {
      cm.i("Could not convert parameters to JSON.");
      return;
    } 
  }
  
  public final void B0(Context paramContext) {
    this.b.setBaseContext(paramContext);
    this.R.c(this.b.a());
  }
  
  public final void C() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield z : Z
    //   7: aload_0
    //   8: getfield f : Lcom/google/android/gms/ads/internal/l;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 22
    //   16: aload_1
    //   17: invokeinterface C : ()V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	25	finally
    //   16	22	25	finally
  }
  
  public final void D(boolean paramBoolean, int paramInt) {
    this.n.k0(paramBoolean, paramInt);
  }
  
  public final int D0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield O : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final x0 E() {
    return this.K;
  }
  
  public final a F() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield p : Lcom/google/android/gms/dynamic/a;
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
  
  public final void G(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Lcom/google/android/gms/ads/internal/overlay/f;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 26
    //   11: aload_2
    //   12: aload_0
    //   13: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   16: invokevirtual E0 : ()Z
    //   19: iload_1
    //   20: invokevirtual X9 : (ZZ)V
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: aload_0
    //   27: iload_1
    //   28: putfield s : Z
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	34	finally
    //   11	23	34	finally
    //   26	31	34	finally
  }
  
  public final void G0(boolean paramBoolean) {
    this.n.g0(paramBoolean);
  }
  
  public final void H0(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield p : Lcom/google/android/gms/dynamic/a;
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
  
  public final void I0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield z : Z
    //   7: aload_0
    //   8: getfield f : Lcom/google/android/gms/ads/internal/l;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 22
    //   16: aload_1
    //   17: invokeinterface I0 : ()V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	25	finally
    //   16	22	25	finally
  }
  
  public final void K0() {
    if (this.J == null) {
      u0.a(this.M.c(), this.K, new String[] { "aes2" });
      x0 x01 = u0.b(this.M.c());
      this.J = x01;
      this.M.a("native:view_show", x01);
    } 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(1);
    hashMap.put("version", this.e.b);
    B("onshow", (Map)hashMap);
  }
  
  public final void L(boolean paramBoolean, long paramLong) {
    String str;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(2);
    if (paramBoolean) {
      str = "1";
    } else {
      str = "0";
    } 
    hashMap.put("success", str);
    hashMap.put("duration", Long.toString(paramLong));
    B("onCacheAccessComplete", (Map)hashMap);
  }
  
  public final void M() {
    setBackgroundColor(0);
  }
  
  public final void M0(g0 paramg0, pu0 parampu0, jo0 paramjo0, pm1 parampm1, String paramString1, String paramString2, int paramInt) {
    this.n.y(paramg0, parampu0, paramjo0, parampm1, paramString1, paramString2, paramInt);
  }
  
  public final void N0() {
    this.R.e();
  }
  
  public final f O0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield P : Lcom/google/android/gms/ads/internal/overlay/f;
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
  
  public final void P(ks paramks) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield q : Lcom/google/android/gms/internal/ads/ks;
    //   7: aload_0
    //   8: invokevirtual requestLayout : ()V
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
  
  public final int P0() {
    return getMeasuredHeight();
  }
  
  public final void Q(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifne -> 38
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: iconst_1
    //   13: anewarray java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: invokestatic a : ()Ljava/lang/String;
    //   21: aastore
    //   22: invokestatic b : (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   25: ldc_w 'text/html'
    //   28: ldc_w 'UTF-8'
    //   31: aload_3
    //   32: invokespecial loadDataWithBaseURL : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   41: invokestatic i : (Ljava/lang/String;)V
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	35	47	finally
    //   38	44	47	finally
  }
  
  public final void Q0(boolean paramBoolean, int paramInt, String paramString1, String paramString2) {
    this.n.H(paramBoolean, paramInt, paramString1, paramString2);
  }
  
  public final void R(c3 paramc3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield E : Lcom/google/android/gms/internal/ads/c3;
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
  
  public final void R0(y2 paramy2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield F : Lcom/google/android/gms/internal/ads/y2;
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
  
  public final void S(String paramString, JSONObject paramJSONObject) {
    JSONObject jSONObject = paramJSONObject;
    if (paramJSONObject == null)
      jSONObject = new JSONObject(); 
    String str = jSONObject.toString();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 3 + String.valueOf(str).length());
    stringBuilder.append(paramString);
    stringBuilder.append("(");
    stringBuilder.append(str);
    stringBuilder.append(");");
    p1(stringBuilder.toString());
  }
  
  public final void S0() {
    if (this.L == null) {
      x0 x01 = u0.b(this.M.c());
      this.L = x01;
      this.M.a("native:view_load", x01);
    } 
  }
  
  public final boolean T() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield u : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final void U() {
    e1();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(1);
    hashMap.put("version", this.e.b);
    B("onhide", (Map)hashMap);
  }
  
  public final tn U0() {
    return null;
  }
  
  public final void V(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield o : Lcom/google/android/gms/ads/internal/overlay/f;
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
  
  public final void V0(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield H : I
    //   6: istore_2
    //   7: iload_1
    //   8: ifeq -> 16
    //   11: iconst_1
    //   12: istore_3
    //   13: goto -> 18
    //   16: iconst_m1
    //   17: istore_3
    //   18: iload_2
    //   19: iload_3
    //   20: iadd
    //   21: istore_3
    //   22: aload_0
    //   23: iload_3
    //   24: putfield H : I
    //   27: iload_3
    //   28: ifgt -> 47
    //   31: aload_0
    //   32: getfield o : Lcom/google/android/gms/ads/internal/overlay/f;
    //   35: astore #4
    //   37: aload #4
    //   39: ifnull -> 47
    //   42: aload #4
    //   44: invokevirtual ia : ()V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: astore #4
    //   52: aload_0
    //   53: monitorexit
    //   54: aload #4
    //   56: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	50	finally
    //   22	27	50	finally
    //   31	37	50	finally
    //   42	47	50	finally
  }
  
  public final void W0(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield O : I
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public final void X() {
    b1.m("Cannot add text view to inner AdWebView");
  }
  
  public final WebViewClient Z() {
    return this.n;
  }
  
  public final Activity a() {
    return this.b.a();
  }
  
  public final void a0(int paramInt) {
    if (paramInt == 0)
      u0.a(this.M.c(), this.K, new String[] { "aebb2" }); 
    e1();
    if (this.M.c() != null)
      this.M.c().d("close_type", String.valueOf(paramInt)); 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(2);
    hashMap.put("closetype", String.valueOf(paramInt));
    hashMap.put("version", this.e.b);
    B("onhide", (Map)hashMap);
  }
  
  public final zzazn b() {
    return this.e;
  }
  
  public final p12 c() {
    return this.c;
  }
  
  public final void c0() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(3);
    hashMap.put("app_muted", String.valueOf(q.h().e()));
    hashMap.put("app_volume", String.valueOf(q.h().d()));
    hashMap.put("device_volume", String.valueOf(f.c(getContext())));
    B("volume", (Map)hashMap);
  }
  
  public final void d(String paramString, x6<? super tq> paramx6) {
    wq wq1 = this.n;
    if (wq1 != null)
      wq1.d(paramString, paramx6); 
  }
  
  public final void d0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 'Destroying WebView!'
    //   5: invokestatic m : (Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokespecial r1 : ()V
    //   12: getstatic com/google/android/gms/ads/internal/util/h1.a : Lcom/google/android/gms/internal/ads/xp1;
    //   15: astore_1
    //   16: new com/google/android/gms/internal/ads/mr
    //   19: astore_2
    //   20: aload_2
    //   21: aload_0
    //   22: invokespecial <init> : (Lcom/google/android/gms/internal/ads/hr;)V
    //   25: aload_1
    //   26: aload_2
    //   27: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   30: pop
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	31	34	finally
  }
  
  public final void destroy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial j1 : ()V
    //   6: aload_0
    //   7: getfield R : Lcom/google/android/gms/ads/internal/util/z0;
    //   10: invokevirtual f : ()V
    //   13: aload_0
    //   14: getfield o : Lcom/google/android/gms/ads/internal/overlay/f;
    //   17: astore_1
    //   18: aload_1
    //   19: ifnull -> 38
    //   22: aload_1
    //   23: invokevirtual T9 : ()V
    //   26: aload_0
    //   27: getfield o : Lcom/google/android/gms/ads/internal/overlay/f;
    //   30: invokevirtual onDestroy : ()V
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield o : Lcom/google/android/gms/ads/internal/overlay/f;
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield p : Lcom/google/android/gms/dynamic/a;
    //   43: aload_0
    //   44: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   47: invokevirtual i : ()V
    //   50: aload_0
    //   51: getfield t : Z
    //   54: istore_2
    //   55: iload_2
    //   56: ifeq -> 62
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: invokestatic y : ()Lcom/google/android/gms/internal/ads/vp;
    //   65: pop
    //   66: aload_0
    //   67: invokestatic f : (Lcom/google/android/gms/internal/ads/eo;)Z
    //   70: pop
    //   71: aload_0
    //   72: invokespecial i1 : ()V
    //   75: aload_0
    //   76: iconst_1
    //   77: putfield t : Z
    //   80: ldc_w 'Initiating WebView self destruct sequence in 3...'
    //   83: invokestatic m : (Ljava/lang/String;)V
    //   86: ldc_w 'Loading blank page in WebView, 2...'
    //   89: invokestatic m : (Ljava/lang/String;)V
    //   92: aload_0
    //   93: ldc_w 'about:blank'
    //   96: invokespecial o1 : (Ljava/lang/String;)V
    //   99: aload_0
    //   100: monitorexit
    //   101: return
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	102	finally
    //   22	38	102	finally
    //   38	55	102	finally
    //   62	99	102	finally
  }
  
  public final lr e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield B : Lcom/google/android/gms/internal/ads/lr;
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
  
  public final lm2 e0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield G : Lcom/google/android/gms/internal/ads/lm2;
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
  
  @TargetApi(19)
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifeq -> 29
    //   9: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   12: invokestatic k : (Ljava/lang/String;)V
    //   15: aload_2
    //   16: ifnull -> 26
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface onReceiveValue : (Ljava/lang/Object;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: aload_1
    //   31: aload_2
    //   32: invokespecial evaluateJavascript : (Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	38	finally
    //   19	26	38	finally
    //   29	35	38	finally
  }
  
  public final nh1 f() {
    return this.j;
  }
  
  public final boolean f0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield s : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  protected final void finalize() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Z
    //   6: ifne -> 33
    //   9: aload_0
    //   10: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   13: invokevirtual i : ()V
    //   16: invokestatic y : ()Lcom/google/android/gms/internal/ads/vp;
    //   19: pop
    //   20: aload_0
    //   21: invokestatic f : (Lcom/google/android/gms/internal/ads/eo;)Z
    //   24: pop
    //   25: aload_0
    //   26: invokespecial i1 : ()V
    //   29: aload_0
    //   30: invokespecial r1 : ()V
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_0
    //   36: invokespecial finalize : ()V
    //   39: return
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore_1
    //   46: aload_0
    //   47: invokespecial finalize : ()V
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   0	2	45	finally
    //   2	33	40	finally
    //   33	35	40	finally
    //   41	43	40	finally
    //   43	45	45	finally
  }
  
  public final b g() {
    return this.g;
  }
  
  public final String g0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Lcom/google/android/gms/internal/ads/sh1;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 20
    //   11: aload_1
    //   12: getfield b : Ljava/lang/String;
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	24	finally
    //   11	16	24	finally
  }
  
  public final String getRequestId() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield A : Ljava/lang/String;
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
  
  public final View getView() {
    return (View)this;
  }
  
  public final WebView getWebView() {
    return this;
  }
  
  public final sh1 h() {
    return this.k;
  }
  
  public final void h0(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield u : Z
    //   7: if_icmpeq -> 15
    //   10: iconst_1
    //   11: istore_2
    //   12: goto -> 17
    //   15: iconst_0
    //   16: istore_2
    //   17: aload_0
    //   18: iload_1
    //   19: putfield u : Z
    //   22: aload_0
    //   23: invokespecial f1 : ()V
    //   26: iload_2
    //   27: ifeq -> 92
    //   30: getstatic com/google/android/gms/internal/ads/m0.K : Lcom/google/android/gms/internal/ads/x;
    //   33: astore_3
    //   34: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   37: aload_3
    //   38: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   41: checkcast java/lang/Boolean
    //   44: invokevirtual booleanValue : ()Z
    //   47: ifeq -> 60
    //   50: aload_0
    //   51: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   54: invokevirtual e : ()Z
    //   57: ifne -> 92
    //   60: new com/google/android/gms/internal/ads/oe
    //   63: astore #4
    //   65: aload #4
    //   67: aload_0
    //   68: invokespecial <init> : (Lcom/google/android/gms/internal/ads/tq;)V
    //   71: iload_1
    //   72: ifeq -> 82
    //   75: ldc_w 'expanded'
    //   78: astore_3
    //   79: goto -> 86
    //   82: ldc_w 'default'
    //   85: astore_3
    //   86: aload #4
    //   88: aload_3
    //   89: invokevirtual g : (Ljava/lang/String;)V
    //   92: aload_0
    //   93: monitorexit
    //   94: return
    //   95: astore_3
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_3
    //   99: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	95	finally
    //   17	26	95	finally
    //   30	60	95	finally
    //   60	71	95	finally
    //   86	92	95	finally
  }
  
  public final void i(String paramString, JSONObject paramJSONObject) {
    JSONObject jSONObject = paramJSONObject;
    if (paramJSONObject == null)
      jSONObject = new JSONObject(); 
    String str = jSONObject.toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
    stringBuilder.append(paramString);
    stringBuilder.append("'");
    stringBuilder.append(",");
    stringBuilder.append(str);
    stringBuilder.append(");");
    paramString = String.valueOf(stringBuilder.toString());
    if (paramString.length() != 0) {
      paramString = "Dispatching AFMA event: ".concat(paramString);
    } else {
      paramString = new String("Dispatching AFMA event: ");
    } 
    cm.e(paramString);
    p1(stringBuilder.toString());
  }
  
  public final void i0() {
    f f1 = z0();
    if (f1 != null)
      f1.ha(); 
  }
  
  public final void j(String paramString, up paramup) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield W : Ljava/util/Map;
    //   6: ifnonnull -> 22
    //   9: new java/util/HashMap
    //   12: astore_3
    //   13: aload_3
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: aload_3
    //   19: putfield W : Ljava/util/Map;
    //   22: aload_0
    //   23: getfield W : Ljava/util/Map;
    //   26: aload_1
    //   27: aload_2
    //   28: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   33: pop
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
    //   2	22	37	finally
    //   22	34	37	finally
  }
  
  public final Context j0() {
    return this.b.b();
  }
  
  public final boolean k() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final void k0(zk2 paramzk2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield m : Z
    //   6: istore_2
    //   7: aload_0
    //   8: iload_2
    //   9: putfield C : Z
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_0
    //   15: iload_2
    //   16: invokespecial l1 : (Z)V
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	20	finally
    //   21	23	20	finally
  }
  
  public final void l0(boolean paramBoolean, int paramInt, String paramString) {
    this.n.E(paramBoolean, paramInt, paramString);
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifne -> 19
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: invokespecial loadData : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   22: invokestatic i : (Ljava/lang/String;)V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	28	finally
    //   19	25	28	finally
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifne -> 23
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: aload #4
    //   15: aload #5
    //   17: invokespecial loadDataWithBaseURL : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   26: invokestatic i : (Ljava/lang/String;)V
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
    //   2	20	32	finally
    //   23	29	32	finally
  }
  
  public final void loadUrl(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne -> 48
    //   11: aload_0
    //   12: aload_1
    //   13: invokespecial loadUrl : (Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: goto -> 28
    //   23: astore_1
    //   24: goto -> 28
    //   27: astore_1
    //   28: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   31: aload_1
    //   32: ldc_w 'AdWebViewImpl.loadUrl'
    //   35: invokevirtual e : (Ljava/lang/Throwable;Ljava/lang/String;)V
    //   38: ldc_w 'Could not call loadUrl. '
    //   41: aload_1
    //   42: invokestatic d : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: ldc_w '#004 The webview is destroyed. Ignoring action.'
    //   51: invokestatic i : (Ljava/lang/String;)V
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
    //   2	7	57	finally
    //   11	16	27	java/lang/Exception
    //   11	16	23	java/lang/NoClassDefFoundError
    //   11	16	19	java/lang/IncompatibleClassChangeError
    //   11	16	57	finally
    //   28	45	57	finally
    //   48	54	57	finally
  }
  
  public final a1 m() {
    return this.M;
  }
  
  public final void n(String paramString) {
    p1(paramString);
  }
  
  public final boolean n0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield y : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final void o(lr paramlr) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield B : Lcom/google/android/gms/internal/ads/lr;
    //   6: ifnull -> 18
    //   9: ldc_w 'Attempt to create multiple AdWebViewVideoControllers.'
    //   12: invokestatic g : (Ljava/lang/String;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: aload_1
    //   20: putfield B : Lcom/google/android/gms/internal/ads/lr;
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
    //   2	15	26	finally
    //   18	23	26	finally
  }
  
  public final void o0(boolean paramBoolean) {
    this.n.o0(paramBoolean);
  }
  
  protected final void onAttachedToWindow() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial onAttachedToWindow : ()V
    //   6: aload_0
    //   7: invokevirtual k : ()Z
    //   10: ifne -> 20
    //   13: aload_0
    //   14: getfield R : Lcom/google/android/gms/ads/internal/util/z0;
    //   17: invokevirtual a : ()V
    //   20: aload_0
    //   21: getfield C : Z
    //   24: istore_1
    //   25: aload_0
    //   26: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   29: astore_2
    //   30: iload_1
    //   31: istore_3
    //   32: aload_2
    //   33: ifnull -> 80
    //   36: iload_1
    //   37: istore_3
    //   38: aload_2
    //   39: invokevirtual I : ()Z
    //   42: ifeq -> 80
    //   45: aload_0
    //   46: getfield D : Z
    //   49: ifne -> 73
    //   52: aload_0
    //   53: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   56: invokevirtual K : ()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    //   59: pop
    //   60: aload_0
    //   61: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   64: invokevirtual L : ()Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    //   67: pop
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield D : Z
    //   73: aload_0
    //   74: invokespecial c1 : ()Z
    //   77: pop
    //   78: iconst_1
    //   79: istore_3
    //   80: aload_0
    //   81: iload_3
    //   82: invokespecial l1 : (Z)V
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: astore_2
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	88	finally
    //   20	30	88	finally
    //   38	73	88	finally
    //   73	78	88	finally
    //   80	85	88	finally
  }
  
  protected final void onDetachedFromWindow() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifne -> 16
    //   9: aload_0
    //   10: getfield R : Lcom/google/android/gms/ads/internal/util/z0;
    //   13: invokevirtual b : ()V
    //   16: aload_0
    //   17: invokespecial onDetachedFromWindow : ()V
    //   20: aload_0
    //   21: getfield D : Z
    //   24: ifeq -> 81
    //   27: aload_0
    //   28: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull -> 81
    //   36: aload_1
    //   37: invokevirtual I : ()Z
    //   40: ifeq -> 81
    //   43: aload_0
    //   44: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   47: ifnull -> 81
    //   50: aload_0
    //   51: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   54: invokevirtual isAlive : ()Z
    //   57: ifeq -> 81
    //   60: aload_0
    //   61: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   64: invokevirtual K : ()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    //   67: pop
    //   68: aload_0
    //   69: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   72: invokevirtual L : ()Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    //   75: pop
    //   76: aload_0
    //   77: iconst_0
    //   78: putfield D : Z
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_0
    //   84: iconst_0
    //   85: invokespecial l1 : (Z)V
    //   88: return
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	89	finally
    //   16	32	89	finally
    //   36	81	89	finally
    //   81	83	89	finally
    //   90	92	89	finally
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW");
      intent.setDataAndType(Uri.parse(paramString1), paramString4);
      q.c();
      h1.k(getContext(), intent);
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 51 + String.valueOf(paramString4).length());
      stringBuilder.append("Couldn't find an Activity to view url/mimetype: ");
      stringBuilder.append(paramString1);
      stringBuilder.append(" / ");
      stringBuilder.append(paramString4);
      cm.e(stringBuilder.toString());
      return;
    } 
  }
  
  @TargetApi(21)
  protected final void onDraw(Canvas paramCanvas) {
    if (k())
      return; 
    if (Build.VERSION.SDK_INT == 21 && paramCanvas.isHardwareAccelerated() && !isAttachedToWindow())
      return; 
    super.onDraw(paramCanvas);
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    float f1 = paramMotionEvent.getAxisValue(9);
    float f2 = paramMotionEvent.getAxisValue(10);
    return (paramMotionEvent.getActionMasked() == 8 && ((f1 > 0.0F && !canScrollVertically(-1)) || (f1 < 0.0F && !canScrollVertically(1)) || (f2 > 0.0F && !canScrollHorizontally(-1)) || (f2 < 0.0F && !canScrollHorizontally(1)))) ? false : super.onGenericMotionEvent(paramMotionEvent);
  }
  
  public final void onGlobalLayout() {
    boolean bool = c1();
    f f1 = z0();
    if (f1 != null && bool)
      f1.fa(); 
  }
  
  @SuppressLint({"DrawAllocation"})
  protected final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual k : ()Z
    //   6: ifeq -> 18
    //   9: aload_0
    //   10: iconst_0
    //   11: iconst_0
    //   12: invokevirtual setMeasuredDimension : (II)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: invokevirtual isInEditMode : ()Z
    //   22: ifne -> 869
    //   25: aload_0
    //   26: getfield u : Z
    //   29: ifne -> 869
    //   32: aload_0
    //   33: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   36: invokevirtual f : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 869
    //   45: aload_0
    //   46: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   49: invokevirtual h : ()Z
    //   52: ifeq -> 64
    //   55: aload_0
    //   56: iload_1
    //   57: iload_2
    //   58: invokespecial onMeasure : (II)V
    //   61: aload_0
    //   62: monitorexit
    //   63: return
    //   64: aload_0
    //   65: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   68: invokevirtual g : ()Z
    //   71: ifeq -> 278
    //   74: getstatic com/google/android/gms/internal/ads/m0.z2 : Lcom/google/android/gms/internal/ads/x;
    //   77: astore_3
    //   78: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   81: aload_3
    //   82: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   85: checkcast java/lang/Boolean
    //   88: invokevirtual booleanValue : ()Z
    //   91: ifeq -> 103
    //   94: aload_0
    //   95: iload_1
    //   96: iload_2
    //   97: invokespecial onMeasure : (II)V
    //   100: aload_0
    //   101: monitorexit
    //   102: return
    //   103: aload_0
    //   104: invokevirtual e : ()Lcom/google/android/gms/internal/ads/lr;
    //   107: astore_3
    //   108: aload_3
    //   109: ifnull -> 121
    //   112: aload_3
    //   113: invokevirtual k0 : ()F
    //   116: fstore #4
    //   118: goto -> 124
    //   121: fconst_0
    //   122: fstore #4
    //   124: fload #4
    //   126: fconst_0
    //   127: fcmpl
    //   128: ifne -> 140
    //   131: aload_0
    //   132: iload_1
    //   133: iload_2
    //   134: invokespecial onMeasure : (II)V
    //   137: aload_0
    //   138: monitorexit
    //   139: return
    //   140: iload_1
    //   141: invokestatic getSize : (I)I
    //   144: istore #5
    //   146: iload_2
    //   147: invokestatic getSize : (I)I
    //   150: istore #6
    //   152: iload #6
    //   154: i2f
    //   155: fload #4
    //   157: fmul
    //   158: f2i
    //   159: istore #7
    //   161: iload #5
    //   163: i2f
    //   164: fload #4
    //   166: fdiv
    //   167: f2i
    //   168: istore #8
    //   170: iload #6
    //   172: ifne -> 202
    //   175: iload #8
    //   177: ifeq -> 202
    //   180: iload #8
    //   182: i2f
    //   183: fload #4
    //   185: fmul
    //   186: f2i
    //   187: istore #9
    //   189: iload #8
    //   191: istore_1
    //   192: iload #8
    //   194: istore #10
    //   196: iload #5
    //   198: istore_2
    //   199: goto -> 259
    //   202: iload #7
    //   204: istore #9
    //   206: iload #8
    //   208: istore #10
    //   210: iload #5
    //   212: istore_2
    //   213: iload #6
    //   215: istore_1
    //   216: iload #5
    //   218: ifne -> 259
    //   221: iload #7
    //   223: istore #9
    //   225: iload #8
    //   227: istore #10
    //   229: iload #5
    //   231: istore_2
    //   232: iload #6
    //   234: istore_1
    //   235: iload #7
    //   237: ifeq -> 259
    //   240: iload #7
    //   242: i2f
    //   243: fload #4
    //   245: fdiv
    //   246: f2i
    //   247: istore #10
    //   249: iload #7
    //   251: istore_2
    //   252: iload #6
    //   254: istore_1
    //   255: iload #7
    //   257: istore #9
    //   259: aload_0
    //   260: iload #9
    //   262: iload_2
    //   263: invokestatic min : (II)I
    //   266: iload #10
    //   268: iload_1
    //   269: invokestatic min : (II)I
    //   272: invokevirtual setMeasuredDimension : (II)V
    //   275: aload_0
    //   276: monitorexit
    //   277: return
    //   278: aload_0
    //   279: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   282: invokevirtual a : ()Z
    //   285: ifeq -> 400
    //   288: getstatic com/google/android/gms/internal/ads/m0.C2 : Lcom/google/android/gms/internal/ads/x;
    //   291: astore_3
    //   292: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   295: aload_3
    //   296: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   299: checkcast java/lang/Boolean
    //   302: invokevirtual booleanValue : ()Z
    //   305: ifne -> 391
    //   308: invokestatic d : ()Z
    //   311: ifne -> 317
    //   314: goto -> 391
    //   317: new com/google/android/gms/internal/ads/jr
    //   320: astore_3
    //   321: aload_3
    //   322: aload_0
    //   323: invokespecial <init> : (Lcom/google/android/gms/internal/ads/hr;)V
    //   326: aload_0
    //   327: ldc_w '/contentHeight'
    //   330: aload_3
    //   331: invokevirtual d : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/x6;)V
    //   334: aload_0
    //   335: ldc_w '(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();'
    //   338: invokespecial p1 : (Ljava/lang/String;)V
    //   341: aload_0
    //   342: getfield h : Landroid/util/DisplayMetrics;
    //   345: getfield density : F
    //   348: fstore #4
    //   350: iload_1
    //   351: invokestatic getSize : (I)I
    //   354: istore #8
    //   356: aload_0
    //   357: getfield I : I
    //   360: istore_1
    //   361: iload_1
    //   362: iconst_m1
    //   363: if_icmpeq -> 376
    //   366: iload_1
    //   367: i2f
    //   368: fload #4
    //   370: fmul
    //   371: f2i
    //   372: istore_1
    //   373: goto -> 381
    //   376: iload_2
    //   377: invokestatic getSize : (I)I
    //   380: istore_1
    //   381: aload_0
    //   382: iload #8
    //   384: iload_1
    //   385: invokevirtual setMeasuredDimension : (II)V
    //   388: aload_0
    //   389: monitorexit
    //   390: return
    //   391: aload_0
    //   392: iload_1
    //   393: iload_2
    //   394: invokespecial onMeasure : (II)V
    //   397: aload_0
    //   398: monitorexit
    //   399: return
    //   400: aload_0
    //   401: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   404: invokevirtual e : ()Z
    //   407: ifeq -> 430
    //   410: aload_0
    //   411: getfield h : Landroid/util/DisplayMetrics;
    //   414: astore_3
    //   415: aload_0
    //   416: aload_3
    //   417: getfield widthPixels : I
    //   420: aload_3
    //   421: getfield heightPixels : I
    //   424: invokevirtual setMeasuredDimension : (II)V
    //   427: aload_0
    //   428: monitorexit
    //   429: return
    //   430: iload_1
    //   431: invokestatic getMode : (I)I
    //   434: istore #7
    //   436: iload_1
    //   437: invokestatic getSize : (I)I
    //   440: istore #9
    //   442: iload_2
    //   443: invokestatic getMode : (I)I
    //   446: istore_1
    //   447: iload_2
    //   448: invokestatic getSize : (I)I
    //   451: istore #10
    //   453: ldc_w 2147483647
    //   456: istore #8
    //   458: iload #7
    //   460: ldc_w -2147483648
    //   463: if_icmpeq -> 484
    //   466: iload #7
    //   468: ldc_w 1073741824
    //   471: if_icmpne -> 477
    //   474: goto -> 484
    //   477: ldc_w 2147483647
    //   480: istore_2
    //   481: goto -> 487
    //   484: iload #9
    //   486: istore_2
    //   487: iload_1
    //   488: ldc_w -2147483648
    //   491: if_icmpeq -> 501
    //   494: iload_1
    //   495: ldc_w 1073741824
    //   498: if_icmpne -> 505
    //   501: iload #10
    //   503: istore #8
    //   505: aload_0
    //   506: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   509: astore_3
    //   510: aload_3
    //   511: getfield c : I
    //   514: iload_2
    //   515: if_icmpgt -> 535
    //   518: aload_3
    //   519: getfield b : I
    //   522: iload #8
    //   524: if_icmple -> 530
    //   527: goto -> 535
    //   530: iconst_0
    //   531: istore_1
    //   532: goto -> 537
    //   535: iconst_1
    //   536: istore_1
    //   537: getstatic com/google/android/gms/internal/ads/m0.X3 : Lcom/google/android/gms/internal/ads/x;
    //   540: astore_3
    //   541: iload_1
    //   542: istore #7
    //   544: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   547: aload_3
    //   548: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   551: checkcast java/lang/Boolean
    //   554: invokevirtual booleanValue : ()Z
    //   557: ifeq -> 627
    //   560: aload_0
    //   561: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   564: astore_3
    //   565: aload_3
    //   566: getfield c : I
    //   569: i2f
    //   570: fstore #4
    //   572: aload_0
    //   573: getfield i : F
    //   576: fstore #11
    //   578: fload #4
    //   580: fload #11
    //   582: fdiv
    //   583: iload_2
    //   584: i2f
    //   585: fload #11
    //   587: fdiv
    //   588: fcmpl
    //   589: ifgt -> 615
    //   592: aload_3
    //   593: getfield b : I
    //   596: i2f
    //   597: fload #11
    //   599: fdiv
    //   600: iload #8
    //   602: i2f
    //   603: fload #11
    //   605: fdiv
    //   606: fcmpl
    //   607: ifgt -> 615
    //   610: iconst_1
    //   611: istore_2
    //   612: goto -> 617
    //   615: iconst_0
    //   616: istore_2
    //   617: iload_1
    //   618: istore #7
    //   620: iload_1
    //   621: ifeq -> 627
    //   624: iload_2
    //   625: istore #7
    //   627: iload #7
    //   629: ifeq -> 813
    //   632: aload_0
    //   633: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   636: astore_3
    //   637: aload_3
    //   638: getfield c : I
    //   641: i2f
    //   642: fstore #11
    //   644: aload_0
    //   645: getfield i : F
    //   648: fstore #4
    //   650: fload #11
    //   652: fload #4
    //   654: fdiv
    //   655: f2i
    //   656: istore_1
    //   657: aload_3
    //   658: getfield b : I
    //   661: i2f
    //   662: fload #4
    //   664: fdiv
    //   665: f2i
    //   666: istore_2
    //   667: iload #9
    //   669: i2f
    //   670: fload #4
    //   672: fdiv
    //   673: f2i
    //   674: istore #8
    //   676: iload #10
    //   678: i2f
    //   679: fload #4
    //   681: fdiv
    //   682: f2i
    //   683: istore #7
    //   685: new java/lang/StringBuilder
    //   688: astore_3
    //   689: aload_3
    //   690: bipush #103
    //   692: invokespecial <init> : (I)V
    //   695: aload_3
    //   696: ldc_w 'Not enough space to show ad. Needs '
    //   699: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: pop
    //   703: aload_3
    //   704: iload_1
    //   705: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   708: pop
    //   709: aload_3
    //   710: ldc_w 'x'
    //   713: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: pop
    //   717: aload_3
    //   718: iload_2
    //   719: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   722: pop
    //   723: aload_3
    //   724: ldc_w ' dp, but only has '
    //   727: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   730: pop
    //   731: aload_3
    //   732: iload #8
    //   734: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   737: pop
    //   738: aload_3
    //   739: ldc_w 'x'
    //   742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: pop
    //   746: aload_3
    //   747: iload #7
    //   749: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   752: pop
    //   753: aload_3
    //   754: ldc_w ' dp.'
    //   757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: aload_3
    //   762: invokevirtual toString : ()Ljava/lang/String;
    //   765: invokestatic i : (Ljava/lang/String;)V
    //   768: aload_0
    //   769: invokevirtual getVisibility : ()I
    //   772: bipush #8
    //   774: if_icmpeq -> 782
    //   777: aload_0
    //   778: iconst_4
    //   779: invokevirtual setVisibility : (I)V
    //   782: aload_0
    //   783: iconst_0
    //   784: iconst_0
    //   785: invokevirtual setMeasuredDimension : (II)V
    //   788: aload_0
    //   789: getfield l : Z
    //   792: ifne -> 866
    //   795: aload_0
    //   796: getfield b0 : Lcom/google/android/gms/internal/ads/xn2;
    //   799: getstatic com/google/android/gms/internal/ads/zztw$zza$zza.S : Lcom/google/android/gms/internal/ads/zztw$zza$zza;
    //   802: invokevirtual a : (Lcom/google/android/gms/internal/ads/zztw$zza$zza;)V
    //   805: aload_0
    //   806: iconst_1
    //   807: putfield l : Z
    //   810: aload_0
    //   811: monitorexit
    //   812: return
    //   813: aload_0
    //   814: invokevirtual getVisibility : ()I
    //   817: bipush #8
    //   819: if_icmpeq -> 827
    //   822: aload_0
    //   823: iconst_0
    //   824: invokevirtual setVisibility : (I)V
    //   827: aload_0
    //   828: getfield m : Z
    //   831: ifne -> 849
    //   834: aload_0
    //   835: getfield b0 : Lcom/google/android/gms/internal/ads/xn2;
    //   838: getstatic com/google/android/gms/internal/ads/zztw$zza$zza.T : Lcom/google/android/gms/internal/ads/zztw$zza$zza;
    //   841: invokevirtual a : (Lcom/google/android/gms/internal/ads/zztw$zza$zza;)V
    //   844: aload_0
    //   845: iconst_1
    //   846: putfield m : Z
    //   849: aload_0
    //   850: getfield q : Lcom/google/android/gms/internal/ads/ks;
    //   853: astore_3
    //   854: aload_0
    //   855: aload_3
    //   856: getfield c : I
    //   859: aload_3
    //   860: getfield b : I
    //   863: invokevirtual setMeasuredDimension : (II)V
    //   866: aload_0
    //   867: monitorexit
    //   868: return
    //   869: aload_0
    //   870: iload_1
    //   871: iload_2
    //   872: invokespecial onMeasure : (II)V
    //   875: aload_0
    //   876: monitorexit
    //   877: return
    //   878: astore_3
    //   879: aload_0
    //   880: monitorexit
    //   881: aload_3
    //   882: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	878	finally
    //   18	42	878	finally
    //   45	61	878	finally
    //   64	100	878	finally
    //   103	108	878	finally
    //   112	118	878	finally
    //   131	137	878	finally
    //   140	152	878	finally
    //   259	275	878	finally
    //   278	314	878	finally
    //   317	361	878	finally
    //   376	381	878	finally
    //   381	388	878	finally
    //   391	397	878	finally
    //   400	427	878	finally
    //   430	453	878	finally
    //   505	527	878	finally
    //   537	541	878	finally
    //   544	578	878	finally
    //   592	610	878	finally
    //   632	650	878	finally
    //   657	667	878	finally
    //   685	782	878	finally
    //   782	810	878	finally
    //   813	827	878	finally
    //   827	849	878	finally
    //   849	866	878	finally
    //   869	875	878	finally
  }
  
  public final void onPause() {
    if (k())
      return; 
    try {
      super.onPause();
      return;
    } catch (Exception exception) {
      cm.c("Could not pause webview.", exception);
      return;
    } 
  }
  
  public final void onResume() {
    if (k())
      return; 
    try {
      super.onResume();
      return;
    } catch (Exception exception) {
      cm.c("Could not resume webview.", exception);
      return;
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   4: invokevirtual I : ()Z
    //   7: ifeq -> 48
    //   10: aload_0
    //   11: getfield n : Lcom/google/android/gms/internal/ads/wq;
    //   14: invokevirtual J : ()Z
    //   17: ifne -> 48
    //   20: aload_0
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield E : Lcom/google/android/gms/internal/ads/c3;
    //   26: astore_2
    //   27: aload_2
    //   28: ifnull -> 38
    //   31: aload_2
    //   32: aload_1
    //   33: invokeinterface Z0 : (Landroid/view/MotionEvent;)V
    //   38: aload_0
    //   39: monitorexit
    //   40: goto -> 76
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    //   48: aload_0
    //   49: getfield c : Lcom/google/android/gms/internal/ads/p12;
    //   52: astore_2
    //   53: aload_2
    //   54: ifnull -> 62
    //   57: aload_2
    //   58: aload_1
    //   59: invokevirtual d : (Landroid/view/MotionEvent;)V
    //   62: aload_0
    //   63: getfield d : Lcom/google/android/gms/internal/ads/n1;
    //   66: astore_2
    //   67: aload_2
    //   68: ifnull -> 76
    //   71: aload_2
    //   72: aload_1
    //   73: invokevirtual a : (Landroid/view/MotionEvent;)V
    //   76: aload_0
    //   77: invokevirtual k : ()Z
    //   80: ifeq -> 85
    //   83: iconst_0
    //   84: ireturn
    //   85: aload_0
    //   86: aload_1
    //   87: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   90: ireturn
    // Exception table:
    //   from	to	target	type
    //   22	27	43	finally
    //   31	38	43	finally
    //   38	40	43	finally
    //   44	46	43	finally
  }
  
  public final void p(String paramString, x6<? super tq> paramx6) {
    wq wq1 = this.n;
    if (wq1 != null)
      wq1.p(paramString, paramx6); 
  }
  
  public final boolean p0() {
    return false;
  }
  
  public final ks q() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield q : Lcom/google/android/gms/internal/ads/ks;
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
  
  public final void q0(zzd paramzzd) {
    this.n.t(paramzzd);
  }
  
  public final int r() {
    return getMeasuredWidth();
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener) {
    this.N = new WeakReference<View.OnClickListener>(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public final void setRequestedOrientation(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield x : I
    //   7: aload_0
    //   8: getfield o : Lcom/google/android/gms/ads/internal/overlay/f;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 21
    //   16: aload_2
    //   17: iload_1
    //   18: invokevirtual U9 : (I)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_2
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	24	finally
    //   16	21	24	finally
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient) {
    super.setWebViewClient(paramWebViewClient);
    if (paramWebViewClient instanceof wq)
      this.n = (wq)paramWebViewClient; 
  }
  
  public final void stopLoading() {
    if (k())
      return; 
    try {
      super.stopLoading();
      return;
    } catch (Exception exception) {
      cm.c("Could not stop loading webview.", exception);
      return;
    } 
  }
  
  public final void t() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield F : Lcom/google/android/gms/internal/ads/y2;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 17
    //   11: aload_1
    //   12: invokeinterface a2 : ()V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	20	finally
    //   11	17	20	finally
  }
  
  public final void u(lm2 paramlm2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield G : Lcom/google/android/gms/internal/ads/lm2;
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
  
  public final void u0(nh1 paramnh1, sh1 paramsh1) {
    this.j = paramnh1;
    this.k = paramsh1;
  }
  
  public final c3 v() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield E : Lcom/google/android/gms/internal/ads/c3;
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
  
  public final void v0(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield y : Z
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public final String w() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield r : Ljava/lang/String;
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
  
  public final void x() {
    wq wq1 = this.n;
    if (wq1 != null)
      wq1.x(); 
  }
  
  public final void x0(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield P : Lcom/google/android/gms/ads/internal/overlay/f;
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
  
  public final up y(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield W : Ljava/util/Map;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: aload_2
    //   16: aload_1
    //   17: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast com/google/android/gms/internal/ads/up
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: areturn
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	30	finally
    //   15	26	30	finally
  }
  
  public final boolean y0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield H : I
    //   6: istore_1
    //   7: iload_1
    //   8: ifle -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -> 13
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: goto -> 30
    //   28: aload_3
    //   29: athrow
    //   30: goto -> 28
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final void z(String paramString, p<x6<? super tq>> paramp) {
    wq wq1 = this.n;
    if (wq1 != null)
      wq1.z(paramString, paramp); 
  }
  
  public final f z0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Lcom/google/android/gms/ads/internal/overlay/f;
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */