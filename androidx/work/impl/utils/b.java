package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.d;
import androidx.work.f;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.e;
import androidx.work.impl.f;
import androidx.work.impl.h;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b implements Runnable {
  private static final String b = f.f("EnqueueRunnable");
  
  private final f c;
  
  private final androidx.work.impl.b d;
  
  public b(f paramf) {
    this.c = paramf;
    this.d = new androidx.work.impl.b();
  }
  
  private static boolean b(f paramf) {
    Set set = f.l(paramf);
    boolean bool = c(paramf.g(), paramf.f(), (String[])set.toArray((Object[])new String[0]), paramf.d(), paramf.b());
    paramf.k();
    return bool;
  }
  
  private static boolean c(h paramh, List<? extends l> paramList, String[] paramArrayOfString, String paramString, ExistingWorkPolicy paramExistingWorkPolicy) {
    boolean bool1;
    Iterator iterator2;
    long l = System.currentTimeMillis();
    WorkDatabase workDatabase = paramh.n();
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      bool1 = paramArrayOfString.length;
      byte b1 = 0;
      int i5 = 1;
      byte b2 = 0;
      byte b3 = 0;
      while (true) {
        i1 = i5;
        i2 = b2;
        i3 = b3;
        if (b1 < bool1) {
          String str = paramArrayOfString[b1];
          j j1 = workDatabase.y().m(str);
          if (j1 == null) {
            f.c().b(b, String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[] { str }), new Throwable[0]);
            return false;
          } 
          WorkInfo.State state = j1.d;
          if (state == WorkInfo.State.d) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          i5 &= i3;
          if (state == WorkInfo.State.e) {
            i3 = 1;
          } else {
            i3 = b2;
            if (state == WorkInfo.State.g) {
              b3 = 1;
              i3 = b2;
            } 
          } 
          b1++;
          b2 = i3;
          continue;
        } 
        break;
      } 
    } else {
      i1 = 1;
      i2 = 0;
      i3 = 0;
    } 
    int i4 = TextUtils.isEmpty(paramString) ^ true;
    if (i4 != 0 && !i) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    String[] arrayOfString = paramArrayOfString;
    int m = i;
    int n = i1;
    int k = i2;
    int j = i3;
    if (bool1) {
      List list = workDatabase.y().c(paramString);
      arrayOfString = paramArrayOfString;
      m = i;
      n = i1;
      k = i2;
      j = i3;
      if (!list.isEmpty()) {
        androidx.work.impl.l.b b1;
        WorkInfo.State state;
        if (paramExistingWorkPolicy == ExistingWorkPolicy.d) {
          b1 = workDatabase.s();
          ArrayList<String> arrayList = new ArrayList();
          for (j.b b2 : list) {
            n = i1;
            i = i2;
            m = i3;
            if (!b1.d(b2.a)) {
              state = b2.b;
              if (state == WorkInfo.State.d) {
                m = 1;
              } else {
                m = 0;
              } 
              if (state == WorkInfo.State.e) {
                i = 1;
              } else {
                i = i2;
                if (state == WorkInfo.State.g) {
                  i3 = 1;
                  i = i2;
                } 
              } 
              arrayList.add(b2.a);
              n = m & i1;
              m = i3;
            } 
            i1 = n;
            i2 = i;
            i3 = m;
          } 
          String[] arrayOfString1 = arrayList.<String>toArray(paramArrayOfString);
          if (arrayOfString1.length > 0) {
            m = 1;
            n = i1;
            k = i2;
            j = i3;
          } else {
            m = 0;
            j = i3;
            k = i2;
            n = i1;
          } 
        } else {
          if (b1 == ExistingWorkPolicy.c) {
            Iterator iterator3 = state.iterator();
            while (iterator3.hasNext()) {
              WorkInfo.State state1 = ((j.b)iterator3.next()).b;
              if (state1 == WorkInfo.State.b || state1 == WorkInfo.State.c)
                return false; 
            } 
          } 
          a.b(paramString, paramh, false).run();
          k k1 = workDatabase.y();
          iterator2 = state.iterator();
          while (iterator2.hasNext())
            k1.e(((j.b)iterator2.next()).a); 
          boolean bool = true;
          iterator = paramList.iterator();
        } 
      } 
    } 
    boolean bool2 = false;
    int i3 = j;
    int i2 = k;
    int i1 = n;
    int i = m;
    Iterator iterator1 = iterator2;
    Iterator<? extends l> iterator = iterator.iterator();
  }
  
  private static boolean e(f paramf) {
    List list = paramf.e();
    boolean bool = false;
    if (list != null) {
      Iterator<f> iterator = list.iterator();
      bool = false;
      while (iterator.hasNext()) {
        f f1 = iterator.next();
        if (!f1.j()) {
          bool |= e(f1);
          continue;
        } 
        f.c().h(b, String.format("Already enqueued work ids (%s).", new Object[] { TextUtils.join(", ", f1.c()) }), new Throwable[0]);
      } 
    } 
    return b(paramf) | bool;
  }
  
  private static void g(j paramj) {
    androidx.work.b b1 = paramj.l;
    if (b1.f() || b1.i()) {
      String str = paramj.e;
      d.a a = new d.a();
      a.c(paramj.g).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
      paramj.e = ConstraintTrackingWorker.class.getName();
      paramj.g = a.a();
    } 
  }
  
  private static boolean h(h paramh, String paramString) {
    try {
      Class<?> clazz = Class.forName(paramString);
      Iterator<d> iterator = paramh.m().iterator();
      while (iterator.hasNext()) {
        boolean bool = clazz.isAssignableFrom(((d)iterator.next()).getClass());
        if (bool)
          return true; 
      } 
    } catch (ClassNotFoundException classNotFoundException) {}
    return false;
  }
  
  public boolean a() {
    WorkDatabase workDatabase = this.c.g().n();
    workDatabase.c();
    try {
      boolean bool = e(this.c);
      workDatabase.q();
      return bool;
    } finally {
      workDatabase.g();
    } 
  }
  
  public h d() {
    return (h)this.d;
  }
  
  public void f() {
    h h = this.c.g();
    e.b(h.h(), h.n(), h.m());
  }
  
  public void run() {
    try {
    
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */