package com.allinone.callerid.util.gg;

import android.app.Activity;
import android.content.Context;
import com.allinone.callerid.d.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;

public class b {
  private static b a = new b();
  
  private com.google.android.gms.ads.z.b b;
  
  public static b a() {
    return a;
  }
  
  public void b(d paramd) {
    if (d0.a)
      d0.a("wbb", "initRewardAd_request"); 
    com.google.android.gms.ads.z.b b1 = this.b;
    if (b1 != null && b1.a() && System.currentTimeMillis() - f.g() < 1800000L) {
      if (d0.a)
        d0.a("wbb", "initRewardAd_has_cache"); 
    } else {
      this.b = new com.google.android.gms.ads.z.b((Context)EZCallApplication.c(), "ca-app-pub-5825926894918682/1702975975");
      a a = new a(this, paramd);
      this.b.b((new com.google.android.gms.ads.e.a()).d(), a);
    } 
  }
  
  public void c(Activity paramActivity, e parame) {
    if (d0.a)
      d0.a("wbb", "rewardedAd_show"); 
    com.google.android.gms.ads.z.b b1 = this.b;
    if (b1 != null && b1.a()) {
      c c = new c(this, parame);
      this.b.c(paramActivity, c);
      parame.c();
      this.b = null;
      f.s(0L);
    } else {
      if (d0.a)
        d0.a("wbb", "onRewardedAdLoaded_NotShow"); 
      parame.d();
    } 
  }
  
  public void d(boolean paramBoolean, Activity paramActivity, e parame) {
    if (d0.a)
      d0.a("wbb", "rewardedAd_show"); 
    if (paramBoolean) {
      com.google.android.gms.ads.z.b b1 = this.b;
      if (b1 != null && b1.a()) {
        b b2 = new b(this, parame);
        this.b.c(paramActivity, b2);
        parame.c();
        this.b = null;
        f.s(0L);
        return;
      } 
    } 
    if (d0.a)
      d0.a("wbb", "onRewardedAdLoaded_NotShow"); 
  }
  
  class a extends com.google.android.gms.ads.z.d {
    a(b this$0, b.d param1d) {}
    
    public void c(int param1Int) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onRewardedAdFailedToLoad:");
        stringBuilder.append(param1Int);
        d0.a("wbb", stringBuilder.toString());
      } 
      this.a.j(param1Int);
    }
    
    public void e() {
      if (d0.a)
        d0.a("wbb", "onRewardedAdLoaded"); 
      f.s(System.currentTimeMillis());
      this.a.i();
    }
  }
  
  class b extends com.google.android.gms.ads.z.c {
    b(b this$0, b.e param1e) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "onRewardedAdClosed"); 
    }
    
    public void b(int param1Int) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onRewardedAdFailedToShow:");
        stringBuilder.append(param1Int);
        d0.a("wbb", stringBuilder.toString());
      } 
      this.a.a();
    }
    
    public void d() {
      if (d0.a)
        d0.a("wbb", "onRewardedAdOpened"); 
    }
    
    public void e(com.google.android.gms.ads.z.a param1a) {
      if (d0.a)
        d0.a("wbb", "onUserEarnedReward"); 
      this.a.b();
    }
  }
  
  class c extends com.google.android.gms.ads.z.c {
    c(b this$0, b.e param1e) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "onRewardedAdClosed"); 
    }
    
    public void b(int param1Int) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onRewardedAdFailedToShow:");
        stringBuilder.append(param1Int);
        d0.a("wbb", stringBuilder.toString());
      } 
      this.a.a();
    }
    
    public void d() {
      if (d0.a)
        d0.a("wbb", "onRewardedAdOpened"); 
    }
    
    public void e(com.google.android.gms.ads.z.a param1a) {
      if (d0.a)
        d0.a("wbb", "onUserEarnedReward"); 
      this.a.b();
    }
  }
  
  public static interface d {
    void i();
    
    void j(int param1Int);
  }
  
  public static interface e {
    void a();
    
    void b();
    
    void c();
    
    void d();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/gg/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */