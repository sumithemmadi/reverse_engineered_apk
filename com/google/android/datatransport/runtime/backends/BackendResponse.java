package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendResponse {
  public static BackendResponse a() {
    return new b(Status.d, -1L);
  }
  
  public static BackendResponse d(long paramLong) {
    return new b(Status.b, paramLong);
  }
  
  public static BackendResponse e() {
    return new b(Status.c, -1L);
  }
  
  public abstract long b();
  
  public abstract Status c();
  
  public enum Status {
    b, c, d;
    
    static {
      Status status1 = new Status("OK", 0);
      b = status1;
      Status status2 = new Status("TRANSIENT_ERROR", 1);
      c = status2;
      Status status3 = new Status("FATAL_ERROR", 2);
      d = status3;
      e = new Status[] { status1, status2, status3 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/BackendResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */