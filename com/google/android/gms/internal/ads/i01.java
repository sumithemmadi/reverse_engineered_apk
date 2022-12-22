package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

public final class i01<AdT, AdapterT, ListenerT extends v50> implements hv0<AdT> {
  private final lv0<AdapterT, ListenerT> a;
  
  private final ov0<AdT, AdapterT, ListenerT> b;
  
  private final am1 c;
  
  private final nt1 d;
  
  public i01(am1 paramam1, nt1 paramnt1, lv0<AdapterT, ListenerT> paramlv0, ov0<AdT, AdapterT, ListenerT> paramov0) {
    this.c = paramam1;
    this.d = paramnt1;
    this.b = paramov0;
    this.a = paramlv0;
  }
  
  static String d(String paramString, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 31);
    stringBuilder.append("Error from: ");
    stringBuilder.append(paramString);
    stringBuilder.append(", code: ");
    stringBuilder.append(paramInt);
    return stringBuilder.toString();
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    return !paramnh1.s.isEmpty();
  }
  
  public final ot1<AdT> b(ci1 paramci1, nh1 paramnh1) {
    jv0 jv0;
    Iterator<String> iterator = paramnh1.s.iterator();
    while (true) {
      if (iterator.hasNext()) {
        String str = iterator.next();
        try {
          jv0<AdapterT, ListenerT> jv01 = this.a.a(str, paramnh1.u);
          break;
        } catch (zzdnt zzdnt) {
          continue;
        } 
      } 
      jv0 = null;
      break;
    } 
    if (jv0 == null)
      return dt1.a(new zzcum("unable to instantiate mediation adapter class")); 
    sm sm = new sm();
    j01 j01 = new j01(this, jv0, sm);
    jv0.c.X5(j01);
    if (paramnh1.H) {
      Bundle bundle2 = paramci1.a.a.d.n;
      Bundle bundle3 = bundle2.getBundle(AdMobAdapter.class.getName());
      Bundle bundle1 = bundle3;
      if (bundle3 == null) {
        bundle1 = new Bundle();
        bundle2.putBundle(AdMobAdapter.class.getName(), bundle1);
      } 
      bundle1.putBoolean("render_test_ad_label", true);
    } 
    return this.c.g(zzdrk.o).a(new h01(this, paramci1, paramnh1, jv0), this.d).j(zzdrk.p).h(sm).j(zzdrk.q).g(new k01(this, paramci1, paramnh1, jv0)).f();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */