package c.c.a.a.b.c;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class k {
  private final ConcurrentHashMap<j, List<Throwable>> a = new ConcurrentHashMap<j, List<Throwable>>(16, 0.75F, 10);
  
  private final ReferenceQueue<Throwable> b = new ReferenceQueue<Throwable>();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean) {
    ReferenceQueue<Throwable> referenceQueue = this.b;
    while (true) {
      Reference<? extends Throwable> reference = referenceQueue.poll();
      if (reference != null) {
        this.a.remove(reference);
        ReferenceQueue<Throwable> referenceQueue1 = this.b;
        continue;
      } 
      reference = new j(paramThrowable, null);
      List<Throwable> list2 = this.a.get(reference);
      if (list2 != null)
        return list2; 
      list2 = new Vector<Throwable>(2);
      List<Throwable> list1 = this.a.putIfAbsent(new j(paramThrowable, this.b), list2);
      return (list1 == null) ? list2 : list1;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */