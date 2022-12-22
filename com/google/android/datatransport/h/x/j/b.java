package com.google.android.datatransport.h.x.j;

import com.google.android.datatransport.h.h;
import com.google.android.datatransport.h.m;

final class b extends i {
  private final long a;
  
  private final m b;
  
  private final h c;
  
  b(long paramLong, m paramm, h paramh) {
    this.a = paramLong;
    if (paramm != null) {
      this.b = paramm;
      if (paramh != null) {
        this.c = paramh;
        return;
      } 
      throw new NullPointerException("Null event");
    } 
    throw new NullPointerException("Null transportContext");
  }
  
  public h b() {
    return this.c;
  }
  
  public long c() {
    return this.a;
  }
  
  public m d() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof i) {
      paramObject = paramObject;
      if (this.a != paramObject.c() || !this.b.equals(paramObject.d()) || !this.c.equals(paramObject.b()))
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    int j = (int)(l ^ l >>> 32L);
    int k = this.b.hashCode();
    return this.c.hashCode() ^ ((j ^ 0xF4243) * 1000003 ^ k) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PersistedEvent{id=");
    stringBuilder.append(this.a);
    stringBuilder.append(", transportContext=");
    stringBuilder.append(this.b);
    stringBuilder.append(", event=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */