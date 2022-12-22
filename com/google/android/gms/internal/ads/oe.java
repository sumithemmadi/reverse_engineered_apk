package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class oe {
  private final tq a;
  
  private final String b;
  
  public oe(tq paramtq) {
    this(paramtq, "");
  }
  
  public oe(tq paramtq, String paramString) {
    this.a = paramtq;
    this.b = paramString;
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject = jSONObject.put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.a.i("onSizeChanged", jSONObject);
      return;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while dispatching size change.", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject = jSONObject.put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      this.a.i("onScreenInfoChanged", jSONObject);
      return;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while obtaining screen information.", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject = jSONObject.put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.a.i("onDefaultPositionReceived", jSONObject);
      return;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while dispatching default position.", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void e(String paramString) {
    try {
      JSONObject jSONObject2 = new JSONObject();
      this();
      JSONObject jSONObject1 = jSONObject2.put("message", paramString).put("action", this.b);
      tq tq1 = this.a;
      if (tq1 != null)
        tq1.i("onError", jSONObject1); 
      return;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while dispatching error event.", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void f(String paramString) {
    try {
      JSONObject jSONObject2 = new JSONObject();
      this();
      JSONObject jSONObject1 = jSONObject2.put("js", paramString);
      this.a.i("onReadyEventReceived", jSONObject1);
      return;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while dispatching ready Event.", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void g(String paramString) {
    try {
      JSONObject jSONObject2 = new JSONObject();
      this();
      JSONObject jSONObject1 = jSONObject2.put("state", paramString);
      this.a.i("onStateChanged", jSONObject1);
      return;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while dispatching state change.", (Throwable)jSONException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */