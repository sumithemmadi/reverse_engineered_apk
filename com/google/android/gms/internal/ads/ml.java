package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;

public final class ml {
  private long a = -1L;
  
  private long b = -1L;
  
  private int c = -1;
  
  int d = -1;
  
  private long e = 0L;
  
  private final Object f = new Object();
  
  private final String g;
  
  private final d1 h;
  
  private int i = 0;
  
  private int j = 0;
  
  public ml(String paramString, d1 paramd1) {
    this.g = paramString;
    this.h = paramd1;
  }
  
  private static boolean b(Context paramContext) {
    Context context = lh.a(paramContext);
    int i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (i == 0) {
      cm.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    } 
    ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try {
      if (i == (context.getPackageManager().getActivityInfo(componentName, 0)).theme)
        return true; 
      cm.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      cm.i("Fail to fetch AdActivity theme");
      cm.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    } 
  }
  
  public final void a(zzvl paramzzvl, long paramLong) {
    synchronized (this.f) {
      long l1 = this.h.b();
      long l2 = q.j().a();
      if (this.b == -1L) {
        x<Long> x = m0.D0;
        if (l2 - l1 > ((Long)er2.e().<Long>c(x)).longValue()) {
          this.d = -1;
        } else {
          this.d = this.h.B();
        } 
        this.b = paramLong;
        this.a = paramLong;
      } else {
        this.a = paramLong;
      } 
      if (paramzzvl != null) {
        Bundle bundle = paramzzvl.d;
        if (bundle != null && bundle.getInt("gw", 2) == 1)
          return; 
      } 
      this.c++;
      int i = this.d + 1;
      this.d = i;
      if (i == 0) {
        this.e = 0L;
        this.h.o(l2);
      } else {
        this.e = l2 - this.h.A();
      } 
      return;
    } 
  }
  
  public final Bundle c(Context paramContext, String paramString) {
    synchronized (this.f) {
      String str;
      Bundle bundle = new Bundle();
      this();
      if (this.h.h()) {
        str = "";
      } else {
        str = this.g;
      } 
      bundle.putString("session_id", str);
      bundle.putLong("basets", this.b);
      bundle.putLong("currts", this.a);
      bundle.putString("seq_num", paramString);
      bundle.putInt("preqs", this.c);
      bundle.putInt("preqs_in_session", this.d);
      bundle.putLong("time_in_session", this.e);
      bundle.putInt("pclick", this.i);
      bundle.putInt("pimp", this.j);
      bundle.putBoolean("support_transparent_background", b(paramContext));
      return bundle;
    } 
  }
  
  public final void d() {
    synchronized (this.f) {
      this.j++;
      return;
    } 
  }
  
  public final void e() {
    synchronized (this.f) {
      this.i++;
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */