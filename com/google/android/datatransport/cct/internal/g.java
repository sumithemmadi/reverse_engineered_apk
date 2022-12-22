package com.google.android.datatransport.cct.internal;

import java.util.List;

final class g extends l {
  private final long a;
  
  private final long b;
  
  private final ClientInfo c;
  
  private final Integer d;
  
  private final String e;
  
  private final List<k> f;
  
  private final QosTier g;
  
  private g(long paramLong1, long paramLong2, ClientInfo paramClientInfo, Integer paramInteger, String paramString, List<k> paramList, QosTier paramQosTier) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramClientInfo;
    this.d = paramInteger;
    this.e = paramString;
    this.f = paramList;
    this.g = paramQosTier;
  }
  
  public ClientInfo b() {
    return this.c;
  }
  
  public List<k> c() {
    return this.f;
  }
  
  public Integer d() {
    return this.d;
  }
  
  public String e() {
    return this.e;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof l) {
      paramObject = paramObject;
      if (this.a == paramObject.g() && this.b == paramObject.h()) {
        ClientInfo clientInfo = this.c;
        if ((clientInfo == null) ? (paramObject.b() == null) : clientInfo.equals(paramObject.b())) {
          Integer integer = this.d;
          if ((integer == null) ? (paramObject.d() == null) : integer.equals(paramObject.d())) {
            String str = this.e;
            if ((str == null) ? (paramObject.e() == null) : str.equals(paramObject.e())) {
              List<k> list = this.f;
              if ((list == null) ? (paramObject.c() == null) : list.equals(paramObject.c())) {
                QosTier qosTier = this.g;
                if ((qosTier == null) ? (paramObject.f() == null) : qosTier.equals(paramObject.f()))
                  return bool; 
              } 
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public QosTier f() {
    return this.g;
  }
  
  public long g() {
    return this.a;
  }
  
  public long h() {
    return this.b;
  }
  
  public int hashCode() {
    int m;
    int n;
    int i1;
    int i2;
    long l1 = this.a;
    int i = (int)(l1 ^ l1 >>> 32L);
    l1 = this.b;
    int j = (int)(l1 ^ l1 >>> 32L);
    ClientInfo clientInfo = this.c;
    int k = 0;
    if (clientInfo == null) {
      m = 0;
    } else {
      m = clientInfo.hashCode();
    } 
    Integer integer = this.d;
    if (integer == null) {
      n = 0;
    } else {
      n = integer.hashCode();
    } 
    String str = this.e;
    if (str == null) {
      i1 = 0;
    } else {
      i1 = str.hashCode();
    } 
    List<k> list = this.f;
    if (list == null) {
      i2 = 0;
    } else {
      i2 = list.hashCode();
    } 
    QosTier qosTier = this.g;
    if (qosTier != null)
      k = qosTier.hashCode(); 
    return ((((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ k;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LogRequest{requestTimeMs=");
    stringBuilder.append(this.a);
    stringBuilder.append(", requestUptimeMs=");
    stringBuilder.append(this.b);
    stringBuilder.append(", clientInfo=");
    stringBuilder.append(this.c);
    stringBuilder.append(", logSource=");
    stringBuilder.append(this.d);
    stringBuilder.append(", logSourceName=");
    stringBuilder.append(this.e);
    stringBuilder.append(", logEvents=");
    stringBuilder.append(this.f);
    stringBuilder.append(", qosTier=");
    stringBuilder.append(this.g);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends l.a {
    private Long a;
    
    private Long b;
    
    private ClientInfo c;
    
    private Integer d;
    
    private String e;
    
    private List<k> f;
    
    private QosTier g;
    
    public l a() {
      Long long_ = this.a;
      String str2 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" requestTimeMs");
        str2 = stringBuilder1.toString();
      } 
      String str1 = str2;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" requestUptimeMs");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new g(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public l.a b(ClientInfo param1ClientInfo) {
      this.c = param1ClientInfo;
      return this;
    }
    
    public l.a c(List<k> param1List) {
      this.f = param1List;
      return this;
    }
    
    l.a d(Integer param1Integer) {
      this.d = param1Integer;
      return this;
    }
    
    l.a e(String param1String) {
      this.e = param1String;
      return this;
    }
    
    public l.a f(QosTier param1QosTier) {
      this.g = param1QosTier;
      return this;
    }
    
    public l.a g(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public l.a h(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */