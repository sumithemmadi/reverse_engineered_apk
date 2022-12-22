package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class qw implements ka<vw> {
  private final Context a;
  
  private final vk2 b;
  
  private final PowerManager c;
  
  public qw(Context paramContext, vk2 paramvk2) {
    this.a = paramContext;
    this.b = paramvk2;
    this.c = (PowerManager)paramContext.getSystemService("power");
  }
  
  public final JSONObject b(vw paramvw) {
    JSONObject jSONObject1;
    JSONException jSONException;
    JSONArray jSONArray = new JSONArray();
    JSONObject jSONObject2 = new JSONObject();
    zk2 zk2 = paramvw.f;
    if (zk2 == null) {
      jSONObject1 = new JSONObject();
    } else {
      if (this.b.e() != null) {
        boolean bool2;
        boolean bool1 = zk2.c;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3.put("afmaVersion", this.b.d()).put("activeViewJSON", this.b.e()).put("timestamp", ((vw)jSONObject1).d).put("adFormat", this.b.c()).put("hashCode", this.b.a()).put("isMraid", false).put("isStopped", false).put("isPaused", ((vw)jSONObject1).b).put("isNative", this.b.b());
        if (Build.VERSION.SDK_INT >= 20) {
          bool2 = this.c.isInteractive();
        } else {
          bool2 = this.c.isScreenOn();
        } 
        jSONObject4.put("isScreenOn", bool2).put("appMuted", q.h().e()).put("appVolume", q.h().d()).put("deviceVolume", f.c(this.a.getApplicationContext()));
        rect = new Rect();
        Display display = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        rect.right = display.getWidth();
        rect.bottom = display.getHeight();
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        jSONObject3.put("windowVisibility", zk2.d).put("isAttachedToWindow", bool1).put("viewBox", (new JSONObject()).put("top", zk2.e.top).put("bottom", zk2.e.bottom).put("left", zk2.e.left).put("right", zk2.e.right)).put("adBox", (new JSONObject()).put("top", zk2.f.top).put("bottom", zk2.f.bottom).put("left", zk2.f.left).put("right", zk2.f.right)).put("globalVisibleBox", (new JSONObject()).put("top", zk2.g.top).put("bottom", zk2.g.bottom).put("left", zk2.g.left).put("right", zk2.g.right)).put("globalVisibleBoxVisible", zk2.h).put("localVisibleBox", (new JSONObject()).put("top", zk2.i.top).put("bottom", zk2.i.bottom).put("left", zk2.i.left).put("right", zk2.i.right)).put("localVisibleBoxVisible", zk2.j).put("hitBox", (new JSONObject()).put("top", zk2.k.top).put("bottom", zk2.k.bottom).put("left", zk2.k.left).put("right", zk2.k.right)).put("screenDensity", displayMetrics.density);
        jSONObject3.put("isVisible", ((vw)jSONObject1).a);
        x<Boolean> x = m0.l1;
        if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
          JSONArray jSONArray1 = new JSONArray();
          List<Rect> list = zk2.n;
          if (list != null)
            for (Rect rect : list)
              jSONArray1.put((new JSONObject()).put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));  
          jSONObject3.put("scrollableContainerBoxes", jSONArray1);
        } 
        if (!TextUtils.isEmpty(((vw)jSONObject1).e))
          jSONObject3.put("doneReasonCode", "u"); 
        jSONObject1 = jSONObject3;
        jSONArray.put(jSONObject1);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
      } 
      jSONException = new JSONException("Active view Info cannot be null.");
      throw jSONException;
    } 
    jSONArray.put(jSONException);
    jSONObject2.put("units", jSONArray);
    return jSONObject2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */