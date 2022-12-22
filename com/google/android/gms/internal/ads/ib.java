package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ib {
  private final String a;
  
  private final String b;
  
  public final List<String> c;
  
  private final String d;
  
  private final String e;
  
  private final List<String> f;
  
  private final List<String> g;
  
  private final List<String> h;
  
  private final List<String> i;
  
  private final List<String> j;
  
  public final String k;
  
  private final List<String> l;
  
  private final List<String> m;
  
  private final List<String> n;
  
  private final String o;
  
  private final String p;
  
  private final String q;
  
  private final String r;
  
  private final String s;
  
  private final List<String> t;
  
  private final String u;
  
  public final String v;
  
  private final long w;
  
  public ib(JSONObject paramJSONObject) {
    this.b = paramJSONObject.optString("id");
    JSONArray jSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList<String> arrayList = new ArrayList(jSONArray.length());
    for (byte b = 0; b < jSONArray.length(); b++)
      arrayList.add(jSONArray.getString(b)); 
    this.c = Collections.unmodifiableList(arrayList);
    this.d = paramJSONObject.optString("allocation_id", null);
    q.u();
    this.f = kb.a(paramJSONObject, "clickurl");
    q.u();
    this.g = kb.a(paramJSONObject, "imp_urls");
    q.u();
    this.h = kb.a(paramJSONObject, "downloaded_imp_urls");
    q.u();
    this.j = kb.a(paramJSONObject, "fill_urls");
    q.u();
    this.l = kb.a(paramJSONObject, "video_start_urls");
    q.u();
    this.n = kb.a(paramJSONObject, "video_complete_urls");
    q.u();
    this.m = kb.a(paramJSONObject, "video_reward_urls");
    this.o = paramJSONObject.optString("transaction_id");
    this.p = paramJSONObject.optString("valid_from_timestamp");
    JSONObject jSONObject2 = paramJSONObject.optJSONObject("ad");
    if (jSONObject2 != null) {
      q.u();
      List<String> list = kb.a(jSONObject2, "manual_impression_urls");
    } else {
      jSONArray = null;
    } 
    this.i = (List<String>)jSONArray;
    if (jSONObject2 != null) {
      String str = jSONObject2.toString();
    } else {
      jSONArray = null;
    } 
    this.a = (String)jSONArray;
    jSONObject2 = paramJSONObject.optJSONObject("data");
    if (jSONObject2 != null) {
      String str = jSONObject2.toString();
    } else {
      jSONArray = null;
    } 
    this.k = (String)jSONArray;
    if (jSONObject2 != null) {
      String str = jSONObject2.optString("class_name");
    } else {
      jSONArray = null;
    } 
    this.e = (String)jSONArray;
    this.q = paramJSONObject.optString("html_template", null);
    this.r = paramJSONObject.optString("ad_base_url", null);
    JSONObject jSONObject1 = paramJSONObject.optJSONObject("assets");
    if (jSONObject1 != null) {
      String str = jSONObject1.toString();
    } else {
      jSONObject1 = null;
    } 
    this.s = (String)jSONObject1;
    q.u();
    this.t = kb.a(paramJSONObject, "template_ids");
    jSONObject1 = paramJSONObject.optJSONObject("ad_loader_options");
    if (jSONObject1 != null) {
      String str = jSONObject1.toString();
    } else {
      jSONObject1 = null;
    } 
    this.u = (String)jSONObject1;
    this.v = paramJSONObject.optString("response_type", null);
    this.w = paramJSONObject.optLong("ad_network_timeout_millis", -1L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */