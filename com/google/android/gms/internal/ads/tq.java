package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.common.util.p;
import com.google.android.gms.dynamic.a;

public interface tq extends l, r8, e9, eo, lq, rr, ur, yr, cs, ds, fs, yk2, bq2 {
  boolean A(boolean paramBoolean, int paramInt);
  
  void B0(Context paramContext);
  
  a F();
  
  void G(boolean paramBoolean);
  
  void H0(a parama);
  
  void K0();
  
  void M();
  
  es N();
  
  void N0();
  
  f O0();
  
  void P(ks paramks);
  
  void Q(String paramString1, String paramString2, String paramString3);
  
  void R(c3 paramc3);
  
  void R0(y2 paramy2);
  
  void S0();
  
  boolean T();
  
  void U();
  
  void V(f paramf);
  
  void V0(boolean paramBoolean);
  
  void X();
  
  WebViewClient Z();
  
  Activity a();
  
  void a0(int paramInt);
  
  zzazn b();
  
  p12 c();
  
  void c0();
  
  void d(String paramString, x6<? super tq> paramx6);
  
  void d0();
  
  void destroy();
  
  lr e();
  
  lm2 e0();
  
  nh1 f();
  
  boolean f0();
  
  b g();
  
  Context getContext();
  
  int getHeight();
  
  ViewGroup.LayoutParams getLayoutParams();
  
  void getLocationOnScreen(int[] paramArrayOfint);
  
  ViewParent getParent();
  
  View getView();
  
  WebView getWebView();
  
  int getWidth();
  
  sh1 h();
  
  void h0(boolean paramBoolean);
  
  void j(String paramString, up paramup);
  
  Context j0();
  
  boolean k();
  
  void loadData(String paramString1, String paramString2, String paramString3);
  
  void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  void loadUrl(String paramString);
  
  a1 m();
  
  void measure(int paramInt1, int paramInt2);
  
  boolean n0();
  
  void o(lr paramlr);
  
  void o0(boolean paramBoolean);
  
  void onPause();
  
  void onResume();
  
  void p(String paramString, x6<? super tq> paramx6);
  
  boolean p0();
  
  ks q();
  
  void setBackgroundColor(int paramInt);
  
  void setOnClickListener(View.OnClickListener paramOnClickListener);
  
  void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  void setRequestedOrientation(int paramInt);
  
  void setWebChromeClient(WebChromeClient paramWebChromeClient);
  
  void setWebViewClient(WebViewClient paramWebViewClient);
  
  void u(lm2 paramlm2);
  
  void u0(nh1 paramnh1, sh1 paramsh1);
  
  c3 v();
  
  void v0(boolean paramBoolean);
  
  String w();
  
  void x0(f paramf);
  
  boolean y0();
  
  void z(String paramString, p<x6<? super tq>> paramp);
  
  f z0();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */