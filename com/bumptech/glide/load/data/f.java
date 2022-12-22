package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

public class f {
  private static final e.a<?> a = new a();
  
  private final Map<Class<?>, e.a<?>> b = new HashMap<Class<?>, e.a<?>>();
  
  public <T> e<T> a(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: getfield b : Ljava/util/Map;
    //   11: aload_1
    //   12: invokevirtual getClass : ()Ljava/lang/Class;
    //   15: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast com/bumptech/glide/load/data/e$a
    //   23: astore_2
    //   24: aload_2
    //   25: astore_3
    //   26: aload_2
    //   27: ifnonnull -> 85
    //   30: aload_0
    //   31: getfield b : Ljava/util/Map;
    //   34: invokeinterface values : ()Ljava/util/Collection;
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #4
    //   46: aload_2
    //   47: astore_3
    //   48: aload #4
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 85
    //   58: aload #4
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: checkcast com/bumptech/glide/load/data/e$a
    //   68: astore_3
    //   69: aload_3
    //   70: invokeinterface a : ()Ljava/lang/Class;
    //   75: aload_1
    //   76: invokevirtual getClass : ()Ljava/lang/Class;
    //   79: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   82: ifeq -> 46
    //   85: aload_3
    //   86: astore_2
    //   87: aload_3
    //   88: ifnonnull -> 95
    //   91: getstatic com/bumptech/glide/load/data/f.a : Lcom/bumptech/glide/load/data/e$a;
    //   94: astore_2
    //   95: aload_2
    //   96: aload_1
    //   97: invokeinterface b : (Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: areturn
    //   107: astore_1
    //   108: aload_0
    //   109: monitorexit
    //   110: goto -> 115
    //   113: aload_1
    //   114: athrow
    //   115: goto -> 113
    // Exception table:
    //   from	to	target	type
    //   2	24	107	finally
    //   30	46	107	finally
    //   48	85	107	finally
    //   91	95	107	finally
    //   95	103	107	finally
  }
  
  public void b(e.a<?> parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface a : ()Ljava/lang/Class;
    //   12: aload_1
    //   13: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   18: pop
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  class a implements e.a<Object> {
    public Class<Object> a() {
      throw new UnsupportedOperationException("Not implemented");
    }
    
    public e<Object> b(Object param1Object) {
      return new f.b(param1Object);
    }
  }
  
  private static final class b implements e<Object> {
    private final Object a;
    
    b(Object param1Object) {
      this.a = param1Object;
    }
    
    public Object a() {
      return this.a;
    }
    
    public void b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */