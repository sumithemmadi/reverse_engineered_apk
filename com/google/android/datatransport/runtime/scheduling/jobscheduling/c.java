package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.h.y.a;
import java.util.Map;

final class c extends SchedulerConfig {
  private final a a;
  
  private final Map<Priority, SchedulerConfig.b> b;
  
  c(a parama, Map<Priority, SchedulerConfig.b> paramMap) {
    if (parama != null) {
      this.a = parama;
      if (paramMap != null) {
        this.b = paramMap;
        return;
      } 
      throw new NullPointerException("Null values");
    } 
    throw new NullPointerException("Null clock");
  }
  
  a e() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof SchedulerConfig) {
      paramObject = paramObject;
      if (!this.a.equals(paramObject.e()) || !this.b.equals(paramObject.h()))
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  Map<Priority, SchedulerConfig.b> h() {
    return this.b;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SchedulerConfig{clock=");
    stringBuilder.append(this.a);
    stringBuilder.append(", values=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */