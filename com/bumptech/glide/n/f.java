package com.bumptech.glide.n;

import com.bumptech.glide.load.g;
import java.util.ArrayList;
import java.util.List;

public class f {
  private final List<a<?>> a = new ArrayList<a<?>>();
  
  public <Z> void a(Class<Z> paramClass, g<Z> paramg) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: astore_3
    //   7: new com/bumptech/glide/n/f$a
    //   10: astore #4
    //   12: aload #4
    //   14: aload_1
    //   15: aload_2
    //   16: invokespecial <init> : (Ljava/lang/Class;Lcom/bumptech/glide/load/g;)V
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
  
  public <Z> g<Z> b(Class<Z> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: getfield a : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: istore_3
    //   14: iload_2
    //   15: iload_3
    //   16: if_icmpge -> 59
    //   19: aload_0
    //   20: getfield a : Ljava/util/List;
    //   23: iload_2
    //   24: invokeinterface get : (I)Ljava/lang/Object;
    //   29: checkcast com/bumptech/glide/n/f$a
    //   32: astore #4
    //   34: aload #4
    //   36: aload_1
    //   37: invokevirtual a : (Ljava/lang/Class;)Z
    //   40: ifeq -> 53
    //   43: aload #4
    //   45: getfield b : Lcom/bumptech/glide/load/g;
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: areturn
    //   53: iinc #2, 1
    //   56: goto -> 14
    //   59: aload_0
    //   60: monitorexit
    //   61: aconst_null
    //   62: areturn
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: goto -> 71
    //   69: aload_1
    //   70: athrow
    //   71: goto -> 69
    // Exception table:
    //   from	to	target	type
    //   4	14	63	finally
    //   19	49	63	finally
  }
  
  private static final class a<T> {
    private final Class<T> a;
    
    final g<T> b;
    
    a(Class<T> param1Class, g<T> param1g) {
      this.a = param1Class;
      this.b = param1g;
    }
    
    boolean a(Class<?> param1Class) {
      return this.a.isAssignableFrom(param1Class);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/n/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */