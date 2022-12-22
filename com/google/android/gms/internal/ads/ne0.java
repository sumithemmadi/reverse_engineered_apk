package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.n0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ne0 implements xf0 {
  private final Context a;
  
  private final ag0 b;
  
  private final JSONObject c;
  
  private final dk0 d;
  
  private final pf0 e;
  
  private final p12 f;
  
  private final e50 g;
  
  private final l40 h;
  
  private final nh1 i;
  
  private final zzazn j;
  
  private final gi1 k;
  
  private final sw l;
  
  private final sg0 m;
  
  private final e n;
  
  private final eb0 o;
  
  private final jn1 p;
  
  private boolean q = false;
  
  private boolean r;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private Point u = new Point();
  
  private Point v = new Point();
  
  private long w = 0L;
  
  private long x = 0L;
  
  private us2 y;
  
  public ne0(Context paramContext, ag0 paramag0, JSONObject paramJSONObject, dk0 paramdk0, pf0 parampf0, p12 paramp12, e50 parame50, l40 paraml40, nh1 paramnh1, zzazn paramzzazn, gi1 paramgi1, sw paramsw, sg0 paramsg0, e parame, eb0 parameb0, jn1 paramjn1) {
    this.a = paramContext;
    this.b = paramag0;
    this.c = paramJSONObject;
    this.d = paramdk0;
    this.e = parampf0;
    this.f = paramp12;
    this.g = parame50;
    this.h = paraml40;
    this.i = paramnh1;
    this.j = paramzzazn;
    this.k = paramgi1;
    this.l = paramsw;
    this.m = paramsg0;
    this.n = parame;
    this.o = parameb0;
    this.p = paramjn1;
  }
  
  private final void q(View paramView, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, String paramString, JSONObject paramJSONObject5, JSONObject paramJSONObject6, boolean paramBoolean1, boolean paramBoolean2) {
    t.e("performClick must be called on the main UI thread.");
    try {
      boolean bool2;
      JSONObject jSONObject3 = new JSONObject();
      this();
      jSONObject3.put("ad", this.c);
      jSONObject3.put("asset_view_signal", paramJSONObject2);
      jSONObject3.put("ad_view_signal", paramJSONObject1);
      jSONObject3.put("click_signal", paramJSONObject5);
      jSONObject3.put("scroll_view_signal", paramJSONObject3);
      jSONObject3.put("lock_screen_signal", paramJSONObject4);
      s4 s4 = this.b.i(this.e.e());
      boolean bool1 = false;
      if (s4 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      jSONObject3.put("has_custom_click_handler", bool2);
      jSONObject3.put("provided_signals", paramJSONObject6);
      JSONObject jSONObject2 = new JSONObject();
      this();
      jSONObject2.put("asset_id", paramString);
      jSONObject2.put("template", this.e.A());
      jSONObject2.put("view_aware_api_used", paramBoolean1);
      zzaeh zzaeh = this.k.i;
      if (zzaeh != null && zzaeh.h) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      } 
      jSONObject2.put("custom_mute_requested", paramBoolean1);
      if (!this.e.j().isEmpty() && this.e.D() != null) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      } 
      jSONObject2.put("custom_mute_enabled", paramBoolean1);
      if (this.m.c() != null && this.c.optBoolean("custom_one_point_five_click_enabled", false))
        jSONObject2.put("custom_one_point_five_click_eligible", true); 
      jSONObject2.put("timestamp", this.n.a());
      if (this.t && s())
        jSONObject2.put("custom_click_gesture_eligible", true); 
      if (paramBoolean2)
        jSONObject2.put("is_custom_click_gesture", true); 
      paramBoolean1 = bool1;
      if (this.b.i(this.e.e()) != null)
        paramBoolean1 = true; 
      jSONObject2.put("has_custom_click_handler", paramBoolean1);
      jSONObject2.put("click_signals", w(paramView));
      x<Boolean> x = m0.l3;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
        jSONObject2.put("open_chrome_custom_tab", true); 
      x = m0.a6;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && o.n())
        jSONObject2.put("try_fallback_for_deep_link", true); 
      x = m0.b6;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && o.n())
        jSONObject2.put("in_app_link_handling_for_android_11_enabled", true); 
      jSONObject3.put("click", jSONObject2);
      JSONObject jSONObject1 = new JSONObject();
      this();
      long l = this.n.a();
      jSONObject1.put("time_from_last_touch_down", l - this.w);
      jSONObject1.put("time_from_last_touch", l - this.x);
      jSONObject3.put("touch_signal", jSONObject1);
      mm.a(this.d.j("google.afma.nativeAds.handleClick", jSONObject3), "Error during performing handleClick");
      return;
    } catch (JSONException jSONException) {
      cm.c("Unable to create click JSON.", (Throwable)jSONException);
      return;
    } 
  }
  
  private final boolean r(JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, String paramString, JSONObject paramJSONObject5, boolean paramBoolean) {
    t.e("recordImpression must be called on the main UI thread.");
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("ad", this.c);
      jSONObject.put("asset_view_signal", paramJSONObject2);
      jSONObject.put("ad_view_signal", paramJSONObject1);
      jSONObject.put("scroll_view_signal", paramJSONObject3);
      jSONObject.put("lock_screen_signal", paramJSONObject4);
      jSONObject.put("provided_signals", paramJSONObject5);
      x<Boolean> x = m0.h2;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
        jSONObject.put("view_signals", paramString); 
      jSONObject.put("policy_validator_enabled", paramBoolean);
      jSONObject.put("screen", n0.i(this.a));
      x = m0.W5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        dk0 dk02 = this.d;
        oe0 oe0 = new oe0();
        this(this, null);
        dk02.e("/clickRecorded", oe0);
      } else {
        dk0 dk02 = this.d;
        pe0 pe0 = new pe0();
        this(this, null);
        dk02.e("/logScionEvent", pe0);
      } 
      dk0 dk01 = this.d;
      re0 re0 = new re0();
      this(this, null);
      dk01.e("/nativeImpression", re0);
      mm.a(this.d.j("google.afma.nativeAds.handleImpression", jSONObject), "Error during performing handleImpression");
      paramBoolean = this.q;
      if (!paramBoolean && this.i.B != null)
        this.q = paramBoolean | q.m().c(this.a, this.j.b, this.i.B.toString(), this.k.f); 
      return true;
    } catch (JSONException jSONException) {
      cm.c("Unable to create impression JSON.", (Throwable)jSONException);
      return false;
    } 
  }
  
  private final boolean s() {
    return this.c.optBoolean("allow_custom_click_gesture", false);
  }
  
  private final String u(View paramView, Map<String, WeakReference<View>> paramMap) {
    if (paramMap != null && paramView != null)
      for (Map.Entry<String, WeakReference<View>> entry : paramMap.entrySet()) {
        if (paramView.equals(((WeakReference<View>)entry.getValue()).get()))
          return (String)entry.getKey(); 
      }  
    int i = this.e.A();
    return (i != 1) ? ((i != 2) ? ((i != 6) ? null : "3099") : "2099") : "1099";
  }
  
  private final boolean v(String paramString) {
    JSONObject jSONObject = this.c.optJSONObject("allow_pub_event_reporting");
    return (jSONObject != null && jSONObject.optBoolean(paramString, false));
  }
  
  private final String w(View paramView) {
    try {
      JSONObject jSONObject1 = this.c.optJSONObject("tracking_urls_and_actions");
      JSONObject jSONObject2 = jSONObject1;
      if (jSONObject1 == null) {
        jSONObject2 = new JSONObject();
        this();
      } 
      String str = jSONObject2.optString("click_string");
      return this.f.h().a(this.a, str, paramView);
    } catch (Exception exception) {
      cm.c("Exception obtaining click signals", exception);
      return null;
    } 
  }
  
  private final String x(View paramView) {
    x<Boolean> x = m0.h2;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return null; 
    try {
      return this.f.h().e(this.a, paramView, null);
    } catch (Exception exception) {
      cm.g("Exception getting data.");
      return null;
    } 
  }
  
  public final void B0() {
    this.t = true;
  }
  
  public final void G0(i5 parami5) {
    if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
      cm.i("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
      return;
    } 
    this.m.b(parami5);
  }
  
  public final void R0(ys2 paramys2) {
    try {
      if (this.s)
        return; 
      if (paramys2 == null && this.e.D() != null) {
        this.s = true;
        this.p.a(this.e.D().P7());
        m();
        return;
      } 
      this.s = true;
      this.p.a(paramys2.P7());
      m();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener) {
    this.u = new Point();
    this.v = new Point();
    if (!this.r) {
      this.o.b1(paramView);
      this.r = true;
    } 
    paramView.setOnTouchListener(paramOnTouchListener);
    paramView.setClickable(true);
    paramView.setOnClickListener(paramOnClickListener);
    this.l.t(this);
    boolean bool = n0.k(this.j.d);
    if (paramMap1 != null) {
      Iterator<Map.Entry> iterator = paramMap1.entrySet().iterator();
      while (iterator.hasNext()) {
        View view = ((WeakReference<View>)((Map.Entry)iterator.next()).getValue()).get();
        if (view != null) {
          if (bool)
            view.setOnTouchListener(paramOnTouchListener); 
          view.setClickable(true);
          view.setOnClickListener(paramOnClickListener);
        } 
      } 
    } 
    if (paramMap2 != null) {
      Iterator<Map.Entry> iterator = paramMap2.entrySet().iterator();
      while (iterator.hasNext()) {
        View view = ((WeakReference<View>)((Map.Entry)iterator.next()).getValue()).get();
        if (view != null) {
          if (bool)
            view.setOnTouchListener(paramOnTouchListener); 
          view.setClickable(false);
        } 
      } 
    } 
  }
  
  public final void b(Bundle paramBundle) {
    if (paramBundle == null) {
      cm.e("Touch event data is null. No touch event is reported.");
      return;
    } 
    if (!v("touch_reporting")) {
      cm.g("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
      return;
    } 
    int i = (int)paramBundle.getFloat("x");
    int j = (int)paramBundle.getFloat("y");
    int k = paramBundle.getInt("duration_ms");
    this.f.h().c(i, j, k);
  }
  
  public final void c(View paramView) {
    if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
      cm.i("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
      return;
    } 
    sg0 sg01 = this.m;
    if (paramView != null) {
      paramView.setOnClickListener(sg01);
      paramView.setClickable(true);
      sg01.h = new WeakReference<View>(paramView);
    } 
  }
  
  public final void d(View paramView, Map<String, WeakReference<View>> paramMap) {
    this.u = new Point();
    this.v = new Point();
    this.o.c1(paramView);
    this.r = false;
  }
  
  public final void destroy() {
    this.d.a();
  }
  
  public final void e(Bundle paramBundle) {
    if (paramBundle == null) {
      cm.e("Click data is null. No click is reported.");
      return;
    } 
    if (!v("click_reporting")) {
      cm.g("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
      return;
    } 
    Bundle bundle = paramBundle.getBundle("click_signal");
    if (bundle != null) {
      String str = bundle.getString("asset_id");
    } else {
      bundle = null;
    } 
    q(null, null, null, null, null, (String)bundle, null, q.c().i(paramBundle, null), false, false);
  }
  
  public final void f(View paramView1, MotionEvent paramMotionEvent, View paramView2) {
    this.u = n0.a(paramMotionEvent, paramView2);
    long l = this.n.a();
    this.x = l;
    if (paramMotionEvent.getAction() == 0) {
      this.w = l;
      this.v = this.u;
    } 
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    Point point = this.u;
    paramMotionEvent.setLocation(point.x, point.y);
    this.f.d(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  public final void g(View paramView1, View paramView2, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean) {
    JSONObject jSONObject3 = n0.e(this.a, paramMap1, paramMap2, paramView2);
    JSONObject jSONObject4 = n0.d(this.a, paramView2);
    JSONObject jSONObject5 = n0.l(paramView2);
    JSONObject jSONObject2 = n0.h(this.a, paramView2);
    String str = u(paramView1, paramMap1);
    JSONObject jSONObject1 = n0.f(str, this.a, this.v, this.u);
    x<Boolean> x = m0.i2;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      paramView1 = paramView2; 
    q(paramView1, jSONObject4, jSONObject3, jSONObject5, jSONObject2, str, jSONObject1, null, paramBoolean, false);
  }
  
  public final void h(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2) {
    JSONObject jSONObject = n0.e(this.a, paramMap1, paramMap2, paramView);
    r(n0.d(this.a, paramView), jSONObject, n0.l(paramView), n0.h(this.a, paramView), x(paramView), null, n0.g(this.a, this.i));
  }
  
  public final JSONObject i(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2) {
    JSONObject jSONObject2 = n0.e(this.a, paramMap1, paramMap2, paramView);
    JSONObject jSONObject1 = n0.d(this.a, paramView);
    JSONObject jSONObject3 = n0.l(paramView);
    JSONObject jSONObject4 = n0.h(this.a, paramView);
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("asset_view_signal", jSONObject2);
      jSONObject.put("ad_view_signal", jSONObject1);
      jSONObject.put("scroll_view_signal", jSONObject3);
      jSONObject.put("lock_screen_signal", jSONObject4);
      return jSONObject;
    } catch (JSONException jSONException) {
      cm.c("Unable to create native ad view signals JSON.", (Throwable)jSONException);
      return null;
    } 
  }
  
  public final void j(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean) {
    if (!this.t) {
      cm.e("Custom click reporting failed. enableCustomClickGesture is not set.");
      return;
    } 
    if (!s()) {
      cm.e("Custom click reporting failed. Ad unit id not in the allow list.");
      return;
    } 
    JSONObject jSONObject2 = n0.e(this.a, paramMap1, paramMap2, paramView);
    JSONObject jSONObject3 = n0.d(this.a, paramView);
    JSONObject jSONObject1 = n0.l(paramView);
    JSONObject jSONObject4 = n0.h(this.a, paramView);
    String str = u(null, paramMap1);
    q(paramView, jSONObject3, jSONObject2, jSONObject1, jSONObject4, str, n0.f(str, this.a, this.v, this.u), null, paramBoolean, true);
  }
  
  public final void k() {
    r(null, null, null, null, null, null, false);
  }
  
  public final void l() {
    t.e("recordDownloadedImpression must be called on the main UI thread.");
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("ad", this.c);
      mm.a(this.d.j("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
      return;
    } catch (JSONException jSONException) {
      cm.c("", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void m() {
    try {
      us2 us21 = this.y;
      if (us21 != null)
        us21.G2(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final boolean n(Bundle paramBundle) {
    if (!v("impression_reporting")) {
      cm.g("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
      return false;
    } 
    return r(null, null, null, null, null, q.c().i(paramBundle, null), false);
  }
  
  public final boolean n1() {
    return s();
  }
  
  public final void o(String paramString) {
    q(null, null, null, null, null, paramString, null, null, false, false);
  }
  
  public final void o0(us2 paramus2) {
    this.y = paramus2;
  }
  
  public final void r0() {
    if (!this.c.optBoolean("custom_one_point_five_click_enabled", false))
      return; 
    this.m.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ne0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */