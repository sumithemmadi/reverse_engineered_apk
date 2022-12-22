package b.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {
  static Object[] b;
  
  static int c;
  
  static Object[] d;
  
  static int e;
  
  int[] f;
  
  Object[] g;
  
  int h;
  
  public g() {
    this.f = c.a;
    this.g = c.c;
    this.h = 0;
  }
  
  public g(int paramInt) {
    if (paramInt == 0) {
      this.f = c.a;
      this.g = c.c;
    } else {
      a(paramInt);
    } 
    this.h = 0;
  }
  
  public g(g<K, V> paramg) {
    this();
    if (paramg != null)
      j(paramg); 
  }
  
  private void a(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 73
    //   6: ldc b/e/g
    //   8: monitorenter
    //   9: getstatic b/e/g.d : [Ljava/lang/Object;
    //   12: astore_2
    //   13: aload_2
    //   14: ifnull -> 61
    //   17: aload_0
    //   18: aload_2
    //   19: putfield g : [Ljava/lang/Object;
    //   22: aload_2
    //   23: iconst_0
    //   24: aaload
    //   25: checkcast [Ljava/lang/Object;
    //   28: putstatic b/e/g.d : [Ljava/lang/Object;
    //   31: aload_0
    //   32: aload_2
    //   33: iconst_1
    //   34: aaload
    //   35: checkcast [I
    //   38: putfield f : [I
    //   41: aload_2
    //   42: iconst_1
    //   43: aconst_null
    //   44: aastore
    //   45: aload_2
    //   46: iconst_0
    //   47: aconst_null
    //   48: aastore
    //   49: getstatic b/e/g.e : I
    //   52: iconst_1
    //   53: isub
    //   54: putstatic b/e/g.e : I
    //   57: ldc b/e/g
    //   59: monitorexit
    //   60: return
    //   61: ldc b/e/g
    //   63: monitorexit
    //   64: goto -> 145
    //   67: astore_2
    //   68: ldc b/e/g
    //   70: monitorexit
    //   71: aload_2
    //   72: athrow
    //   73: iload_1
    //   74: iconst_4
    //   75: if_icmpne -> 145
    //   78: ldc b/e/g
    //   80: monitorenter
    //   81: getstatic b/e/g.b : [Ljava/lang/Object;
    //   84: astore_2
    //   85: aload_2
    //   86: ifnull -> 133
    //   89: aload_0
    //   90: aload_2
    //   91: putfield g : [Ljava/lang/Object;
    //   94: aload_2
    //   95: iconst_0
    //   96: aaload
    //   97: checkcast [Ljava/lang/Object;
    //   100: putstatic b/e/g.b : [Ljava/lang/Object;
    //   103: aload_0
    //   104: aload_2
    //   105: iconst_1
    //   106: aaload
    //   107: checkcast [I
    //   110: putfield f : [I
    //   113: aload_2
    //   114: iconst_1
    //   115: aconst_null
    //   116: aastore
    //   117: aload_2
    //   118: iconst_0
    //   119: aconst_null
    //   120: aastore
    //   121: getstatic b/e/g.c : I
    //   124: iconst_1
    //   125: isub
    //   126: putstatic b/e/g.c : I
    //   129: ldc b/e/g
    //   131: monitorexit
    //   132: return
    //   133: ldc b/e/g
    //   135: monitorexit
    //   136: goto -> 145
    //   139: astore_2
    //   140: ldc b/e/g
    //   142: monitorexit
    //   143: aload_2
    //   144: athrow
    //   145: aload_0
    //   146: iload_1
    //   147: newarray int
    //   149: putfield f : [I
    //   152: aload_0
    //   153: iload_1
    //   154: iconst_1
    //   155: ishl
    //   156: anewarray java/lang/Object
    //   159: putfield g : [Ljava/lang/Object;
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   9	13	67	finally
    //   17	41	67	finally
    //   49	60	67	finally
    //   61	64	67	finally
    //   68	71	67	finally
    //   81	85	139	finally
    //   89	113	139	finally
    //   121	132	139	finally
    //   133	136	139	finally
    //   140	143	139	finally
  }
  
  private static int b(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    try {
      return c.a(paramArrayOfint, paramInt1, paramInt2);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ConcurrentModificationException();
    } 
  }
  
  private static void d(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 73
    //   7: ldc b/e/g
    //   9: monitorenter
    //   10: getstatic b/e/g.e : I
    //   13: bipush #10
    //   15: if_icmpge -> 61
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic b/e/g.d : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iload_2
    //   29: iconst_1
    //   30: ishl
    //   31: iconst_1
    //   32: isub
    //   33: istore_2
    //   34: iload_2
    //   35: iconst_2
    //   36: if_icmplt -> 49
    //   39: aload_1
    //   40: iload_2
    //   41: aconst_null
    //   42: aastore
    //   43: iinc #2, -1
    //   46: goto -> 34
    //   49: aload_1
    //   50: putstatic b/e/g.d : [Ljava/lang/Object;
    //   53: getstatic b/e/g.e : I
    //   56: iconst_1
    //   57: iadd
    //   58: putstatic b/e/g.e : I
    //   61: ldc b/e/g
    //   63: monitorexit
    //   64: goto -> 145
    //   67: astore_0
    //   68: ldc b/e/g
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    //   73: aload_0
    //   74: arraylength
    //   75: iconst_4
    //   76: if_icmpne -> 145
    //   79: ldc b/e/g
    //   81: monitorenter
    //   82: getstatic b/e/g.c : I
    //   85: bipush #10
    //   87: if_icmpge -> 133
    //   90: aload_1
    //   91: iconst_0
    //   92: getstatic b/e/g.b : [Ljava/lang/Object;
    //   95: aastore
    //   96: aload_1
    //   97: iconst_1
    //   98: aload_0
    //   99: aastore
    //   100: iload_2
    //   101: iconst_1
    //   102: ishl
    //   103: iconst_1
    //   104: isub
    //   105: istore_2
    //   106: iload_2
    //   107: iconst_2
    //   108: if_icmplt -> 121
    //   111: aload_1
    //   112: iload_2
    //   113: aconst_null
    //   114: aastore
    //   115: iinc #2, -1
    //   118: goto -> 106
    //   121: aload_1
    //   122: putstatic b/e/g.b : [Ljava/lang/Object;
    //   125: getstatic b/e/g.c : I
    //   128: iconst_1
    //   129: iadd
    //   130: putstatic b/e/g.c : I
    //   133: ldc b/e/g
    //   135: monitorexit
    //   136: goto -> 145
    //   139: astore_0
    //   140: ldc b/e/g
    //   142: monitorexit
    //   143: aload_0
    //   144: athrow
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   10	24	67	finally
    //   49	61	67	finally
    //   61	64	67	finally
    //   68	71	67	finally
    //   82	96	139	finally
    //   121	133	139	finally
    //   133	136	139	finally
    //   140	143	139	finally
  }
  
  public void c(int paramInt) {
    int i = this.h;
    int[] arrayOfInt = this.f;
    if (arrayOfInt.length < paramInt) {
      Object[] arrayOfObject = this.g;
      a(paramInt);
      if (this.h > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, i);
        System.arraycopy(arrayOfObject, 0, this.g, 0, i << 1);
      } 
      d(arrayOfInt, arrayOfObject, i);
    } 
    if (this.h == i)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public void clear() {
    int i = this.h;
    if (i > 0) {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      this.f = c.a;
      this.g = c.c;
      this.h = 0;
      d(arrayOfInt, arrayOfObject, i);
    } 
    if (this.h <= 0)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject) {
    boolean bool;
    if (f(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean containsValue(Object paramObject) {
    boolean bool;
    if (h(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  int e(Object paramObject, int paramInt) {
    int i = this.h;
    if (i == 0)
      return -1; 
    int j = b(this.f, i, paramInt);
    if (j < 0)
      return j; 
    if (paramObject.equals(this.g[j << 1]))
      return j; 
    int k;
    for (k = j + 1; k < i && this.f[k] == paramInt; k++) {
      if (paramObject.equals(this.g[k << 1]))
        return k; 
    } 
    for (i = j - 1; i >= 0 && this.f[i] == paramInt; i--) {
      if (paramObject.equals(this.g[i << 1]))
        return i; 
    } 
    return k ^ 0xFFFFFFFF;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof g) {
      g g1 = (g)paramObject;
      if (size() != g1.size())
        return false; 
      byte b = 0;
      try {
        while (b < this.h) {
          K k = i(b);
          paramObject = m(b);
          Object object = g1.get(k);
          if (paramObject == null) {
            if (object != null || !g1.containsKey(k))
              return false; 
          } else {
            boolean bool = paramObject.equals(object);
            if (!bool)
              return false; 
          } 
          b++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {
        return false;
      } 
    } 
    if (nullPointerException instanceof Map) {
      Map map = (Map)nullPointerException;
      if (size() != map.size())
        return false; 
      byte b = 0;
      try {
        while (b < this.h) {
          K k = i(b);
          nullPointerException = (NullPointerException)m(b);
          Object object = map.get(k);
          if (nullPointerException == null) {
            if (object != null || !map.containsKey(k))
              return false; 
          } else {
            boolean bool = nullPointerException.equals(object);
            if (!bool)
              return false; 
          } 
          b++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException1) {}
    } 
    return false;
  }
  
  public int f(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = g();
    } else {
      i = e(paramObject, paramObject.hashCode());
    } 
    return i;
  }
  
  int g() {
    int i = this.h;
    if (i == 0)
      return -1; 
    int j = b(this.f, i, 0);
    if (j < 0)
      return j; 
    if (this.g[j << 1] == null)
      return j; 
    int k;
    for (k = j + 1; k < i && this.f[k] == 0; k++) {
      if (this.g[k << 1] == null)
        return k; 
    } 
    for (i = j - 1; i >= 0 && this.f[i] == 0; i--) {
      if (this.g[i << 1] == null)
        return i; 
    } 
    return k ^ 0xFFFFFFFF;
  }
  
  public V get(Object paramObject) {
    return getOrDefault(paramObject, null);
  }
  
  public V getOrDefault(Object paramObject, V paramV) {
    int i = f(paramObject);
    if (i >= 0)
      paramV = (V)this.g[(i << 1) + 1]; 
    return paramV;
  }
  
  int h(Object paramObject) {
    int i = this.h * 2;
    Object[] arrayOfObject = this.g;
    if (paramObject == null) {
      for (byte b = 1; b < i; b += 2) {
        if (arrayOfObject[b] == null)
          return b >> 1; 
      } 
    } else {
      for (byte b = 1; b < i; b += 2) {
        if (paramObject.equals(arrayOfObject[b]))
          return b >> 1; 
      } 
    } 
    return -1;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.f;
    Object[] arrayOfObject = this.g;
    int i = this.h;
    boolean bool = true;
    byte b = 0;
    int j = 0;
    while (b < i) {
      int m;
      Object object = arrayOfObject[bool];
      int k = arrayOfInt[b];
      if (object == null) {
        m = 0;
      } else {
        m = object.hashCode();
      } 
      j += m ^ k;
      b++;
      bool += true;
    } 
    return j;
  }
  
  public K i(int paramInt) {
    return (K)this.g[paramInt << 1];
  }
  
  public boolean isEmpty() {
    boolean bool;
    if (this.h <= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void j(g<? extends K, ? extends V> paramg) {
    int i = paramg.h;
    c(this.h + i);
    int j = this.h;
    byte b = 0;
    if (j == 0) {
      if (i > 0) {
        System.arraycopy(paramg.f, 0, this.f, 0, i);
        System.arraycopy(paramg.g, 0, this.g, 0, i << 1);
        this.h = i;
      } 
    } else {
      while (b < i) {
        put(paramg.i(b), paramg.m(b));
        b++;
      } 
    } 
  }
  
  public V k(int paramInt) {
    Object[] arrayOfObject = this.g;
    int i = paramInt << 1;
    Object object = arrayOfObject[i + 1];
    int j = this.h;
    int k = 0;
    if (j <= 1) {
      d(this.f, arrayOfObject, j);
      this.f = c.a;
      this.g = c.c;
      paramInt = k;
    } else {
      int m = j - 1;
      int[] arrayOfInt = this.f;
      int n = arrayOfInt.length;
      k = 8;
      if (n > 8 && j < arrayOfInt.length / 3) {
        if (j > 8)
          k = j + (j >> 1); 
        a(k);
        if (j == this.h) {
          if (paramInt > 0) {
            System.arraycopy(arrayOfInt, 0, this.f, 0, paramInt);
            System.arraycopy(arrayOfObject, 0, this.g, 0, i);
          } 
          if (paramInt < m) {
            n = paramInt + 1;
            int[] arrayOfInt1 = this.f;
            k = m - paramInt;
            System.arraycopy(arrayOfInt, n, arrayOfInt1, paramInt, k);
            System.arraycopy(arrayOfObject, n << 1, this.g, i, k << 1);
          } 
        } else {
          throw new ConcurrentModificationException();
        } 
      } else {
        if (paramInt < m) {
          n = paramInt + 1;
          k = m - paramInt;
          System.arraycopy(arrayOfInt, n, arrayOfInt, paramInt, k);
          Object[] arrayOfObject2 = this.g;
          System.arraycopy(arrayOfObject2, n << 1, arrayOfObject2, i, k << 1);
        } 
        Object[] arrayOfObject1 = this.g;
        paramInt = m << 1;
        arrayOfObject1[paramInt] = null;
        arrayOfObject1[paramInt + 1] = null;
      } 
      paramInt = m;
    } 
    if (j == this.h) {
      this.h = paramInt;
      return (V)object;
    } 
    throw new ConcurrentModificationException();
  }
  
  public V l(int paramInt, V paramV) {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = this.g;
    Object object = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramV;
    return (V)object;
  }
  
  public V m(int paramInt) {
    return (V)this.g[(paramInt << 1) + 1];
  }
  
  public V put(K paramK, V paramV) {
    Object[] arrayOfObject;
    int k;
    int i = this.h;
    if (paramK == null) {
      j = g();
      k = 0;
    } else {
      k = paramK.hashCode();
      j = e(paramK, k);
    } 
    if (j >= 0) {
      j = (j << 1) + 1;
      arrayOfObject = this.g;
      Object object = arrayOfObject[j];
      arrayOfObject[j] = paramV;
      return (V)object;
    } 
    int m = j ^ 0xFFFFFFFF;
    int[] arrayOfInt = this.f;
    if (i >= arrayOfInt.length) {
      j = 4;
      if (i >= 8) {
        j = (i >> 1) + i;
      } else if (i >= 4) {
        j = 8;
      } 
      Object[] arrayOfObject1 = this.g;
      a(j);
      if (i == this.h) {
        int[] arrayOfInt1 = this.f;
        if (arrayOfInt1.length > 0) {
          System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
          System.arraycopy(arrayOfObject1, 0, this.g, 0, arrayOfObject1.length);
        } 
        d(arrayOfInt, arrayOfObject1, i);
      } else {
        throw new ConcurrentModificationException();
      } 
    } 
    if (m < i) {
      int[] arrayOfInt1 = this.f;
      j = m + 1;
      System.arraycopy(arrayOfInt1, m, arrayOfInt1, j, i - m);
      Object[] arrayOfObject1 = this.g;
      System.arraycopy(arrayOfObject1, m << 1, arrayOfObject1, j << 1, this.h - m << 1);
    } 
    int j = this.h;
    if (i == j) {
      int[] arrayOfInt1 = this.f;
      if (m < arrayOfInt1.length) {
        arrayOfInt1[m] = k;
        Object[] arrayOfObject1 = this.g;
        k = m << 1;
        arrayOfObject1[k] = arrayOfObject;
        arrayOfObject1[k + 1] = paramV;
        this.h = j + 1;
        return null;
      } 
    } 
    throw new ConcurrentModificationException();
  }
  
  public V putIfAbsent(K paramK, V paramV) {
    V v1 = get(paramK);
    V v2 = v1;
    if (v1 == null)
      v2 = put(paramK, paramV); 
    return v2;
  }
  
  public V remove(Object paramObject) {
    int i = f(paramObject);
    return (i >= 0) ? k(i) : null;
  }
  
  public boolean remove(Object paramObject1, Object paramObject2) {
    int i = f(paramObject1);
    if (i >= 0) {
      paramObject1 = m(i);
      if (paramObject2 == paramObject1 || (paramObject2 != null && paramObject2.equals(paramObject1))) {
        k(i);
        return true;
      } 
    } 
    return false;
  }
  
  public V replace(K paramK, V paramV) {
    int i = f(paramK);
    return (i >= 0) ? l(i, paramV) : null;
  }
  
  public boolean replace(K paramK, V paramV1, V paramV2) {
    int i = f(paramK);
    if (i >= 0) {
      paramK = (K)m(i);
      if (paramK == paramV1 || (paramV1 != null && paramV1.equals(paramK))) {
        l(i, paramV2);
        return true;
      } 
    } 
    return false;
  }
  
  public int size() {
    return this.h;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.h * 28);
    stringBuilder.append('{');
    for (byte b = 0; b < this.h; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      V v = (V)i(b);
      if (v != this) {
        stringBuilder.append(v);
      } else {
        stringBuilder.append("(this Map)");
      } 
      stringBuilder.append('=');
      v = m(b);
      if (v != this) {
        stringBuilder.append(v);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */