package com.bumptech.glide.load.engine.x;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class j implements b {
  private final h<a, Object> a = new h<a, Object>();
  
  private final b b = new b();
  
  private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap<Class<?>, NavigableMap<Integer, Integer>>();
  
  private final Map<Class<?>, a<?>> d = new HashMap<Class<?>, a<?>>();
  
  private final int e;
  
  private int f;
  
  public j(int paramInt) {
    this.e = paramInt;
  }
  
  private void f(int paramInt, Class<?> paramClass) {
    NavigableMap<Integer, Integer> navigableMap = m(paramClass);
    Integer integer = navigableMap.get(Integer.valueOf(paramInt));
    if (integer != null) {
      if (integer.intValue() == 1) {
        navigableMap.remove(Integer.valueOf(paramInt));
      } else {
        navigableMap.put(Integer.valueOf(paramInt), Integer.valueOf(integer.intValue() - 1));
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Tried to decrement empty size, size: ");
    stringBuilder.append(paramInt);
    stringBuilder.append(", this: ");
    stringBuilder.append(this);
    throw new NullPointerException(stringBuilder.toString());
  }
  
  private void g() {
    h(this.e);
  }
  
  private void h(int paramInt) {
    while (this.f > paramInt) {
      Object object = this.a.f();
      com.bumptech.glide.p.j.d(object);
      a<Object> a = i(object);
      this.f -= a.b(object) * a.a();
      f(a.b(object), object.getClass());
      if (Log.isLoggable(a.getTag(), 2)) {
        String str = a.getTag();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("evicted: ");
        stringBuilder.append(a.b(object));
        Log.v(str, stringBuilder.toString());
      } 
    } 
  }
  
  private <T> a<T> i(T paramT) {
    return j((Class)paramT.getClass());
  }
  
  private <T> a<T> j(Class<T> paramClass) {
    StringBuilder stringBuilder;
    a a1 = this.d.get(paramClass);
    a a2 = a1;
    if (a1 == null) {
      if (paramClass.equals(int[].class)) {
        a2 = new i();
      } else if (paramClass.equals(byte[].class)) {
        a2 = new g();
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No array pool found for: ");
        stringBuilder.append(paramClass.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      this.d.put(paramClass, stringBuilder);
    } 
    return (a<T>)stringBuilder;
  }
  
  private <T> T k(a parama) {
    return (T)this.a.a(parama);
  }
  
  private <T> T l(a parama, Class<T> paramClass) {
    a<T> a1 = j(paramClass);
    T t2 = (T)k(parama);
    if (t2 != null) {
      this.f -= a1.b(t2) * a1.a();
      f(a1.b(t2), paramClass);
    } 
    T t1 = t2;
    if (t2 == null) {
      if (Log.isLoggable(a1.getTag(), 2)) {
        String str = a1.getTag();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Allocated ");
        stringBuilder.append(parama.b);
        stringBuilder.append(" bytes");
        Log.v(str, stringBuilder.toString());
      } 
      t1 = a1.newArray(parama.b);
    } 
    return t1;
  }
  
  private NavigableMap<Integer, Integer> m(Class<?> paramClass) {
    NavigableMap<Object, Object> navigableMap1 = (NavigableMap)this.c.get(paramClass);
    NavigableMap<Object, Object> navigableMap2 = navigableMap1;
    if (navigableMap1 == null) {
      navigableMap2 = new TreeMap<Object, Object>();
      this.c.put(paramClass, navigableMap2);
    } 
    return (NavigableMap)navigableMap2;
  }
  
  private boolean n() {
    int i = this.f;
    return (i == 0 || this.e / i >= 2);
  }
  
  private boolean o(int paramInt) {
    boolean bool;
    if (paramInt <= this.e / 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean p(int paramInt, Integer paramInteger) {
    boolean bool;
    if (paramInteger != null && (n() || paramInteger.intValue() <= paramInt * 8)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void a(int paramInt) {
    /* monitor enter ThisExpression{ObjectType{com/bumptech/glide/load/engine/x/j}} */
    if (paramInt >= 40) {
      try {
        b();
      } finally {
        Exception exception;
      } 
    } else if (paramInt >= 20 || paramInt == 15) {
      h(this.e / 2);
    } 
    /* monitor exit ThisExpression{ObjectType{com/bumptech/glide/load/engine/x/j}} */
  }
  
  public void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: invokespecial h : (I)V
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public <T> T c(int paramInt, Class<T> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield b : Lcom/bumptech/glide/load/engine/x/j$b;
    //   7: iload_1
    //   8: aload_2
    //   9: invokevirtual e : (ILjava/lang/Class;)Lcom/bumptech/glide/load/engine/x/j$a;
    //   12: aload_2
    //   13: invokespecial l : (Lcom/bumptech/glide/load/engine/x/j$a;Ljava/lang/Class;)Ljava/lang/Object;
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: areturn
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	21	finally
  }
  
  public <T> void d(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual getClass : ()Ljava/lang/Class;
    //   6: astore_2
    //   7: aload_0
    //   8: aload_2
    //   9: invokespecial j : (Ljava/lang/Class;)Lcom/bumptech/glide/load/engine/x/a;
    //   12: astore_3
    //   13: aload_3
    //   14: aload_1
    //   15: invokeinterface b : (Ljava/lang/Object;)I
    //   20: istore #4
    //   22: aload_3
    //   23: invokeinterface a : ()I
    //   28: iload #4
    //   30: imul
    //   31: istore #5
    //   33: aload_0
    //   34: iload #5
    //   36: invokespecial o : (I)Z
    //   39: istore #6
    //   41: iload #6
    //   43: ifne -> 49
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_0
    //   50: getfield b : Lcom/bumptech/glide/load/engine/x/j$b;
    //   53: iload #4
    //   55: aload_2
    //   56: invokevirtual e : (ILjava/lang/Class;)Lcom/bumptech/glide/load/engine/x/j$a;
    //   59: astore_3
    //   60: aload_0
    //   61: getfield a : Lcom/bumptech/glide/load/engine/x/h;
    //   64: aload_3
    //   65: aload_1
    //   66: invokevirtual d : (Lcom/bumptech/glide/load/engine/x/m;Ljava/lang/Object;)V
    //   69: aload_0
    //   70: aload_2
    //   71: invokespecial m : (Ljava/lang/Class;)Ljava/util/NavigableMap;
    //   74: astore_1
    //   75: aload_1
    //   76: aload_3
    //   77: getfield b : I
    //   80: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   83: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   88: checkcast java/lang/Integer
    //   91: astore_2
    //   92: aload_3
    //   93: getfield b : I
    //   96: istore #7
    //   98: iconst_1
    //   99: istore #4
    //   101: aload_2
    //   102: ifnonnull -> 108
    //   105: goto -> 116
    //   108: iconst_1
    //   109: aload_2
    //   110: invokevirtual intValue : ()I
    //   113: iadd
    //   114: istore #4
    //   116: aload_1
    //   117: iload #7
    //   119: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   122: iload #4
    //   124: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   127: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   132: pop
    //   133: aload_0
    //   134: aload_0
    //   135: getfield f : I
    //   138: iload #5
    //   140: iadd
    //   141: putfield f : I
    //   144: aload_0
    //   145: invokespecial g : ()V
    //   148: aload_0
    //   149: monitorexit
    //   150: return
    //   151: astore_1
    //   152: aload_0
    //   153: monitorexit
    //   154: aload_1
    //   155: athrow
    // Exception table:
    //   from	to	target	type
    //   2	41	151	finally
    //   49	98	151	finally
    //   108	116	151	finally
    //   116	148	151	finally
  }
  
  public <T> T e(int paramInt, Class<T> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokespecial m : (Ljava/lang/Class;)Ljava/util/NavigableMap;
    //   7: iload_1
    //   8: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11: invokeinterface ceilingKey : (Ljava/lang/Object;)Ljava/lang/Object;
    //   16: checkcast java/lang/Integer
    //   19: astore_3
    //   20: aload_0
    //   21: iload_1
    //   22: aload_3
    //   23: invokespecial p : (ILjava/lang/Integer;)Z
    //   26: ifeq -> 45
    //   29: aload_0
    //   30: getfield b : Lcom/bumptech/glide/load/engine/x/j$b;
    //   33: aload_3
    //   34: invokevirtual intValue : ()I
    //   37: aload_2
    //   38: invokevirtual e : (ILjava/lang/Class;)Lcom/bumptech/glide/load/engine/x/j$a;
    //   41: astore_3
    //   42: goto -> 55
    //   45: aload_0
    //   46: getfield b : Lcom/bumptech/glide/load/engine/x/j$b;
    //   49: iload_1
    //   50: aload_2
    //   51: invokevirtual e : (ILjava/lang/Class;)Lcom/bumptech/glide/load/engine/x/j$a;
    //   54: astore_3
    //   55: aload_0
    //   56: aload_3
    //   57: aload_2
    //   58: invokespecial l : (Lcom/bumptech/glide/load/engine/x/j$a;Ljava/lang/Class;)Ljava/lang/Object;
    //   61: astore_2
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_2
    //   65: areturn
    //   66: astore_2
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_2
    //   70: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	66	finally
    //   45	55	66	finally
    //   55	62	66	finally
  }
  
  private static final class a implements m {
    private final j.b a;
    
    int b;
    
    private Class<?> c;
    
    a(j.b param1b) {
      this.a = param1b;
    }
    
    public void a() {
      this.a.c(this);
    }
    
    void b(int param1Int, Class<?> param1Class) {
      this.b = param1Int;
      this.c = param1Class;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof a;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (bool) {
        param1Object = param1Object;
        bool2 = bool1;
        if (this.b == ((a)param1Object).b) {
          bool2 = bool1;
          if (this.c == ((a)param1Object).c)
            bool2 = true; 
        } 
      } 
      return bool2;
    }
    
    public int hashCode() {
      byte b1;
      int i = this.b;
      Class<?> clazz = this.c;
      if (clazz != null) {
        b1 = clazz.hashCode();
      } else {
        b1 = 0;
      } 
      return i * 31 + b1;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Key{size=");
      stringBuilder.append(this.b);
      stringBuilder.append("array=");
      stringBuilder.append(this.c);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  private static final class b extends d<a> {
    protected j.a d() {
      return new j.a(this);
    }
    
    j.a e(int param1Int, Class<?> param1Class) {
      j.a a = (j.a)b();
      a.b(param1Int, param1Class);
      return a;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */