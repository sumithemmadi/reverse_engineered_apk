package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.tq;
import com.google.android.gms.internal.ads.wq;
import com.google.android.gms.internal.ads.xn2;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.zzuq;
import java.io.InputStream;
import java.util.Map;

@TargetApi(16)
public class p1 {
  private p1() {}
  
  public static p1 m(int paramInt) {
    return (paramInt >= 28) ? new d() : ((paramInt >= 26) ? new x1() : ((paramInt >= 24) ? new b() : ((paramInt >= 21) ? new v1() : ((paramInt >= 19) ? new w1() : ((paramInt >= 18) ? new t1() : ((paramInt >= 17) ? new u1() : new p1()))))));
  }
  
  public static boolean q() {
    int i = Process.myUid();
    return (i == 0 || i == 1000);
  }
  
  public String a(Context paramContext) {
    return "";
  }
  
  public boolean b(View paramView) {
    return (paramView.getWindowToken() != null || paramView.getWindowVisibility() != 8);
  }
  
  public int c(ContentResolver paramContentResolver) {
    return Settings.System.getInt(paramContentResolver, "wifi_on", 0);
  }
  
  public Drawable d(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat) {
    return (Drawable)new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }
  
  public WebResourceResponse e(String paramString1, String paramString2, int paramInt, String paramString3, Map<String, String> paramMap, InputStream paramInputStream) {
    return new WebResourceResponse(paramString1, paramString2, paramInputStream);
  }
  
  public wq f(tq paramtq, xn2 paramxn2, boolean paramBoolean) {
    return (wq)new xr(paramtq, paramxn2, paramBoolean);
  }
  
  public zzuq g(Context paramContext, TelephonyManager paramTelephonyManager) {
    return zzuq.d;
  }
  
  public boolean h(Activity paramActivity, Configuration paramConfiguration) {
    return false;
  }
  
  public boolean i(Context paramContext, WebSettings paramWebSettings) {
    r0.a(paramContext, new s1(paramContext, paramWebSettings));
    paramWebSettings.setAllowFileAccessFromFileURLs(false);
    paramWebSettings.setAllowUniversalAccessFromFileURLs(false);
    return true;
  }
  
  public int j(ContentResolver paramContentResolver) {
    return Settings.System.getInt(paramContentResolver, "airplane_mode_on", 0);
  }
  
  public void k(Context paramContext) {}
  
  public CookieManager l(Context paramContext) {
    if (q())
      return null; 
    try {
      return CookieManager.getInstance();
    } finally {
      paramContext = null;
      cm.c("Failed to obtain CookieManager.", (Throwable)paramContext);
      q.g().e((Throwable)paramContext, "ApiLevelUtil.getCookieManager");
    } 
  }
  
  public void n(Activity paramActivity) {}
  
  public int o() {
    return 5;
  }
  
  public ViewGroup.LayoutParams p() {
    return new ViewGroup.LayoutParams(-2, -2);
  }
  
  public int r() {
    return 1;
  }
  
  public long s() {
    return -1L;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/p1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */