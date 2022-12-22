package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

final class d extends SchedulerConfig.b {
  private final long a;
  
  private final long b;
  
  private final Set<SchedulerConfig.Flag> c;
  
  private d(long paramLong1, long paramLong2, Set<SchedulerConfig.Flag> paramSet) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramSet;
  }
  
  long b() {
    return this.a;
  }
  
  Set<SchedulerConfig.Flag> c() {
    return this.c;
  }
  
  long d() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof SchedulerConfig.b) {
      paramObject = paramObject;
      if (this.a != paramObject.b() || this.b != paramObject.d() || !this.c.equals(paramObject.c()))
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    int i = (int)(l ^ l >>> 32L);
    l = this.b;
    int j = (int)(l ^ l >>> 32L);
    return this.c.hashCode() ^ ((i ^ 0xF4243) * 1000003 ^ j) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ConfigValue{delta=");
    stringBuilder.append(this.a);
    stringBuilder.append(", maxAllowedDelay=");
    stringBuilder.append(this.b);
    stringBuilder.append(", flags=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends SchedulerConfig.b.a {
    private Long a;
    
    private Long b;
    
    private Set<SchedulerConfig.Flag> c;
    
    public SchedulerConfig.b a() {
      Long long_ = this.a;
      String str2 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" delta");
        str2 = stringBuilder1.toString();
      } 
      String str1 = str2;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" maxAllowedDelay");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" flags");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new d(this.a.longValue(), this.b.longValue(), this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public SchedulerConfig.b.a b(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public SchedulerConfig.b.a c(Set<SchedulerConfig.Flag> param1Set) {
      if (param1Set != null) {
        this.c = param1Set;
        return this;
      } 
      throw new NullPointerException("Null flags");
    }
    
    public SchedulerConfig.b.a d(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */