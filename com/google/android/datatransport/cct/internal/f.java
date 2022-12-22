package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

final class f extends k {
  private final long a;
  
  private final Integer b;
  
  private final long c;
  
  private final byte[] d;
  
  private final String e;
  
  private final long f;
  
  private final NetworkConnectionInfo g;
  
  private f(long paramLong1, Integer paramInteger, long paramLong2, byte[] paramArrayOfbyte, String paramString, long paramLong3, NetworkConnectionInfo paramNetworkConnectionInfo) {
    this.a = paramLong1;
    this.b = paramInteger;
    this.c = paramLong2;
    this.d = paramArrayOfbyte;
    this.e = paramString;
    this.f = paramLong3;
    this.g = paramNetworkConnectionInfo;
  }
  
  public Integer b() {
    return this.b;
  }
  
  public long c() {
    return this.a;
  }
  
  public long d() {
    return this.c;
  }
  
  public NetworkConnectionInfo e() {
    return this.g;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof k) {
      k k1 = (k)paramObject;
      if (this.a == k1.c()) {
        paramObject = this.b;
        if (((paramObject == null) ? (k1.b() == null) : paramObject.equals(k1.b())) && this.c == k1.d()) {
          byte[] arrayOfByte = this.d;
          if (k1 instanceof f) {
            paramObject = ((f)k1).d;
          } else {
            paramObject = k1.f();
          } 
          if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {
            paramObject = this.e;
            if (((paramObject == null) ? (k1.g() == null) : paramObject.equals(k1.g())) && this.f == k1.h()) {
              paramObject = this.g;
              if ((paramObject == null) ? (k1.e() == null) : paramObject.equals(k1.e()))
                return bool; 
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public byte[] f() {
    return this.d;
  }
  
  public String g() {
    return this.e;
  }
  
  public long h() {
    return this.f;
  }
  
  public int hashCode() {
    int m;
    int i2;
    long l = this.a;
    int i = (int)(l ^ l >>> 32L);
    Integer integer = this.b;
    int j = 0;
    if (integer == null) {
      m = 0;
    } else {
      m = integer.hashCode();
    } 
    l = this.c;
    int n = (int)(l ^ l >>> 32L);
    int i1 = Arrays.hashCode(this.d);
    String str = this.e;
    if (str == null) {
      i2 = 0;
    } else {
      i2 = str.hashCode();
    } 
    l = this.f;
    int i3 = (int)(l >>> 32L ^ l);
    NetworkConnectionInfo networkConnectionInfo = this.g;
    if (networkConnectionInfo != null)
      j = networkConnectionInfo.hashCode(); 
    return ((((((i ^ 0xF4243) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LogEvent{eventTimeMs=");
    stringBuilder.append(this.a);
    stringBuilder.append(", eventCode=");
    stringBuilder.append(this.b);
    stringBuilder.append(", eventUptimeMs=");
    stringBuilder.append(this.c);
    stringBuilder.append(", sourceExtension=");
    stringBuilder.append(Arrays.toString(this.d));
    stringBuilder.append(", sourceExtensionJsonProto3=");
    stringBuilder.append(this.e);
    stringBuilder.append(", timezoneOffsetSeconds=");
    stringBuilder.append(this.f);
    stringBuilder.append(", networkConnectionInfo=");
    stringBuilder.append(this.g);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends k.a {
    private Long a;
    
    private Integer b;
    
    private Long c;
    
    private byte[] d;
    
    private String e;
    
    private Long f;
    
    private NetworkConnectionInfo g;
    
    public k a() {
      Long long_ = this.a;
      String str2 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" eventTimeMs");
        str2 = stringBuilder1.toString();
      } 
      String str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" eventUptimeMs");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.f == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" timezoneOffsetSeconds");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new f(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public k.a b(Integer param1Integer) {
      this.b = param1Integer;
      return this;
    }
    
    public k.a c(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public k.a d(long param1Long) {
      this.c = Long.valueOf(param1Long);
      return this;
    }
    
    public k.a e(NetworkConnectionInfo param1NetworkConnectionInfo) {
      this.g = param1NetworkConnectionInfo;
      return this;
    }
    
    k.a f(byte[] param1ArrayOfbyte) {
      this.d = param1ArrayOfbyte;
      return this;
    }
    
    k.a g(String param1String) {
      this.e = param1String;
      return this;
    }
    
    public k.a h(long param1Long) {
      this.f = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */