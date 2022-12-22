package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.h.k.w;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.common.util.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class wq extends WebViewClient implements es {
  private final HashSet<String> A;
  
  private View.OnAttachStateChangeListener B;
  
  protected tq b;
  
  private final xn2 c;
  
  private final HashMap<String, List<x6<? super tq>>> d = new HashMap<String, List<x6<? super tq>>>();
  
  private final Object e = new Object();
  
  private bq2 f;
  
  private p g;
  
  private hs h;
  
  private gs i;
  
  private z5 j;
  
  private b6 k;
  
  private js l;
  
  private boolean m = false;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private boolean q;
  
  private u r;
  
  private final pe s;
  
  private a t;
  
  private ee u;
  
  protected uj v;
  
  private boolean w;
  
  private boolean x;
  
  private int y;
  
  private boolean z;
  
  public wq(tq paramtq, xn2 paramxn2, boolean paramBoolean) {
    this(paramtq, paramxn2, paramBoolean, new pe(paramtq, paramtq.j0(), new s(paramtq.getContext())), null);
  }
  
  private wq(tq paramtq, xn2 paramxn2, boolean paramBoolean, pe parampe, ee paramee) {
    this.c = paramxn2;
    this.b = paramtq;
    this.n = paramBoolean;
    this.s = parampe;
    this.u = null;
    x<String> x = m0.j4;
    this.A = new HashSet<String>(Arrays.asList(((String)er2.e().<String>c(x)).split(",")));
  }
  
  private final void D(Map<String, String> paramMap, List<x6<? super tq>> paramList, String paramString) {
    if (b1.n()) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Received GMSG: ".concat(paramString);
      } else {
        paramString = new String("Received GMSG: ");
      } 
      b1.m(paramString);
      for (String paramString : paramMap.keySet()) {
        String str = paramMap.get(paramString);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 4 + String.valueOf(str).length());
        stringBuilder.append("  ");
        stringBuilder.append(paramString);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        b1.m(stringBuilder.toString());
      } 
    } 
    Iterator<x6<? super tq>> iterator = paramList.iterator();
    while (iterator.hasNext())
      ((x6<tq>)iterator.next()).a(this.b, paramMap); 
  }
  
  private final void O() {
    if (this.B == null)
      return; 
    this.b.getView().removeOnAttachStateChangeListener(this.B);
  }
  
  private final void S() {
    if (this.h != null && ((this.w && this.y <= 0) || this.x)) {
      x<Boolean> x = m0.D1;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && this.b.m() != null)
        u0.a(this.b.m().c(), this.b.E(), new String[] { "awfllc" }); 
      this.h.a(true ^ this.x);
      this.h = null;
    } 
    this.b.S0();
  }
  
  private static WebResourceResponse Y() {
    x<Boolean> x = m0.p0;
    return ((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0])) : null;
  }
  
  private final WebResourceResponse l0(String paramString, Map<String, String> paramMap) {
    null = new URL(paramString);
    try {
      TrafficStats.setThreadStatsTag(264);
      byte b = 0;
      while (++b <= 20) {
        URLConnection uRLConnection = null.openConnection();
        uRLConnection.setConnectTimeout(10000);
        uRLConnection.setReadTimeout(10000);
        for (Map.Entry<String, String> entry : paramMap.entrySet())
          uRLConnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue()); 
        if (uRLConnection instanceof HttpURLConnection) {
          HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
          q.c().m(this.b.getContext(), (this.b.b()).b, false, httpURLConnection, false, 60000);
          wl wl = new wl();
          this();
          wl.i(httpURLConnection, null);
          int i = httpURLConnection.getResponseCode();
          wl.h(httpURLConnection, i);
          if (i >= 300 && i < 400) {
            String str = httpURLConnection.getHeaderField("Location");
            if (str != null) {
              WebResourceResponse webResourceResponse;
              String str1;
              boolean bool = str.startsWith("tel:");
              if (bool)
                return null; 
              URL uRL2 = new URL();
              this(null, str);
              String str2 = uRL2.getProtocol();
              if (str2 == null) {
                cm.i("Protocol is null");
                webResourceResponse = Y();
                return webResourceResponse;
              } 
              if (!webResourceResponse.equals("http") && !webResourceResponse.equals("https")) {
                String str3;
                if (webResourceResponse.length() != 0) {
                  str3 = "Unsupported scheme: ".concat((String)webResourceResponse);
                } else {
                  str3 = new String("Unsupported scheme: ");
                } 
                cm.i(str3);
                return Y();
              } 
              if (str.length() != 0) {
                str1 = "Redirecting to ".concat(str);
              } else {
                str1 = new String("Redirecting to ");
              } 
              cm.e(str1);
              httpURLConnection.disconnect();
              URL uRL1 = uRL2;
              continue;
            } 
            IOException iOException1 = new IOException();
            this("Missing Location header in redirect");
            throw iOException1;
          } 
          q.c();
          return h1.X(httpURLConnection);
        } 
        IOException iOException = new IOException();
        this("Invalid protocol.");
        throw iOException;
      } 
      TrafficStats.clearThreadStatsTag();
      StringBuilder stringBuilder = new StringBuilder(32);
      stringBuilder.append("Too many redirects (20)");
      throw new IOException(stringBuilder.toString());
    } finally {
      TrafficStats.clearThreadStatsTag();
    } 
  }
  
  private final void n(View paramView, uj paramuj, int paramInt) {
    if (paramuj.e() && paramInt > 0) {
      paramuj.g(paramView);
      if (paramuj.e())
        h1.a.postDelayed(new xq(this, paramView, paramuj, paramInt), 100L); 
    } 
  }
  
  private final void r(AdOverlayInfoParcel paramAdOverlayInfoParcel) {
    boolean bool;
    ee ee1 = this.u;
    if (ee1 != null) {
      bool = ee1.l();
    } else {
      bool = false;
    } 
    q.b();
    n.a(this.b.getContext(), paramAdOverlayInfoParcel, bool ^ true);
    uj uj1 = this.v;
    if (uj1 != null) {
      String str2 = paramAdOverlayInfoParcel.m;
      String str1 = str2;
      if (str2 == null) {
        zzd zzd = paramAdOverlayInfoParcel.b;
        str1 = str2;
        if (zzd != null)
          str1 = zzd.c; 
      } 
      uj1.b(str1);
    } 
  }
  
  public final void A0() {
    synchronized (this.e) {
      this.q = true;
      this.y++;
      S();
      return;
    } 
  }
  
  public final void C0(boolean paramBoolean) {
    synchronized (this.e) {
      this.o = true;
      return;
    } 
  }
  
  public final void E(boolean paramBoolean, int paramInt, String paramString) {
    bq2 bq21;
    cr cr;
    boolean bool = this.b.T();
    if (bool && !this.b.q().e()) {
      bq21 = null;
    } else {
      bq21 = this.f;
    } 
    if (bool) {
      cr = null;
    } else {
      cr = new cr(this.b, this.g);
    } 
    z5 z51 = this.j;
    b6 b61 = this.k;
    u u1 = this.r;
    tq tq1 = this.b;
    r(new AdOverlayInfoParcel(bq21, cr, z51, b61, u1, tq1, paramBoolean, paramInt, paramString, tq1.b()));
  }
  
  public final boolean E0() {
    synchronized (this.e) {
      return this.n;
    } 
  }
  
  public final void F0() {
    synchronized (this.e) {
      this.m = false;
      this.n = true;
      nt1 nt1 = fm.e;
      vq vq = new vq();
      this(this);
      nt1.execute(vq);
      return;
    } 
  }
  
  public final void H(boolean paramBoolean, int paramInt, String paramString1, String paramString2) {
    bq2 bq21;
    cr cr;
    boolean bool = this.b.T();
    if (bool && !this.b.q().e()) {
      bq21 = null;
    } else {
      bq21 = this.f;
    } 
    if (bool) {
      cr = null;
    } else {
      cr = new cr(this.b, this.g);
    } 
    z5 z51 = this.j;
    b6 b61 = this.k;
    u u1 = this.r;
    tq tq1 = this.b;
    r(new AdOverlayInfoParcel(bq21, cr, z51, b61, u1, tq1, paramBoolean, paramInt, paramString1, paramString2, tq1.b()));
  }
  
  public final boolean I() {
    synchronized (this.e) {
      return this.o;
    } 
  }
  
  public final boolean J() {
    synchronized (this.e) {
      return this.p;
    } 
  }
  
  public final void J0(gs paramgs) {
    this.i = paramgs;
  }
  
  public final ViewTreeObserver.OnGlobalLayoutListener K() {
    synchronized (this.e) {
      return null;
    } 
  }
  
  public final ViewTreeObserver.OnScrollChangedListener L() {
    synchronized (this.e) {
      return null;
    } 
  }
  
  public final void L0() {
    this.y--;
    S();
  }
  
  public final void T0() {
    xn2 xn21 = this.c;
    if (xn21 != null)
      xn21.a(zztw$zza$zza.W); 
    this.x = true;
    S();
    this.b.destroy();
  }
  
  public final void W(boolean paramBoolean) {
    synchronized (this.e) {
      this.p = paramBoolean;
      return;
    } 
  }
  
  public final void b0(int paramInt1, int paramInt2) {
    ee ee1 = this.u;
    if (ee1 != null)
      ee1.k(paramInt1, paramInt2); 
  }
  
  public final void d(String paramString, x6<? super tq> paramx6) {
    synchronized (this.e) {
      List<x6<? super tq>> list1 = this.d.get(paramString);
      List<x6<? super tq>> list2 = list1;
      if (list1 == null) {
        list2 = new CopyOnWriteArrayList();
        super();
        this.d.put(paramString, list2);
      } 
      list2.add(paramx6);
      return;
    } 
  }
  
  public final void g0(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public final void i() {
    uj uj1 = this.v;
    if (uj1 != null) {
      uj1.a();
      this.v = null;
    } 
    O();
    synchronized (this.e) {
      this.d.clear();
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.m = false;
      this.n = false;
      this.o = false;
      this.q = false;
      this.r = null;
      this.l = null;
      ee ee1 = this.u;
      if (ee1 != null) {
        ee1.i(true);
        this.u = null;
      } 
      return;
    } 
  }
  
  protected final WebResourceResponse i0(String paramString, Map<String, String> paramMap) {
    try {
      String str = qk.d(paramString, this.b.getContext(), this.z);
      if (!str.equals(paramString))
        return l0(str, paramMap); 
      zzth zzth = zzth.o0(paramString);
      if (zzth != null) {
        zztc zztc = q.i().d(zzth);
        if (zztc != null && zztc.o0())
          return new WebResourceResponse("", "", zztc.p0()); 
      } 
      return (wl.a() && ((Boolean)e2.b.a()).booleanValue()) ? l0(paramString, paramMap) : null;
    } catch (Exception exception) {
    
    } catch (NoClassDefFoundError noClassDefFoundError) {}
    q.g().e(noClassDefFoundError, "AdWebViewClient.interceptRequest");
    return Y();
  }
  
  public final void k0(boolean paramBoolean, int paramInt) {
    bq2 bq21;
    if (this.b.T() && !this.b.q().e()) {
      bq21 = null;
    } else {
      bq21 = this.f;
    } 
    p p1 = this.g;
    u u1 = this.r;
    tq tq1 = this.b;
    r(new AdOverlayInfoParcel(bq21, p1, u1, tq1, paramBoolean, paramInt, tq1.b()));
  }
  
  public final void l(Uri paramUri) {
    String str2 = paramUri.getPath();
    List<x6<? super tq>> list = this.d.get(str2);
    if (str2 != null && list != null) {
      String str = paramUri.getEncodedQuery();
      x<Boolean> x1 = m0.i4;
      if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue() && this.A.contains(str2) && str != null) {
        int i = str.length();
        x<Integer> x2 = m0.k4;
        if (i >= ((Integer)er2.e().c((x)x2)).intValue()) {
          String str3;
          if (str2.length() != 0) {
            str3 = "Parsing gmsg query params on BG thread: ".concat(str2);
          } else {
            str3 = new String("Parsing gmsg query params on BG thread: ");
          } 
          b1.m(str3);
          dt1.g(q.c().i0(paramUri), new zq(this, list, str2, paramUri), fm.e);
          return;
        } 
      } 
      q.c();
      D(h1.g0(paramUri), list, str2);
      return;
    } 
    String str1 = String.valueOf(paramUri);
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 32);
    stringBuilder.append("No GMSG handler found for GMSG: ");
    stringBuilder.append(str1);
    b1.m(stringBuilder.toString());
    x<Boolean> x = m0.o5;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && q.g().l() != null)
      fm.a.execute(new yq(str2)); 
  }
  
  public final void m0() {
    uj uj1 = this.v;
    if (uj1 != null) {
      WebView webView = this.b.getWebView();
      if (w.U((View)webView)) {
        n((View)webView, uj1, 10);
        return;
      } 
      O();
      this.B = new ar(this, uj1);
      this.b.getView().addOnAttachStateChangeListener(this.B);
    } 
  }
  
  public final void o0(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString) {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      str = "Loading resource: ".concat(str);
    } else {
      str = new String("Loading resource: ");
    } 
    b1.m(str);
    Uri uri = Uri.parse(paramString);
    if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost()))
      l(uri); 
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString) {
    synchronized (this.e) {
      if (this.b.k()) {
        b1.m("Blank page loaded, 1...");
        this.b.d0();
        return;
      } 
      this.w = true;
      null = this.i;
      if (null != null) {
        null.a();
        this.i = null;
      } 
      S();
      return;
    } 
  }
  
  @TargetApi(26)
  public boolean onRenderProcessGone(WebView paramWebView, RenderProcessGoneDetail paramRenderProcessGoneDetail) {
    return this.b.A(paramRenderProcessGoneDetail.didCrash(), paramRenderProcessGoneDetail.rendererPriorityAtExit());
  }
  
  public final void p(String paramString, x6<? super tq> paramx6) {
    synchronized (this.e) {
      List list = this.d.get(paramString);
      if (list == null)
        return; 
      list.remove(paramx6);
      return;
    } 
  }
  
  public final void s(bq2 parambq2, z5 paramz5, p paramp, b6 paramb6, u paramu, boolean paramBoolean, w6 paramw6, a parama, qe paramqe, uj paramuj, pu0 parampu0, jn1 paramjn1, jo0 paramjo0, pm1 parampm1) {
    a a1;
    if (parama == null) {
      a1 = new a(this.b.getContext(), paramuj, null);
    } else {
      a1 = parama;
    } 
    this.u = new ee(this.b, paramqe);
    this.v = paramuj;
    x<Boolean> x = m0.A0;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      d("/adMetadata", new a6(paramz5)); 
    d("/appEvent", new c6(paramb6));
    d("/backButton", d6.k);
    d("/refresh", d6.l);
    d("/canOpenApp", d6.b);
    d("/canOpenURLs", d6.a);
    d("/canOpenIntents", d6.c);
    d("/close", d6.e);
    d("/customClose", d6.f);
    d("/instrument", d6.o);
    d("/delayPageLoaded", d6.q);
    d("/delayPageClosed", d6.r);
    d("/getLocationInfo", d6.s);
    d("/log", (x6)d6.h);
    d("/mraid", new y6(a1, this.u, paramqe));
    d("/mraidLoaded", this.s);
    d("/open", new b7<tq>(a1, this.u, parampu0, paramjo0, parampm1));
    d("/precache", new dq());
    d("/touch", d6.j);
    d("/video", (x6)d6.m);
    d("/videoMeta", (x6)d6.n);
    if (parampu0 != null && paramjn1 != null) {
      d("/click", mi1.a(parampu0, paramjn1));
      d("/httpTrack", mi1.b(parampu0, paramjn1));
    } else {
      d("/click", d6.d);
      d("/httpTrack", d6.g);
    } 
    if (q.A().H(this.b.getContext()))
      d("/logScionEvent", new z6(this.b.getContext())); 
    this.f = parambq2;
    this.g = paramp;
    this.j = paramz5;
    this.k = paramb6;
    this.r = paramu;
    this.t = a1;
    this.m = paramBoolean;
  }
  
  public final void s0(int paramInt1, int paramInt2, boolean paramBoolean) {
    this.s.h(paramInt1, paramInt2);
    ee ee1 = this.u;
    if (ee1 != null)
      ee1.h(paramInt1, paramInt2, false); 
  }
  
  @TargetApi(11)
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString) {
    return i0(paramString, Collections.emptyMap());
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    if (i != 79 && i != 222)
      switch (i) {
        default:
          switch (i) {
            default:
              return false;
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
              break;
          } 
          break;
        case 85:
        case 86:
        case 87:
        case 88:
        case 89:
        case 90:
        case 91:
          break;
      }  
    return true;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString) {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      str = "AdWebView shouldOverrideUrlLoading: ".concat(str);
    } else {
      str = new String("AdWebView shouldOverrideUrlLoading: ");
    } 
    b1.m(str);
    Uri uri = Uri.parse(paramString);
    if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
      l(uri);
    } else {
      uj uj1;
      if (this.m && paramWebView == this.b.getWebView()) {
        boolean bool;
        String str1 = uri.getScheme();
        if ("http".equalsIgnoreCase(str1) || "https".equalsIgnoreCase(str1)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          bq2 bq21 = this.f;
          if (bq21 != null) {
            bq21.x();
            uj1 = this.v;
            if (uj1 != null)
              uj1.b(paramString); 
            this.f = null;
          } 
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        } 
      } 
      if (!this.b.getWebView().willNotDraw()) {
        uj uj2;
        try {
          p12 p12 = this.b.c();
          uj2 = uj1;
          if (p12 != null) {
            uj2 = uj1;
            if (p12.f((Uri)uj1))
              Uri uri1 = p12.b((Uri)uj1, this.b.getContext(), this.b.getView(), this.b.a()); 
          } 
        } catch (zzeh zzeh) {
          String str1 = String.valueOf(paramString);
          if (str1.length() != 0) {
            str1 = "Unable to append parameter to URL: ".concat(str1);
          } else {
            str1 = new String("Unable to append parameter to URL: ");
          } 
          cm.i(str1);
          uj2 = uj1;
        } 
        a a1 = this.t;
        if (a1 == null || a1.d()) {
          t(new zzd("android.intent.action.VIEW", uj2.toString(), null, null, null, null, null, null));
          return true;
        } 
        this.t.b(paramString);
      } else {
        String str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "AdWebView unable to handle URL: ".concat(str1);
        } else {
          str1 = new String("AdWebView unable to handle URL: ");
        } 
        cm.i(str1);
      } 
    } 
    return true;
  }
  
  public final void t(zzd paramzzd) {
    bq2 bq21;
    p p1;
    boolean bool = this.b.T();
    if (bool && !this.b.q().e()) {
      bq21 = null;
    } else {
      bq21 = this.f;
    } 
    if (bool) {
      p1 = null;
    } else {
      p1 = this.g;
    } 
    r(new AdOverlayInfoParcel(paramzzd, bq21, p1, this.r, this.b.b(), this.b));
  }
  
  public final a t0() {
    return this.t;
  }
  
  public final void w0(hs paramhs) {
    this.h = paramhs;
  }
  
  public void x() {
    bq2 bq21 = this.f;
    if (bq21 != null)
      bq21.x(); 
  }
  
  public final void y(g0 paramg0, pu0 parampu0, jo0 paramjo0, pm1 parampm1, String paramString1, String paramString2, int paramInt) {
    tq tq1 = this.b;
    r(new AdOverlayInfoParcel(tq1, tq1.b(), paramg0, parampu0, paramjo0, parampm1, paramString1, paramString2, paramInt));
  }
  
  public final void z(String paramString, p<x6<? super tq>> paramp) {
    synchronized (this.e) {
      List list = this.d.get(paramString);
      if (list == null)
        return; 
      ArrayList<x6> arrayList = new ArrayList();
      this();
      for (x6 x6 : list) {
        if (paramp.a(x6))
          arrayList.add(x6); 
      } 
      list.removeAll(arrayList);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */