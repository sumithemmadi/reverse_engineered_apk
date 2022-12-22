package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class a {
  private final Executor a;
  
  private final Executor b;
  
  private final m c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  a(a parama) {
    Executor executor = parama.a;
    if (executor == null) {
      this.a = a();
    } else {
      this.a = executor;
    } 
    executor = parama.c;
    if (executor == null) {
      this.b = a();
    } else {
      this.b = executor;
    } 
    m m1 = parama.b;
    if (m1 == null) {
      this.c = m.c();
    } else {
      this.c = m1;
    } 
    this.d = parama.d;
    this.e = parama.e;
    this.f = parama.f;
    this.g = parama.g;
  }
  
  private Executor a() {
    return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
  }
  
  public Executor b() {
    return this.a;
  }
  
  public int c() {
    return this.f;
  }
  
  public int d() {
    return (Build.VERSION.SDK_INT == 23) ? (this.g / 2) : this.g;
  }
  
  public int e() {
    return this.e;
  }
  
  public int f() {
    return this.d;
  }
  
  public Executor g() {
    return this.b;
  }
  
  public m h() {
    return this.c;
  }
  
  public static final class a {
    Executor a;
    
    m b;
    
    Executor c;
    
    int d = 4;
    
    int e = 0;
    
    int f = Integer.MAX_VALUE;
    
    int g = 20;
    
    public a a() {
      return new a(this);
    }
  }
  
  public static interface b {
    a a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */