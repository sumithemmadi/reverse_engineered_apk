package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.e;
import androidx.work.impl.h;
import androidx.work.impl.l.k;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a implements Runnable {
  private final androidx.work.impl.b b = new androidx.work.impl.b();
  
  public static a b(String paramString, h paramh, boolean paramBoolean) {
    return new b(paramh, paramString, paramBoolean);
  }
  
  public static a c(String paramString, h paramh) {
    return new a(paramh, paramString);
  }
  
  private void e(WorkDatabase paramWorkDatabase, String paramString) {
    k k = paramWorkDatabase.y();
    androidx.work.impl.l.b b1 = paramWorkDatabase.s();
    LinkedList<String> linkedList = new LinkedList();
    linkedList.add(paramString);
    while (!linkedList.isEmpty()) {
      String str = linkedList.remove();
      WorkInfo.State state = k.l(str);
      if (state != WorkInfo.State.d && state != WorkInfo.State.e)
        k.a(WorkInfo.State.g, new String[] { str }); 
      linkedList.addAll(b1.b(str));
    } 
  }
  
  void a(h paramh, String paramString) {
    e(paramh.n(), paramString);
    paramh.l().h(paramString);
    Iterator<d> iterator = paramh.m().iterator();
    while (iterator.hasNext())
      ((d)iterator.next()).d(paramString); 
  }
  
  public h d() {
    return (h)this.b;
  }
  
  void f(h paramh) {
    e.b(paramh.h(), paramh.n(), paramh.m());
  }
  
  abstract void g();
  
  public void run() {
    try {
      g();
      this.b.a((h.b)h.a);
    } finally {
      Exception exception = null;
    } 
  }
  
  static final class a extends a {
    a(h param1h, String param1String) {}
    
    void g() {
      WorkDatabase workDatabase = this.c.n();
      workDatabase.c();
      try {
        for (String str : workDatabase.y().o(this.d))
          a(this.c, str); 
        workDatabase.q();
        workDatabase.g();
        return;
      } finally {
        workDatabase.g();
      } 
    }
  }
  
  static final class b extends a {
    b(h param1h, String param1String, boolean param1Boolean) {}
    
    void g() {
      WorkDatabase workDatabase = this.c.n();
      workDatabase.c();
      try {
        for (String str : workDatabase.y().k(this.d))
          a(this.c, str); 
        workDatabase.q();
        workDatabase.g();
        return;
      } finally {
        workDatabase.g();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */