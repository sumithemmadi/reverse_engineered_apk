package com.android.billingclient.api;

public final class g {
  private int a;
  
  private String b;
  
  public static a c() {
    return new a(null);
  }
  
  public String a() {
    return this.b;
  }
  
  public int b() {
    return this.a;
  }
  
  public static class a {
    private int a;
    
    private String b = "";
    
    public g a() {
      g g = new g();
      g.d(g, this.a);
      g.e(g, this.b);
      return g;
    }
    
    public a b(String param1String) {
      this.b = param1String;
      return this;
    }
    
    public a c(int param1Int) {
      this.a = param1Int;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */