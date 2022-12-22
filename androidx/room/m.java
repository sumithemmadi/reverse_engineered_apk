package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class m implements Executor {
  private final Executor b;
  
  private final ArrayDeque<Runnable> c = new ArrayDeque<Runnable>();
  
  private Runnable d;
  
  m(Executor paramExecutor) {
    this.b = paramExecutor;
  }
  
  void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/ArrayDeque;
    //   6: invokevirtual poll : ()Ljava/lang/Object;
    //   9: checkcast java/lang/Runnable
    //   12: astore_1
    //   13: aload_0
    //   14: aload_1
    //   15: putfield d : Ljava/lang/Runnable;
    //   18: aload_1
    //   19: ifnull -> 32
    //   22: aload_0
    //   23: getfield b : Ljava/util/concurrent/Executor;
    //   26: aload_1
    //   27: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	35	finally
    //   22	32	35	finally
  }
  
  public void execute(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/ArrayDeque;
    //   6: astore_2
    //   7: new androidx/room/m$a
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial <init> : (Landroidx/room/m;Ljava/lang/Runnable;)V
    //   17: aload_2
    //   18: aload_3
    //   19: invokevirtual offer : (Ljava/lang/Object;)Z
    //   22: pop
    //   23: aload_0
    //   24: getfield d : Ljava/lang/Runnable;
    //   27: ifnonnull -> 34
    //   30: aload_0
    //   31: invokevirtual b : ()V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	34	37	finally
  }
  
  class a implements Runnable {
    a(m this$0, Runnable param1Runnable) {}
    
    public void run() {
      try {
        this.b.run();
        return;
      } finally {
        this.c.b();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */