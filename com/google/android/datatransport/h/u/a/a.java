package com.google.android.datatransport.h.u.a;

import e.a.a;

public final class a<T> implements a<T> {
  private static final Object a = new Object();
  
  private volatile a<T> b;
  
  private volatile Object c = a;
  
  private a(a<T> parama) {
    this.b = parama;
  }
  
  public static <P extends a<T>, T> a<T> a(P paramP) {
    d.b(paramP);
    return (a<T>)((paramP instanceof a) ? (Object)paramP : new a<T>((a<T>)paramP));
  }
  
  public static Object b(Object paramObject1, Object paramObject2) {
    boolean bool;
    if (paramObject1 != a) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool || paramObject1 == paramObject2)
      return paramObject2; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
    stringBuilder.append(paramObject1);
    stringBuilder.append(" & ");
    stringBuilder.append(paramObject2);
    stringBuilder.append(". This is likely due to a circular dependency.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public T get() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: astore_1
    //   5: getstatic com/google/android/datatransport/h/u/a/a.a : Ljava/lang/Object;
    //   8: astore_2
    //   9: aload_1
    //   10: astore_3
    //   11: aload_1
    //   12: aload_2
    //   13: if_acmpne -> 67
    //   16: aload_0
    //   17: monitorenter
    //   18: aload_0
    //   19: getfield c : Ljava/lang/Object;
    //   22: astore_1
    //   23: aload_1
    //   24: astore_3
    //   25: aload_1
    //   26: aload_2
    //   27: if_acmpne -> 57
    //   30: aload_0
    //   31: getfield b : Le/a/a;
    //   34: invokeinterface get : ()Ljava/lang/Object;
    //   39: astore_3
    //   40: aload_0
    //   41: aload_0
    //   42: getfield c : Ljava/lang/Object;
    //   45: aload_3
    //   46: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: putfield c : Ljava/lang/Object;
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield b : Le/a/a;
    //   57: aload_0
    //   58: monitorexit
    //   59: goto -> 67
    //   62: astore_3
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_3
    //   66: athrow
    //   67: aload_3
    //   68: areturn
    // Exception table:
    //   from	to	target	type
    //   18	23	62	finally
    //   30	57	62	finally
    //   57	59	62	finally
    //   63	65	62	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/u/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */