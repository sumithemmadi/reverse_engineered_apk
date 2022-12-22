package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l.k;

public class h implements Runnable {
  private static final String b = f.f("StopWorkRunnable");
  
  private androidx.work.impl.h c;
  
  private String d;
  
  public h(androidx.work.impl.h paramh, String paramString) {
    this.c = paramh;
    this.d = paramString;
  }
  
  public void run() {
    WorkDatabase workDatabase = this.c.n();
    null = workDatabase.y();
    workDatabase.c();
    try {
      if (null.l(this.d) == WorkInfo.State.c)
        null.a(WorkInfo.State.b, new String[] { this.d }); 
      boolean bool = this.c.l().i(this.d);
      f.c().a(b, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[] { this.d, Boolean.valueOf(bool) }), new Throwable[0]);
      workDatabase.q();
      return;
    } finally {
      workDatabase.g();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */