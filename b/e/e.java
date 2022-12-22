package b.e;

import java.util.LinkedHashMap;

public class e<K, V> {
  private final LinkedHashMap<K, V> a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  public e(int paramInt) {
    if (paramInt > 0) {
      this.c = paramInt;
      this.a = new LinkedHashMap<K, V>(0, 0.75F, true);
      return;
    } 
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  private int e(K paramK, V paramV) {
    int i = f(paramK, paramV);
    if (i >= 0)
      return i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Negative size: ");
    stringBuilder.append(paramK);
    stringBuilder.append("=");
    stringBuilder.append(paramV);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected V a(K paramK) {
    return null;
  }
  
  protected void b(boolean paramBoolean, K paramK, V paramV1, V paramV2) {}
  
  public final V c(K paramK) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 147
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield a : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: astore_2
    //   15: aload_2
    //   16: ifnull -> 33
    //   19: aload_0
    //   20: aload_0
    //   21: getfield g : I
    //   24: iconst_1
    //   25: iadd
    //   26: putfield g : I
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_2
    //   32: areturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield h : I
    //   38: iconst_1
    //   39: iadd
    //   40: putfield h : I
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_0
    //   46: aload_1
    //   47: invokevirtual a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   50: astore_2
    //   51: aload_2
    //   52: ifnonnull -> 57
    //   55: aconst_null
    //   56: areturn
    //   57: aload_0
    //   58: monitorenter
    //   59: aload_0
    //   60: aload_0
    //   61: getfield e : I
    //   64: iconst_1
    //   65: iadd
    //   66: putfield e : I
    //   69: aload_0
    //   70: getfield a : Ljava/util/LinkedHashMap;
    //   73: aload_1
    //   74: aload_2
    //   75: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: astore_3
    //   79: aload_3
    //   80: ifnull -> 96
    //   83: aload_0
    //   84: getfield a : Ljava/util/LinkedHashMap;
    //   87: aload_1
    //   88: aload_3
    //   89: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   92: pop
    //   93: goto -> 111
    //   96: aload_0
    //   97: aload_0
    //   98: getfield b : I
    //   101: aload_0
    //   102: aload_1
    //   103: aload_2
    //   104: invokespecial e : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   107: iadd
    //   108: putfield b : I
    //   111: aload_0
    //   112: monitorexit
    //   113: aload_3
    //   114: ifnull -> 127
    //   117: aload_0
    //   118: iconst_0
    //   119: aload_1
    //   120: aload_2
    //   121: aload_3
    //   122: invokevirtual b : (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   125: aload_3
    //   126: areturn
    //   127: aload_0
    //   128: aload_0
    //   129: getfield c : I
    //   132: invokevirtual g : (I)V
    //   135: aload_2
    //   136: areturn
    //   137: astore_1
    //   138: aload_0
    //   139: monitorexit
    //   140: aload_1
    //   141: athrow
    //   142: astore_1
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_1
    //   146: athrow
    //   147: new java/lang/NullPointerException
    //   150: dup
    //   151: ldc 'key == null'
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: athrow
    // Exception table:
    //   from	to	target	type
    //   6	15	142	finally
    //   19	31	142	finally
    //   33	45	142	finally
    //   59	79	137	finally
    //   83	93	137	finally
    //   96	111	137	finally
    //   111	113	137	finally
    //   138	140	137	finally
    //   143	145	142	finally
  }
  
  public final V d(K paramK, V paramV) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 93
    //   4: aload_2
    //   5: ifnull -> 93
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: aload_0
    //   12: getfield d : I
    //   15: iconst_1
    //   16: iadd
    //   17: putfield d : I
    //   20: aload_0
    //   21: aload_0
    //   22: getfield b : I
    //   25: aload_0
    //   26: aload_1
    //   27: aload_2
    //   28: invokespecial e : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   31: iadd
    //   32: putfield b : I
    //   35: aload_0
    //   36: getfield a : Ljava/util/LinkedHashMap;
    //   39: aload_1
    //   40: aload_2
    //   41: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   44: astore_3
    //   45: aload_3
    //   46: ifnull -> 64
    //   49: aload_0
    //   50: aload_0
    //   51: getfield b : I
    //   54: aload_0
    //   55: aload_1
    //   56: aload_3
    //   57: invokespecial e : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   60: isub
    //   61: putfield b : I
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_3
    //   67: ifnull -> 78
    //   70: aload_0
    //   71: iconst_0
    //   72: aload_1
    //   73: aload_3
    //   74: aload_2
    //   75: invokevirtual b : (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   78: aload_0
    //   79: aload_0
    //   80: getfield c : I
    //   83: invokevirtual g : (I)V
    //   86: aload_3
    //   87: areturn
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    //   93: new java/lang/NullPointerException
    //   96: dup
    //   97: ldc 'key == null || value == null'
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: athrow
    // Exception table:
    //   from	to	target	type
    //   10	45	88	finally
    //   49	64	88	finally
    //   64	66	88	finally
    //   89	91	88	finally
  }
  
  protected int f(K paramK, V paramV) {
    return 1;
  }
  
  public void g(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : I
    //   6: iflt -> 132
    //   9: aload_0
    //   10: getfield a : Ljava/util/LinkedHashMap;
    //   13: invokevirtual isEmpty : ()Z
    //   16: ifeq -> 26
    //   19: aload_0
    //   20: getfield b : I
    //   23: ifne -> 132
    //   26: aload_0
    //   27: getfield b : I
    //   30: iload_1
    //   31: if_icmple -> 129
    //   34: aload_0
    //   35: getfield a : Ljava/util/LinkedHashMap;
    //   38: invokevirtual isEmpty : ()Z
    //   41: ifeq -> 47
    //   44: goto -> 129
    //   47: aload_0
    //   48: getfield a : Ljava/util/LinkedHashMap;
    //   51: invokevirtual entrySet : ()Ljava/util/Set;
    //   54: invokeinterface iterator : ()Ljava/util/Iterator;
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast java/util/Map$Entry
    //   67: astore_2
    //   68: aload_2
    //   69: invokeinterface getKey : ()Ljava/lang/Object;
    //   74: astore_3
    //   75: aload_2
    //   76: invokeinterface getValue : ()Ljava/lang/Object;
    //   81: astore_2
    //   82: aload_0
    //   83: getfield a : Ljava/util/LinkedHashMap;
    //   86: aload_3
    //   87: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   90: pop
    //   91: aload_0
    //   92: aload_0
    //   93: getfield b : I
    //   96: aload_0
    //   97: aload_3
    //   98: aload_2
    //   99: invokespecial e : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   102: isub
    //   103: putfield b : I
    //   106: aload_0
    //   107: aload_0
    //   108: getfield f : I
    //   111: iconst_1
    //   112: iadd
    //   113: putfield f : I
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_0
    //   119: iconst_1
    //   120: aload_3
    //   121: aload_2
    //   122: aconst_null
    //   123: invokevirtual b : (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   126: goto -> 0
    //   129: aload_0
    //   130: monitorexit
    //   131: return
    //   132: new java/lang/IllegalStateException
    //   135: astore_2
    //   136: new java/lang/StringBuilder
    //   139: astore_3
    //   140: aload_3
    //   141: invokespecial <init> : ()V
    //   144: aload_3
    //   145: aload_0
    //   146: invokevirtual getClass : ()Ljava/lang/Class;
    //   149: invokevirtual getName : ()Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload_3
    //   157: ldc '.sizeOf() is reporting inconsistent results!'
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_2
    //   164: aload_3
    //   165: invokevirtual toString : ()Ljava/lang/String;
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: aload_2
    //   172: athrow
    //   173: astore_3
    //   174: aload_0
    //   175: monitorexit
    //   176: goto -> 181
    //   179: aload_3
    //   180: athrow
    //   181: goto -> 179
    // Exception table:
    //   from	to	target	type
    //   2	26	173	finally
    //   26	44	173	finally
    //   47	118	173	finally
    //   129	131	173	finally
    //   132	173	173	finally
    //   174	176	173	finally
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : I
    //   6: istore_1
    //   7: aload_0
    //   8: getfield h : I
    //   11: iload_1
    //   12: iadd
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq -> 28
    //   18: iload_1
    //   19: bipush #100
    //   21: imul
    //   22: iload_2
    //   23: idiv
    //   24: istore_2
    //   25: goto -> 30
    //   28: iconst_0
    //   29: istore_2
    //   30: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   33: ldc 'LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]'
    //   35: iconst_4
    //   36: anewarray java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_0
    //   42: getfield c : I
    //   45: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload_0
    //   52: getfield g : I
    //   55: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_2
    //   61: aload_0
    //   62: getfield h : I
    //   65: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   68: aastore
    //   69: dup
    //   70: iconst_3
    //   71: iload_2
    //   72: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   75: aastore
    //   76: invokestatic format : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   79: astore_3
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_3
    //   83: areturn
    //   84: astore_3
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_3
    //   88: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	84	finally
    //   18	25	84	finally
    //   30	80	84	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */