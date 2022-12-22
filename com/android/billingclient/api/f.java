package com.android.billingclient.api;

import java.util.ArrayList;

public class f {
  private boolean a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private int f = 0;
  
  private ArrayList<SkuDetails> g;
  
  private boolean h;
  
  public static a e() {
    return new a(null);
  }
  
  public String a() {
    return this.c;
  }
  
  public String b() {
    return this.d;
  }
  
  public int c() {
    return this.f;
  }
  
  public boolean d() {
    return this.h;
  }
  
  public final ArrayList<SkuDetails> f() {
    ArrayList<SkuDetails> arrayList = new ArrayList();
    arrayList.addAll(this.g);
    return arrayList;
  }
  
  public final String g() {
    return this.b;
  }
  
  final boolean h() {
    return (this.h || this.b != null || this.e != null || this.f != 0 || this.a);
  }
  
  public final String i() {
    return this.e;
  }
  
  public static class a {
    private String a;
    
    private String b;
    
    private String c;
    
    private String d;
    
    private int e = 0;
    
    private ArrayList<SkuDetails> f;
    
    private boolean g;
    
    public f a() {
      ArrayList<SkuDetails> arrayList = this.f;
      if (arrayList != null && !arrayList.isEmpty()) {
        arrayList = this.f;
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          if ((SkuDetails)arrayList.get(b) != null) {
            b++;
            continue;
          } 
          throw new IllegalArgumentException("SKU cannot be null.");
        } 
        if (this.f.size() > 1) {
          SkuDetails skuDetails = this.f.get(0);
          String str1 = skuDetails.d();
          ArrayList<SkuDetails> arrayList2 = this.f;
          i = arrayList2.size();
          b = 0;
          while (b < i) {
            SkuDetails skuDetails1 = arrayList2.get(b);
            if (str1.equals("play_pass_subs") || skuDetails1.d().equals("play_pass_subs") || str1.equals(skuDetails1.d())) {
              b++;
              continue;
            } 
            throw new IllegalArgumentException("SKUs should have the same type.");
          } 
          String str2 = skuDetails.e();
          ArrayList<SkuDetails> arrayList1 = this.f;
          i = arrayList1.size();
          b = 0;
          while (b < i) {
            SkuDetails skuDetails1 = arrayList1.get(b);
            if (str1.equals("play_pass_subs") || skuDetails1.d().equals("play_pass_subs") || str2.equals(skuDetails1.e())) {
              b++;
              continue;
            } 
            throw new IllegalArgumentException("All SKUs must have the same package name.");
          } 
        } 
        f f = new f(null);
        f.j(f, true ^ ((SkuDetails)this.f.get(0)).e().isEmpty());
        f.k(f, this.a);
        f.l(f, this.d);
        f.m(f, this.b);
        f.n(f, this.c);
        f.o(f, this.e);
        f.p(f, this.f);
        f.q(f, this.g);
        return f;
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SkuDetails must be provided.");
      throw illegalArgumentException;
    }
    
    public a b(SkuDetails param1SkuDetails) {
      ArrayList<SkuDetails> arrayList = new ArrayList();
      arrayList.add(param1SkuDetails);
      this.f = arrayList;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */