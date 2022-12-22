package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;

public final class j31 implements f31<p00> {
  private final ii1 a;
  
  private final ss b;
  
  private final Context c;
  
  private final d31 d;
  
  private b10 e;
  
  public j31(ss paramss, Context paramContext, d31 paramd31, ii1 paramii1) {
    this.b = paramss;
    this.c = paramContext;
    this.d = paramd31;
    this.a = paramii1;
  }
  
  public final boolean a(zzvl paramzzvl, String paramString, e31 parame31, h31<? super p00> paramh31) {
    boolean bool;
    q.c();
    if (h1.K(this.c) && paramzzvl.t == null) {
      cm.g("Failed to load the ad because app ID is missing.");
      this.b.f().execute(new i31(this));
      return false;
    } 
    if (paramString == null) {
      cm.g("Ad unit ID should not be null for NativeAdLoader.");
      this.b.f().execute(new l31(this));
      return false;
    } 
    ui1.b(this.c, paramzzvl.g);
    if (parame31 instanceof g31) {
      bool = ((g31)parame31).a;
    } else {
      bool = true;
    } 
    gi1 gi1 = this.a.C(paramzzvl).w(bool).e();
    ce0 ce0 = this.b.t().C((new w30.a()).g(this.c).c(gi1).d()).b((new k90.a()).n()).e(this.d.a()).o(new py(null)).h();
    this.b.z().a(1);
    b10 b101 = new b10(this.b.h(), this.b.g(), ce0.c().g());
    this.e = b101;
    b101.e(new k31(this, paramh31, ce0));
    return true;
  }
  
  public final boolean r() {
    b10 b101 = this.e;
    return (b101 != null && b101.a());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */