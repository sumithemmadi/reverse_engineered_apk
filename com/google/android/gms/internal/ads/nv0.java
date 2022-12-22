package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class nv0 {
  private final List<zzvw> a = Collections.synchronizedList(new ArrayList<zzvw>());
  
  private final Map<String, zzvw> b = Collections.synchronizedMap(new HashMap<String, zzvw>());
  
  private nh1 c = null;
  
  public final List<zzvw> a() {
    return this.a;
  }
  
  public final void b(nh1 paramnh1, long paramLong, zzvg paramzzvg) {
    String str = paramnh1.v;
    if (!this.b.containsKey(str))
      return; 
    if (this.c == null)
      this.c = paramnh1; 
    zzvw zzvw = this.b.get(str);
    zzvw.c = paramLong;
    zzvw.d = paramzzvg;
  }
  
  public final h40 c() {
    return new h40(this.c, "", this);
  }
  
  public final void d(nh1 paramnh1) {
    String str = paramnh1.v;
    if (this.b.containsKey(str))
      return; 
    Bundle bundle = new Bundle();
    Iterator<String> iterator = paramnh1.u.keys();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      try {
        bundle.putString(str1, paramnh1.u.getString(str1));
      } catch (JSONException jSONException) {}
    } 
    zzvw zzvw = new zzvw(paramnh1.D, 0L, null, bundle);
    this.a.add(zzvw);
    this.b.put(str, zzvw);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */