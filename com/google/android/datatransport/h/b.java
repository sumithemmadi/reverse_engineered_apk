package com.google.android.datatransport.h;

import com.google.android.datatransport.c;
import com.google.android.datatransport.d;

final class b extends l {
  private final m a;
  
  private final String b;
  
  private final c<?> c;
  
  private final d<?, byte[]> d;
  
  private final com.google.android.datatransport.b e;
  
  private b(m paramm, String paramString, c<?> paramc, d<?, byte[]> paramd, com.google.android.datatransport.b paramb) {
    this.a = paramm;
    this.b = paramString;
    this.c = paramc;
    this.d = paramd;
    this.e = paramb;
  }
  
  public com.google.android.datatransport.b b() {
    return this.e;
  }
  
  c<?> c() {
    return this.c;
  }
  
  d<?, byte[]> e() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof l) {
      paramObject = paramObject;
      if (!this.a.equals(paramObject.f()) || !this.b.equals(paramObject.g()) || !this.c.equals(paramObject.c()) || !this.d.equals(paramObject.e()) || !this.e.equals(paramObject.b()))
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public m f() {
    return this.a;
  }
  
  public String g() {
    return this.b;
  }
  
  public int hashCode() {
    return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SendRequest{transportContext=");
    stringBuilder.append(this.a);
    stringBuilder.append(", transportName=");
    stringBuilder.append(this.b);
    stringBuilder.append(", event=");
    stringBuilder.append(this.c);
    stringBuilder.append(", transformer=");
    stringBuilder.append(this.d);
    stringBuilder.append(", encoding=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends l.a {
    private m a;
    
    private String b;
    
    private c<?> c;
    
    private d<?, byte[]> d;
    
    private com.google.android.datatransport.b e;
    
    public l a() {
      m m1 = this.a;
      String str2 = "";
      if (m1 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" transportContext");
        str2 = stringBuilder1.toString();
      } 
      String str1 = str2;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" transportName");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" event");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.d == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" transformer");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" encoding");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new b(this.a, this.b, this.c, this.d, this.e, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    l.a b(com.google.android.datatransport.b param1b) {
      if (param1b != null) {
        this.e = param1b;
        return this;
      } 
      throw new NullPointerException("Null encoding");
    }
    
    l.a c(c<?> param1c) {
      if (param1c != null) {
        this.c = param1c;
        return this;
      } 
      throw new NullPointerException("Null event");
    }
    
    l.a d(d<?, byte[]> param1d) {
      if (param1d != null) {
        this.d = param1d;
        return this;
      } 
      throw new NullPointerException("Null transformer");
    }
    
    public l.a e(m param1m) {
      if (param1m != null) {
        this.a = param1m;
        return this;
      } 
      throw new NullPointerException("Null transportContext");
    }
    
    public l.a f(String param1String) {
      if (param1String != null) {
        this.b = param1String;
        return this;
      } 
      throw new NullPointerException("Null transportName");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */