package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public class w30 {
  private final Context a;
  
  private final gi1 b;
  
  private Bundle c;
  
  private final String d;
  
  private final bi1 e;
  
  private w30(a parama) {
    this.a = a.a(parama);
    this.b = a.e(parama);
    this.c = a.f(parama);
    this.d = a.h(parama);
    this.e = a.j(parama);
  }
  
  final a a() {
    return (new a()).g(this.a).c(this.b).k(this.d).i(this.c);
  }
  
  final gi1 b() {
    return this.b;
  }
  
  final bi1 c() {
    return this.e;
  }
  
  final Bundle d() {
    return this.c;
  }
  
  final Context e(Context paramContext) {
    return (this.d != null) ? paramContext : this.a;
  }
  
  public static final class a {
    private Context a;
    
    private gi1 b;
    
    private Bundle c;
    
    private String d;
    
    private bi1 e;
    
    public final a b(bi1 param1bi1) {
      this.e = param1bi1;
      return this;
    }
    
    public final a c(gi1 param1gi1) {
      this.b = param1gi1;
      return this;
    }
    
    public final w30 d() {
      return new w30(this, null);
    }
    
    public final a g(Context param1Context) {
      this.a = param1Context;
      return this;
    }
    
    public final a i(Bundle param1Bundle) {
      this.c = param1Bundle;
      return this;
    }
    
    public final a k(String param1String) {
      this.d = param1String;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */