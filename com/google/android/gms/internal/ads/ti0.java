package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ti0 {
  private final Executor a;
  
  private final ei0 b;
  
  public ti0(Executor paramExecutor, ei0 paramei0) {
    this.a = paramExecutor;
    this.b = paramei0;
  }
  
  public final ot1<List<yi0>> a(JSONObject paramJSONObject, String paramString) {
    JSONArray jSONArray = paramJSONObject.optJSONArray(paramString);
    if (jSONArray == null)
      return dt1.h(Collections.emptyList()); 
    ArrayList<JSONObject> arrayList = new ArrayList();
    int i = jSONArray.length();
    for (byte b = 0; b < i; b++) {
      paramJSONObject = jSONArray.optJSONObject(b);
      if (paramJSONObject != null) {
        String str = paramJSONObject.optString("name");
        if (str != null) {
          ot1<?> ot11;
          boolean bool;
          String str1 = paramJSONObject.optString("type");
          if ("string".equals(str1)) {
            bool = true;
          } else if ("image".equals(str1)) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool != true) {
            if (bool == 2) {
              ot11 = dt1.j(this.b.g(paramJSONObject, "image_value"), new vi0(str), this.a);
              continue;
            } 
          } else {
            ot11 = dt1.h(new yi0(str, ot11.optString("string_value")));
            continue;
          } 
        } 
      } 
      ot1<?> ot1 = dt1.h(null);
      continue;
      arrayList.add(paramJSONObject);
    } 
    return dt1.j(dt1.n((Iterable)arrayList), wi0.a, this.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ti0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */