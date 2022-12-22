package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.util.n0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class bh0 {
  private final kl0 a;
  
  private final dk0 b;
  
  private ViewTreeObserver.OnScrollChangedListener c;
  
  public bh0(kl0 paramkl0, dk0 paramdk0) {
    this.a = paramkl0;
    this.b = paramdk0;
    this.c = null;
  }
  
  private static int a(Context paramContext, String paramString, int paramInt) {
    try {
      int i = Integer.parseInt(paramString);
      paramInt = i;
    } catch (NumberFormatException numberFormatException) {}
    er2.a();
    return sl.r(paramContext, paramInt);
  }
  
  public final View b(View paramView, WindowManager paramWindowManager) {
    tq tq = this.a.a(zzvs.r0(), null, null);
    tq.getView().setVisibility(4);
    tq.getView().setContentDescription("policy_validator");
    tq.d("/sendMessageToSdk", new eh0(this));
    tq.d("/hideValidatorOverlay", new dh0(this, paramWindowManager, paramView));
    tq.d("/open", new b7<tq>(null, null, null, null, null));
    this.b.g(new WeakReference(tq), "/loadNativeAdPolicyViolations", new gh0(this, paramView, paramWindowManager));
    this.b.g(new WeakReference(tq), "/showValidatorOverlay", fh0.a);
    return tq.getView();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */