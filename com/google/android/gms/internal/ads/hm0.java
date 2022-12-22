package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.f;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class hm0 {
  private final gm0 a;
  
  private final AtomicReference<mb> b = new AtomicReference<mb>();
  
  hm0(gm0 paramgm0) {
    this.a = paramgm0;
  }
  
  private final mb b() {
    mb mb = this.b.get();
    if (mb != null)
      return mb; 
    cm.i("Unexpected call to adapter creator.");
    throw new RemoteException();
  }
  
  private final rb f(String paramString, JSONObject paramJSONObject) {
    mb mb = b();
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
      try {
        return mb.e2(paramJSONObject.getString("class_name")) ? mb.i5("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : mb.i5("com.google.ads.mediation.customevent.CustomEventAdapter");
      } catch (JSONException jSONException) {
        cm.c("Invalid custom event.", (Throwable)jSONException);
      }  
    return mb.i5(paramString);
  }
  
  public final boolean a() {
    return (this.b.get() != null);
  }
  
  public final void c(mb parammb) {
    this.b.compareAndSet(null, parammb);
  }
  
  public final xi1 d(String paramString, JSONObject paramJSONObject) {
    try {
      rb rb;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString)) {
        rb = new jc();
        AdMobAdapter adMobAdapter = new AdMobAdapter();
        this();
        this((f)adMobAdapter);
      } else if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString)) {
        AdUrlAdapter adUrlAdapter = new AdUrlAdapter();
        this();
        rb = new jc((f)adUrlAdapter);
      } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(paramString)) {
        zzaqa zzaqa = new zzaqa();
        this();
        rb = new jc((f)zzaqa);
      } else {
        rb = f(paramString, (JSONObject)rb);
      } 
      xi1 xi1 = new xi1(rb);
      return xi1;
    } finally {
      paramString = null;
    } 
  }
  
  public final kd e(String paramString) {
    kd kd = b().g3(paramString);
    this.a.a(paramString, kd);
    return kd;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */