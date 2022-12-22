package com.google.android.datatransport.runtime.backends;

final class b extends BackendResponse {
  private final BackendResponse.Status a;
  
  private final long b;
  
  b(BackendResponse.Status paramStatus, long paramLong) {
    if (paramStatus != null) {
      this.a = paramStatus;
      this.b = paramLong;
      return;
    } 
    throw new NullPointerException("Null status");
  }
  
  public long b() {
    return this.b;
  }
  
  public BackendResponse.Status c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof BackendResponse) {
      paramObject = paramObject;
      if (!this.a.equals(paramObject.c()) || this.b != paramObject.b())
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public int hashCode() {
    int i = this.a.hashCode();
    long l = this.b;
    return (i ^ 0xF4243) * 1000003 ^ (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("BackendResponse{status=");
    stringBuilder.append(this.a);
    stringBuilder.append(", nextRequestWaitMillis=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */