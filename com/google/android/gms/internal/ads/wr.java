package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
public class wr extends wq {
  public wr(tq paramtq, xn2 paramxn2, boolean paramBoolean) {
    super(paramtq, paramxn2, paramBoolean);
  }
  
  protected final WebResourceResponse q0(WebView paramWebView, String paramString, Map<String, String> paramMap) {
    String str;
    if (!(paramWebView instanceof tq)) {
      cm.i("Tried to intercept request from a WebView that wasn't an AdWebView.");
      return null;
    } 
    tq tq = (tq)paramWebView;
    uj uj = this.v;
    if (uj != null)
      uj.d(paramString, paramMap, 1); 
    if (!"mraid.js".equalsIgnoreCase((new File(paramString)).getName())) {
      Map<String, String> map = paramMap;
      if (paramMap == null)
        map = Collections.emptyMap(); 
      return i0(paramString, map);
    } 
    if (tq.N() != null)
      tq.N().F0(); 
    if (tq.q().e()) {
      x<String> x = m0.I;
      str = er2.e().<String>c(x);
    } else if (tq.T()) {
      x<String> x = m0.H;
      str = er2.e().<String>c(x);
    } else {
      x<String> x = m0.G;
      str = er2.e().<String>c(x);
    } 
    q.c();
    return h1.W(tq.getContext(), (tq.b()).b, str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */