package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class d0 {
  private final Collection<x<?>> a = new ArrayList<x<?>>();
  
  private final Collection<x<String>> b = new ArrayList<x<String>>();
  
  private final Collection<x<String>> c = new ArrayList<x<String>>();
  
  public final void a(SharedPreferences.Editor paramEditor, int paramInt, JSONObject paramJSONObject) {
    for (x<?> x : this.a) {
      if (x.b() == 1)
        x.i(paramEditor, x.l(paramJSONObject)); 
    } 
    if (paramJSONObject != null) {
      paramEditor.putString("flag_configuration", paramJSONObject.toString());
      return;
    } 
    cm.g("Flag Json is null.");
  }
  
  public final void b(x<?> paramx) {
    this.a.add(paramx);
  }
  
  public final void c(x<String> paramx) {
    this.b.add(paramx);
  }
  
  public final void d(x<String> paramx) {
    this.c.add(paramx);
  }
  
  public final List<String> e() {
    ArrayList<String> arrayList = new ArrayList();
    for (x<String> x : this.b) {
      String str = er2.e().<String>c(x);
      if (!TextUtils.isEmpty(str))
        arrayList.add(str); 
    } 
    arrayList.addAll(n0.b());
    return arrayList;
  }
  
  public final List<String> f() {
    List<String> list = e();
    for (x<String> x : this.c) {
      String str = er2.e().<String>c(x);
      if (!TextUtils.isEmpty(str))
        list.add(str); 
    } 
    list.addAll(n0.c());
    return list;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */