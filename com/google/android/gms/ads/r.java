package com.google.android.gms.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class r {
  public static final List<String> a = Arrays.asList(new String[] { "MA", "T", "PG", "G" });
  
  private final int b;
  
  private final int c;
  
  private final String d;
  
  private final List<String> e;
  
  private r(int paramInt1, int paramInt2, String paramString, List<String> paramList) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramString;
    this.e = paramList;
  }
  
  public String a() {
    String str1 = this.d;
    String str2 = str1;
    if (str1 == null)
      str2 = ""; 
    return str2;
  }
  
  public int b() {
    return this.b;
  }
  
  public int c() {
    return this.c;
  }
  
  public List<String> d() {
    return new ArrayList<String>(this.e);
  }
  
  public static class a {
    private int a = -1;
    
    private int b = -1;
    
    private String c = null;
    
    private final List<String> d = new ArrayList<String>();
    
    public r a() {
      return new r(this.a, this.b, this.c, this.d, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */