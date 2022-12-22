package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.impl.utils.j.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c implements a {
  private static final String b = f.f("Processor");
  
  private Context c;
  
  private androidx.work.a d;
  
  private a e;
  
  private WorkDatabase f;
  
  private Map<String, i> g;
  
  private List<d> h;
  
  private Set<String> i;
  
  private final List<a> j;
  
  private final Object k;
  
  public c(Context paramContext, androidx.work.a parama, a parama1, WorkDatabase paramWorkDatabase, List<d> paramList) {
    this.c = paramContext;
    this.d = parama;
    this.e = parama1;
    this.f = paramWorkDatabase;
    this.g = new HashMap<String, i>();
    this.h = paramList;
    this.i = new HashSet<String>();
    this.j = new ArrayList<a>();
    this.k = new Object();
  }
  
  public void a(a parama) {
    synchronized (this.k) {
      this.j.add(parama);
      return;
    } 
  }
  
  public boolean b(String paramString) {
    synchronized (this.k) {
      return this.i.contains(paramString);
    } 
  }
  
  public void c(String paramString, boolean paramBoolean) {
    synchronized (this.k) {
      this.g.remove(paramString);
      f.c().a(b, String.format("%s %s executed; reschedule = %s", new Object[] { getClass().getSimpleName(), paramString, Boolean.valueOf(paramBoolean) }), new Throwable[0]);
      Iterator<a> iterator = this.j.iterator();
      while (iterator.hasNext())
        ((a)iterator.next()).c(paramString, paramBoolean); 
      return;
    } 
  }
  
  public boolean d(String paramString) {
    synchronized (this.k) {
      return this.g.containsKey(paramString);
    } 
  }
  
  public void e(a parama) {
    synchronized (this.k) {
      this.j.remove(parama);
      return;
    } 
  }
  
  public boolean f(String paramString) {
    return g(paramString, null);
  }
  
  public boolean g(String paramString, WorkerParameters.a parama) {
    synchronized (this.k) {
      if (this.g.containsKey(paramString)) {
        f.c().a(b, String.format("Work %s is already enqueued for processing", new Object[] { paramString }), new Throwable[0]);
        return false;
      } 
      i.c c1 = new i.c();
      this(this.c, this.d, this.e, this.f, paramString);
      i i = c1.c(this.h).b(parama).a();
      com.google.common.util.concurrent.a<Boolean> a1 = i.b();
      a a2 = new a();
      this(this, paramString, a1);
      a1.a(a2, this.e.a());
      this.g.put(paramString, i);
      this.e.c().execute(i);
      f.c().a(b, String.format("%s: processing %s", new Object[] { c.class.getSimpleName(), paramString }), new Throwable[0]);
      return true;
    } 
  }
  
  public boolean h(String paramString) {
    synchronized (this.k) {
      f f = f.c();
      String str = b;
      f.a(str, String.format("Processor cancelling %s", new Object[] { paramString }), new Throwable[0]);
      this.i.add(paramString);
      i i = this.g.remove(paramString);
      if (i != null) {
        i.d(true);
        f.c().a(str, String.format("WorkerWrapper cancelled for %s", new Object[] { paramString }), new Throwable[0]);
        return true;
      } 
      f.c().a(str, String.format("WorkerWrapper could not be found for %s", new Object[] { paramString }), new Throwable[0]);
      return false;
    } 
  }
  
  public boolean i(String paramString) {
    synchronized (this.k) {
      f f = f.c();
      String str = b;
      f.a(str, String.format("Processor stopping %s", new Object[] { paramString }), new Throwable[0]);
      i i = this.g.remove(paramString);
      if (i != null) {
        i.d(false);
        f.c().a(str, String.format("WorkerWrapper stopped for %s", new Object[] { paramString }), new Throwable[0]);
        return true;
      } 
      f.c().a(str, String.format("WorkerWrapper could not be found for %s", new Object[] { paramString }), new Throwable[0]);
      return false;
    } 
  }
  
  private static class a implements Runnable {
    private a b;
    
    private String c;
    
    private com.google.common.util.concurrent.a<Boolean> d;
    
    a(a param1a, String param1String, com.google.common.util.concurrent.a<Boolean> param1a1) {
      this.b = param1a;
      this.c = param1String;
      this.d = param1a1;
    }
    
    public void run() {
      boolean bool;
      try {
        bool = ((Boolean)this.d.get()).booleanValue();
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {
        bool = true;
      } 
      this.b.c(this.c, bool);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */