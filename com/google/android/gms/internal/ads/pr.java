package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;

@TargetApi(17)
public final class pr<WebViewT extends ur & ds & fs> {
  private final vr a;
  
  private final WebViewT b;
  
  public pr(WebViewT paramWebViewT, vr paramvr) {
    this.a = paramvr;
    this.b = paramWebViewT;
  }
  
  @JavascriptInterface
  public final String getClickSignals(String paramString) {
    if (TextUtils.isEmpty(paramString)) {
      b1.m("Click string is empty, not proceeding.");
      return "";
    } 
    p12 p12 = ((ds)this.b).c();
    if (p12 == null) {
      b1.m("Signal utils is empty, ignoring.");
      return "";
    } 
    xr1 xr1 = p12.h();
    if (xr1 == null) {
      b1.m("Signals object is empty, ignoring.");
      return "";
    } 
    if (this.b.getContext() == null) {
      b1.m("Context is null, ignoring.");
      return "";
    } 
    return xr1.g(this.b.getContext(), paramString, ((fs)this.b).getView(), this.b.a());
  }
  
  @JavascriptInterface
  public final void notify(String paramString) {
    if (TextUtils.isEmpty(paramString)) {
      cm.i("URL is empty, ignoring message");
      return;
    } 
    h1.a.post(new sr(this, paramString));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */