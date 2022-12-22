package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f7 implements x6<Object> {
  private final Object a = new Object();
  
  private final Map<String, h7> b = new HashMap<String, h7>();
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    String str1 = paramMap.get("id");
    String str2 = paramMap.get("fail");
    paramObject = paramMap.get("fail_reason");
    String str3 = paramMap.get("fail_stack");
    String str4 = paramMap.get("result");
    Object object = paramObject;
    if (TextUtils.isEmpty(str3))
      object = "Unknown Fail Reason."; 
    if (TextUtils.isEmpty(str3)) {
      paramObject = "";
    } else {
      paramObject = String.valueOf(str3);
      if (paramObject.length() != 0) {
        paramObject = "\n".concat((String)paramObject);
      } else {
        paramObject = new String("\n");
      } 
    } 
    synchronized (this.a) {
      h7 h7 = this.b.remove(str1);
      if (h7 == null) {
        paramObject = String.valueOf(str1);
        if (paramObject.length() != 0) {
          paramObject = "Received result for unexpected method invocation: ".concat((String)paramObject);
        } else {
          paramObject = new String("Received result for unexpected method invocation: ");
        } 
        cm.i((String)paramObject);
        return;
      } 
      if (!TextUtils.isEmpty(str2)) {
        object = String.valueOf(object);
        paramObject = String.valueOf(paramObject);
        if (paramObject.length() != 0) {
          paramObject = object.concat((String)paramObject);
        } else {
          paramObject = new String((String)object);
        } 
        h7.Q((String)paramObject);
        return;
      } 
      if (str4 == null) {
        h7.a(null);
        return;
      } 
      try {
        object = new JSONObject();
        super(str4);
        if (b1.n()) {
          paramObject = String.valueOf(object.toString(2));
          if (paramObject.length() != 0) {
            paramObject = "Result GMSG: ".concat((String)paramObject);
          } else {
            paramObject = new String("Result GMSG: ");
          } 
          b1.m((String)paramObject);
        } 
        h7.a((JSONObject)object);
      } catch (JSONException jSONException) {
        h7.Q(jSONException.getMessage());
      } 
      return;
    } 
  }
  
  public final <EngineT extends e9> ot1<JSONObject> b(EngineT paramEngineT, String paramString, JSONObject paramJSONObject) {
    sm<JSONObject> sm = new sm();
    q.c();
    String str = h1.x0();
    c(str, new e7(this, sm));
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("id", str);
      jSONObject.put("args", paramJSONObject);
      paramEngineT.S(paramString, jSONObject);
    } catch (Exception exception) {
      sm.d(exception);
    } 
    return sm;
  }
  
  public final void c(String paramString, h7 paramh7) {
    synchronized (this.a) {
      this.b.put(paramString, paramh7);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */