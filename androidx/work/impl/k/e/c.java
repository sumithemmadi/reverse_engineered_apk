package androidx.work.impl.k.e;

import androidx.work.impl.k.a;
import androidx.work.impl.k.f.d;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.List;

public abstract class c<T> implements a<T> {
  private final List<String> a = new ArrayList<String>();
  
  private T b;
  
  private d<T> c;
  
  private a d;
  
  c(d<T> paramd) {
    this.c = paramd;
  }
  
  private void h() {
    if (!this.a.isEmpty() && this.d != null) {
      T t = this.b;
      if (t == null || c(t)) {
        this.d.b(this.a);
        return;
      } 
      this.d.a(this.a);
    } 
  }
  
  public void a(T paramT) {
    this.b = paramT;
    h();
  }
  
  abstract boolean b(j paramj);
  
  abstract boolean c(T paramT);
  
  public boolean d(String paramString) {
    boolean bool;
    T t = this.b;
    if (t != null && c(t) && this.a.contains(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void e(List<j> paramList) {
    this.a.clear();
    for (j j : paramList) {
      if (b(j))
        this.a.add(j.c); 
    } 
    if (this.a.isEmpty()) {
      this.c.c(this);
    } else {
      this.c.a(this);
    } 
    h();
  }
  
  public void f() {
    if (!this.a.isEmpty()) {
      this.a.clear();
      this.c.c(this);
    } 
  }
  
  public void g(a parama) {
    if (this.d != parama) {
      this.d = parama;
      h();
    } 
  }
  
  public static interface a {
    void a(List<String> param1List);
    
    void b(List<String> param1List);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */