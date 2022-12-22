package androidx.work.impl.k.f;

import android.content.Context;
import androidx.work.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class d<T> {
  private static final String a = f.f("ConstraintTracker");
  
  protected final androidx.work.impl.utils.j.a b;
  
  protected final Context c;
  
  private final Object d = new Object();
  
  private final Set<androidx.work.impl.k.a<T>> e = new LinkedHashSet<androidx.work.impl.k.a<T>>();
  
  T f;
  
  d(Context paramContext, androidx.work.impl.utils.j.a parama) {
    this.c = paramContext.getApplicationContext();
    this.b = parama;
  }
  
  public void a(androidx.work.impl.k.a<T> parama) {
    synchronized (this.d) {
      if (this.e.add(parama)) {
        if (this.e.size() == 1) {
          this.f = b();
          f.c().a(a, String.format("%s: initial state = %s", new Object[] { getClass().getSimpleName(), this.f }), new Throwable[0]);
          e();
        } 
        parama.a(this.f);
      } 
      return;
    } 
  }
  
  public abstract T b();
  
  public void c(androidx.work.impl.k.a<T> parama) {
    synchronized (this.d) {
      if (this.e.remove(parama) && this.e.isEmpty())
        f(); 
      return;
    } 
  }
  
  public void d(T paramT) {
    synchronized (this.d) {
      T t = this.f;
      if (t == paramT || (t != null && t.equals(paramT)))
        return; 
      this.f = paramT;
      ArrayList arrayList = new ArrayList();
      this(this.e);
      Executor executor = this.b.a();
      a a1 = new a();
      this(this, arrayList);
      executor.execute(a1);
      return;
    } 
  }
  
  public abstract void e();
  
  public abstract void f();
  
  class a implements Runnable {
    a(d this$0, List param1List) {}
    
    public void run() {
      Iterator<androidx.work.impl.k.a> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((androidx.work.impl.k.a)iterator.next()).a(this.c.f); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */