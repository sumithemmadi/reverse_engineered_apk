package com.bumptech.glide.n;

import com.bumptech.glide.load.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {
  private final List<String> a = new ArrayList<String>();
  
  private final Map<String, List<a<?, ?>>> b = new HashMap<String, List<a<?, ?>>>();
  
  private List<a<?, ?>> c(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: aload_1
    //   7: invokeinterface contains : (Ljava/lang/Object;)Z
    //   12: ifne -> 26
    //   15: aload_0
    //   16: getfield a : Ljava/util/List;
    //   19: aload_1
    //   20: invokeinterface add : (Ljava/lang/Object;)Z
    //   25: pop
    //   26: aload_0
    //   27: getfield b : Ljava/util/Map;
    //   30: aload_1
    //   31: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast java/util/List
    //   39: astore_2
    //   40: aload_2
    //   41: astore_3
    //   42: aload_2
    //   43: ifnonnull -> 66
    //   46: new java/util/ArrayList
    //   49: astore_3
    //   50: aload_3
    //   51: invokespecial <init> : ()V
    //   54: aload_0
    //   55: getfield b : Ljava/util/Map;
    //   58: aload_1
    //   59: aload_3
    //   60: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   65: pop
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_3
    //   69: areturn
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	70	finally
    //   26	40	70	finally
    //   46	66	70	finally
  }
  
  public <T, R> void a(String paramString, f<T, R> paramf, Class<T> paramClass, Class<R> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial c : (Ljava/lang/String;)Ljava/util/List;
    //   7: astore #5
    //   9: new com/bumptech/glide/n/e$a
    //   12: astore_1
    //   13: aload_1
    //   14: aload_3
    //   15: aload #4
    //   17: aload_2
    //   18: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/f;)V
    //   21: aload #5
    //   23: aload_1
    //   24: invokeinterface add : (Ljava/lang/Object;)Z
    //   29: pop
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	30	33	finally
  }
  
  public <T, R> List<f<T, R>> b(Class<T> paramClass, Class<R> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: getfield a : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore #4
    //   21: aload #4
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 123
    //   31: aload #4
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast java/lang/String
    //   41: astore #5
    //   43: aload_0
    //   44: getfield b : Ljava/util/Map;
    //   47: aload #5
    //   49: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast java/util/List
    //   57: astore #5
    //   59: aload #5
    //   61: ifnonnull -> 67
    //   64: goto -> 21
    //   67: aload #5
    //   69: invokeinterface iterator : ()Ljava/util/Iterator;
    //   74: astore #6
    //   76: aload #6
    //   78: invokeinterface hasNext : ()Z
    //   83: ifeq -> 21
    //   86: aload #6
    //   88: invokeinterface next : ()Ljava/lang/Object;
    //   93: checkcast com/bumptech/glide/n/e$a
    //   96: astore #5
    //   98: aload #5
    //   100: aload_1
    //   101: aload_2
    //   102: invokevirtual a : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   105: ifeq -> 76
    //   108: aload_3
    //   109: aload #5
    //   111: getfield c : Lcom/bumptech/glide/load/f;
    //   114: invokeinterface add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: goto -> 76
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_3
    //   126: areturn
    //   127: astore_1
    //   128: aload_0
    //   129: monitorexit
    //   130: goto -> 135
    //   133: aload_1
    //   134: athrow
    //   135: goto -> 133
    // Exception table:
    //   from	to	target	type
    //   2	21	127	finally
    //   21	59	127	finally
    //   67	76	127	finally
    //   76	120	127	finally
  }
  
  public <T, R> List<Class<R>> d(Class<T> paramClass, Class<R> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: getfield a : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore #4
    //   21: aload #4
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 137
    //   31: aload #4
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast java/lang/String
    //   41: astore #5
    //   43: aload_0
    //   44: getfield b : Ljava/util/Map;
    //   47: aload #5
    //   49: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast java/util/List
    //   57: astore #5
    //   59: aload #5
    //   61: ifnonnull -> 67
    //   64: goto -> 21
    //   67: aload #5
    //   69: invokeinterface iterator : ()Ljava/util/Iterator;
    //   74: astore #6
    //   76: aload #6
    //   78: invokeinterface hasNext : ()Z
    //   83: ifeq -> 21
    //   86: aload #6
    //   88: invokeinterface next : ()Ljava/lang/Object;
    //   93: checkcast com/bumptech/glide/n/e$a
    //   96: astore #5
    //   98: aload #5
    //   100: aload_1
    //   101: aload_2
    //   102: invokevirtual a : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   105: ifeq -> 76
    //   108: aload_3
    //   109: aload #5
    //   111: getfield b : Ljava/lang/Class;
    //   114: invokeinterface contains : (Ljava/lang/Object;)Z
    //   119: ifne -> 76
    //   122: aload_3
    //   123: aload #5
    //   125: getfield b : Ljava/lang/Class;
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: goto -> 76
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_3
    //   140: areturn
    //   141: astore_1
    //   142: aload_0
    //   143: monitorexit
    //   144: goto -> 149
    //   147: aload_1
    //   148: athrow
    //   149: goto -> 147
    // Exception table:
    //   from	to	target	type
    //   2	21	141	finally
    //   21	59	141	finally
    //   67	76	141	finally
    //   76	134	141	finally
  }
  
  public <T, R> void e(String paramString, f<T, R> paramf, Class<T> paramClass, Class<R> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial c : (Ljava/lang/String;)Ljava/util/List;
    //   7: astore #5
    //   9: new com/bumptech/glide/n/e$a
    //   12: astore_1
    //   13: aload_1
    //   14: aload_3
    //   15: aload #4
    //   17: aload_2
    //   18: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/f;)V
    //   21: aload #5
    //   23: iconst_0
    //   24: aload_1
    //   25: invokeinterface add : (ILjava/lang/Object;)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	30	33	finally
  }
  
  public void f(List<String> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: getfield a : Ljava/util/List;
    //   11: invokespecial <init> : (Ljava/util/Collection;)V
    //   14: aload_0
    //   15: getfield a : Ljava/util/List;
    //   18: invokeinterface clear : ()V
    //   23: aload_1
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore_3
    //   30: aload_3
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 65
    //   39: aload_3
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast java/lang/String
    //   48: astore #4
    //   50: aload_0
    //   51: getfield a : Ljava/util/List;
    //   54: aload #4
    //   56: invokeinterface add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: goto -> 30
    //   65: aload_2
    //   66: invokeinterface iterator : ()Ljava/util/Iterator;
    //   71: astore #4
    //   73: aload #4
    //   75: invokeinterface hasNext : ()Z
    //   80: ifeq -> 118
    //   83: aload #4
    //   85: invokeinterface next : ()Ljava/lang/Object;
    //   90: checkcast java/lang/String
    //   93: astore_3
    //   94: aload_1
    //   95: aload_3
    //   96: invokeinterface contains : (Ljava/lang/Object;)Z
    //   101: ifne -> 73
    //   104: aload_0
    //   105: getfield a : Ljava/util/List;
    //   108: aload_3
    //   109: invokeinterface add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: goto -> 73
    //   118: aload_0
    //   119: monitorexit
    //   120: return
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: goto -> 129
    //   127: aload_1
    //   128: athrow
    //   129: goto -> 127
    // Exception table:
    //   from	to	target	type
    //   2	30	121	finally
    //   30	62	121	finally
    //   65	73	121	finally
    //   73	115	121	finally
  }
  
  private static class a<T, R> {
    private final Class<T> a;
    
    final Class<R> b;
    
    final f<T, R> c;
    
    public a(Class<T> param1Class, Class<R> param1Class1, f<T, R> param1f) {
      this.a = param1Class;
      this.b = param1Class1;
      this.c = param1f;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/n/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */