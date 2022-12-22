package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import java.util.Collections;
import java.util.List;

public final class lp0 implements a, m40, r40, f50, i50, d60, d70, fm1, bq2 {
  private final List<Object> b;
  
  private final zo0 c;
  
  private long d;
  
  public lp0(zo0 paramzo0, ss paramss) {
    this.c = paramzo0;
    this.b = Collections.singletonList(paramss);
  }
  
  private final void k0(Class<?> paramClass, String paramString, Object... paramVarArgs) {
    zo0 zo01 = this.c;
    List<Object> list = this.b;
    String str = paramClass.getSimpleName();
    if (str.length() != 0) {
      str = "Event-".concat(str);
    } else {
      str = new String("Event-");
    } 
    zo01.a(list, str, paramString, paramVarArgs);
  }
  
  public final void B(zzdrk paramzzdrk, String paramString) {
    k0(yl1.class, "onTaskSucceeded", new Object[] { paramString });
  }
  
  public final void C(zzdrk paramzzdrk, String paramString, Throwable paramThrowable) {
    k0(yl1.class, "onTaskFailed", new Object[] { paramString, paramThrowable.getClass().getSimpleName() });
  }
  
  public final void D(Context paramContext) {
    k0(i50.class, "onPause", new Object[] { paramContext });
  }
  
  public final void E(zzvg paramzzvg) {
    k0(r40.class, "onAdFailedToLoad", new Object[] { Integer.valueOf(paramzzvg.b), paramzzvg.c, paramzzvg.d });
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {
    k0(m40.class, "onRewarded", new Object[] { paramkh, paramString1, paramString2 });
  }
  
  public final void I() {
    k0(m40.class, "onRewardedVideoStarted", new Object[0]);
  }
  
  public final void J(zzatq paramzzatq) {
    this.d = q.j().b();
    k0(d70.class, "onAdRequest", new Object[0]);
  }
  
  public final void K() {
    k0(m40.class, "onRewardedVideoCompleted", new Object[0]);
  }
  
  public final void L() {
    k0(m40.class, "onAdOpened", new Object[0]);
  }
  
  public final void O() {
    k0(m40.class, "onAdLeftApplication", new Object[0]);
  }
  
  public final void S() {
    k0(f50.class, "onAdImpression", new Object[0]);
  }
  
  public final void Y() {
    k0(m40.class, "onAdClosed", new Object[0]);
  }
  
  public final void g0(zzdrk paramzzdrk, String paramString) {
    k0(yl1.class, "onTaskCreated", new Object[] { paramString });
  }
  
  public final void i() {
    long l1 = q.j().b();
    long l2 = this.d;
    StringBuilder stringBuilder = new StringBuilder(41);
    stringBuilder.append("Ad Request Latency : ");
    stringBuilder.append(l1 - l2);
    b1.m(stringBuilder.toString());
    k0(d60.class, "onAdLoaded", new Object[0]);
  }
  
  public final void i0(ci1 paramci1) {}
  
  public final void n(String paramString1, String paramString2) {
    k0(a.class, "onAppEvent", new Object[] { paramString1, paramString2 });
  }
  
  public final void r(Context paramContext) {
    k0(i50.class, "onDestroy", new Object[] { paramContext });
  }
  
  public final void t(zzdrk paramzzdrk, String paramString) {
    k0(yl1.class, "onTaskStarted", new Object[] { paramString });
  }
  
  public final void x() {
    k0(bq2.class, "onAdClicked", new Object[0]);
  }
  
  public final void y(Context paramContext) {
    k0(i50.class, "onResume", new Object[] { paramContext });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */