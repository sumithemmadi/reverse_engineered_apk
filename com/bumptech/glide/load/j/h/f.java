package com.bumptech.glide.load.j.h;

import java.util.ArrayList;
import java.util.List;

public class f {
  private final List<a<?, ?>> a = new ArrayList<a<?, ?>>();
  
  public <Z, R> e<Z, R> a(Class<Z> paramClass, Class<R> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: aload_1
    //   4: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   7: ifeq -> 18
    //   10: invokestatic b : ()Lcom/bumptech/glide/load/j/h/e;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: aload_0
    //   19: getfield a : Ljava/util/List;
    //   22: invokeinterface iterator : ()Ljava/util/Iterator;
    //   27: astore_3
    //   28: aload_3
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 68
    //   37: aload_3
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast com/bumptech/glide/load/j/h/f$a
    //   46: astore #4
    //   48: aload #4
    //   50: aload_1
    //   51: aload_2
    //   52: invokevirtual a : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   55: ifeq -> 28
    //   58: aload #4
    //   60: getfield c : Lcom/bumptech/glide/load/j/h/e;
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: areturn
    //   68: new java/lang/IllegalArgumentException
    //   71: astore_3
    //   72: new java/lang/StringBuilder
    //   75: astore #4
    //   77: aload #4
    //   79: invokespecial <init> : ()V
    //   82: aload #4
    //   84: ldc 'No transcoder registered to transcode from '
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload #4
    //   92: aload_1
    //   93: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #4
    //   99: ldc ' to '
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #4
    //   107: aload_2
    //   108: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_3
    //   113: aload #4
    //   115: invokevirtual toString : ()Ljava/lang/String;
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: aload_3
    //   122: athrow
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: goto -> 131
    //   129: aload_1
    //   130: athrow
    //   131: goto -> 129
    // Exception table:
    //   from	to	target	type
    //   2	14	123	finally
    //   18	28	123	finally
    //   28	64	123	finally
    //   68	123	123	finally
  }
  
  public <Z, R> List<Class<R>> b(Class<Z> paramClass, Class<R> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial <init> : ()V
    //   10: aload_2
    //   11: aload_1
    //   12: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   15: ifeq -> 30
    //   18: aload_3
    //   19: aload_2
    //   20: invokeinterface add : (Ljava/lang/Object;)Z
    //   25: pop
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_3
    //   29: areturn
    //   30: aload_0
    //   31: getfield a : Ljava/util/List;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #4
    //   41: aload #4
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 80
    //   51: aload #4
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast com/bumptech/glide/load/j/h/f$a
    //   61: aload_1
    //   62: aload_2
    //   63: invokevirtual a : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   66: ifeq -> 41
    //   69: aload_3
    //   70: aload_2
    //   71: invokeinterface add : (Ljava/lang/Object;)Z
    //   76: pop
    //   77: goto -> 41
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_3
    //   83: areturn
    //   84: astore_1
    //   85: aload_0
    //   86: monitorexit
    //   87: goto -> 92
    //   90: aload_1
    //   91: athrow
    //   92: goto -> 90
    // Exception table:
    //   from	to	target	type
    //   2	26	84	finally
    //   30	41	84	finally
    //   41	77	84	finally
  }
  
  public <Z, R> void c(Class<Z> paramClass, Class<R> paramClass1, e<Z, R> parame) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: astore #4
    //   8: new com/bumptech/glide/load/j/h/f$a
    //   11: astore #5
    //   13: aload #5
    //   15: aload_1
    //   16: aload_2
    //   17: aload_3
    //   18: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/j/h/e;)V
    //   21: aload #4
    //   23: aload #5
    //   25: invokeinterface add : (Ljava/lang/Object;)Z
    //   30: pop
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	31	34	finally
  }
  
  private static final class a<Z, R> {
    private final Class<Z> a;
    
    private final Class<R> b;
    
    final e<Z, R> c;
    
    a(Class<Z> param1Class, Class<R> param1Class1, e<Z, R> param1e) {
      this.a = param1Class;
      this.b = param1Class1;
      this.c = param1e;
    }
    
    public boolean a(Class<?> param1Class1, Class<?> param1Class2) {
      boolean bool;
      if (this.a.isAssignableFrom(param1Class1) && param1Class2.isAssignableFrom(this.b)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */