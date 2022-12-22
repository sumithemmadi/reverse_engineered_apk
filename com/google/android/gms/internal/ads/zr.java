package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
public final class zr extends wr {
  public zr(tq paramtq, xn2 paramxn2, boolean paramBoolean) {
    super(paramtq, paramxn2, paramBoolean);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest) {
    return (paramWebResourceRequest == null || paramWebResourceRequest.getUrl() == null) ? null : q0(paramWebView, paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.getRequestHeaders());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */