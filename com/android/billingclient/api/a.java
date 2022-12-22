package com.android.billingclient.api;

public final class a {
  private String a;
  
  public static a b() {
    return new a(null);
  }
  
  public String a() {
    return this.a;
  }
  
  public static final class a {
    private String a;
    
    public a a() {
      if (this.a != null) {
        a a1 = new a(null);
        a.c(a1, this.a);
        return a1;
      } 
      throw new IllegalArgumentException("Purchase token must be set");
    }
    
    public a b(String param1String) {
      this.a = param1String;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */