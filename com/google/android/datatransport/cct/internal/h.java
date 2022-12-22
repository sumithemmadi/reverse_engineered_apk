package com.google.android.datatransport.cct.internal;

final class h extends m {
  private final long a;
  
  h(long paramLong) {
    this.a = paramLong;
  }
  
  public long c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof m) {
      paramObject = paramObject;
      if (this.a != paramObject.c())
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    return 0xF4243 ^ (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LogResponse{nextRequestWaitMillis=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */