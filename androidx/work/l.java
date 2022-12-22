package androidx.work;

import androidx.work.impl.l.j;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class l {
  private UUID a;
  
  private j b;
  
  private Set<String> c;
  
  protected l(UUID paramUUID, j paramj, Set<String> paramSet) {
    this.a = paramUUID;
    this.b = paramj;
    this.c = paramSet;
  }
  
  public String a() {
    return this.a.toString();
  }
  
  public Set<String> b() {
    return this.c;
  }
  
  public j c() {
    return this.b;
  }
  
  public static abstract class a<B extends a, W extends l> {
    boolean a = false;
    
    UUID b = UUID.randomUUID();
    
    j c;
    
    Set<String> d = new HashSet<String>();
    
    a(Class<? extends ListenableWorker> param1Class) {
      this.c = new j(this.b.toString(), param1Class.getName());
      a(param1Class.getName());
    }
    
    public final B a(String param1String) {
      this.d.add(param1String);
      return d();
    }
    
    public final W b() {
      W w = c();
      this.b = UUID.randomUUID();
      j j1 = new j(this.c);
      this.c = j1;
      j1.c = this.b.toString();
      return w;
    }
    
    abstract W c();
    
    abstract B d();
    
    public final B e(b param1b) {
      this.c.l = param1b;
      return d();
    }
    
    public final B f(d param1d) {
      this.c.g = param1d;
      return d();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */