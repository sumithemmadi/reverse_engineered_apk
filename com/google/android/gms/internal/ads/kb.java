package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class kb {
  public static List<String> a(JSONObject paramJSONObject, String paramString) {
    JSONArray jSONArray = paramJSONObject.optJSONArray(paramString);
    if (jSONArray != null) {
      ArrayList<String> arrayList = new ArrayList(jSONArray.length());
      for (byte b = 0; b < jSONArray.length(); b++)
        arrayList.add(jSONArray.getString(b)); 
      return Collections.unmodifiableList(arrayList);
    } 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */