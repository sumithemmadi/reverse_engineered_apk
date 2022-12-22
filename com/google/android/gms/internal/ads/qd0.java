package com.google.android.gms.internal.ads;

import android.content.Context;
import b.e.a;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.nonagon.transaction.omid.OmidMediaType;
import com.google.android.gms.dynamic.a;
import java.util.Map;

public final class qd0 implements p, d60 {
  private final Context b;
  
  private final tq c;
  
  private final nh1 d;
  
  private final zzazn e;
  
  private final zzug$zza.zza f;
  
  private a g;
  
  public qd0(Context paramContext, tq paramtq, nh1 paramnh1, zzazn paramzzazn, zzug$zza.zza paramzza) {
    this.b = paramContext;
    this.c = paramtq;
    this.d = paramnh1;
    this.e = paramzzazn;
    this.f = paramzza;
  }
  
  public final void M0() {}
  
  public final void R5(zzn paramzzn) {
    this.g = null;
  }
  
  public final void i() {
    zzug$zza.zza zza1 = this.f;
    if ((zza1 == zzug$zza.zza.i || zza1 == zzug$zza.zza.e || zza1 == zzug$zza.zza.l) && this.d.N && this.c != null && q.r().k(this.b)) {
      zzazn zzazn1 = this.e;
      int i = zzazn1.c;
      int j = zzazn1.d;
      StringBuilder stringBuilder = new StringBuilder(23);
      stringBuilder.append(i);
      stringBuilder.append(".");
      stringBuilder.append(j);
      String str1 = stringBuilder.toString();
      String str2 = this.d.P.b();
      x<Boolean> x = m0.G3;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        zzarm zzarm;
        zzarn zzarn;
        if (this.d.P.a() == OmidMediaType.b) {
          zzarn zzarn1 = zzarn.d;
          zzarm = zzarm.c;
          zzarn = zzarn1;
        } else {
          zzarm zzarm1;
          if (this.d.S == 2) {
            zzarm1 = zzarm.e;
          } else {
            zzarm1 = zzarm.b;
          } 
          zzarn = zzarn.b;
          zzarm = zzarm1;
        } 
        this.g = q.r().c(str1, this.c.getWebView(), "", "javascript", str2, zzarm, zzarn, this.d.f0);
      } else {
        this.g = q.r().b(str1, this.c.getWebView(), "", "javascript", str2);
      } 
      if (this.g != null && this.c.getView() != null) {
        q.r().f(this.g, this.c.getView());
        this.c.H0(this.g);
        q.r().g(this.g);
        x = m0.J3;
        if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
          this.c.B("onSdkLoaded", (Map<String, ?>)new a()); 
      } 
    } 
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void u9() {
    if (this.g != null) {
      tq tq1 = this.c;
      if (tq1 != null)
        tq1.B("onSdkImpression", (Map<String, ?>)new a()); 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qd0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */