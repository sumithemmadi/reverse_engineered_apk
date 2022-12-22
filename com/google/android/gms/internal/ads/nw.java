package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

public final class nw {
  private final String a;
  
  private final wa b;
  
  private final Executor c;
  
  private sw d;
  
  private final x6<Object> e = new mw(this);
  
  private final x6<Object> f = new ow(this);
  
  public nw(String paramString, wa paramwa, Executor paramExecutor) {
    this.a = paramString;
    this.b = paramwa;
    this.c = paramExecutor;
  }
  
  private final boolean h(Map<String, String> paramMap) {
    if (paramMap == null)
      return false; 
    String str = paramMap.get("hashCode");
    return (!TextUtils.isEmpty(str) && str.equals(this.a));
  }
  
  public final void b(tq paramtq) {
    paramtq.d("/updateActiveView", (x6)this.e);
    paramtq.d("/untrackActiveViewUnit", (x6)this.f);
  }
  
  public final void c(sw paramsw) {
    this.b.b("/updateActiveView", (x6)this.e);
    this.b.b("/untrackActiveViewUnit", (x6)this.f);
    this.d = paramsw;
  }
  
  public final void e() {
    this.b.c("/updateActiveView", (x6)this.e);
    this.b.c("/untrackActiveViewUnit", (x6)this.f);
  }
  
  public final void g(tq paramtq) {
    paramtq.p("/updateActiveView", (x6)this.e);
    paramtq.p("/untrackActiveViewUnit", (x6)this.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */