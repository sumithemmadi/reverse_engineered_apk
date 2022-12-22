package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.List;

@AutoValue
public abstract class l {
  public static a a() {
    return new g.b();
  }
  
  public abstract ClientInfo b();
  
  public abstract List<k> c();
  
  public abstract Integer d();
  
  public abstract String e();
  
  public abstract QosTier f();
  
  public abstract long g();
  
  public abstract long h();
  
  @Builder
  public static abstract class a {
    public abstract l a();
    
    public abstract a b(ClientInfo param1ClientInfo);
    
    public abstract a c(List<k> param1List);
    
    abstract a d(Integer param1Integer);
    
    abstract a e(String param1String);
    
    public abstract a f(QosTier param1QosTier);
    
    public abstract a g(long param1Long);
    
    public abstract a h(long param1Long);
    
    public a i(int param1Int) {
      return d(Integer.valueOf(param1Int));
    }
    
    public a j(String param1String) {
      return e(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */