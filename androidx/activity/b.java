package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {
  private boolean a;
  
  private CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<a>();
  
  public b(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  void a(a parama) {
    this.b.add(parama);
  }
  
  public abstract void b();
  
  public final boolean c() {
    return this.a;
  }
  
  public final void d() {
    Iterator<a> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).cancel(); 
  }
  
  void e(a parama) {
    this.b.remove(parama);
  }
  
  public final void f(boolean paramBoolean) {
    this.a = paramBoolean;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */