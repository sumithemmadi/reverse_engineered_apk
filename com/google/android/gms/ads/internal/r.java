package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.n91;
import com.google.android.gms.internal.ads.y1;
import com.google.android.gms.internal.ads.zzazn;
import com.google.android.gms.internal.ads.zzvl;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

final class r {
  private final Context a;
  
  private final String b;
  
  private final Map<String, String> c;
  
  private String d;
  
  private String e;
  
  public r(Context paramContext, String paramString) {
    this.a = paramContext.getApplicationContext();
    this.b = paramString;
    this.c = new TreeMap<String, String>();
  }
  
  public final String a() {
    return this.d;
  }
  
  public final void b(zzvl paramzzvl, zzazn paramzzazn) {
    this.d = paramzzvl.k.b;
    Bundle bundle = paramzzvl.n;
    if (bundle != null) {
      bundle = bundle.getBundle(AdMobAdapter.class.getName());
    } else {
      bundle = null;
    } 
    if (bundle == null)
      return; 
    String str = (String)y1.c.a();
    for (String str1 : bundle.keySet()) {
      if (str.equals(str1)) {
        this.e = bundle.getString(str1);
        continue;
      } 
      if (str1.startsWith("csa_"))
        this.c.put(str1.substring(4), bundle.getString(str1)); 
    } 
    this.c.put("SDKVersion", paramzzazn.b);
    if (((Boolean)y1.a.a()).booleanValue())
      try {
        JSONArray jSONArray = new JSONArray();
        this((String)y1.b.a());
        Bundle bundle1 = n91.b(this.a, jSONArray);
        for (String str1 : bundle1.keySet())
          this.c.put(str1, bundle1.get(str1).toString()); 
        return;
      } catch (JSONException jSONException) {
        cm.c("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", (Throwable)jSONException);
      }  
  }
  
  public final String c() {
    return this.e;
  }
  
  public final String d() {
    return this.b;
  }
  
  public final Map<String, String> e() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */