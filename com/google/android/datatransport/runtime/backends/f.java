package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.h.h;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class f {
  public static a a() {
    return new a.b();
  }
  
  public abstract Iterable<h> b();
  
  public abstract byte[] c();
  
  @Builder
  public static abstract class a {
    public abstract f a();
    
    public abstract a b(Iterable<h> param1Iterable);
    
    public abstract a c(byte[] param1ArrayOfbyte);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */