package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.Map;
import org.json.JSONObject;

public final class w8 implements t8, u8 {
  private final tq b;
  
  public w8(Context paramContext, zzazn paramzzazn, p12 paramp12, b paramb) {
    q.d();
    tq tq1 = br.a(paramContext, ks.b(), "", false, false, paramp12, null, paramzzazn, null, null, null, xn2.f(), null, null);
    this.b = tq1;
    tq1.getView().setWillNotDraw(true);
  }
  
  private static void l(Runnable paramRunnable) {
    er2.a();
    if (sl.w()) {
      paramRunnable.run();
      return;
    } 
    h1.a.post(paramRunnable);
  }
  
  public final void B(String paramString, Map paramMap) {
    s8.b(this, paramString, paramMap);
  }
  
  public final fa H() {
    return new ha(this);
  }
  
  public final void J(String paramString) {
    l(new b9(this, paramString));
  }
  
  public final void K(x8 paramx8) {
    es es = this.b.N();
    paramx8.getClass();
    es.J0(c9.b(paramx8));
  }
  
  public final void O(String paramString1, String paramString2) {
    s8.a(this, paramString1, paramString2);
  }
  
  public final void S(String paramString, JSONObject paramJSONObject) {
    s8.c(this, paramString, paramJSONObject);
  }
  
  public final void Y(String paramString) {
    l(new y8(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString })));
  }
  
  public final void d(String paramString, x6<? super ga> paramx6) {
    this.b.d(paramString, new f9(this, paramx6));
  }
  
  public final void destroy() {
    this.b.destroy();
  }
  
  public final void i(String paramString, JSONObject paramJSONObject) {
    s8.d(this, paramString, paramJSONObject);
  }
  
  public final boolean k() {
    return this.b.k();
  }
  
  public final void n(String paramString) {
    l(new z8(this, paramString));
  }
  
  public final void p(String paramString, x6<? super ga> paramx6) {
    this.b.z(paramString, new d9(paramx6));
  }
  
  public final void r0(String paramString) {
    l(new a9(this, paramString));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */