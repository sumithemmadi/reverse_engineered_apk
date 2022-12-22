package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

public class l {
  private String a;
  
  private List<String> b;
  
  public static a c() {
    return new a(null);
  }
  
  public String a() {
    return this.a;
  }
  
  public List<String> b() {
    return this.b;
  }
  
  public static class a {
    private String a;
    
    private List<String> b;
    
    public l a() {
      if (this.a != null) {
        if (this.b != null) {
          l l = new l();
          l.d(l, this.a);
          l.e(l, this.b);
          return l;
        } 
        throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
      } 
      throw new IllegalArgumentException("SKU type must be set");
    }
    
    public a b(List<String> param1List) {
      this.b = new ArrayList<String>(param1List);
      return this;
    }
    
    public a c(String param1String) {
      this.a = param1String;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */