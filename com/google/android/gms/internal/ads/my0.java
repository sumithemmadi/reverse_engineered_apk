package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class my0<AdT> implements hv0<AdT> {
  private static Bundle d(Bundle paramBundle) {
    return (paramBundle == null) ? new Bundle() : new Bundle(paramBundle);
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    return !TextUtils.isEmpty(paramnh1.u.optString("pubid", ""));
  }
  
  public final ot1<AdT> b(ci1 paramci1, nh1 paramnh1) {
    String str1 = paramnh1.u.optString("pubid", "");
    gi1 gi11 = paramci1.a.a;
    ii1 ii1 = (new ii1()).o(gi11).A(str1);
    Bundle bundle2 = d(gi11.d.n);
    Bundle bundle4 = d(bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
    bundle4.putInt("gw", 1);
    String str3 = paramnh1.u.optString("mad_hac", null);
    if (str3 != null)
      bundle4.putString("mad_hac", str3); 
    str3 = paramnh1.u.optString("adJson", null);
    if (str3 != null)
      bundle4.putString("_ad", str3); 
    bundle4.putBoolean("_noRefresh", true);
    Iterator<String> iterator = paramnh1.C.keys();
    while (iterator.hasNext()) {
      String str = iterator.next();
      str3 = paramnh1.C.optString(str, null);
      if (str != null)
        bundle4.putString(str, str3); 
    } 
    bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
    zzvl zzvl = gi11.d;
    gi1 gi12 = ii1.C(new zzvl(zzvl.b, zzvl.c, bundle4, zzvl.e, zzvl.f, zzvl.g, zzvl.h, zzvl.i, zzvl.j, zzvl.k, zzvl.l, zzvl.m, bundle2, zzvl.o, zzvl.p, zzvl.q, zzvl.r, zzvl.s, zzvl.t, zzvl.u, zzvl.v, zzvl.w, zzvl.x)).e();
    bundle2 = new Bundle();
    sh1 sh1 = paramci1.b.b;
    Bundle bundle3 = new Bundle();
    bundle3.putStringArrayList("nofill_urls", new ArrayList<String>(sh1.a));
    bundle3.putInt("refresh_interval", sh1.c);
    bundle3.putString("gws_query_id", sh1.b);
    bundle2.putBundle("parent_common_config", bundle3);
    String str2 = paramci1.a.a.f;
    Bundle bundle1 = new Bundle();
    bundle1.putString("initial_ad_unit_id", str2);
    bundle1.putString("allocation_id", paramnh1.v);
    bundle1.putStringArrayList("click_urls", new ArrayList<String>(paramnh1.c));
    bundle1.putStringArrayList("imp_urls", new ArrayList<String>(paramnh1.d));
    bundle1.putStringArrayList("manual_tracking_urls", new ArrayList<String>(paramnh1.o));
    bundle1.putStringArrayList("fill_urls", new ArrayList<String>(paramnh1.m));
    bundle1.putStringArrayList("video_start_urls", new ArrayList<String>(paramnh1.g));
    bundle1.putStringArrayList("video_reward_urls", new ArrayList<String>(paramnh1.h));
    bundle1.putStringArrayList("video_complete_urls", new ArrayList<String>(paramnh1.i));
    bundle1.putString("transaction_id", paramnh1.j);
    bundle1.putString("valid_from_timestamp", paramnh1.k);
    bundle1.putBoolean("is_closable_area_disabled", paramnh1.K);
    if (paramnh1.l != null) {
      Bundle bundle = new Bundle();
      bundle.putInt("rb_amount", paramnh1.l.c);
      bundle.putString("rb_type", paramnh1.l.b);
      bundle1.putParcelableArray("rewards", (Parcelable[])new Bundle[] { bundle });
    } 
    bundle2.putBundle("parent_ad_config", bundle1);
    return c(gi12, bundle2);
  }
  
  protected abstract ot1<AdT> c(gi1 paramgi1, Bundle paramBundle);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/my0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */