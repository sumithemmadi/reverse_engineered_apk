package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.d1;
import com.google.android.gms.ads.internal.util.n0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

public final class lg0 {
  private final d1 a;
  
  private final gi1 b;
  
  private final tf0 c;
  
  private final pf0 d;
  
  private final tg0 e;
  
  private final bh0 f;
  
  private final Executor g;
  
  private final Executor h;
  
  private final zzaeh i;
  
  private final of0 j;
  
  public lg0(d1 paramd1, gi1 paramgi1, tf0 paramtf0, pf0 parampf0, tg0 paramtg0, bh0 parambh0, Executor paramExecutor1, Executor paramExecutor2, of0 paramof0) {
    this.a = paramd1;
    this.b = paramgi1;
    this.i = paramgi1.i;
    this.c = paramtf0;
    this.d = parampf0;
    this.e = paramtg0;
    this.f = parambh0;
    this.g = paramExecutor1;
    this.h = paramExecutor2;
    this.j = paramof0;
  }
  
  private static void a(RelativeLayout.LayoutParams paramLayoutParams, int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          paramLayoutParams.addRule(10);
          paramLayoutParams.addRule(11);
          return;
        } 
        paramLayoutParams.addRule(12);
        paramLayoutParams.addRule(9);
        return;
      } 
      paramLayoutParams.addRule(12);
      paramLayoutParams.addRule(11);
      return;
    } 
    paramLayoutParams.addRule(10);
    paramLayoutParams.addRule(9);
  }
  
  private static boolean e(jh0 paramjh0, String[] paramArrayOfString) {
    Map<String, WeakReference<View>> map = paramjh0.J7();
    if (map == null)
      return false; 
    int i = paramArrayOfString.length;
    for (byte b = 0; b < i; b++) {
      if (map.get(paramArrayOfString[b]) != null)
        return true; 
    } 
    return false;
  }
  
  public final void b(jh0 paramjh0) {
    this.g.execute(new og0(this, paramjh0));
  }
  
  public final boolean c(ViewGroup paramViewGroup) {
    FrameLayout.LayoutParams layoutParams;
    View view = this.d.E();
    if (view == null)
      return false; 
    paramViewGroup.removeAllViews();
    if (view.getParent() instanceof ViewGroup)
      ((ViewGroup)view.getParent()).removeView(view); 
    x<Boolean> x = m0.z2;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    } else {
      layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
    } 
    paramViewGroup.addView(view, (ViewGroup.LayoutParams)layoutParams);
    return true;
  }
  
  public final void g(jh0 paramjh0) {
    if (paramjh0 != null && this.e != null && paramjh0.j2() != null) {
      if (!this.c.c())
        return; 
      try {
        paramjh0.j2().addView(this.e.c());
        return;
      } catch (zzben zzben) {
        b1.l("web view can not be obtained", zzben);
      } 
    } 
  }
  
  public final void h(jh0 paramjh0) {
    if (paramjh0 == null)
      return; 
    Context context = paramjh0.t9().getContext();
    if (!n0.g(context, this.c.a))
      return; 
    if (!(context instanceof android.app.Activity)) {
      cm.e("Activity context is needed for policy validator.");
      return;
    } 
    if (this.f != null && paramjh0.j2() != null)
      try {
        WindowManager windowManager = (WindowManager)context.getSystemService("window");
        FrameLayout frameLayout = paramjh0.j2();
        windowManager.addView(this.f.b((View)frameLayout, windowManager), (ViewGroup.LayoutParams)n0.n());
        return;
      } catch (zzben zzben) {
        b1.l("web view can not be obtained", zzben);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */