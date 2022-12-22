package com.google.android.datatransport.h;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class h {
  public static a a() {
    return (new a.b()).f(new HashMap<String, String>());
  }
  
  public final String b(String paramString) {
    String str = c().get(paramString);
    paramString = str;
    if (str == null)
      paramString = ""; 
    return paramString;
  }
  
  protected abstract Map<String, String> c();
  
  public abstract Integer d();
  
  public abstract g e();
  
  public abstract long f();
  
  public final int g(String paramString) {
    int i;
    paramString = c().get(paramString);
    if (paramString == null) {
      i = 0;
    } else {
      i = Integer.valueOf(paramString).intValue();
    } 
    return i;
  }
  
  public final long h(String paramString) {
    long l;
    paramString = c().get(paramString);
    if (paramString == null) {
      l = 0L;
    } else {
      l = Long.valueOf(paramString).longValue();
    } 
    return l;
  }
  
  public final Map<String, String> i() {
    return Collections.unmodifiableMap(c());
  }
  
  public abstract String j();
  
  public abstract long k();
  
  public a l() {
    return (new a.b()).j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap<String, String>(c()));
  }
  
  @Builder
  public static abstract class a {
    public final a a(String param1String, int param1Int) {
      e().put(param1String, String.valueOf(param1Int));
      return this;
    }
    
    public final a b(String param1String, long param1Long) {
      e().put(param1String, String.valueOf(param1Long));
      return this;
    }
    
    public final a c(String param1String1, String param1String2) {
      e().put(param1String1, param1String2);
      return this;
    }
    
    public abstract h d();
    
    protected abstract Map<String, String> e();
    
    protected abstract a f(Map<String, String> param1Map);
    
    public abstract a g(Integer param1Integer);
    
    public abstract a h(g param1g);
    
    public abstract a i(long param1Long);
    
    public abstract a j(String param1String);
    
    public abstract a k(long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */