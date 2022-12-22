package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.work.f;
import androidx.work.impl.a;
import androidx.work.impl.h;
import androidx.work.impl.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e implements a {
  static final String b = f.f("SystemAlarmDispatcher");
  
  final Context c;
  
  private final androidx.work.impl.utils.j.a d;
  
  private final g e;
  
  private final androidx.work.impl.c f;
  
  private final h g;
  
  final b h;
  
  private final Handler i;
  
  final List<Intent> j;
  
  Intent k;
  
  private c l;
  
  e(Context paramContext) {
    this(paramContext, null, null);
  }
  
  e(Context paramContext, androidx.work.impl.c paramc, h paramh) {
    Context context = paramContext.getApplicationContext();
    this.c = context;
    this.h = new b(context);
    this.e = new g();
    if (paramh == null)
      paramh = h.j(paramContext); 
    this.g = paramh;
    if (paramc == null)
      paramc = paramh.l(); 
    this.f = paramc;
    this.d = paramh.o();
    paramc.a(this);
    this.j = new ArrayList<Intent>();
    this.k = null;
    this.i = new Handler(Looper.getMainLooper());
  }
  
  private void b() {
    if (this.i.getLooper().getThread() == Thread.currentThread())
      return; 
    throw new IllegalStateException("Needs to be invoked on the main thread.");
  }
  
  private boolean i(String paramString) {
    b();
    synchronized (this.j) {
      Iterator<Intent> iterator = this.j.iterator();
      while (iterator.hasNext()) {
        if (paramString.equals(((Intent)iterator.next()).getAction()))
          return true; 
      } 
      return false;
    } 
  }
  
  private void l() {
    b();
    PowerManager.WakeLock wakeLock = i.b(this.c, "ProcessCommand");
    try {
      wakeLock.acquire();
      androidx.work.impl.utils.j.a a1 = this.g.o();
      a a2 = new a();
      this(this);
      a1.b(a2);
      return;
    } finally {
      wakeLock.release();
    } 
  }
  
  public boolean a(Intent paramIntent, int paramInt) {
    // Byte code:
    //   0: invokestatic c : ()Landroidx/work/f;
    //   3: astore_3
    //   4: getstatic androidx/work/impl/background/systemalarm/e.b : Ljava/lang/String;
    //   7: astore #4
    //   9: iconst_0
    //   10: istore #5
    //   12: aload_3
    //   13: aload #4
    //   15: ldc 'Adding command %s (%s)'
    //   17: iconst_2
    //   18: anewarray java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: iload_2
    //   28: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   31: aastore
    //   32: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   35: iconst_0
    //   36: anewarray java/lang/Throwable
    //   39: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   42: aload_0
    //   43: invokespecial b : ()V
    //   46: aload_1
    //   47: invokevirtual getAction : ()Ljava/lang/String;
    //   50: astore_3
    //   51: aload_3
    //   52: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   55: ifeq -> 74
    //   58: invokestatic c : ()Landroidx/work/f;
    //   61: aload #4
    //   63: ldc 'Unknown command. Ignoring'
    //   65: iconst_0
    //   66: anewarray java/lang/Throwable
    //   69: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   72: iconst_0
    //   73: ireturn
    //   74: ldc 'ACTION_CONSTRAINTS_CHANGED'
    //   76: aload_3
    //   77: invokevirtual equals : (Ljava/lang/Object;)Z
    //   80: ifeq -> 94
    //   83: aload_0
    //   84: ldc 'ACTION_CONSTRAINTS_CHANGED'
    //   86: invokespecial i : (Ljava/lang/String;)Z
    //   89: ifeq -> 94
    //   92: iconst_0
    //   93: ireturn
    //   94: aload_1
    //   95: ldc 'KEY_START_ID'
    //   97: iload_2
    //   98: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   101: pop
    //   102: aload_0
    //   103: getfield j : Ljava/util/List;
    //   106: astore #4
    //   108: aload #4
    //   110: monitorenter
    //   111: iload #5
    //   113: istore_2
    //   114: aload_0
    //   115: getfield j : Ljava/util/List;
    //   118: invokeinterface isEmpty : ()Z
    //   123: ifne -> 128
    //   126: iconst_1
    //   127: istore_2
    //   128: aload_0
    //   129: getfield j : Ljava/util/List;
    //   132: aload_1
    //   133: invokeinterface add : (Ljava/lang/Object;)Z
    //   138: pop
    //   139: iload_2
    //   140: ifne -> 147
    //   143: aload_0
    //   144: invokespecial l : ()V
    //   147: aload #4
    //   149: monitorexit
    //   150: iconst_1
    //   151: ireturn
    //   152: astore_1
    //   153: aload #4
    //   155: monitorexit
    //   156: aload_1
    //   157: athrow
    // Exception table:
    //   from	to	target	type
    //   114	126	152	finally
    //   128	139	152	finally
    //   143	147	152	finally
    //   147	150	152	finally
    //   153	156	152	finally
  }
  
  public void c(String paramString, boolean paramBoolean) {
    k(new b(this, b.d(this.c, paramString, paramBoolean), 0));
  }
  
  void d() {
    f f = f.c();
    null = b;
    f.a(null, "Checking if commands are complete.", new Throwable[0]);
    b();
    synchronized (this.j) {
      IllegalStateException illegalStateException;
      if (this.k != null) {
        f.c().a(null, String.format("Removing command %s", new Object[] { this.k }), new Throwable[0]);
        if (((Intent)this.j.remove(0)).equals(this.k)) {
          this.k = null;
        } else {
          illegalStateException = new IllegalStateException();
          this("Dequeue-d command is not the first.");
          throw illegalStateException;
        } 
      } 
      if (!this.h.o() && this.j.isEmpty()) {
        f.c().a((String)illegalStateException, "No more commands & intents.", new Throwable[0]);
        c c1 = this.l;
        if (c1 != null)
          c1.b(); 
      } else if (!this.j.isEmpty()) {
        l();
      } 
      return;
    } 
  }
  
  androidx.work.impl.c e() {
    return this.f;
  }
  
  androidx.work.impl.utils.j.a f() {
    return this.d;
  }
  
  h g() {
    return this.g;
  }
  
  g h() {
    return this.e;
  }
  
  void j() {
    f.c().a(b, "Destroying SystemAlarmDispatcher", new Throwable[0]);
    this.f.e(this);
    this.e.a();
    this.l = null;
  }
  
  void k(Runnable paramRunnable) {
    this.i.post(paramRunnable);
  }
  
  void m(c paramc) {
    if (this.l != null) {
      f.c().b(b, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
      return;
    } 
    this.l = paramc;
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      List<Intent> list;
      e e1;
      synchronized (this.b.j) {
        e.d d;
        e e2 = this.b;
        e2.k = e2.j.get(0);
        Intent intent = this.b.k;
        if (intent != null) {
          String str1 = intent.getAction();
          int i = this.b.k.getIntExtra("KEY_START_ID", 0);
          f f = f.c();
          String str2 = e.b;
          f.a(str2, String.format("Processing command %s, %s", new Object[] { this.b.k, Integer.valueOf(i) }), new Throwable[0]);
          PowerManager.WakeLock wakeLock = i.b(this.b.c, String.format("%s (%s)", new Object[] { str1, Integer.valueOf(i) }));
          try {
            f.c().a(str2, String.format("Acquiring operation wake lock (%s) %s", new Object[] { str1, wakeLock }), new Throwable[0]);
            wakeLock.acquire();
            e e3 = this.b;
            e3.h.p(e3.k, i, e3);
            f.c().a(str2, String.format("Releasing operation wake lock (%s) %s", new Object[] { str1, wakeLock }), new Throwable[0]);
            wakeLock.release();
            e1 = this.b;
          } finally {
            str2 = null;
          } 
        } else {
          return;
        } 
        e1.k(d);
      } 
    }
  }
  
  static class b implements Runnable {
    private final e b;
    
    private final Intent c;
    
    private final int d;
    
    b(e param1e, Intent param1Intent, int param1Int) {
      this.b = param1e;
      this.c = param1Intent;
      this.d = param1Int;
    }
    
    public void run() {
      this.b.a(this.c, this.d);
    }
  }
  
  static interface c {
    void b();
  }
  
  static class d implements Runnable {
    private final e b;
    
    d(e param1e) {
      this.b = param1e;
    }
    
    public void run() {
      this.b.d();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */