package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.tq;
import com.google.android.gms.internal.ads.wq;
import com.google.android.gms.internal.ads.xn2;
import com.google.android.gms.internal.ads.zr;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public class v1 extends w1 {
  public final WebResourceResponse e(String paramString1, String paramString2, int paramInt, String paramString3, Map<String, String> paramMap, InputStream paramInputStream) {
    return new WebResourceResponse(paramString1, paramString2, paramInt, paramString3, paramMap, paramInputStream);
  }
  
  public final wq f(tq paramtq, xn2 paramxn2, boolean paramBoolean) {
    return (wq)new zr(paramtq, paramxn2, paramBoolean);
  }
  
  public final CookieManager l(Context paramContext) {
    if (p1.q())
      return null; 
    try {
      return CookieManager.getInstance();
    } finally {
      paramContext = null;
      cm.c("Failed to obtain CookieManager.", (Throwable)paramContext);
      q.g().e((Throwable)paramContext, "ApiLevelUtil.getCookieManager");
    } 
  }
  
  public final int r() {
    return 16974374;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/v1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */