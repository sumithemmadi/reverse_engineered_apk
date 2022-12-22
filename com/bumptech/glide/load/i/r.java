package com.bumptech.glide.load.i;

import b.h.j.f;
import com.bumptech.glide.load.e;
import com.bumptech.glide.p.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class r {
  private static final c a = new c();
  
  private static final n<Object, Object> b = new a();
  
  private final List<b<?, ?>> c = new ArrayList<b<?, ?>>();
  
  private final c d;
  
  private final Set<b<?, ?>> e = new HashSet<b<?, ?>>();
  
  private final f<List<Throwable>> f;
  
  public r(f<List<Throwable>> paramf) {
    this(paramf, a);
  }
  
  r(f<List<Throwable>> paramf, c paramc) {
    this.f = paramf;
    this.d = paramc;
  }
  
  private <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo, boolean paramBoolean) {
    boolean bool;
    b<Model, Data> b = new b<Model, Data>(paramClass, paramClass1, paramo);
    List<b<?, ?>> list = this.c;
    if (paramBoolean) {
      bool = list.size();
    } else {
      bool = false;
    } 
    list.add(bool, b);
  }
  
  private <Model, Data> n<Model, Data> c(b<?, ?> paramb) {
    return (n<Model, Data>)j.d(paramb.c.b(this));
  }
  
  private static <Model, Data> n<Model, Data> f() {
    return (n)b;
  }
  
  <Model, Data> void b(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: aload_3
    //   6: iconst_1
    //   7: invokespecial a : (Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/i/o;Z)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	13	finally
  }
  
  public <Model, Data> n<Model, Data> d(Class<Model> paramClass, Class<Data> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: getfield c : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore #4
    //   21: iconst_0
    //   22: istore #5
    //   24: aload #4
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 116
    //   34: aload #4
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast com/bumptech/glide/load/i/r$b
    //   44: astore #6
    //   46: aload_0
    //   47: getfield e : Ljava/util/Set;
    //   50: aload #6
    //   52: invokeinterface contains : (Ljava/lang/Object;)Z
    //   57: ifeq -> 66
    //   60: iconst_1
    //   61: istore #5
    //   63: goto -> 24
    //   66: aload #6
    //   68: aload_1
    //   69: aload_2
    //   70: invokevirtual b : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   73: ifeq -> 24
    //   76: aload_0
    //   77: getfield e : Ljava/util/Set;
    //   80: aload #6
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload_3
    //   89: aload_0
    //   90: aload #6
    //   92: invokespecial c : (Lcom/bumptech/glide/load/i/r$b;)Lcom/bumptech/glide/load/i/n;
    //   95: invokeinterface add : (Ljava/lang/Object;)Z
    //   100: pop
    //   101: aload_0
    //   102: getfield e : Ljava/util/Set;
    //   105: aload #6
    //   107: invokeinterface remove : (Ljava/lang/Object;)Z
    //   112: pop
    //   113: goto -> 24
    //   116: aload_3
    //   117: invokeinterface size : ()I
    //   122: iconst_1
    //   123: if_icmple -> 143
    //   126: aload_0
    //   127: getfield d : Lcom/bumptech/glide/load/i/r$c;
    //   130: aload_3
    //   131: aload_0
    //   132: getfield f : Lb/h/j/f;
    //   135: invokevirtual a : (Ljava/util/List;Lb/h/j/f;)Lcom/bumptech/glide/load/i/q;
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: areturn
    //   143: aload_3
    //   144: invokeinterface size : ()I
    //   149: iconst_1
    //   150: if_icmpne -> 168
    //   153: aload_3
    //   154: iconst_0
    //   155: invokeinterface get : (I)Ljava/lang/Object;
    //   160: checkcast com/bumptech/glide/load/i/n
    //   163: astore_1
    //   164: aload_0
    //   165: monitorexit
    //   166: aload_1
    //   167: areturn
    //   168: iload #5
    //   170: ifeq -> 181
    //   173: invokestatic f : ()Lcom/bumptech/glide/load/i/n;
    //   176: astore_1
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_1
    //   180: areturn
    //   181: new com/bumptech/glide/Registry$NoModelLoaderAvailableException
    //   184: astore_3
    //   185: aload_3
    //   186: aload_1
    //   187: aload_2
    //   188: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Class;)V
    //   191: aload_3
    //   192: athrow
    //   193: astore_1
    //   194: aload_0
    //   195: getfield e : Ljava/util/Set;
    //   198: invokeinterface clear : ()V
    //   203: aload_1
    //   204: athrow
    //   205: astore_1
    //   206: aload_0
    //   207: monitorexit
    //   208: goto -> 213
    //   211: aload_1
    //   212: athrow
    //   213: goto -> 211
    // Exception table:
    //   from	to	target	type
    //   2	21	193	finally
    //   24	60	193	finally
    //   66	113	193	finally
    //   116	139	193	finally
    //   143	164	193	finally
    //   173	177	193	finally
    //   181	193	193	finally
    //   194	205	205	finally
  }
  
  <Model> List<n<Model, ?>> e(Class<Model> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: getfield c : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 106
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast com/bumptech/glide/load/i/r$b
    //   38: astore #4
    //   40: aload_0
    //   41: getfield e : Ljava/util/Set;
    //   44: aload #4
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: ifeq -> 57
    //   54: goto -> 20
    //   57: aload #4
    //   59: aload_1
    //   60: invokevirtual a : (Ljava/lang/Class;)Z
    //   63: ifeq -> 20
    //   66: aload_0
    //   67: getfield e : Ljava/util/Set;
    //   70: aload #4
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_2
    //   79: aload_0
    //   80: aload #4
    //   82: invokespecial c : (Lcom/bumptech/glide/load/i/r$b;)Lcom/bumptech/glide/load/i/n;
    //   85: invokeinterface add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: aload_0
    //   92: getfield e : Ljava/util/Set;
    //   95: aload #4
    //   97: invokeinterface remove : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: goto -> 20
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: areturn
    //   110: astore_1
    //   111: aload_0
    //   112: getfield e : Ljava/util/Set;
    //   115: invokeinterface clear : ()V
    //   120: aload_1
    //   121: athrow
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: goto -> 130
    //   128: aload_1
    //   129: athrow
    //   130: goto -> 128
    // Exception table:
    //   from	to	target	type
    //   2	20	110	finally
    //   20	54	110	finally
    //   57	103	110	finally
    //   111	122	122	finally
  }
  
  List<Class<?>> g(Class<?> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: getfield c : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 78
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast com/bumptech/glide/load/i/r$b
    //   38: astore #4
    //   40: aload_2
    //   41: aload #4
    //   43: getfield b : Ljava/lang/Class;
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: ifne -> 20
    //   54: aload #4
    //   56: aload_1
    //   57: invokevirtual a : (Ljava/lang/Class;)Z
    //   60: ifeq -> 20
    //   63: aload_2
    //   64: aload #4
    //   66: getfield b : Ljava/lang/Class;
    //   69: invokeinterface add : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: goto -> 20
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: areturn
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: goto -> 90
    //   88: aload_1
    //   89: athrow
    //   90: goto -> 88
    // Exception table:
    //   from	to	target	type
    //   2	20	82	finally
    //   20	75	82	finally
  }
  
  private static class a implements n<Object, Object> {
    public boolean a(Object param1Object) {
      return false;
    }
    
    public n.a<Object> b(Object param1Object, int param1Int1, int param1Int2, e param1e) {
      return null;
    }
  }
  
  private static class b<Model, Data> {
    private final Class<Model> a;
    
    final Class<Data> b;
    
    final o<? extends Model, ? extends Data> c;
    
    public b(Class<Model> param1Class, Class<Data> param1Class1, o<? extends Model, ? extends Data> param1o) {
      this.a = param1Class;
      this.b = param1Class1;
      this.c = param1o;
    }
    
    public boolean a(Class<?> param1Class) {
      return this.a.isAssignableFrom(param1Class);
    }
    
    public boolean b(Class<?> param1Class1, Class<?> param1Class2) {
      boolean bool;
      if (a(param1Class1) && this.b.isAssignableFrom(param1Class2)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  static class c {
    public <Model, Data> q<Model, Data> a(List<n<Model, Data>> param1List, f<List<Throwable>> param1f) {
      return new q<Model, Data>(param1List, param1f);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */