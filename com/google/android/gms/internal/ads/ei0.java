package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ei0 {
  private final Context a;
  
  private final zh0 b;
  
  private final p12 c;
  
  private final zzazn d;
  
  private final b e;
  
  private final xn2 f;
  
  private final Executor g;
  
  private final zzaeh h;
  
  private final aj0 i;
  
  private final ScheduledExecutorService j;
  
  public ei0(Context paramContext, zh0 paramzh0, p12 paramp12, zzazn paramzzazn, b paramb, xn2 paramxn2, Executor paramExecutor, gi1 paramgi1, aj0 paramaj0, ScheduledExecutorService paramScheduledExecutorService) {
    this.a = paramContext;
    this.b = paramzh0;
    this.c = paramp12;
    this.d = paramzzazn;
    this.e = paramb;
    this.f = paramxn2;
    this.g = paramExecutor;
    this.h = paramgi1.i;
    this.i = paramaj0;
    this.j = paramScheduledExecutorService;
  }
  
  private static <T> ot1<T> b(ot1<T> paramot1, T paramT) {
    return dt1.l(paramot1, Exception.class, new ki0(null), fm.f);
  }
  
  private final ot1<List<a3>> d(JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2) {
    byte b1;
    if (paramJSONArray == null || paramJSONArray.length() <= 0)
      return dt1.h(Collections.emptyList()); 
    ArrayList<ot1<a3>> arrayList = new ArrayList();
    if (paramBoolean2) {
      b1 = paramJSONArray.length();
    } else {
      b1 = 1;
    } 
    for (byte b2 = 0; b2 < b1; b2++)
      arrayList.add(e(paramJSONArray.optJSONObject(b2), paramBoolean1)); 
    return dt1.j(dt1.n(arrayList), hi0.a, this.g);
  }
  
  private final ot1<a3> e(JSONObject paramJSONObject, boolean paramBoolean) {
    if (paramJSONObject == null)
      return dt1.h(null); 
    String str = paramJSONObject.optString("url");
    if (TextUtils.isEmpty(str))
      return dt1.h(null); 
    double d = paramJSONObject.optDouble("scale", 1.0D);
    boolean bool = paramJSONObject.optBoolean("is_transparent", true);
    int i = paramJSONObject.optInt("width", -1);
    int j = paramJSONObject.optInt("height", -1);
    if (paramBoolean)
      return dt1.h(new a3(null, Uri.parse(str), d, i, j)); 
    ot1<?> ot1 = dt1.j(this.b.d(str, d, bool), new gi0(str, d, i, j), this.g);
    return (ot1)f(paramJSONObject.optBoolean("require"), ot1, null);
  }
  
  private static <T> ot1<T> f(boolean paramBoolean, ot1<T> paramot1, T paramT) {
    return paramBoolean ? dt1.k(paramot1, new si0(paramot1), fm.f) : b(paramot1, null);
  }
  
  private static Integer j(JSONObject paramJSONObject, String paramString) {
    try {
      paramJSONObject = paramJSONObject.getJSONObject(paramString);
      int i = Color.rgb(paramJSONObject.getInt("r"), paramJSONObject.getInt("g"), paramJSONObject.getInt("b"));
      return Integer.valueOf(i);
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  public static List<du2> k(JSONObject paramJSONObject) {
    paramJSONObject = paramJSONObject.optJSONObject("mute");
    if (paramJSONObject == null)
      return zzdxd.zzazm(); 
    JSONArray jSONArray = paramJSONObject.optJSONArray("reasons");
    if (jSONArray == null || jSONArray.length() <= 0)
      return zzdxd.zzazm(); 
    ArrayList<du2> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < jSONArray.length(); b1++) {
      du2 du2 = m(jSONArray.optJSONObject(b1));
      if (du2 != null)
        arrayList.add(du2); 
    } 
    return zzdxd.zzb(arrayList);
  }
  
  public static du2 l(JSONObject paramJSONObject) {
    paramJSONObject = paramJSONObject.optJSONObject("mute");
    if (paramJSONObject == null)
      return null; 
    paramJSONObject = paramJSONObject.optJSONObject("default_reason");
    return (paramJSONObject == null) ? null : m(paramJSONObject);
  }
  
  private static du2 m(JSONObject paramJSONObject) {
    du2 du2;
    JSONObject jSONObject = null;
    if (paramJSONObject == null)
      return null; 
    String str1 = paramJSONObject.optString("reason");
    String str2 = paramJSONObject.optString("ping_url");
    paramJSONObject = jSONObject;
    if (!TextUtils.isEmpty(str1))
      if (TextUtils.isEmpty(str2)) {
        paramJSONObject = jSONObject;
      } else {
        du2 = new du2(str1, str2);
      }  
    return du2;
  }
  
  public final ot1<a3> g(JSONObject paramJSONObject, String paramString) {
    return e(paramJSONObject.optJSONObject(paramString), this.h.c);
  }
  
  public final ot1<List<a3>> h(JSONObject paramJSONObject, String paramString) {
    JSONArray jSONArray = paramJSONObject.optJSONArray(paramString);
    zzaeh zzaeh1 = this.h;
    return d(jSONArray, zzaeh1.c, zzaeh1.e);
  }
  
  public final ot1<v2> i(JSONObject paramJSONObject, String paramString) {
    JSONObject jSONObject1 = paramJSONObject.optJSONObject(paramString);
    if (jSONObject1 == null)
      return dt1.h(null); 
    JSONArray jSONArray2 = jSONObject1.optJSONArray("images");
    JSONObject jSONObject2 = jSONObject1.optJSONObject("image");
    JSONArray jSONArray1 = jSONArray2;
    if (jSONArray2 == null) {
      jSONArray1 = jSONArray2;
      if (jSONObject2 != null) {
        jSONArray1 = new JSONArray();
        jSONArray1.put(jSONObject2);
      } 
    } 
    ot1<?> ot1 = dt1.j(d(jSONArray1, false, true), new ji0(this, jSONObject1), this.g);
    return (ot1)f(jSONObject1.optBoolean("require"), ot1, null);
  }
  
  public final ot1<tq> n(JSONObject paramJSONObject) {
    x<Integer> x;
    JSONObject jSONObject = h0.d(paramJSONObject, new String[] { "html_containers", "instream" });
    if (jSONObject == null) {
      paramJSONObject = paramJSONObject.optJSONObject("video");
      if (paramJSONObject == null)
        return dt1.h(null); 
      if (TextUtils.isEmpty(paramJSONObject.optString("vast_xml"))) {
        cm.i("Required field 'vast_xml' is missing");
        return dt1.h(null);
      } 
      ot1<tq> ot11 = this.i.f(paramJSONObject);
      x = m0.r2;
      return b(dt1.d(ot11, ((Integer)er2.e().<Integer>c(x)).intValue(), TimeUnit.SECONDS, this.j), null);
    } 
    ot1<tq> ot1 = this.i.g(x.optString("base_url"), x.optString("html"));
    return dt1.k(ot1, new li0(ot1), fm.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ei0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */