package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
public final class xr extends wr {
  public xr(tq paramtq, xn2 paramxn2, boolean paramBoolean) {
    super(paramtq, paramxn2, paramBoolean);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString) {
    return q0(paramWebView, paramString, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */