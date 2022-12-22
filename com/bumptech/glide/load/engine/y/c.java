package com.bumptech.glide.load.engine.y;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c {
  private final Map<String, a> a = new HashMap<String, a>();
  
  private final b b = new b();
  
  void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/bumptech/glide/load/engine/y/c$a
    //   15: astore_2
    //   16: aload_2
    //   17: astore_3
    //   18: aload_2
    //   19: ifnonnull -> 42
    //   22: aload_0
    //   23: getfield b : Lcom/bumptech/glide/load/engine/y/c$b;
    //   26: invokevirtual a : ()Lcom/bumptech/glide/load/engine/y/c$a;
    //   29: astore_3
    //   30: aload_0
    //   31: getfield a : Ljava/util/Map;
    //   34: aload_1
    //   35: aload_3
    //   36: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   41: pop
    //   42: aload_3
    //   43: aload_3
    //   44: getfield b : I
    //   47: iconst_1
    //   48: iadd
    //   49: putfield b : I
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_3
    //   55: getfield a : Ljava/util/concurrent/locks/Lock;
    //   58: invokeinterface lock : ()V
    //   63: return
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	64	finally
    //   22	42	64	finally
    //   42	54	64	finally
    //   65	67	64	finally
  }
  
  void b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast com/bumptech/glide/load/engine/y/c$a
    //   18: astore_2
    //   19: aload_2
    //   20: getfield b : I
    //   23: istore_3
    //   24: iload_3
    //   25: iconst_1
    //   26: if_icmplt -> 163
    //   29: iinc #3, -1
    //   32: aload_2
    //   33: iload_3
    //   34: putfield b : I
    //   37: iload_3
    //   38: ifne -> 151
    //   41: aload_0
    //   42: getfield a : Ljava/util/Map;
    //   45: aload_1
    //   46: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast com/bumptech/glide/load/engine/y/c$a
    //   54: astore #4
    //   56: aload #4
    //   58: aload_2
    //   59: invokevirtual equals : (Ljava/lang/Object;)Z
    //   62: ifeq -> 77
    //   65: aload_0
    //   66: getfield b : Lcom/bumptech/glide/load/engine/y/c$b;
    //   69: aload #4
    //   71: invokevirtual b : (Lcom/bumptech/glide/load/engine/y/c$a;)V
    //   74: goto -> 151
    //   77: new java/lang/IllegalStateException
    //   80: astore #5
    //   82: new java/lang/StringBuilder
    //   85: astore #6
    //   87: aload #6
    //   89: invokespecial <init> : ()V
    //   92: aload #6
    //   94: ldc 'Removed the wrong lock, expected to remove: '
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload #6
    //   102: aload_2
    //   103: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload #6
    //   109: ldc ', but actually removed: '
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload #6
    //   117: aload #4
    //   119: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload #6
    //   125: ldc ', safeKey: '
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload #6
    //   133: aload_1
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload #5
    //   140: aload #6
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokespecial <init> : (Ljava/lang/String;)V
    //   148: aload #5
    //   150: athrow
    //   151: aload_0
    //   152: monitorexit
    //   153: aload_2
    //   154: getfield a : Ljava/util/concurrent/locks/Lock;
    //   157: invokeinterface unlock : ()V
    //   162: return
    //   163: new java/lang/IllegalStateException
    //   166: astore #5
    //   168: new java/lang/StringBuilder
    //   171: astore #6
    //   173: aload #6
    //   175: invokespecial <init> : ()V
    //   178: aload #6
    //   180: ldc 'Cannot release a lock that is not held, safeKey: '
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: aload #6
    //   188: aload_1
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload #6
    //   195: ldc ', interestedThreads: '
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload #6
    //   203: aload_2
    //   204: getfield b : I
    //   207: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload #5
    //   213: aload #6
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: invokespecial <init> : (Ljava/lang/String;)V
    //   221: aload #5
    //   223: athrow
    //   224: astore_1
    //   225: aload_0
    //   226: monitorexit
    //   227: aload_1
    //   228: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	224	finally
    //   32	37	224	finally
    //   41	74	224	finally
    //   77	151	224	finally
    //   151	153	224	finally
    //   163	224	224	finally
    //   225	227	224	finally
  }
  
  private static class a {
    final Lock a = new ReentrantLock();
    
    int b;
  }
  
  private static class b {
    private final Queue<c.a> a = new ArrayDeque<c.a>();
    
    c.a a() {
      Queue<c.a> queue;
      c.a a;
      synchronized (this.a) {
        c.a a1 = this.a.poll();
        a = a1;
        if (a1 == null)
          a = new c.a(); 
        return a;
      } 
    }
    
    void b(c.a param1a) {
      synchronized (this.a) {
        if (this.a.size() < 10)
          this.a.offer(param1a); 
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */