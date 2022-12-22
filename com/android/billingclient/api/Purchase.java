package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class Purchase {
  private final String a;
  
  private final String b;
  
  private final JSONObject c;
  
  public Purchase(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = new JSONObject(paramString1);
  }
  
  public String a() {
    return this.a;
  }
  
  public int b() {
    return (this.c.optInt("purchaseState", 1) != 4) ? 1 : 2;
  }
  
  public long c() {
    return this.c.optLong("purchaseTime");
  }
  
  public String d() {
    JSONObject jSONObject = this.c;
    return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
  }
  
  public String e() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Purchase))
      return false; 
    paramObject = paramObject;
    return (TextUtils.equals(this.a, paramObject.a()) && TextUtils.equals(this.b, paramObject.e()));
  }
  
  public String f() {
    return this.c.optString("productId");
  }
  
  public boolean g() {
    return this.c.optBoolean("acknowledged", true);
  }
  
  public boolean h() {
    return this.c.optBoolean("autoRenewing");
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    String str = String.valueOf(this.a);
    if (str.length() != 0) {
      str = "Purchase. Json: ".concat(str);
    } else {
      str = new String("Purchase. Json: ");
    } 
    return str;
  }
  
  public static class a {
    private final List<Purchase> a;
    
    private final g b;
    
    public a(g param1g, List<Purchase> param1List) {
      this.a = param1List;
      this.b = param1g;
    }
    
    public g a() {
      return this.b;
    }
    
    public List<Purchase> b() {
      return this.a;
    }
    
    public int c() {
      return a().b();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/Purchase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */