package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.v;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.t;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.nt2;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.zzbga;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, v, y, MediationRewardedVideoAdAdapter, zzbga {
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  
  private AdView zzmj;
  
  private k zzmk;
  
  private com.google.android.gms.ads.d zzml;
  
  private Context zzmm;
  
  private k zzmn;
  
  private com.google.android.gms.ads.reward.mediation.a zzmo;
  
  private final com.google.android.gms.ads.y.d zzmp = new f(this);
  
  private final com.google.android.gms.ads.e zza(Context paramContext, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle1, Bundle paramBundle2) {
    com.google.android.gms.ads.e.a a1 = new com.google.android.gms.ads.e.a();
    Date date = parame.h();
    if (date != null)
      a1.e(date); 
    int i = parame.n();
    if (i != 0)
      a1.f(i); 
    Set set = parame.j();
    if (set != null) {
      Iterator<String> iterator = set.iterator();
      while (iterator.hasNext())
        a1.a(iterator.next()); 
    } 
    Location location = parame.l();
    if (location != null)
      a1.h(location); 
    if (parame.i()) {
      er2.a();
      a1.c(sl.j(paramContext));
    } 
    if (parame.c() != -1) {
      i = parame.c();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      a1.i(bool);
    } 
    a1.g(parame.f());
    a1.b(AdMobAdapter.class, zza(paramBundle1, paramBundle2));
    return a1.d();
  }
  
  public String getAdUnitId(Bundle paramBundle) {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView() {
    return (View)this.zzmj;
  }
  
  public Bundle getInterstitialAdapterInfo() {
    return (new com.google.android.gms.ads.mediation.f.a()).b(1).a();
  }
  
  public nt2 getVideoController() {
    AdView adView = this.zzmj;
    if (adView != null) {
      t t = adView.getVideoController();
      if (t != null)
        return t.c(); 
    } 
    return null;
  }
  
  public void initialize(Context paramContext, com.google.android.gms.ads.mediation.e parame, String paramString, com.google.android.gms.ads.reward.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2) {
    this.zzmm = paramContext.getApplicationContext();
    this.zzmo = parama;
    parama.H(this);
  }
  
  public boolean isInitialized() {
    return (this.zzmo != null);
  }
  
  public void loadAd(com.google.android.gms.ads.mediation.e parame, Bundle paramBundle1, Bundle paramBundle2) {
    Context context = this.zzmm;
    if (context == null || this.zzmo == null) {
      cm.g("AdMobAdapter.loadAd called before initialize.");
      return;
    } 
    k k1 = new k(context);
    this.zzmn = k1;
    k1.j(true);
    this.zzmn.f(getAdUnitId(paramBundle1));
    this.zzmn.h(this.zzmp);
    this.zzmn.e(new g(this));
    this.zzmn.c(zza(this.zzmm, parame, paramBundle2, paramBundle1));
  }
  
  public void onDestroy() {
    AdView adView = this.zzmj;
    if (adView != null) {
      adView.a();
      this.zzmj = null;
    } 
    if (this.zzmk != null)
      this.zzmk = null; 
    if (this.zzml != null)
      this.zzml = null; 
    if (this.zzmn != null)
      this.zzmn = null; 
  }
  
  public void onImmersiveModeUpdated(boolean paramBoolean) {
    k k1 = this.zzmk;
    if (k1 != null)
      k1.g(paramBoolean); 
    k1 = this.zzmn;
    if (k1 != null)
      k1.g(paramBoolean); 
  }
  
  public void onPause() {
    AdView adView = this.zzmj;
    if (adView != null)
      adView.c(); 
  }
  
  public void onResume() {
    AdView adView = this.zzmj;
    if (adView != null)
      adView.d(); 
  }
  
  public void requestBannerAd(Context paramContext, h paramh, Bundle paramBundle1, com.google.android.gms.ads.f paramf, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle2) {
    AdView adView = new AdView(paramContext);
    this.zzmj = adView;
    adView.setAdSize(new com.google.android.gms.ads.f(paramf.c(), paramf.a()));
    this.zzmj.setAdUnitId(getAdUnitId(paramBundle1));
    this.zzmj.setAdListener(new e(this, paramh));
    this.zzmj.b(zza(paramContext, parame, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, l paraml, Bundle paramBundle1, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle2) {
    k k1 = new k(paramContext);
    this.zzmk = k1;
    k1.f(getAdUnitId(paramBundle1));
    this.zzmk.d(new d(this, paraml));
    this.zzmk.c(zza(paramContext, parame, paramBundle2, paramBundle1));
  }
  
  public void requestNativeAd(Context paramContext, n paramn, Bundle paramBundle1, t paramt, Bundle paramBundle2) {
    f f = new f(this, paramn);
    com.google.android.gms.ads.d.a a1 = (new com.google.android.gms.ads.d.a(paramContext, paramBundle1.getString("pubid"))).f(f);
    a1.g(paramt.k());
    a1.h(paramt.b());
    if (paramt.d())
      a1.e(f); 
    if (paramt.g())
      a1.b(f); 
    if (paramt.m())
      a1.c(f); 
    if (paramt.e())
      for (String str : paramt.a().keySet()) {
        if (((Boolean)paramt.a().get(str)).booleanValue()) {
          f f1 = f;
        } else {
          paramn = null;
        } 
        a1.d(str, f, (com.google.android.gms.ads.formats.f.a)paramn);
      }  
    com.google.android.gms.ads.d d1 = a1.a();
    this.zzml = d1;
    d1.b(zza(paramContext, (com.google.android.gms.ads.mediation.e)paramt, paramBundle2, paramBundle1));
  }
  
  public void showInterstitial() {
    this.zzmk.i();
  }
  
  public void showVideo() {
    this.zzmn.i();
  }
  
  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);
  
  static final class a extends r {
    private final com.google.android.gms.ads.formats.d p;
    
    public a(com.google.android.gms.ads.formats.d param1d) {
      this.p = param1d;
      z(param1d.d().toString());
      B(param1d.f());
      x(param1d.b().toString());
      A(param1d.e());
      y(param1d.c().toString());
      if (param1d.h() != null)
        D(param1d.h().doubleValue()); 
      if (param1d.i() != null)
        E(param1d.i().toString()); 
      if (param1d.g() != null)
        C(param1d.g().toString()); 
      j(true);
      i(true);
      n(param1d.j());
    }
    
    public final void k(View param1View) {
      if (param1View instanceof NativeAdView)
        ((NativeAdView)param1View).setNativeAd((com.google.android.gms.ads.formats.a)this.p); 
      com.google.android.gms.ads.formats.c c = (com.google.android.gms.ads.formats.c)com.google.android.gms.ads.formats.c.a.get(param1View);
      if (c != null)
        c.a((com.google.android.gms.ads.formats.a)this.p); 
    }
  }
  
  private static final class b extends w {
    private final g s;
    
    public b(g param1g) {
      this.s = param1g;
      x(param1g.d());
      z(param1g.f());
      v(param1g.b());
      y(param1g.e());
      w(param1g.c());
      u(param1g.a());
      D(param1g.h());
      E(param1g.i());
      C(param1g.g());
      K(param1g.l());
      B(true);
      A(true);
      H(param1g.j());
    }
    
    public final void F(View param1View, Map<String, View> param1Map1, Map<String, View> param1Map2) {
      if (param1View instanceof UnifiedNativeAdView) {
        ((UnifiedNativeAdView)param1View).setNativeAd(this.s);
        return;
      } 
      com.google.android.gms.ads.formats.c c = (com.google.android.gms.ads.formats.c)com.google.android.gms.ads.formats.c.a.get(param1View);
      if (c != null)
        c.b(this.s); 
    }
  }
  
  static final class c extends s {
    private final com.google.android.gms.ads.formats.e n;
    
    public c(com.google.android.gms.ads.formats.e param1e) {
      this.n = param1e;
      y(param1e.e().toString());
      z(param1e.f());
      w(param1e.c().toString());
      if (param1e.g() != null)
        A(param1e.g()); 
      x(param1e.d().toString());
      v(param1e.b().toString());
      j(true);
      i(true);
      n(param1e.h());
    }
    
    public final void k(View param1View) {
      if (param1View instanceof NativeAdView)
        ((NativeAdView)param1View).setNativeAd((com.google.android.gms.ads.formats.a)this.n); 
      com.google.android.gms.ads.formats.c c1 = (com.google.android.gms.ads.formats.c)com.google.android.gms.ads.formats.c.a.get(param1View);
      if (c1 != null)
        c1.a((com.google.android.gms.ads.formats.a)this.n); 
    }
  }
  
  static final class d extends com.google.android.gms.ads.b implements bq2 {
    private final AbstractAdViewAdapter b;
    
    private final l c;
    
    public d(AbstractAdViewAdapter param1AbstractAdViewAdapter, l param1l) {
      this.b = param1AbstractAdViewAdapter;
      this.c = param1l;
    }
    
    public final void C() {
      this.c.t((MediationInterstitialAdapter)this.b);
    }
    
    public final void D(int param1Int) {
      this.c.e((MediationInterstitialAdapter)this.b, param1Int);
    }
    
    public final void I() {
      this.c.d((MediationInterstitialAdapter)this.b);
    }
    
    public final void J() {
      this.c.r((MediationInterstitialAdapter)this.b);
    }
    
    public final void K() {
      this.c.y((MediationInterstitialAdapter)this.b);
    }
    
    public final void x() {
      this.c.n((MediationInterstitialAdapter)this.b);
    }
  }
  
  static final class e extends com.google.android.gms.ads.b implements com.google.android.gms.ads.doubleclick.a, bq2 {
    private final AbstractAdViewAdapter b;
    
    private final h c;
    
    public e(AbstractAdViewAdapter param1AbstractAdViewAdapter, h param1h) {
      this.b = param1AbstractAdViewAdapter;
      this.c = param1h;
    }
    
    public final void C() {
      this.c.a(this.b);
    }
    
    public final void D(int param1Int) {
      this.c.z(this.b, param1Int);
    }
    
    public final void I() {
      this.c.p(this.b);
    }
    
    public final void J() {
      this.c.i(this.b);
    }
    
    public final void K() {
      this.c.s(this.b);
    }
    
    public final void n(String param1String1, String param1String2) {
      this.c.m(this.b, param1String1, param1String2);
    }
    
    public final void x() {
      this.c.g(this.b);
    }
  }
  
  static final class f extends com.google.android.gms.ads.b implements com.google.android.gms.ads.formats.d.a, com.google.android.gms.ads.formats.e.a, com.google.android.gms.ads.formats.f.a, com.google.android.gms.ads.formats.f.b, g.a {
    private final AbstractAdViewAdapter b;
    
    private final n c;
    
    public f(AbstractAdViewAdapter param1AbstractAdViewAdapter, n param1n) {
      this.b = param1AbstractAdViewAdapter;
      this.c = param1n;
    }
    
    public final void B(com.google.android.gms.ads.formats.f param1f, String param1String) {
      this.c.w(this.b, param1f, param1String);
    }
    
    public final void C() {
      this.c.h(this.b);
    }
    
    public final void D(int param1Int) {
      this.c.j(this.b, param1Int);
    }
    
    public final void H() {
      this.c.x(this.b);
    }
    
    public final void I() {
      this.c.o(this.b);
    }
    
    public final void J() {}
    
    public final void K() {
      this.c.b(this.b);
    }
    
    public final void i(com.google.android.gms.ads.formats.d param1d) {
      this.c.u(this.b, (q)new AbstractAdViewAdapter.a(param1d));
    }
    
    public final void r(g param1g) {
      this.c.v(this.b, new AbstractAdViewAdapter.b(param1g));
    }
    
    public final void t(com.google.android.gms.ads.formats.f param1f) {
      this.c.l(this.b, param1f);
    }
    
    public final void x() {
      this.c.k(this.b);
    }
    
    public final void y(com.google.android.gms.ads.formats.e param1e) {
      this.c.u(this.b, (q)new AbstractAdViewAdapter.c(param1e));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/AbstractAdViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */