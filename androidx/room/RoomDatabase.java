package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.room.n.a;
import b.e.h;
import b.r.a.e;
import b.r.a.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class RoomDatabase {
  @Deprecated
  protected volatile b.r.a.b a;
  
  private Executor b;
  
  private Executor c;
  
  private b.r.a.c d;
  
  private final f e = e();
  
  private boolean f;
  
  boolean g;
  
  @Deprecated
  protected List<b> h;
  
  private final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
  
  private final ThreadLocal<Integer> j = new ThreadLocal<Integer>();
  
  private final Map<String, Object> k = new ConcurrentHashMap<String, Object>();
  
  private static boolean n() {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void a() {
    if (this.f)
      return; 
    if (!n())
      return; 
    throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
  }
  
  public void b() {
    if (k() || this.j.get() == null)
      return; 
    throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
  }
  
  @Deprecated
  public void c() {
    a();
    b.r.a.b b1 = this.d.b();
    this.e.m(b1);
    b1.a();
  }
  
  public f d(String paramString) {
    a();
    b();
    return this.d.b().s(paramString);
  }
  
  protected abstract f e();
  
  protected abstract b.r.a.c f(a parama);
  
  @Deprecated
  public void g() {
    this.d.b().T();
    if (!k())
      this.e.f(); 
  }
  
  Lock h() {
    return this.i.readLock();
  }
  
  public b.r.a.c i() {
    return this.d;
  }
  
  public Executor j() {
    return this.b;
  }
  
  public boolean k() {
    return this.d.b().b0();
  }
  
  public void l(a parama) {
    b.r.a.c c1 = f(parama);
    this.d = c1;
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = false;
    if (i >= 16) {
      bool1 = bool2;
      if (parama.g == JournalMode.d)
        bool1 = true; 
      c1.a(bool1);
    } 
    this.h = parama.e;
    this.b = parama.h;
    this.c = new m(parama.i);
    this.f = parama.f;
    this.g = bool1;
    if (parama.j)
      this.e.i(parama.b, parama.c); 
  }
  
  protected void m(b.r.a.b paramb) {
    this.e.d(paramb);
  }
  
  public boolean o() {
    boolean bool;
    b.r.a.b b1 = this.a;
    if (b1 != null && b1.isOpen()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Cursor p(e parame) {
    a();
    b();
    return this.d.b().X(parame);
  }
  
  @Deprecated
  public void q() {
    this.d.b().J();
  }
  
  public enum JournalMode {
    b, c, d;
    
    static {
      JournalMode journalMode1 = new JournalMode("AUTOMATIC", 0);
      b = journalMode1;
      JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
      c = journalMode2;
      JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
      d = journalMode3;
      e = new JournalMode[] { journalMode1, journalMode2, journalMode3 };
    }
    
    @SuppressLint({"NewApi"})
    JournalMode resolve(Context param1Context) {
      if (this != b)
        return this; 
      if (Build.VERSION.SDK_INT >= 16) {
        ActivityManager activityManager = (ActivityManager)param1Context.getSystemService("activity");
        if (activityManager != null && !androidx.core.app.b.a(activityManager))
          return d; 
      } 
      return c;
    }
  }
  
  public static class a<T extends RoomDatabase> {
    private final Class<T> a;
    
    private final String b;
    
    private final Context c;
    
    private ArrayList<RoomDatabase.b> d;
    
    private Executor e;
    
    private Executor f;
    
    private b.r.a.c.c g;
    
    private boolean h;
    
    private RoomDatabase.JournalMode i;
    
    private boolean j;
    
    private boolean k;
    
    private boolean l;
    
    private final RoomDatabase.c m;
    
    private Set<Integer> n;
    
    private Set<Integer> o;
    
    a(Context param1Context, Class<T> param1Class, String param1String) {
      this.c = param1Context;
      this.a = param1Class;
      this.b = param1String;
      this.i = RoomDatabase.JournalMode.b;
      this.k = true;
      this.m = new RoomDatabase.c();
    }
    
    public a<T> a(RoomDatabase.b param1b) {
      if (this.d == null)
        this.d = new ArrayList<RoomDatabase.b>(); 
      this.d.add(param1b);
      return this;
    }
    
    public a<T> b(a... param1VarArgs) {
      if (this.o == null)
        this.o = new HashSet<Integer>(); 
      int i = param1VarArgs.length;
      for (byte b = 0; b < i; b++) {
        a a1 = param1VarArgs[b];
        this.o.add(Integer.valueOf(a1.a));
        this.o.add(Integer.valueOf(a1.b));
      } 
      this.m.b(param1VarArgs);
      return this;
    }
    
    public a<T> c() {
      this.h = true;
      return this;
    }
    
    @SuppressLint({"RestrictedApi"})
    public T d() {
      if (this.c != null) {
        if (this.a != null) {
          Executor executor = this.e;
          if (executor == null && this.f == null) {
            executor = b.b.a.a.a.d();
            this.f = executor;
            this.e = executor;
          } else if (executor != null && this.f == null) {
            this.f = executor;
          } else if (executor == null) {
            executor = this.f;
            if (executor != null)
              this.e = executor; 
          } 
          Set<Integer> set = this.o;
          if (set != null && this.n != null) {
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
              Integer integer = iterator.next();
              if (!this.n.contains(integer))
                continue; 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
              stringBuilder.append(integer);
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
          } 
          if (this.g == null)
            this.g = (b.r.a.c.c)new b.r.a.g.c(); 
          Context context = this.c;
          a a1 = new a(context, this.b, this.g, this.m, this.d, this.h, this.i.resolve(context), this.e, this.f, this.j, this.k, this.l, this.n);
          RoomDatabase roomDatabase = h.<RoomDatabase, T>b(this.a, "_Impl");
          roomDatabase.l(a1);
          return (T)roomDatabase;
        } 
        throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot provide null context for the database.");
      throw illegalArgumentException;
    }
    
    public a<T> e() {
      this.k = false;
      this.l = true;
      return this;
    }
    
    public a<T> f(Executor param1Executor) {
      this.e = param1Executor;
      return this;
    }
  }
  
  public static abstract class b {
    public void a(b.r.a.b param1b) {}
    
    public void b(b.r.a.b param1b) {}
  }
  
  public static class c {
    private h<h<a>> a = new h();
    
    private void a(a param1a) {
      int i = param1a.a;
      int j = param1a.b;
      h h1 = (h)this.a.i(i);
      h h2 = h1;
      if (h1 == null) {
        h2 = new h();
        this.a.n(i, h2);
      } 
      a a1 = (a)h2.i(j);
      if (a1 != null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Overriding migration ");
        stringBuilder.append(a1);
        stringBuilder.append(" with ");
        stringBuilder.append(param1a);
        Log.w("ROOM", stringBuilder.toString());
      } 
      h2.a(j, param1a);
    }
    
    private List<a> d(List<a> param1List, boolean param1Boolean, int param1Int1, int param1Int2) {
      byte b;
      int i;
      if (param1Boolean) {
        b = -1;
        i = param1Int1;
      } else {
        b = 1;
        i = param1Int1;
      } 
      while (param1Boolean ? (i < param1Int2) : (i > param1Int2)) {
        boolean bool2;
        int k;
        h h1 = (h)this.a.i(i);
        if (h1 == null)
          return null; 
        int j = h1.r();
        boolean bool1 = false;
        if (param1Boolean) {
          param1Int1 = j - 1;
          j = -1;
        } else {
          param1Int1 = 0;
        } 
        while (true) {
          bool2 = bool1;
          k = i;
          if (param1Int1 != j) {
            k = h1.m(param1Int1);
            if (param1Boolean ? (k <= param1Int2 && k > i) : (k >= param1Int2 && k < i)) {
              bool2 = true;
            } else {
              bool2 = false;
            } 
            if (bool2) {
              param1List.add(h1.s(param1Int1));
              bool2 = true;
              break;
            } 
            param1Int1 += b;
            continue;
          } 
          break;
        } 
        i = k;
        if (!bool2)
          return null; 
      } 
      return param1List;
    }
    
    public void b(a... param1VarArgs) {
      int i = param1VarArgs.length;
      for (byte b = 0; b < i; b++)
        a(param1VarArgs[b]); 
    }
    
    public List<a> c(int param1Int1, int param1Int2) {
      boolean bool;
      if (param1Int1 == param1Int2)
        return Collections.emptyList(); 
      if (param1Int2 > param1Int1) {
        bool = true;
      } else {
        bool = false;
      } 
      return d(new ArrayList<a>(), bool, param1Int1, param1Int2);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/RoomDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */