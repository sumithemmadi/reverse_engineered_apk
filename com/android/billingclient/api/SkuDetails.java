package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

public class SkuDetails {
  private final String a;
  
  private final JSONObject b;
  
  public SkuDetails(String paramString) {
    this.a = paramString;
    JSONObject jSONObject = new JSONObject(paramString);
    this.b = jSONObject;
    if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
      if (!TextUtils.isEmpty(jSONObject.optString("type")))
        return; 
      throw new IllegalArgumentException("SkuType cannot be empty.");
    } 
    throw new IllegalArgumentException("SKU cannot be empty.");
  }
  
  public String a() {
    return this.a;
  }
  
  public String b() {
    return this.b.optString("price");
  }
  
  public String c() {
    return this.b.optString("productId");
  }
  
  public String d() {
    return this.b.optString("type");
  }
  
  public final String e() {
    return this.b.optString("packageName");
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof SkuDetails))
      return false; 
    paramObject = paramObject;
    return TextUtils.equals(this.a, ((SkuDetails)paramObject).a);
  }
  
  final String f() {
    return this.b.optString("skuDetailsToken");
  }
  
  public String g() {
    return this.b.optString("offer_id");
  }
  
  public int h() {
    return this.b.optInt("offer_type");
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    String str = String.valueOf(this.a);
    if (str.length() != 0) {
      str = "SkuDetails: ".concat(str);
    } else {
      str = new String("SkuDetails: ");
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/SkuDetails.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */