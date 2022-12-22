package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaau;

public final class u {
  private final boolean a;
  
  private final boolean b;
  
  private final boolean c;
  
  private u(a parama) {
    this.a = a.c(parama);
    this.b = a.d(parama);
    this.c = a.e(parama);
  }
  
  public u(zzaau paramzzaau) {
    this.a = paramzzaau.b;
    this.b = paramzzaau.c;
    this.c = paramzzaau.d;
  }
  
  public final boolean a() {
    return this.c;
  }
  
  public final boolean b() {
    return this.b;
  }
  
  public final boolean c() {
    return this.a;
  }
  
  public static final class a {
    private boolean a = true;
    
    private boolean b = false;
    
    private boolean c = false;
    
    public final u a() {
      return new u(this, null);
    }
    
    public final a b(boolean param1Boolean) {
      this.a = param1Boolean;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */