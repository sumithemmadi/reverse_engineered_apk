package androidx.work;

import android.os.Build;

public final class b {
  public static final b a = (new a()).a();
  
  private NetworkType b;
  
  private boolean c;
  
  private boolean d;
  
  private boolean e;
  
  private boolean f;
  
  private long g;
  
  private long h;
  
  private c i;
  
  public b() {
    this.b = NetworkType.b;
    this.g = -1L;
    this.h = -1L;
    this.i = new c();
  }
  
  b(a parama) {
    boolean bool;
    this.b = NetworkType.b;
    this.g = -1L;
    this.h = -1L;
    this.i = new c();
    this.c = parama.a;
    int i = Build.VERSION.SDK_INT;
    if (i >= 23 && parama.b) {
      bool = true;
    } else {
      bool = false;
    } 
    this.d = bool;
    this.b = parama.c;
    this.e = parama.d;
    this.f = parama.e;
    if (i >= 24) {
      this.i = parama.h;
      this.g = parama.f;
      this.h = parama.g;
    } 
  }
  
  public b(b paramb) {
    this.b = NetworkType.b;
    this.g = -1L;
    this.h = -1L;
    this.i = new c();
    this.c = paramb.c;
    this.d = paramb.d;
    this.b = paramb.b;
    this.e = paramb.e;
    this.f = paramb.f;
    this.i = paramb.i;
  }
  
  public c a() {
    return this.i;
  }
  
  public NetworkType b() {
    return this.b;
  }
  
  public long c() {
    return this.g;
  }
  
  public long d() {
    return this.h;
  }
  
  public boolean e() {
    boolean bool;
    if (this.i.c() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || b.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return (this.c != ((b)paramObject).c) ? false : ((this.d != ((b)paramObject).d) ? false : ((this.e != ((b)paramObject).e) ? false : ((this.f != ((b)paramObject).f) ? false : ((this.g != ((b)paramObject).g) ? false : ((this.h != ((b)paramObject).h) ? false : ((this.b != ((b)paramObject).b) ? false : this.i.equals(((b)paramObject).i)))))));
  }
  
  public boolean f() {
    return this.e;
  }
  
  public boolean g() {
    return this.c;
  }
  
  public boolean h() {
    return this.d;
  }
  
  public int hashCode() {
    int i = this.b.hashCode();
    boolean bool1 = this.c;
    boolean bool2 = this.d;
    boolean bool3 = this.e;
    boolean bool4 = this.f;
    long l = this.g;
    int j = (int)(l ^ l >>> 32L);
    l = this.h;
    return ((((((i * 31 + bool1) * 31 + bool2) * 31 + bool3) * 31 + bool4) * 31 + j) * 31 + (int)(l ^ l >>> 32L)) * 31 + this.i.hashCode();
  }
  
  public boolean i() {
    return this.f;
  }
  
  public void j(c paramc) {
    this.i = paramc;
  }
  
  public void k(NetworkType paramNetworkType) {
    this.b = paramNetworkType;
  }
  
  public void l(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void m(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public void n(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public void o(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public void p(long paramLong) {
    this.g = paramLong;
  }
  
  public void q(long paramLong) {
    this.h = paramLong;
  }
  
  public static final class a {
    boolean a = false;
    
    boolean b = false;
    
    NetworkType c = NetworkType.b;
    
    boolean d = false;
    
    boolean e = false;
    
    long f = -1L;
    
    long g = -1L;
    
    c h = new c();
    
    public b a() {
      return new b(this);
    }
    
    public a b(NetworkType param1NetworkType) {
      this.c = param1NetworkType;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */