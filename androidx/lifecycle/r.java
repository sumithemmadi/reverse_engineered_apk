package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class r {
  private final Map<String, Object> a = new HashMap<String, Object>();
  
  private volatile boolean b = false;
  
  private static void b(Object paramObject) {
    if (paramObject instanceof Closeable)
      try {
        ((Closeable)paramObject).close();
      } catch (IOException iOException) {
        throw new RuntimeException(iOException);
      }  
  }
  
  final void a() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield b : Z
    //   5: aload_0
    //   6: getfield a : Ljava/util/Map;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull -> 62
    //   14: aload_1
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield a : Ljava/util/Map;
    //   20: invokeinterface values : ()Ljava/util/Collection;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 52
    //   40: aload_2
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: invokestatic b : (Ljava/lang/Object;)V
    //   49: goto -> 31
    //   52: aload_1
    //   53: monitorexit
    //   54: goto -> 62
    //   57: astore_2
    //   58: aload_1
    //   59: monitorexit
    //   60: aload_2
    //   61: athrow
    //   62: aload_0
    //   63: invokevirtual d : ()V
    //   66: return
    // Exception table:
    //   from	to	target	type
    //   16	31	57	finally
    //   31	49	57	finally
    //   52	54	57	finally
    //   58	60	57	finally
  }
  
  <T> T c(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/util/Map;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_2
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield a : Ljava/util/Map;
    //   17: aload_1
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: astore_1
    //   24: aload_2
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: astore_1
    //   29: aload_2
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   13	26	28	finally
    //   29	31	28	finally
  }
  
  protected void d() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */