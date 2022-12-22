package com.google.android.gms.auth.b;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.auth.api.signin.internal.g;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.auth_api.f;
import com.google.android.gms.internal.auth_api.g;

public final class a {
  public static final com.google.android.gms.common.api.a.g<g> a;
  
  public static final com.google.android.gms.common.api.a.g<g> b;
  
  private static final com.google.android.gms.common.api.a.a<g, a> c;
  
  private static final com.google.android.gms.common.api.a.a<g, GoogleSignInOptions> d;
  
  @Deprecated
  public static final com.google.android.gms.common.api.a<c> e = b.c;
  
  public static final com.google.android.gms.common.api.a<a> f;
  
  public static final com.google.android.gms.common.api.a<GoogleSignInOptions> g;
  
  @Deprecated
  public static final com.google.android.gms.auth.api.proxy.a h = b.d;
  
  public static final com.google.android.gms.auth.api.credentials.a i = (com.google.android.gms.auth.api.credentials.a)new f();
  
  public static final b j = (b)new h();
  
  static {
    com.google.android.gms.common.api.a.g<g> g1 = new com.google.android.gms.common.api.a.g();
    a = g1;
    com.google.android.gms.common.api.a.g<g> g2 = new com.google.android.gms.common.api.a.g();
    b = g2;
    e e = new e();
    c = e;
    f f = new f();
    d = f;
  }
  
  static {
    f = new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", e, g1);
    g = new com.google.android.gms.common.api.a("Auth.GOOGLE_SIGN_IN_API", f, g2);
  }
  
  @Deprecated
  public static class a implements com.google.android.gms.common.api.a.d {
    public static final a b = (new a()).b();
    
    private final String c;
    
    private final boolean d;
    
    private final String e;
    
    public a(a param1a) {
      this.c = param1a.a;
      this.d = param1a.b.booleanValue();
      this.e = param1a.c;
    }
    
    public final Bundle a() {
      Bundle bundle = new Bundle();
      bundle.putString("consumer_package", this.c);
      bundle.putBoolean("force_save_dialog", this.d);
      bundle.putString("log_session_id", this.e);
      return bundle;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (r.a(this.c, ((a)param1Object).c) && this.d == ((a)param1Object).d && r.a(this.e, ((a)param1Object).e));
    }
    
    public int hashCode() {
      return r.b(new Object[] { this.c, Boolean.valueOf(this.d), this.e });
    }
    
    @Deprecated
    public static class a {
      protected String a;
      
      protected Boolean b = Boolean.FALSE;
      
      protected String c;
      
      public a() {}
      
      public a(a.a param2a) {
        this.a = a.a.b(param2a);
        this.b = Boolean.valueOf(a.a.c(param2a));
        this.c = a.a.d(param2a);
      }
      
      public a a(String param2String) {
        this.c = param2String;
        return this;
      }
      
      public a.a b() {
        return new a.a(this);
      }
    }
  }
  
  @Deprecated
  public static class a {
    protected String a;
    
    protected Boolean b = Boolean.FALSE;
    
    protected String c;
    
    public a() {}
    
    public a(a.a param1a) {
      this.a = a.a.b(param1a);
      this.b = Boolean.valueOf(a.a.c(param1a));
      this.c = a.a.d(param1a);
    }
    
    public a a(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public a.a b() {
      return new a.a(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */