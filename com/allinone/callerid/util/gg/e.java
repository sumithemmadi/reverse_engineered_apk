package com.allinone.callerid.util.gg;

import android.content.Context;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.l;

public class e {
  private static e a = new e();
  
  private k b;
  
  private boolean c = false;
  
  public static e d() {
    return a;
  }
  
  public void e(boolean paramBoolean) {
    if (com.allinone.callerid.util.e.b((Context)EZCallApplication.c())) {
      if (d0.a)
        d0.a("wbb", "backInterstitialAd_request"); 
      if (this.c)
        return; 
      k k1 = this.b;
      if (k1 != null && k1.b() && System.currentTimeMillis() - f.a() < 1800000L) {
        if (d0.a)
          d0.a("wbb", "backInterstitialAd_has_cache"); 
      } else {
        this.c = true;
        k1 = new k((Context)EZCallApplication.c());
        this.b = k1;
        k1.f("ca-app-pub-5825926894918682/1576366355");
        this.b.c((new com.google.android.gms.ads.e.a()).d());
        this.b.d(new a(this, paramBoolean));
      } 
    } else if (d0.a) {
      d0.a("wbb", "无网");
    } 
  }
  
  public void f() {
    k k1 = this.b;
    if (k1 != null && k1.b()) {
      this.b.i();
      if (d0.a)
        d0.a("wbb", "applyInterstitialAd_show"); 
      this.b = null;
      f.m(0L);
    } else {
      e(true);
    } 
  }
  
  class a extends b {
    a(e this$0, boolean param1Boolean) {}
    
    public void E(l param1l) {
      super.E(param1l);
      e.a(this.b, false);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("backInterstitialAd_onAdFailedToLoad:");
        stringBuilder.append(param1l.c());
        d0.a("wbb", stringBuilder.toString());
      } 
    }
    
    public void J() {
      super.J();
      e.a(this.b, false);
      f.m(System.currentTimeMillis());
      if (d0.a)
        d0.a("wbb", "backInterstitialAd_onAdLoaded"); 
      if (this.a && e.b(this.b) != null && e.b(this.b).b()) {
        e.b(this.b).i();
        e.c(this.b, null);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/gg/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */