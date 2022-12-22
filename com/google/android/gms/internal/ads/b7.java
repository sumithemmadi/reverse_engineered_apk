package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h1;
import java.util.HashMap;
import java.util.Map;

public final class b7<T extends bq2 & lq & tq & r8 & rr & ur & yr & ds & fs> implements x6<T> {
  private final a a;
  
  private final jo0 b;
  
  private final pm1 c;
  
  private final em d;
  
  private final ee e;
  
  private final pu0 f;
  
  private s g = null;
  
  public b7(a parama, ee paramee, pu0 parampu0, jo0 paramjo0, pm1 parampm1) {
    this.a = parama;
    this.e = paramee;
    this.f = parampu0;
    this.b = paramjo0;
    this.c = parampm1;
    this.d = new em();
  }
  
  static Uri b(Context paramContext, p12 paramp12, Uri paramUri, View paramView, Activity paramActivity) {
    if (paramp12 == null)
      return paramUri; 
    Uri uri = paramUri;
    try {
      if (paramp12.g(paramUri))
        uri = paramp12.b(paramUri, paramContext, paramView, paramActivity); 
    } catch (zzeh zzeh) {
      uri = paramUri;
    } catch (Exception exception) {
      q.g().e(exception, "OpenGmsgHandler.maybeAddClickSignalsToUri");
      uri = paramUri;
    } 
    return uri;
  }
  
  private final boolean d(T paramT, Context paramContext, String paramString1, String paramString2) {
    boolean bool1;
    q.c();
    boolean bool = h1.O(paramContext);
    q.c();
    g0 g0 = h1.R(paramContext);
    jo0 jo01 = this.b;
    if (jo01 != null)
      zu0.U9(paramContext, jo01, this.c, this.f, paramString2, "offline_open"); 
    tq tq = (tq)paramT;
    if (tq.q().e() && tq.a() == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool) {
      this.f.q(this.d, paramString2);
      return false;
    } 
    q.c();
    if (h1.Q(paramContext) && g0 != null && !bool1) {
      x<Boolean> x = m0.V5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        if (tq.q().e()) {
          zu0.T9(tq.a(), null, g0, this.f, this.b, this.c, paramString2, paramString1);
        } else {
          ((yr)paramT).M0(g0, this.f, this.b, this.c, paramString2, paramString1, q.e().o());
        } 
        jo0 jo02 = this.b;
        if (jo02 != null)
          zu0.U9(paramContext, jo02, this.c, this.f, paramString2, "dialog_impression"); 
        paramT.x();
        return true;
      } 
    } 
    this.f.u(paramString2);
    if (this.b != null) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      q.c();
      if (!h1.Q(paramContext)) {
        hashMap.put("dialog_not_shown_reason", "notifications_disabled");
      } else if (g0 == null) {
        hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
      } else {
        x<Boolean> x = m0.V5;
        if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
          hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
        } else if (bool1) {
          hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
        } 
      } 
      zu0.V9(paramContext, this.b, this.c, this.f, paramString2, "dialog_not_shown", (Map)hashMap);
    } 
    return false;
  }
  
  private final void e(boolean paramBoolean) {
    ee ee1 = this.e;
    if (ee1 != null)
      ee1.i(paramBoolean); 
  }
  
  private final void f(zzacr paramzzacr) {
    if (this.b == null)
      return; 
    x<Boolean> x = m0.c6;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      this.c.b(rm1.d("cct_action").i("cct_open_status", paramzzacr.toString()));
      return;
    } 
    this.b.b().h("action", "cct_action").h("cct_open_status", paramzzacr.toString()).c();
  }
  
  private static boolean g(Map<String, String> paramMap) {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int h(Map<String, String> paramMap) {
    String str = paramMap.get("o");
    if (str != null) {
      if ("p".equalsIgnoreCase(str))
        return 7; 
      if ("l".equalsIgnoreCase(str))
        return 6; 
      if ("c".equalsIgnoreCase(str))
        return q.e().o(); 
    } 
    return -1;
  }
  
  static Uri i(Uri paramUri) {
    try {
      if (paramUri.getQueryParameter("aclk_ms") != null) {
        long l = SystemClock.uptimeMillis();
        return paramUri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(l)).build();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      String str = String.valueOf(paramUri.toString());
      if (str.length() != 0) {
        str = "Error adding click uptime parameter to url: ".concat(str);
      } else {
        str = new String("Error adding click uptime parameter to url: ");
      } 
      cm.c(str, unsupportedOperationException);
    } 
    return paramUri;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */