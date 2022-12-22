package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.x;

@TargetApi(24)
public class b extends v1 {
  private static boolean t(int paramInt1, int paramInt2, int paramInt3) {
    return (Math.abs(paramInt1 - paramInt2) <= paramInt3);
  }
  
  public final boolean h(Activity paramActivity, Configuration paramConfiguration) {
    x x2 = m0.t3;
    if (!((Boolean)er2.e().c(x2)).booleanValue())
      return false; 
    x2 = m0.v3;
    if (((Boolean)er2.e().c(x2)).booleanValue())
      return paramActivity.isInMultiWindowMode(); 
    er2.a();
    int i = sl.r((Context)paramActivity, paramConfiguration.screenHeightDp);
    int j = sl.r((Context)paramActivity, paramConfiguration.screenWidthDp);
    WindowManager windowManager = (WindowManager)paramActivity.getApplicationContext().getSystemService("window");
    q.c();
    DisplayMetrics displayMetrics = h1.b(windowManager);
    int k = displayMetrics.heightPixels;
    int m = displayMetrics.widthPixels;
    int n = paramActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (n > 0) {
      n = paramActivity.getResources().getDimensionPixelSize(n);
    } else {
      n = 0;
    } 
    double d = (paramActivity.getResources().getDisplayMetrics()).density;
    Double.isNaN(d);
    int i1 = (int)Math.round(d + 0.5D);
    x x1 = m0.s3;
    i1 *= ((Integer)er2.e().c(x1)).intValue();
    if (t(k, i + n, i1) && t(m, j, i1)) {
      n = 1;
    } else {
      n = 0;
    } 
    return (n == 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */