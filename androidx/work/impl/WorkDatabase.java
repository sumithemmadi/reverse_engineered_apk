package androidx.work.impl;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.h;
import androidx.work.impl.l.b;
import androidx.work.impl.l.e;
import androidx.work.impl.l.h;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import b.r.a.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends RoomDatabase {
  private static final long l = TimeUnit.DAYS.toMillis(7L);
  
  public static WorkDatabase r(Context paramContext, Executor paramExecutor, boolean paramBoolean) {
    RoomDatabase.a a;
    if (paramBoolean) {
      a = h.c(paramContext, WorkDatabase.class).c();
    } else {
      a = h.a(paramContext, WorkDatabase.class, "androidx.work.workdb").f((Executor)a);
    } 
    return (WorkDatabase)a.a(t()).b(new androidx.room.n.a[] { g.a }).b(new androidx.room.n.a[] { new g.d(paramContext, 2, 3) }).b(new androidx.room.n.a[] { g.b }).b(new androidx.room.n.a[] { g.c }).b(new androidx.room.n.a[] { new g.d(paramContext, 5, 6) }).e().d();
  }
  
  static RoomDatabase.b t() {
    return new a();
  }
  
  static long u() {
    return System.currentTimeMillis() - l;
  }
  
  static String v() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
    stringBuilder.append(u());
    stringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
    return stringBuilder.toString();
  }
  
  public abstract b s();
  
  public abstract e w();
  
  public abstract h x();
  
  public abstract k y();
  
  public abstract n z();
  
  static final class a extends RoomDatabase.b {
    public void b(b param1b) {
      super.b(param1b);
      param1b.a();
      try {
        param1b.m(WorkDatabase.v());
        param1b.J();
        return;
      } finally {
        param1b.T();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/WorkDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */