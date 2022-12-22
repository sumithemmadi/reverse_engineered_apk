package com.bumptech.glide.n;

import java.util.ArrayList;
import java.util.List;

public class a {
  private final List<a<?>> a = new ArrayList<a<?>>();
  
  public <T> void a(Class<T> paramClass, com.bumptech.glide.load.a<T> parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: astore_3
    //   7: new com/bumptech/glide/n/a$a
    //   10: astore #4
    //   12: aload #4
    //   14: aload_1
    //   15: aload_2
    //   16: invokespecial <init> : (Ljava/lang/Class;Lcom/bumptech/glide/load/a;)V
    //   19: aload_3
    //   20: aload #4
    //   22: invokeinterface add : (Ljava/lang/Object;)Z
    //   27: pop
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	31	finally
  }
  
  public <T> com.bumptech.glide.load.a<T> b(Class<T> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_2
    //   12: aload_2
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 48
    //   21: aload_2
    //   22: invokeinterface next : ()Ljava/lang/Object;
    //   27: checkcast com/bumptech/glide/n/a$a
    //   30: astore_3
    //   31: aload_3
    //   32: aload_1
    //   33: invokevirtual a : (Ljava/lang/Class;)Z
    //   36: ifeq -> 12
    //   39: aload_3
    //   40: getfield b : Lcom/bumptech/glide/load/a;
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: areturn
    //   48: aload_0
    //   49: monitorexit
    //   50: aconst_null
    //   51: areturn
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: goto -> 60
    //   58: aload_1
    //   59: athrow
    //   60: goto -> 58
    // Exception table:
    //   from	to	target	type
    //   2	12	52	finally
    //   12	44	52	finally
  }
  
  private static final class a<T> {
    private final Class<T> a;
    
    final com.bumptech.glide.load.a<T> b;
    
    a(Class<T> param1Class, com.bumptech.glide.load.a<T> param1a) {
      this.a = param1Class;
      this.b = param1a;
    }
    
    boolean a(Class<?> param1Class) {
      return this.a.isAssignableFrom(param1Class);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */