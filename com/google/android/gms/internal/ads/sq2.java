package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

public class sq2 {
  private final fq2 a;
  
  private final gq2 b;
  
  private final gu2 c;
  
  private final q5 d;
  
  private final yh e;
  
  private final cj f;
  
  private final bf g;
  
  private final p5 h;
  
  public sq2(fq2 paramfq2, gq2 paramgq2, gu2 paramgu2, q5 paramq5, yh paramyh, cj paramcj, bf parambf, p5 paramp5) {
    this.a = paramfq2;
    this.b = paramgq2;
    this.c = paramgu2;
    this.d = paramq5;
    this.e = paramyh;
    this.f = paramcj;
    this.g = parambf;
    this.h = paramp5;
  }
  
  private static void d(Context paramContext, String paramString) {
    Bundle bundle = new Bundle();
    bundle.putString("action", "no_ads_fallback");
    bundle.putString("flow", paramString);
    er2.a().c(paramContext, (er2.g()).b, "gmob-apps", bundle, true);
  }
  
  public final q3 a(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2) {
    return (new br2(this, paramFrameLayout1, paramFrameLayout2, paramContext)).b(paramContext, false);
  }
  
  public final xr2 c(Context paramContext, zzvs paramzzvs, String paramString, mb parammb) {
    return (new yq2(this, paramContext, paramzzvs, paramString, parammb)).b(paramContext, false);
  }
  
  public final te e(Context paramContext, mb parammb) {
    return (new wq2(this, paramContext, parammb)).b(paramContext, false);
  }
  
  public final af f(Activity paramActivity) {
    tq2 tq2 = new tq2(this, paramActivity);
    Intent intent = paramActivity.getIntent();
    boolean bool1 = intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar");
    boolean bool2 = false;
    if (!bool1) {
      cm.g("useClientJar flag not found in activity intent extras.");
    } else {
      bool2 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
    } 
    return tq2.b((Context)paramActivity, bool2);
  }
  
  public final ur2 h(Context paramContext, String paramString, mb parammb) {
    return (new zq2(this, paramContext, paramString, parammb)).b(paramContext, false);
  }
  
  public final xr2 i(Context paramContext, zzvs paramzzvs, String paramString, mb parammb) {
    return (new ar2(this, paramContext, paramzzvs, paramString, parammb)).b(paramContext, false);
  }
  
  public final li k(Context paramContext, String paramString, mb parammb) {
    return (new uq2(this, paramContext, paramString, parammb)).b(paramContext, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */