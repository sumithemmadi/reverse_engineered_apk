package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.d1;
import java.util.List;

public final class t30 {
  private final am1 a;
  
  private final zzazn b;
  
  private final ApplicationInfo c;
  
  private final String d;
  
  private final List<String> e;
  
  private final PackageInfo f;
  
  private final t82<ot1<String>> g;
  
  private final String h;
  
  private final v91<Bundle> i;
  
  public t30(am1 paramam1, zzazn paramzzazn, ApplicationInfo paramApplicationInfo, String paramString1, List<String> paramList, PackageInfo paramPackageInfo, t82<ot1<String>> paramt82, d1 paramd1, String paramString2, v91<Bundle> paramv91) {
    this.a = paramam1;
    this.b = paramzzazn;
    this.c = paramApplicationInfo;
    this.d = paramString1;
    this.e = paramList;
    this.f = paramPackageInfo;
    this.g = paramt82;
    this.h = paramString2;
    this.i = paramv91;
  }
  
  public final ot1<Bundle> a() {
    return this.a.g(zzdrk.b).<Bundle>d(this.i.a(new Bundle())).f();
  }
  
  public final ot1<zzatq> b() {
    ot1<Bundle> ot1 = a();
    return this.a.a(zzdrk.c, (ot1<?>[])new ot1[] { ot1, this.g.get() }).<zzatq>a(new s30(this, ot1)).f();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */