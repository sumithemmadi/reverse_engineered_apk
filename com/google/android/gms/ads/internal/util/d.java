package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.x;
import java.util.Locale;

@TargetApi(28)
public final class d extends x1 {
  private static void v(boolean paramBoolean, Activity paramActivity) {
    byte b;
    Window window = paramActivity.getWindow();
    WindowManager.LayoutParams layoutParams = window.getAttributes();
    int i = layoutParams.layoutInDisplayCutoutMode;
    if (paramBoolean) {
      b = 1;
    } else {
      b = 2;
    } 
    if (b != i) {
      layoutParams.layoutInDisplayCutoutMode = b;
      window.setAttributes(layoutParams);
    } 
  }
  
  public final void n(Activity paramActivity) {
    x x = m0.L0;
    if (((Boolean)er2.e().c(x)).booleanValue() && q.g().r().n() == null && !paramActivity.isInMultiWindowMode()) {
      v(true, paramActivity);
      paramActivity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new c(this, paramActivity));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */