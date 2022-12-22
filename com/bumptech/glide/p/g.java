package com.bumptech.glide.p;

import java.util.LinkedHashMap;
import java.util.Map;

public class g<T, Y> {
  private final Map<T, a<Y>> a = new LinkedHashMap<T, a<Y>>(100, 0.75F, true);
  
  private final long b;
  
  private long c;
  
  private long d;
  
  public g(long paramLong) {
    this.b = paramLong;
    this.c = paramLong;
  }
  
  private void f() {
    m(this.c);
  }
  
  public void b() {
    m(0L);
  }
  
  public Y g(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/bumptech/glide/p/g$a
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull -> 28
    //   20: aload_1
    //   21: getfield a : Ljava/lang/Object;
    //   24: astore_1
    //   25: goto -> 30
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: areturn
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	34	finally
    //   20	25	34	finally
  }
  
  public long h() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  protected int i(Y paramY) {
    return 1;
  }
  
  protected void j(T paramT, Y paramY) {}
  
  public Y k(T paramT, Y paramY) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokevirtual i : (Ljava/lang/Object;)I
    //   7: istore_3
    //   8: iload_3
    //   9: i2l
    //   10: lstore #4
    //   12: aload_0
    //   13: getfield c : J
    //   16: lstore #6
    //   18: aconst_null
    //   19: astore #8
    //   21: lload #4
    //   23: lload #6
    //   25: lcmp
    //   26: iflt -> 39
    //   29: aload_0
    //   30: aload_1
    //   31: aload_2
    //   32: invokevirtual j : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: aconst_null
    //   38: areturn
    //   39: aload_2
    //   40: ifnull -> 54
    //   43: aload_0
    //   44: aload_0
    //   45: getfield d : J
    //   48: lload #4
    //   50: ladd
    //   51: putfield d : J
    //   54: aload_0
    //   55: getfield a : Ljava/util/Map;
    //   58: astore #9
    //   60: aload_2
    //   61: ifnonnull -> 70
    //   64: aconst_null
    //   65: astore #10
    //   67: goto -> 81
    //   70: new com/bumptech/glide/p/g$a
    //   73: dup
    //   74: aload_2
    //   75: iload_3
    //   76: invokespecial <init> : (Ljava/lang/Object;I)V
    //   79: astore #10
    //   81: aload #9
    //   83: aload_1
    //   84: aload #10
    //   86: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   91: checkcast com/bumptech/glide/p/g$a
    //   94: astore #10
    //   96: aload #10
    //   98: ifnull -> 138
    //   101: aload_0
    //   102: aload_0
    //   103: getfield d : J
    //   106: aload #10
    //   108: getfield b : I
    //   111: i2l
    //   112: lsub
    //   113: putfield d : J
    //   116: aload #10
    //   118: getfield a : Ljava/lang/Object;
    //   121: aload_2
    //   122: invokevirtual equals : (Ljava/lang/Object;)Z
    //   125: ifne -> 138
    //   128: aload_0
    //   129: aload_1
    //   130: aload #10
    //   132: getfield a : Ljava/lang/Object;
    //   135: invokevirtual j : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   138: aload_0
    //   139: invokespecial f : ()V
    //   142: aload #8
    //   144: astore_1
    //   145: aload #10
    //   147: ifnull -> 156
    //   150: aload #10
    //   152: getfield a : Ljava/lang/Object;
    //   155: astore_1
    //   156: aload_0
    //   157: monitorexit
    //   158: aload_1
    //   159: areturn
    //   160: astore_1
    //   161: aload_0
    //   162: monitorexit
    //   163: aload_1
    //   164: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	160	finally
    //   12	18	160	finally
    //   29	35	160	finally
    //   43	54	160	finally
    //   54	60	160	finally
    //   70	81	160	finally
    //   81	96	160	finally
    //   101	138	160	finally
    //   138	142	160	finally
    //   150	156	160	finally
  }
  
  public Y l(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/bumptech/glide/p/g$a
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: aload_0
    //   26: getfield d : J
    //   29: aload_1
    //   30: getfield b : I
    //   33: i2l
    //   34: lsub
    //   35: putfield d : J
    //   38: aload_1
    //   39: getfield a : Ljava/lang/Object;
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: areturn
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	47	finally
    //   24	43	47	finally
  }
  
  protected void m(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : J
    //   6: lload_1
    //   7: lcmp
    //   8: ifle -> 93
    //   11: aload_0
    //   12: getfield a : Ljava/util/Map;
    //   15: invokeinterface entrySet : ()Ljava/util/Set;
    //   20: invokeinterface iterator : ()Ljava/util/Iterator;
    //   25: astore_3
    //   26: aload_3
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast java/util/Map$Entry
    //   35: astore #4
    //   37: aload #4
    //   39: invokeinterface getValue : ()Ljava/lang/Object;
    //   44: checkcast com/bumptech/glide/p/g$a
    //   47: astore #5
    //   49: aload_0
    //   50: aload_0
    //   51: getfield d : J
    //   54: aload #5
    //   56: getfield b : I
    //   59: i2l
    //   60: lsub
    //   61: putfield d : J
    //   64: aload #4
    //   66: invokeinterface getKey : ()Ljava/lang/Object;
    //   71: astore #4
    //   73: aload_3
    //   74: invokeinterface remove : ()V
    //   79: aload_0
    //   80: aload #4
    //   82: aload #5
    //   84: getfield a : Ljava/lang/Object;
    //   87: invokevirtual j : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   90: goto -> 2
    //   93: aload_0
    //   94: monitorexit
    //   95: return
    //   96: astore #5
    //   98: aload_0
    //   99: monitorexit
    //   100: goto -> 106
    //   103: aload #5
    //   105: athrow
    //   106: goto -> 103
    // Exception table:
    //   from	to	target	type
    //   2	90	96	finally
  }
  
  static final class a<Y> {
    final Y a;
    
    final int b;
    
    a(Y param1Y, int param1Int) {
      this.a = param1Y;
      this.b = param1Int;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */