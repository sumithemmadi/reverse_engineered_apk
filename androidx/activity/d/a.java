package androidx.activity.d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {
  private final Set<b> a = new CopyOnWriteArraySet<b>();
  
  private volatile Context b;
  
  public void a(b paramb) {
    if (this.b != null)
      paramb.a(this.b); 
    this.a.add(paramb);
  }
  
  public void b() {
    this.b = null;
  }
  
  public void c(Context paramContext) {
    this.b = paramContext;
    Iterator<b> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((b)iterator.next()).a(paramContext); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */