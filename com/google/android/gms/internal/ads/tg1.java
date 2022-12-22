package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class tg1 implements f31<vk0> {
  private final Context a;
  
  private final Executor b;
  
  private final ss c;
  
  private final xf1 d;
  
  private final cf1<cl0, vk0> e;
  
  private final bi1 f;
  
  private final ii1 g;
  
  private ot1<vk0> h;
  
  public tg1(Context paramContext, Executor paramExecutor, ss paramss, cf1<cl0, vk0> paramcf1, xf1 paramxf1, ii1 paramii1, bi1 parambi1) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = paramss;
    this.e = paramcf1;
    this.d = paramxf1;
    this.g = paramii1;
    this.f = parambi1;
  }
  
  private final bl0 g(bf1 parambf1) {
    parambf1 = parambf1;
    return this.c.u().j((new w30.a()).g(this.a).c(((zg1)parambf1).a).k(((zg1)parambf1).b).b(this.f).d()).l((new k90.a()).n());
  }
  
  public final boolean a(zzvl paramzzvl, String paramString, e31 parame31, h31<? super vk0> paramh31) {
    zzava zzava = new zzava(paramzzvl, paramString);
    if (parame31 instanceof ug1)
      ug1 ug1 = (ug1)parame31; 
    if (zzava.c == null) {
      cm.g("Ad unit ID should not be null for rewarded video ad.");
      this.b.execute(new wg1(this));
      return false;
    } 
    ot1<vk0> ot12 = this.h;
    if (ot12 != null && !ot12.isDone())
      return false; 
    ui1.b(this.a, zzava.b.g);
    gi1 gi1 = this.g.A(zzava.c).z(zzvs.s0()).C(zzava.b).e();
    zg1 zg1 = new zg1(null);
    zg1.a = gi1;
    zg1.b = null;
    ot1<vk0> ot11 = this.e.b(new df1(zg1), new vg1(this));
    this.h = ot11;
    dt1.g(ot11, new yg1(this, paramh31, zg1), this.b);
    return true;
  }
  
  final void i(int paramInt) {
    this.g.d().c(paramInt);
  }
  
  public final boolean r() {
    ot1<vk0> ot11 = this.h;
    return (ot11 != null && !ot11.isDone());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */