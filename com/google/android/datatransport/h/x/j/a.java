package com.google.android.datatransport.h.x.j;

final class a extends d {
  private final long b;
  
  private final int c;
  
  private final int d;
  
  private final long e;
  
  private final int f;
  
  private a(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3) {
    this.b = paramLong1;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramLong2;
    this.f = paramInt3;
  }
  
  int b() {
    return this.d;
  }
  
  long c() {
    return this.e;
  }
  
  int d() {
    return this.c;
  }
  
  int e() {
    return this.f;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
      if (this.b != paramObject.f() || this.c != paramObject.d() || this.d != paramObject.b() || this.e != paramObject.c() || this.f != paramObject.e())
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  long f() {
    return this.b;
  }
  
  public int hashCode() {
    long l = this.b;
    int i = (int)(l ^ l >>> 32L);
    int j = this.c;
    int k = this.d;
    l = this.e;
    int m = (int)(l ^ l >>> 32L);
    return this.f ^ ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EventStoreConfig{maxStorageSizeInBytes=");
    stringBuilder.append(this.b);
    stringBuilder.append(", loadBatchSize=");
    stringBuilder.append(this.c);
    stringBuilder.append(", criticalSectionEnterTimeoutMs=");
    stringBuilder.append(this.d);
    stringBuilder.append(", eventCleanUpAge=");
    stringBuilder.append(this.e);
    stringBuilder.append(", maxBlobByteSizePerRow=");
    stringBuilder.append(this.f);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends d.a {
    private Long a;
    
    private Integer b;
    
    private Integer c;
    
    private Long d;
    
    private Integer e;
    
    d a() {
      Long long_ = this.a;
      String str2 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" maxStorageSizeInBytes");
        str2 = stringBuilder1.toString();
      } 
      String str1 = str2;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" loadBatchSize");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" criticalSectionEnterTimeoutMs");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.d == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" eventCleanUpAge");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" maxBlobByteSizePerRow");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new a(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue(), null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    d.a b(int param1Int) {
      this.c = Integer.valueOf(param1Int);
      return this;
    }
    
    d.a c(long param1Long) {
      this.d = Long.valueOf(param1Long);
      return this;
    }
    
    d.a d(int param1Int) {
      this.b = Integer.valueOf(param1Int);
      return this;
    }
    
    d.a e(int param1Int) {
      this.e = Integer.valueOf(param1Int);
      return this;
    }
    
    d.a f(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */