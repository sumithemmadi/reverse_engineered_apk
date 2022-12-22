package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.as2;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.es2;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.fs2;
import com.google.android.gms.internal.ads.gt2;
import com.google.android.gms.internal.ads.ht2;
import com.google.android.gms.internal.ads.i1;
import com.google.android.gms.internal.ads.ir2;
import com.google.android.gms.internal.ads.jr2;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.ls2;
import com.google.android.gms.internal.ads.ns2;
import com.google.android.gms.internal.ads.nt2;
import com.google.android.gms.internal.ads.or2;
import com.google.android.gms.internal.ads.p12;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.tm2;
import com.google.android.gms.internal.ads.uh;
import com.google.android.gms.internal.ads.y1;
import com.google.android.gms.internal.ads.zzaau;
import com.google.android.gms.internal.ads.zzazn;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzzi;
import java.util.Map;
import java.util.concurrent.Future;

public final class k extends as2 {
  private final zzazn b;
  
  private final zzvs c;
  
  private final Future<p12> d;
  
  private final Context e;
  
  private final r f;
  
  private WebView g;
  
  private jr2 h;
  
  private p12 i;
  
  private AsyncTask<Void, Void, String> j;
  
  public k(Context paramContext, zzvs paramzzvs, String paramString, zzazn paramzzazn) {
    this.e = paramContext;
    this.b = paramzzazn;
    this.c = paramzzvs;
    this.g = new WebView(paramContext);
    this.d = (Future<p12>)fm.a.a(new p(this));
    this.f = new r(paramContext, paramString);
    ba(0);
    this.g.setVerticalScrollBarEnabled(false);
    this.g.getSettings().setJavaScriptEnabled(true);
    this.g.setWebViewClient(new n(this));
    this.g.setOnTouchListener(new m(this));
  }
  
  private final String Z9(String paramString) {
    if (this.i == null)
      return paramString; 
    Uri uri = Uri.parse(paramString);
    try {
      Uri uri1 = this.i.b(uri, this.e, null, null);
      uri = uri1;
    } catch (zzeh zzeh) {
      cm.d("Unable to process ad data", (Throwable)zzeh);
    } 
    return uri.toString();
  }
  
  private final void aa(String paramString) {
    Intent intent = new Intent("android.intent.action.VIEW");
    intent.setData(Uri.parse(paramString));
    this.e.startActivity(intent);
  }
  
  public final void B6(zzzi paramzzzi) {
    throw new IllegalStateException("Unused method");
  }
  
  public final String E8() {
    throw new IllegalStateException("getAdUnitId not implemented");
  }
  
  public final void G8() {
    throw new IllegalStateException("Unused method");
  }
  
  public final Bundle H() {
    throw new IllegalStateException("Unused method");
  }
  
  public final void J() {
    t.e("resume must be called on the main UI thread.");
  }
  
  public final void K0(uh paramuh) {
    throw new IllegalStateException("Unused method");
  }
  
  public final void K2(zzaau paramzzaau) {
    throw new IllegalStateException("Unused method");
  }
  
  public final zzvs L9() {
    return this.c;
  }
  
  public final void O4(ns2 paramns2) {}
  
  public final void R6(String paramString) {
    throw new IllegalStateException("Unused method");
  }
  
  public final void U(gt2 paramgt2) {}
  
  public final void U4(zzvl paramzzvl, or2 paramor2) {}
  
  public final void U6(jr2 paramjr2) {
    this.h = paramjr2;
  }
  
  public final String X0() {
    return null;
  }
  
  final int Y9(String paramString) {
    paramString = Uri.parse(paramString).getQueryParameter("height");
    if (TextUtils.isEmpty(paramString))
      return 0; 
    try {
      er2.a();
      return sl.r(this.e, Integer.parseInt(paramString));
    } catch (NumberFormatException numberFormatException) {
      return 0;
    } 
  }
  
  public final a Z2() {
    t.e("getAdFrame must be called on the main UI thread.");
    return b.a2(this.g);
  }
  
  public final void Z3(qf paramqf, String paramString) {
    throw new IllegalStateException("Unused method");
  }
  
  public final void Z7(zzvx paramzzvx) {
    throw new IllegalStateException("Unused method");
  }
  
  public final String a() {
    return null;
  }
  
  public final void b1(es2 parames2) {
    throw new IllegalStateException("Unused method");
  }
  
  public final fs2 b7() {
    throw new IllegalStateException("getIAppEventListener not implemented");
  }
  
  final void ba(int paramInt) {
    if (this.g == null)
      return; 
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, paramInt);
    this.g.setLayoutParams(layoutParams);
  }
  
  public final void c2(boolean paramBoolean) {}
  
  public final void d9(i1 parami1) {
    throw new IllegalStateException("Unused method");
  }
  
  public final void destroy() {
    t.e("destroy must be called on the main UI thread.");
    this.j.cancel(true);
    this.d.cancel(true);
    this.g.destroy();
    this.g = null;
  }
  
  public final void f6() {}
  
  public final void g8(kf paramkf) {
    throw new IllegalStateException("Unused method");
  }
  
  final String ga() {
    Uri.Builder builder = new Uri.Builder();
    builder.scheme("https://").appendEncodedPath((String)y1.d.a());
    builder.appendQueryParameter("query", this.f.a());
    builder.appendQueryParameter("pubId", this.f.d());
    Map<String, String> map = this.f.e();
    for (String str : map.keySet())
      builder.appendQueryParameter(str, map.get(str)); 
    Uri uri2 = builder.build();
    p12 p121 = this.i;
    Uri uri1 = uri2;
    if (p121 != null)
      try {
        uri1 = p121.a(uri2, this.e);
      } catch (zzeh zzeh) {
        cm.d("Unable to process ad data", (Throwable)zzeh);
        uri1 = uri2;
      }  
    String str2 = ha();
    String str1 = uri1.getEncodedQuery();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str1).length());
    stringBuilder.append(str2);
    stringBuilder.append("#");
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
  
  public final nt2 getVideoController() {
    return null;
  }
  
  public final void h3(tm2 paramtm2) {
    throw new IllegalStateException("Unused method");
  }
  
  final String ha() {
    String str1 = this.f.c();
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = "www.google.com"; 
    str1 = (String)y1.d.a();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(str1).length());
    stringBuilder.append("https://");
    stringBuilder.append(str2);
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
  
  public final void i4(ir2 paramir2) {
    throw new IllegalStateException("Unused method");
  }
  
  public final boolean m() {
    return false;
  }
  
  public final void n5(zzvs paramzzvs) {
    throw new IllegalStateException("AdSize must be set before initialization");
  }
  
  public final void o(boolean paramBoolean) {
    throw new IllegalStateException("Unused method");
  }
  
  public final boolean o7(zzvl paramzzvl) {
    t.k(this.g, "This Search Ad has already been torn down");
    this.f.b(paramzzvl, this.b);
    this.j = (new o(this, null)).execute((Object[])new Void[0]);
    return true;
  }
  
  public final ht2 p() {
    return null;
  }
  
  public final void p0(a parama) {}
  
  public final void pause() {
    t.e("pause must be called on the main UI thread.");
  }
  
  public final void q3(ls2 paramls2) {
    throw new IllegalStateException("Unused method");
  }
  
  public final boolean r() {
    return false;
  }
  
  public final void showInterstitial() {
    throw new IllegalStateException("Unused method");
  }
  
  public final jr2 t3() {
    throw new IllegalStateException("getIAdListener not implemented");
  }
  
  public final void y0(String paramString) {
    throw new IllegalStateException("Unused method");
  }
  
  public final void y6(fs2 paramfs2) {
    throw new IllegalStateException("Unused method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */