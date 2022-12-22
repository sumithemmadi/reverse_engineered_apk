package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.t;
import java.util.Set;

public final class a<O extends a.d> {
  private final a<?, O> a;
  
  private final g<?> b;
  
  private final String c;
  
  public <C extends f> a(String paramString, a<C, O> parama, g<C> paramg) {
    t.k(parama, "Cannot construct an Api with a null ClientBuilder");
    t.k(paramg, "Cannot construct an Api with a null ClientKey");
    this.c = paramString;
    this.a = parama;
    this.b = paramg;
  }
  
  public final c<?> a() {
    g<?> g1 = this.b;
    if (g1 != null)
      return g1; 
    throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
  }
  
  public final String b() {
    return this.c;
  }
  
  public final a<?, O> c() {
    boolean bool;
    if (this.a != null) {
      bool = true;
    } else {
      bool = false;
    } 
    t.n(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
    return this.a;
  }
  
  public static class a<T extends f, O> extends e<T, O> {
    @Deprecated
    public T a(Context param1Context, Looper param1Looper, com.google.android.gms.common.internal.e param1e, O param1O, d.a param1a, d.b param1b) {
      throw null;
    }
  }
  
  public static interface b {}
  
  public static class c<C extends b> {}
  
  public static interface d {
    public static interface a extends d {
      Account U();
    }
    
    public static interface b extends d {
      GoogleSignInAccount S();
    }
  }
  
  public static interface a extends d {
    Account U();
  }
  
  public static interface b extends d {
    GoogleSignInAccount S();
  }
  
  public static class e<T extends b, O> {}
  
  public static interface f extends b {
    void a();
    
    boolean c();
    
    Set<Scope> d();
    
    void e(l param1l, Set<Scope> param1Set);
    
    boolean g();
    
    String h();
    
    void i(com.google.android.gms.common.internal.d.c param1c);
    
    void k(com.google.android.gms.common.internal.d.e param1e);
    
    boolean n();
    
    int o();
    
    Feature[] p();
    
    boolean q();
  }
  
  public static final class g<C extends f> extends c<C> {}
  
  public static interface h<T extends android.os.IInterface> extends b {
    void j(int param1Int, T param1T);
    
    String l();
    
    T m(IBinder param1IBinder);
    
    String r();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */