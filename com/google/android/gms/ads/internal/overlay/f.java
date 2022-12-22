package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.br;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.df;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.tq;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.xn2;
import com.google.android.gms.internal.ads.xp1;
import com.google.android.gms.internal.ads.z5;
import com.google.android.gms.internal.ads.zu0;
import com.google.android.gms.internal.ads.zzazn;
import java.util.Collections;

public class f extends df implements y {
  private static final int b = Color.argb(0, 0, 0, 0);
  
  protected final Activity c;
  
  AdOverlayInfoParcel d;
  
  tq e;
  
  private j f;
  
  private zzp g;
  
  private boolean h = false;
  
  private FrameLayout i;
  
  private WebChromeClient.CustomViewCallback j;
  
  private boolean k = false;
  
  private boolean l = false;
  
  private k m;
  
  private boolean n = false;
  
  zzn o = zzn.b;
  
  private final Object p = new Object();
  
  private Runnable q;
  
  private boolean r;
  
  private boolean s;
  
  private boolean t = false;
  
  private boolean u = false;
  
  private boolean v = true;
  
  public f(Activity paramActivity) {
    this.c = paramActivity;
  }
  
  private final void V9(Configuration paramConfiguration) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    //   4: astore_2
    //   5: iconst_1
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_2
    //   11: ifnull -> 36
    //   14: aload_2
    //   15: getfield p : Lcom/google/android/gms/ads/internal/zzk;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull -> 36
    //   23: aload_2
    //   24: getfield c : Z
    //   27: ifeq -> 36
    //   30: iconst_1
    //   31: istore #5
    //   33: goto -> 39
    //   36: iconst_0
    //   37: istore #5
    //   39: invokestatic e : ()Lcom/google/android/gms/ads/internal/util/p1;
    //   42: aload_0
    //   43: getfield c : Landroid/app/Activity;
    //   46: aload_1
    //   47: invokevirtual h : (Landroid/app/Activity;Landroid/content/res/Configuration;)Z
    //   50: istore #6
    //   52: aload_0
    //   53: getfield l : Z
    //   56: ifeq -> 64
    //   59: iload #5
    //   61: ifeq -> 139
    //   64: iload #6
    //   66: ifne -> 139
    //   69: iload_3
    //   70: istore #7
    //   72: iload #4
    //   74: istore #8
    //   76: getstatic android/os/Build$VERSION.SDK_INT : I
    //   79: bipush #19
    //   81: if_icmplt -> 146
    //   84: aload_0
    //   85: getfield d : Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    //   88: astore_1
    //   89: iload_3
    //   90: istore #7
    //   92: iload #4
    //   94: istore #8
    //   96: aload_1
    //   97: ifnull -> 146
    //   100: aload_1
    //   101: getfield p : Lcom/google/android/gms/ads/internal/zzk;
    //   104: astore_1
    //   105: iload_3
    //   106: istore #7
    //   108: iload #4
    //   110: istore #8
    //   112: aload_1
    //   113: ifnull -> 146
    //   116: iload_3
    //   117: istore #7
    //   119: iload #4
    //   121: istore #8
    //   123: aload_1
    //   124: getfield h : Z
    //   127: ifeq -> 146
    //   130: iconst_1
    //   131: istore #8
    //   133: iload_3
    //   134: istore #7
    //   136: goto -> 146
    //   139: iconst_0
    //   140: istore #7
    //   142: iload #4
    //   144: istore #8
    //   146: aload_0
    //   147: getfield c : Landroid/app/Activity;
    //   150: invokevirtual getWindow : ()Landroid/view/Window;
    //   153: astore_2
    //   154: getstatic com/google/android/gms/internal/ads/m0.K0 : Lcom/google/android/gms/internal/ads/x;
    //   157: astore_1
    //   158: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   161: aload_1
    //   162: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   165: checkcast java/lang/Boolean
    //   168: invokevirtual booleanValue : ()Z
    //   171: ifeq -> 219
    //   174: getstatic android/os/Build$VERSION.SDK_INT : I
    //   177: bipush #19
    //   179: if_icmplt -> 219
    //   182: aload_2
    //   183: invokevirtual getDecorView : ()Landroid/view/View;
    //   186: astore_1
    //   187: sipush #256
    //   190: istore #5
    //   192: iload #7
    //   194: ifeq -> 212
    //   197: sipush #5380
    //   200: istore #5
    //   202: iload #8
    //   204: ifeq -> 212
    //   207: sipush #5894
    //   210: istore #5
    //   212: aload_1
    //   213: iload #5
    //   215: invokevirtual setSystemUiVisibility : (I)V
    //   218: return
    //   219: iload #7
    //   221: ifeq -> 262
    //   224: aload_2
    //   225: sipush #1024
    //   228: invokevirtual addFlags : (I)V
    //   231: aload_2
    //   232: sipush #2048
    //   235: invokevirtual clearFlags : (I)V
    //   238: getstatic android/os/Build$VERSION.SDK_INT : I
    //   241: bipush #19
    //   243: if_icmplt -> 276
    //   246: iload #8
    //   248: ifeq -> 276
    //   251: aload_2
    //   252: invokevirtual getDecorView : ()Landroid/view/View;
    //   255: sipush #4098
    //   258: invokevirtual setSystemUiVisibility : (I)V
    //   261: return
    //   262: aload_2
    //   263: sipush #2048
    //   266: invokevirtual addFlags : (I)V
    //   269: aload_2
    //   270: sipush #1024
    //   273: invokevirtual clearFlags : (I)V
    //   276: return
  }
  
  private final void Y9(boolean paramBoolean) {
    int m;
    x x = m0.w3;
    int i = ((Integer)er2.e().c(x)).intValue();
    r r = new r();
    r.e = 50;
    if (paramBoolean) {
      m = i;
    } else {
      m = 0;
    } 
    r.a = m;
    if (paramBoolean) {
      m = 0;
    } else {
      m = i;
    } 
    r.b = m;
    r.c = 0;
    r.d = i;
    this.g = new zzp((Context)this.c, r, this);
    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
    layoutParams.addRule(10);
    if (paramBoolean) {
      i = 11;
    } else {
      i = 9;
    } 
    layoutParams.addRule(i);
    X9(paramBoolean, this.d.h);
    this.m.addView((View)this.g, (ViewGroup.LayoutParams)layoutParams);
  }
  
  private final void Z9(boolean paramBoolean) {
    if (!this.s)
      this.c.requestWindowFeature(1); 
    Window window = this.c.getWindow();
    if (window != null) {
      boolean bool;
      tq tq2 = this.d.e;
      AdOverlayInfoParcel adOverlayInfoParcel2 = null;
      if (tq2 != null) {
        es es = tq2.N();
      } else {
        tq2 = null;
      } 
      boolean bool1 = false;
      boolean bool2 = false;
      if (tq2 != null && tq2.E0()) {
        bool = true;
      } else {
        bool = false;
      } 
      this.n = false;
      if (bool) {
        int i = this.d.k;
        if (i == 6) {
          if ((this.c.getResources().getConfiguration()).orientation == 1)
            bool2 = true; 
          this.n = bool2;
        } else if (i == 7) {
          bool2 = bool1;
          if ((this.c.getResources().getConfiguration()).orientation == 2)
            bool2 = true; 
          this.n = bool2;
        } 
      } 
      bool2 = this.n;
      StringBuilder stringBuilder = new StringBuilder(46);
      stringBuilder.append("Delay onShow to next orientation change: ");
      stringBuilder.append(bool2);
      cm.e(stringBuilder.toString());
      U9(this.d.k);
      window.setFlags(16777216, 16777216);
      cm.e("Hardware acceleration on the AdActivity window enabled.");
      if (!this.l) {
        this.m.setBackgroundColor(-16777216);
      } else {
        this.m.setBackgroundColor(b);
      } 
      this.c.setContentView((View)this.m);
      this.s = true;
      if (paramBoolean) {
        try {
          a a;
          q.d();
          Activity activity = this.c;
          tq tq5 = this.d.e;
          if (tq5 != null) {
            ks ks = tq5.q();
          } else {
            tq5 = null;
          } 
          tq tq3 = this.d.e;
          if (tq3 != null) {
            String str1 = tq3.w();
          } else {
            tq3 = null;
          } 
          AdOverlayInfoParcel adOverlayInfoParcel5 = this.d;
          zzazn zzazn = adOverlayInfoParcel5.n;
          tq tq6 = adOverlayInfoParcel5.e;
          if (tq6 != null) {
            b b = tq6.g();
          } else {
            tq6 = null;
          } 
          tq5 = br.a((Context)activity, (ks)tq5, (String)tq3, true, bool, null, null, zzazn, null, null, (b)tq6, xn2.f(), null, null);
          this.e = tq5;
          es es = tq5.N();
          AdOverlayInfoParcel adOverlayInfoParcel4 = this.d;
          z5 z5 = adOverlayInfoParcel4.q;
          b6 b6 = adOverlayInfoParcel4.f;
          u u = adOverlayInfoParcel4.j;
          tq tq7 = adOverlayInfoParcel4.e;
          adOverlayInfoParcel4 = adOverlayInfoParcel2;
          if (tq7 != null)
            a = tq7.N().t0(); 
          es.s(null, z5, null, b6, u, true, null, a, null, null, null, null, null, null);
          this.e.N().w0(new h(this));
          AdOverlayInfoParcel adOverlayInfoParcel3 = this.d;
          String str = adOverlayInfoParcel3.m;
          if (str != null) {
            this.e.loadUrl(str);
          } else {
            str = adOverlayInfoParcel3.i;
            if (str != null) {
              this.e.loadDataWithBaseURL(adOverlayInfoParcel3.g, str, "text/html", "UTF-8", null);
            } else {
              throw new zzg("No URL or HTML to display in ad overlay.");
            } 
          } 
          tq tq4 = this.d.e;
          if (tq4 != null)
            tq4.x0(this); 
        } catch (Exception exception) {
          cm.c("Error obtaining webview.", exception);
          throw new zzg("Could not obtain webview for the overlay.");
        } 
      } else {
        tq tq3 = this.d.e;
        this.e = tq3;
        tq3.B0((Context)this.c);
      } 
      this.e.V(this);
      tq tq1 = this.d.e;
      if (tq1 != null)
        aa(tq1.F(), (View)this.m); 
      if (this.d.l != 5) {
        ViewParent viewParent = this.e.getParent();
        if (viewParent != null && viewParent instanceof ViewGroup)
          ((ViewGroup)viewParent).removeView(this.e.getView()); 
        if (this.l)
          this.e.M(); 
        this.m.addView(this.e.getView(), -1, -1);
      } 
      if (!paramBoolean && !this.n)
        ga(); 
      AdOverlayInfoParcel adOverlayInfoParcel1 = this.d;
      if (adOverlayInfoParcel1.l != 5) {
        Y9(bool);
        if (this.e.f0())
          X9(bool, true); 
        return;
      } 
      zu0.T9(this.c, this, adOverlayInfoParcel1.v, adOverlayInfoParcel1.s, adOverlayInfoParcel1.t, adOverlayInfoParcel1.u, adOverlayInfoParcel1.r, adOverlayInfoParcel1.w);
      return;
    } 
    throw new zzg("Invalid activity, no window available.");
  }
  
  private static void aa(a parama, View paramView) {
    if (parama != null && paramView != null)
      q.r().f(parama, paramView); 
  }
  
  private final void da() {
    if (this.c.isFinishing() && !this.t) {
      this.t = true;
      if (this.e != null) {
        int i = this.o.zzwf();
        this.e.a0(i);
        synchronized (this.p) {
          if (!this.r && this.e.y0()) {
            g g = new g();
            this(this);
            this.q = g;
            xp1 xp1 = h1.a;
            x x = m0.H0;
            xp1.postDelayed(g, ((Long)er2.e().c(x)).longValue());
            return;
          } 
        } 
      } 
      ea();
    } 
  }
  
  private final void ga() {
    this.e.K0();
  }
  
  public void G9(Bundle paramBundle) {
    boolean bool;
    this.c.requestWindowFeature(1);
    if (paramBundle != null && paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.k = bool;
    try {
      AdOverlayInfoParcel adOverlayInfoParcel = AdOverlayInfoParcel.p0(this.c.getIntent());
      this.d = adOverlayInfoParcel;
      if (adOverlayInfoParcel != null) {
        if (adOverlayInfoParcel.n.d > 7500000)
          this.o = zzn.e; 
        if (this.c.getIntent() != null)
          this.v = this.c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true); 
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.d;
        zzk zzk = adOverlayInfoParcel2.p;
        if (zzk != null) {
          this.l = zzk.b;
        } else if (adOverlayInfoParcel2.l == 5) {
          this.l = true;
        } else {
          this.l = false;
        } 
        if (this.l && adOverlayInfoParcel2.l != 5 && zzk.g != -1) {
          m m = new m();
          this(this, null);
          m.c();
        } 
        if (paramBundle == null) {
          p p = this.d.d;
          if (p != null && this.v)
            p.u9(); 
          AdOverlayInfoParcel adOverlayInfoParcel3 = this.d;
          if (adOverlayInfoParcel3.l != 1) {
            bq2 bq2 = adOverlayInfoParcel3.c;
            if (bq2 != null)
              bq2.x(); 
          } 
        } 
        k k1 = new k();
        Activity activity = this.c;
        AdOverlayInfoParcel adOverlayInfoParcel1 = this.d;
        this((Context)activity, adOverlayInfoParcel1.o, adOverlayInfoParcel1.n.b);
        this.m = k1;
        k1.setId(1000);
        q.e().n(this.c);
        adOverlayInfoParcel1 = this.d;
        int i = adOverlayInfoParcel1.l;
        if (i != 1) {
          zzg zzg1;
          if (i != 2) {
            if (i != 3) {
              if (i == 5) {
                Z9(false);
                return;
              } 
              zzg1 = new zzg();
              this("Could not determine ad overlay type.");
              throw zzg1;
            } 
            Z9(true);
            return;
          } 
          j j1 = new j();
          this(((AdOverlayInfoParcel)zzg1).e);
          this.f = j1;
          Z9(false);
          return;
        } 
        Z9(false);
        return;
      } 
      zzg zzg = new zzg();
      this("Could not get info for ad overlay.");
      throw zzg;
    } catch (zzg zzg) {
      cm.i(zzg.getMessage());
      this.o = zzn.e;
      this.c.finish();
      return;
    } 
  }
  
  public final void L7() {}
  
  public final void M0() {
    p p = this.d.d;
    if (p != null)
      p.M0(); 
  }
  
  public final boolean S8() {
    this.o = zzn.b;
    tq tq1 = this.e;
    if (tq1 == null)
      return true; 
    boolean bool = tq1.n0();
    if (!bool)
      this.e.B("onbackblocked", Collections.emptyMap()); 
    return bool;
  }
  
  public final void T9() {
    this.o = zzn.d;
    this.c.finish();
    AdOverlayInfoParcel adOverlayInfoParcel = this.d;
    if (adOverlayInfoParcel != null && adOverlayInfoParcel.l == 5)
      this.c.overridePendingTransition(0, 0); 
  }
  
  public final void U7(a parama) {
    V9((Configuration)b.o1(parama));
  }
  
  public final void U9(int paramInt) {
    int i = (this.c.getApplicationInfo()).targetSdkVersion;
    x x = m0.D4;
    if (i >= ((Integer)er2.e().c(x)).intValue()) {
      i = (this.c.getApplicationInfo()).targetSdkVersion;
      x = m0.E4;
      if (i <= ((Integer)er2.e().c(x)).intValue()) {
        i = Build.VERSION.SDK_INT;
        x = m0.F4;
        if (i >= ((Integer)er2.e().c(x)).intValue()) {
          x = m0.G4;
          if (i <= ((Integer)er2.e().c(x)).intValue())
            return; 
        } 
      } 
    } 
    try {
      return;
    } finally {
      x = null;
      q.g().h((Throwable)x, "AdOverlay.setRequestedOrientation");
    } 
  }
  
  public final void W9(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
    FrameLayout frameLayout = new FrameLayout((Context)this.c);
    this.i = frameLayout;
    frameLayout.setBackgroundColor(-16777216);
    this.i.addView(paramView, -1, -1);
    this.c.setContentView((View)this.i);
    this.s = true;
    this.j = paramCustomViewCallback;
    this.h = true;
  }
  
  public final void X() {
    x x = m0.u3;
    if (((Boolean)er2.e().c(x)).booleanValue() && this.e != null && (!this.c.isFinishing() || this.f == null))
      this.e.onPause(); 
    da();
  }
  
  public final void X9(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/m0.I0 : Lcom/google/android/gms/internal/ads/x;
    //   3: astore_3
    //   4: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   7: aload_3
    //   8: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   11: checkcast java/lang/Boolean
    //   14: invokevirtual booleanValue : ()Z
    //   17: istore #4
    //   19: iconst_1
    //   20: istore #5
    //   22: iload #4
    //   24: ifeq -> 58
    //   27: aload_0
    //   28: getfield d : Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnull -> 58
    //   36: aload_3
    //   37: getfield p : Lcom/google/android/gms/ads/internal/zzk;
    //   40: astore_3
    //   41: aload_3
    //   42: ifnull -> 58
    //   45: aload_3
    //   46: getfield i : Z
    //   49: ifeq -> 58
    //   52: iconst_1
    //   53: istore #6
    //   55: goto -> 61
    //   58: iconst_0
    //   59: istore #6
    //   61: getstatic com/google/android/gms/internal/ads/m0.J0 : Lcom/google/android/gms/internal/ads/x;
    //   64: astore_3
    //   65: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   68: aload_3
    //   69: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   72: checkcast java/lang/Boolean
    //   75: invokevirtual booleanValue : ()Z
    //   78: ifeq -> 112
    //   81: aload_0
    //   82: getfield d : Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    //   85: astore_3
    //   86: aload_3
    //   87: ifnull -> 112
    //   90: aload_3
    //   91: getfield p : Lcom/google/android/gms/ads/internal/zzk;
    //   94: astore_3
    //   95: aload_3
    //   96: ifnull -> 112
    //   99: aload_3
    //   100: getfield j : Z
    //   103: ifeq -> 112
    //   106: iconst_1
    //   107: istore #7
    //   109: goto -> 115
    //   112: iconst_0
    //   113: istore #7
    //   115: iload_1
    //   116: ifeq -> 153
    //   119: iload_2
    //   120: ifeq -> 153
    //   123: iload #6
    //   125: ifeq -> 153
    //   128: iload #7
    //   130: ifne -> 153
    //   133: new com/google/android/gms/internal/ads/oe
    //   136: dup
    //   137: aload_0
    //   138: getfield e : Lcom/google/android/gms/internal/ads/tq;
    //   141: ldc_w 'useCustomClose'
    //   144: invokespecial <init> : (Lcom/google/android/gms/internal/ads/tq;Ljava/lang/String;)V
    //   147: ldc_w 'Custom close has been disabled for interstitial ads in this ad slot.'
    //   150: invokevirtual e : (Ljava/lang/String;)V
    //   153: aload_0
    //   154: getfield g : Lcom/google/android/gms/ads/internal/overlay/zzp;
    //   157: astore_3
    //   158: aload_3
    //   159: ifnull -> 192
    //   162: iload #5
    //   164: istore_1
    //   165: iload #7
    //   167: ifne -> 187
    //   170: iload_2
    //   171: ifeq -> 185
    //   174: iload #6
    //   176: ifne -> 185
    //   179: iload #5
    //   181: istore_1
    //   182: goto -> 187
    //   185: iconst_0
    //   186: istore_1
    //   187: aload_3
    //   188: iload_1
    //   189: invokevirtual a : (Z)V
    //   192: return
  }
  
  public final void ba() {
    AdOverlayInfoParcel adOverlayInfoParcel = this.d;
    if (adOverlayInfoParcel != null && this.h)
      U9(adOverlayInfoParcel.k); 
    if (this.i != null) {
      this.c.setContentView((View)this.m);
      this.s = true;
      this.i.removeAllViews();
      this.i = null;
    } 
    WebChromeClient.CustomViewCallback customViewCallback = this.j;
    if (customViewCallback != null) {
      customViewCallback.onCustomViewHidden();
      this.j = null;
    } 
    this.h = false;
  }
  
  public final void c5(Bundle paramBundle) {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.k);
  }
  
  public final void ca() {
    this.m.removeView((View)this.g);
    Y9(true);
  }
  
  final void ea() {
    if (this.u)
      return; 
    this.u = true;
    tq tq1 = this.e;
    if (tq1 != null) {
      this.m.removeView(tq1.getView());
      j j1 = this.f;
      if (j1 != null) {
        this.e.B0(j1.d);
        this.e.h0(false);
        ViewGroup viewGroup = this.f.c;
        View view = this.e.getView();
        j j2 = this.f;
        viewGroup.addView(view, j2.a, j2.b);
        this.f = null;
      } else if (this.c.getApplicationContext() != null) {
        this.e.B0(this.c.getApplicationContext());
      } 
      this.e = null;
    } 
    AdOverlayInfoParcel adOverlayInfoParcel = this.d;
    if (adOverlayInfoParcel != null) {
      p p = adOverlayInfoParcel.d;
      if (p != null)
        p.R5(this.o); 
    } 
    adOverlayInfoParcel = this.d;
    if (adOverlayInfoParcel != null) {
      tq tq2 = adOverlayInfoParcel.e;
      if (tq2 != null)
        aa(tq2.F(), this.d.e.getView()); 
    } 
  }
  
  public final void fa() {
    if (this.n) {
      this.n = false;
      ga();
    } 
  }
  
  public final void ha() {
    this.m.c = true;
  }
  
  public final void i1() {
    this.o = zzn.c;
    this.c.finish();
  }
  
  public final void ia() {
    synchronized (this.p) {
      this.r = true;
      Runnable runnable = this.q;
      if (runnable != null) {
        xp1 xp1 = h1.a;
        xp1.removeCallbacks(runnable);
        xp1.post(this.q);
      } 
      return;
    } 
  }
  
  public final void onDestroy() {
    tq tq1 = this.e;
    if (tq1 != null)
      try {
        this.m.removeView(tq1.getView());
      } catch (NullPointerException nullPointerException) {} 
    da();
  }
  
  public final void onPause() {
    ba();
    p p = this.d.d;
    if (p != null)
      p.onPause(); 
    x x = m0.u3;
    if (!((Boolean)er2.e().c(x)).booleanValue() && this.e != null && (!this.c.isFinishing() || this.f == null))
      this.e.onPause(); 
    da();
  }
  
  public final void onResume() {
    p p = this.d.d;
    if (p != null)
      p.onResume(); 
    V9(this.c.getResources().getConfiguration());
    x x = m0.u3;
    if (!((Boolean)er2.e().c(x)).booleanValue()) {
      tq tq1 = this.e;
      if (tq1 != null && !tq1.k()) {
        this.e.onResume();
        return;
      } 
      cm.i("The webview does not exist. Ignoring action.");
    } 
  }
  
  public final void onStart() {
    x x = m0.u3;
    if (((Boolean)er2.e().c(x)).booleanValue()) {
      tq tq1 = this.e;
      if (tq1 != null && !tq1.k()) {
        this.e.onResume();
        return;
      } 
      cm.i("The webview does not exist. Ignoring action.");
    } 
  }
  
  public final void x1(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void x4() {
    this.s = true;
  }
  
  public final void z8() {
    this.o = zzn.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */