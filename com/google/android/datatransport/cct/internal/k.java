package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class k {
  private static a a() {
    return new f.b();
  }
  
  public static a i(String paramString) {
    return a().g(paramString);
  }
  
  public static a j(byte[] paramArrayOfbyte) {
    return a().f(paramArrayOfbyte);
  }
  
  public abstract Integer b();
  
  public abstract long c();
  
  public abstract long d();
  
  public abstract NetworkConnectionInfo e();
  
  public abstract byte[] f();
  
  public abstract String g();
  
  public abstract long h();
  
  @Builder
  public static abstract class a {
    public abstract k a();
    
    public abstract a b(Integer param1Integer);
    
    public abstract a c(long param1Long);
    
    public abstract a d(long param1Long);
    
    public abstract a e(NetworkConnectionInfo param1NetworkConnectionInfo);
    
    abstract a f(byte[] param1ArrayOfbyte);
    
    abstract a g(String param1String);
    
    public abstract a h(long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */