package com.google.android.gms.ads.nonagon.transaction.omid;

import org.json.JSONObject;

public class a {
  private final JSONObject a;
  
  public a(JSONObject paramJSONObject) {
    this.a = paramJSONObject;
  }
  
  public OmidMediaType a() {
    int i = this.a.optInt("media_type", -1);
    return (i != 0) ? ((i != 1) ? OmidMediaType.d : OmidMediaType.b) : OmidMediaType.c;
  }
  
  public String b() {
    return (b.a[a().ordinal()] != 1) ? "javascript" : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/nonagon/transaction/omid/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */