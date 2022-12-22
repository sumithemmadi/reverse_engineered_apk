package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.w.a;
import com.google.android.gms.common.util.p;
import com.google.android.gms.dynamic.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzbeq extends FrameLayout implements tq {
  private final tq b;
  
  private final tn c;
  
  private final AtomicBoolean d = new AtomicBoolean();
  
  public zzbeq(tq paramtq) {
    super(paramtq.getContext());
    this.b = paramtq;
    this.c = new tn(paramtq.j0(), (ViewGroup)this, this);
    addView(paramtq.getView());
  }
  
  public final boolean A(boolean paramBoolean, int paramInt) {
    if (!this.d.compareAndSet(false, true))
      return true; 
    x<Boolean> x = m0.s0;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return false; 
    if (this.b.getParent() instanceof ViewGroup)
      ((ViewGroup)this.b.getParent()).removeView(this.b.getView()); 
    return this.b.A(paramBoolean, paramInt);
  }
  
  public final void B(String paramString, Map<String, ?> paramMap) {
    this.b.B(paramString, paramMap);
  }
  
  public final void B0(Context paramContext) {
    this.b.B0(paramContext);
  }
  
  public final void C() {
    this.b.C();
  }
  
  public final void D(boolean paramBoolean, int paramInt) {
    this.b.D(paramBoolean, paramInt);
  }
  
  public final int D0() {
    return this.b.D0();
  }
  
  public final x0 E() {
    return this.b.E();
  }
  
  public final a F() {
    return this.b.F();
  }
  
  public final void G(boolean paramBoolean) {
    this.b.G(paramBoolean);
  }
  
  public final void G0(boolean paramBoolean) {
    this.b.G0(paramBoolean);
  }
  
  public final void H0(a parama) {
    this.b.H0(parama);
  }
  
  public final void I0() {
    this.b.I0();
  }
  
  public final void K0() {
    this.b.K0();
  }
  
  public final void L(boolean paramBoolean, long paramLong) {
    this.b.L(paramBoolean, paramLong);
  }
  
  public final void M() {
    setBackgroundColor(0);
    this.b.setBackgroundColor(0);
  }
  
  public final void M0(g0 paramg0, pu0 parampu0, jo0 paramjo0, pm1 parampm1, String paramString1, String paramString2, int paramInt) {
    this.b.M0(paramg0, parampu0, paramjo0, parampm1, paramString1, paramString2, paramInt);
  }
  
  public final es N() {
    return this.b.N();
  }
  
  public final void N0() {
    this.b.N0();
  }
  
  public final f O0() {
    return this.b.O0();
  }
  
  public final void P(ks paramks) {
    this.b.P(paramks);
  }
  
  public final int P0() {
    return getMeasuredHeight();
  }
  
  public final void Q(String paramString1, String paramString2, String paramString3) {
    this.b.Q(paramString1, paramString2, paramString3);
  }
  
  public final void Q0(boolean paramBoolean, int paramInt, String paramString1, String paramString2) {
    this.b.Q0(paramBoolean, paramInt, paramString1, paramString2);
  }
  
  public final void R(c3 paramc3) {
    this.b.R(paramc3);
  }
  
  public final void R0(y2 paramy2) {
    this.b.R0(paramy2);
  }
  
  public final void S(String paramString, JSONObject paramJSONObject) {
    this.b.S(paramString, paramJSONObject);
  }
  
  public final void S0() {
    this.b.S0();
  }
  
  public final boolean T() {
    return this.b.T();
  }
  
  public final void U() {
    this.b.U();
  }
  
  public final tn U0() {
    return this.c;
  }
  
  public final void V(f paramf) {
    this.b.V(paramf);
  }
  
  public final void V0(boolean paramBoolean) {
    this.b.V0(paramBoolean);
  }
  
  public final void W0(int paramInt) {
    this.b.W0(paramInt);
  }
  
  public final void X() {
    String str;
    TextView textView = new TextView(getContext());
    Resources resources = q.g().b();
    if (resources != null) {
      str = resources.getString(a.s7);
    } else {
      str = "Test Ad";
    } 
    textView.setText(str);
    textView.setTextSize(15.0F);
    textView.setTextColor(-1);
    textView.setPadding(5, 0, 5, 0);
    GradientDrawable gradientDrawable = new GradientDrawable();
    gradientDrawable.setShape(0);
    gradientDrawable.setColor(-12303292);
    gradientDrawable.setCornerRadius(8.0F);
    textView.setBackground((Drawable)gradientDrawable);
    addView((View)textView, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2, 49));
    bringChildToFront((View)textView);
  }
  
  public final WebViewClient Z() {
    return this.b.Z();
  }
  
  public final Activity a() {
    return this.b.a();
  }
  
  public final void a0(int paramInt) {
    this.b.a0(paramInt);
  }
  
  public final zzazn b() {
    return this.b.b();
  }
  
  public final p12 c() {
    return this.b.c();
  }
  
  public final void c0() {
    this.b.c0();
  }
  
  public final void d(String paramString, x6<? super tq> paramx6) {
    this.b.d(paramString, paramx6);
  }
  
  public final void d0() {
    this.c.a();
    this.b.d0();
  }
  
  public final void destroy() {
    a a = F();
    if (a != null) {
      xp1 xp1 = h1.a;
      xp1.post(new gr(a));
      ir ir = new ir(this);
      x<Integer> x = m0.E3;
      xp1.postDelayed(ir, ((Integer)er2.e().<Integer>c(x)).intValue());
      return;
    } 
    this.b.destroy();
  }
  
  public final lr e() {
    return this.b.e();
  }
  
  public final lm2 e0() {
    return this.b.e0();
  }
  
  public final nh1 f() {
    return this.b.f();
  }
  
  public final boolean f0() {
    return this.b.f0();
  }
  
  public final b g() {
    return this.b.g();
  }
  
  public final String g0() {
    return this.b.g0();
  }
  
  public final String getRequestId() {
    return this.b.getRequestId();
  }
  
  public final View getView() {
    return (View)this;
  }
  
  public final WebView getWebView() {
    return this.b.getWebView();
  }
  
  public final sh1 h() {
    return this.b.h();
  }
  
  public final void h0(boolean paramBoolean) {
    this.b.h0(paramBoolean);
  }
  
  public final void i(String paramString, JSONObject paramJSONObject) {
    this.b.i(paramString, paramJSONObject);
  }
  
  public final void i0() {
    this.b.i0();
  }
  
  public final void j(String paramString, up paramup) {
    this.b.j(paramString, paramup);
  }
  
  public final Context j0() {
    return this.b.j0();
  }
  
  public final boolean k() {
    return this.b.k();
  }
  
  public final void k0(zk2 paramzk2) {
    this.b.k0(paramzk2);
  }
  
  public final void l0(boolean paramBoolean, int paramInt, String paramString) {
    this.b.l0(paramBoolean, paramInt, paramString);
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3) {
    this.b.loadData(paramString1, paramString2, paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    this.b.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void loadUrl(String paramString) {
    this.b.loadUrl(paramString);
  }
  
  public final a1 m() {
    return this.b.m();
  }
  
  public final void n(String paramString) {
    this.b.n(paramString);
  }
  
  public final boolean n0() {
    return this.b.n0();
  }
  
  public final void o(lr paramlr) {
    this.b.o(paramlr);
  }
  
  public final void o0(boolean paramBoolean) {
    this.b.o0(paramBoolean);
  }
  
  public final void onPause() {
    this.c.b();
    this.b.onPause();
  }
  
  public final void onResume() {
    this.b.onResume();
  }
  
  public final void p(String paramString, x6<? super tq> paramx6) {
    this.b.p(paramString, paramx6);
  }
  
  public final boolean p0() {
    return this.d.get();
  }
  
  public final ks q() {
    return this.b.q();
  }
  
  public final void q0(zzd paramzzd) {
    this.b.q0(paramzzd);
  }
  
  public final int r() {
    return getMeasuredWidth();
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener) {
    this.b.setOnClickListener(paramOnClickListener);
  }
  
  public final void setOnTouchListener(View.OnTouchListener paramOnTouchListener) {
    this.b.setOnTouchListener(paramOnTouchListener);
  }
  
  public final void setRequestedOrientation(int paramInt) {
    this.b.setRequestedOrientation(paramInt);
  }
  
  public final void setWebChromeClient(WebChromeClient paramWebChromeClient) {
    this.b.setWebChromeClient(paramWebChromeClient);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient) {
    this.b.setWebViewClient(paramWebViewClient);
  }
  
  public final void t() {
    this.b.t();
  }
  
  public final void u(lm2 paramlm2) {
    this.b.u(paramlm2);
  }
  
  public final void u0(nh1 paramnh1, sh1 paramsh1) {
    this.b.u0(paramnh1, paramsh1);
  }
  
  public final c3 v() {
    return this.b.v();
  }
  
  public final void v0(boolean paramBoolean) {
    this.b.v0(paramBoolean);
  }
  
  public final String w() {
    return this.b.w();
  }
  
  public final void x() {
    tq tq1 = this.b;
    if (tq1 != null)
      tq1.x(); 
  }
  
  public final void x0(f paramf) {
    this.b.x0(paramf);
  }
  
  public final up y(String paramString) {
    return this.b.y(paramString);
  }
  
  public final boolean y0() {
    return this.b.y0();
  }
  
  public final void z(String paramString, p<x6<? super tq>> paramp) {
    this.b.z(paramString, paramp);
  }
  
  public final f z0() {
    return this.b.z0();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */