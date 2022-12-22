package b.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {
  private static final int[] b = new int[0];
  
  private static final Object[] c = new Object[0];
  
  private static Object[] d;
  
  private static int e;
  
  private static Object[] f;
  
  private static int g;
  
  private int[] h;
  
  Object[] i;
  
  int j;
  
  private f<E, E> k;
  
  public b() {
    this(0);
  }
  
  public b(int paramInt) {
    if (paramInt == 0) {
      this.h = b;
      this.i = c;
    } else {
      a(paramInt);
    } 
    this.j = 0;
  }
  
  private void a(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 73
    //   6: ldc b/e/b
    //   8: monitorenter
    //   9: getstatic b/e/b.f : [Ljava/lang/Object;
    //   12: astore_2
    //   13: aload_2
    //   14: ifnull -> 61
    //   17: aload_0
    //   18: aload_2
    //   19: putfield i : [Ljava/lang/Object;
    //   22: aload_2
    //   23: iconst_0
    //   24: aaload
    //   25: checkcast [Ljava/lang/Object;
    //   28: putstatic b/e/b.f : [Ljava/lang/Object;
    //   31: aload_0
    //   32: aload_2
    //   33: iconst_1
    //   34: aaload
    //   35: checkcast [I
    //   38: putfield h : [I
    //   41: aload_2
    //   42: iconst_1
    //   43: aconst_null
    //   44: aastore
    //   45: aload_2
    //   46: iconst_0
    //   47: aconst_null
    //   48: aastore
    //   49: getstatic b/e/b.g : I
    //   52: iconst_1
    //   53: isub
    //   54: putstatic b/e/b.g : I
    //   57: ldc b/e/b
    //   59: monitorexit
    //   60: return
    //   61: ldc b/e/b
    //   63: monitorexit
    //   64: goto -> 145
    //   67: astore_2
    //   68: ldc b/e/b
    //   70: monitorexit
    //   71: aload_2
    //   72: athrow
    //   73: iload_1
    //   74: iconst_4
    //   75: if_icmpne -> 145
    //   78: ldc b/e/b
    //   80: monitorenter
    //   81: getstatic b/e/b.d : [Ljava/lang/Object;
    //   84: astore_2
    //   85: aload_2
    //   86: ifnull -> 133
    //   89: aload_0
    //   90: aload_2
    //   91: putfield i : [Ljava/lang/Object;
    //   94: aload_2
    //   95: iconst_0
    //   96: aaload
    //   97: checkcast [Ljava/lang/Object;
    //   100: putstatic b/e/b.d : [Ljava/lang/Object;
    //   103: aload_0
    //   104: aload_2
    //   105: iconst_1
    //   106: aaload
    //   107: checkcast [I
    //   110: putfield h : [I
    //   113: aload_2
    //   114: iconst_1
    //   115: aconst_null
    //   116: aastore
    //   117: aload_2
    //   118: iconst_0
    //   119: aconst_null
    //   120: aastore
    //   121: getstatic b/e/b.e : I
    //   124: iconst_1
    //   125: isub
    //   126: putstatic b/e/b.e : I
    //   129: ldc b/e/b
    //   131: monitorexit
    //   132: return
    //   133: ldc b/e/b
    //   135: monitorexit
    //   136: goto -> 145
    //   139: astore_2
    //   140: ldc b/e/b
    //   142: monitorexit
    //   143: aload_2
    //   144: athrow
    //   145: aload_0
    //   146: iload_1
    //   147: newarray int
    //   149: putfield h : [I
    //   152: aload_0
    //   153: iload_1
    //   154: anewarray java/lang/Object
    //   157: putfield i : [Ljava/lang/Object;
    //   160: return
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
  
  private static void f(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 70
    //   7: ldc b/e/b
    //   9: monitorenter
    //   10: getstatic b/e/b.g : I
    //   13: bipush #10
    //   15: if_icmpge -> 58
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic b/e/b.f : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iinc #2, -1
    //   31: iload_2
    //   32: iconst_2
    //   33: if_icmplt -> 46
    //   36: aload_1
    //   37: iload_2
    //   38: aconst_null
    //   39: aastore
    //   40: iinc #2, -1
    //   43: goto -> 31
    //   46: aload_1
    //   47: putstatic b/e/b.f : [Ljava/lang/Object;
    //   50: getstatic b/e/b.g : I
    //   53: iconst_1
    //   54: iadd
    //   55: putstatic b/e/b.g : I
    //   58: ldc b/e/b
    //   60: monitorexit
    //   61: goto -> 139
    //   64: astore_0
    //   65: ldc b/e/b
    //   67: monitorexit
    //   68: aload_0
    //   69: athrow
    //   70: aload_0
    //   71: arraylength
    //   72: iconst_4
    //   73: if_icmpne -> 139
    //   76: ldc b/e/b
    //   78: monitorenter
    //   79: getstatic b/e/b.e : I
    //   82: bipush #10
    //   84: if_icmpge -> 127
    //   87: aload_1
    //   88: iconst_0
    //   89: getstatic b/e/b.d : [Ljava/lang/Object;
    //   92: aastore
    //   93: aload_1
    //   94: iconst_1
    //   95: aload_0
    //   96: aastore
    //   97: iinc #2, -1
    //   100: iload_2
    //   101: iconst_2
    //   102: if_icmplt -> 115
    //   105: aload_1
    //   106: iload_2
    //   107: aconst_null
    //   108: aastore
    //   109: iinc #2, -1
    //   112: goto -> 100
    //   115: aload_1
    //   116: putstatic b/e/b.d : [Ljava/lang/Object;
    //   119: getstatic b/e/b.e : I
    //   122: iconst_1
    //   123: iadd
    //   124: putstatic b/e/b.e : I
    //   127: ldc b/e/b
    //   129: monitorexit
    //   130: goto -> 139
    //   133: astore_0
    //   134: ldc b/e/b
    //   136: monitorexit
    //   137: aload_0
    //   138: athrow
    //   139: return
    // Exception table:
    //   from	to	target	type
    //   10	24	64	finally
    //   46	58	64	finally
    //   58	61	64	finally
    //   65	68	64	finally
    //   79	93	133	finally
    //   115	127	133	finally
    //   127	130	133	finally
    //   134	137	133	finally
  }
  
  private f<E, E> i() {
    if (this.k == null)
      this.k = new a(this); 
    return this.k;
  }
  
  private int j(Object paramObject, int paramInt) {
    int i = this.j;
    if (i == 0)
      return -1; 
    int j = c.a(this.h, i, paramInt);
    if (j < 0)
      return j; 
    if (paramObject.equals(this.i[j]))
      return j; 
    int k;
    for (k = j + 1; k < i && this.h[k] == paramInt; k++) {
      if (paramObject.equals(this.i[k]))
        return k; 
    } 
    for (i = j - 1; i >= 0 && this.h[i] == paramInt; i--) {
      if (paramObject.equals(this.i[i]))
        return i; 
    } 
    return k ^ 0xFFFFFFFF;
  }
  
  private int k() {
    int i = this.j;
    if (i == 0)
      return -1; 
    int j = c.a(this.h, i, 0);
    if (j < 0)
      return j; 
    if (this.i[j] == null)
      return j; 
    int k;
    for (k = j + 1; k < i && this.h[k] == 0; k++) {
      if (this.i[k] == null)
        return k; 
    } 
    while (--j >= 0 && this.h[j] == 0) {
      if (this.i[j] == null)
        return j; 
      j--;
    } 
    return k ^ 0xFFFFFFFF;
  }
  
  public boolean add(E paramE) {
    int j;
    if (paramE == null) {
      i = k();
      j = 0;
    } else {
      j = paramE.hashCode();
      i = j(paramE, j);
    } 
    if (i >= 0)
      return false; 
    int k = i ^ 0xFFFFFFFF;
    int m = this.j;
    int[] arrayOfInt = this.h;
    if (m >= arrayOfInt.length) {
      i = 4;
      if (m >= 8) {
        i = (m >> 1) + m;
      } else if (m >= 4) {
        i = 8;
      } 
      Object[] arrayOfObject = this.i;
      a(i);
      int[] arrayOfInt1 = this.h;
      if (arrayOfInt1.length > 0) {
        System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.i, 0, arrayOfObject.length);
      } 
      f(arrayOfInt, arrayOfObject, this.j);
    } 
    int i = this.j;
    if (k < i) {
      int[] arrayOfInt1 = this.h;
      m = k + 1;
      System.arraycopy(arrayOfInt1, k, arrayOfInt1, m, i - k);
      Object[] arrayOfObject = this.i;
      System.arraycopy(arrayOfObject, k, arrayOfObject, m, this.j - k);
    } 
    this.h[k] = j;
    this.i[k] = paramE;
    this.j++;
    return true;
  }
  
  public boolean addAll(Collection<? extends E> paramCollection) {
    c(this.j + paramCollection.size());
    Iterator<? extends E> iterator = paramCollection.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= add(iterator.next()));
    return bool;
  }
  
  public void c(int paramInt) {
    int[] arrayOfInt = this.h;
    if (arrayOfInt.length < paramInt) {
      Object[] arrayOfObject = this.i;
      a(paramInt);
      paramInt = this.j;
      if (paramInt > 0) {
        System.arraycopy(arrayOfInt, 0, this.h, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.i, 0, this.j);
      } 
      f(arrayOfInt, arrayOfObject, this.j);
    } 
  }
  
  public void clear() {
    int i = this.j;
    if (i != 0) {
      f(this.h, this.i, i);
      this.h = b;
      this.i = c;
      this.j = 0;
    } 
  }
  
  public boolean contains(Object paramObject) {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean containsAll(Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      if (size() != paramObject.size())
        return false; 
      byte b1 = 0;
      try {
        while (b1 < this.j) {
          boolean bool = paramObject.contains(m(b1));
          if (!bool)
            return false; 
          b1++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.h;
    int i = this.j;
    byte b1 = 0;
    int j = 0;
    while (b1 < i) {
      j += arrayOfInt[b1];
      b1++;
    } 
    return j;
  }
  
  public int indexOf(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = k();
    } else {
      i = j(paramObject, paramObject.hashCode());
    } 
    return i;
  }
  
  public boolean isEmpty() {
    boolean bool;
    if (this.j <= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Iterator<E> iterator() {
    return i().m().iterator();
  }
  
  public E l(int paramInt) {
    Object[] arrayOfObject = this.i;
    Object object = arrayOfObject[paramInt];
    int i = this.j;
    if (i <= 1) {
      f(this.h, arrayOfObject, i);
      this.h = b;
      this.i = c;
      this.j = 0;
    } else {
      int[] arrayOfInt = this.h;
      int j = arrayOfInt.length;
      int k = 8;
      if (j > 8 && i < arrayOfInt.length / 3) {
        if (i > 8)
          k = i + (i >> 1); 
        a(k);
        this.j--;
        if (paramInt > 0) {
          System.arraycopy(arrayOfInt, 0, this.h, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, this.i, 0, paramInt);
        } 
        k = this.j;
        if (paramInt < k) {
          i = paramInt + 1;
          System.arraycopy(arrayOfInt, i, this.h, paramInt, k - paramInt);
          System.arraycopy(arrayOfObject, i, this.i, paramInt, this.j - paramInt);
        } 
      } else {
        this.j = --i;
        if (paramInt < i) {
          k = paramInt + 1;
          System.arraycopy(arrayOfInt, k, arrayOfInt, paramInt, i - paramInt);
          arrayOfObject = this.i;
          System.arraycopy(arrayOfObject, k, arrayOfObject, paramInt, this.j - paramInt);
        } 
        this.i[this.j] = null;
      } 
    } 
    return (E)object;
  }
  
  public E m(int paramInt) {
    return (E)this.i[paramInt];
  }
  
  public boolean remove(Object paramObject) {
    int i = indexOf(paramObject);
    if (i >= 0) {
      l(i);
      return true;
    } 
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= remove(iterator.next()));
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    int i = this.j - 1;
    boolean bool = false;
    while (i >= 0) {
      if (!paramCollection.contains(this.i[i])) {
        l(i);
        bool = true;
      } 
      i--;
    } 
    return bool;
  }
  
  public int size() {
    return this.j;
  }
  
  public Object[] toArray() {
    int i = this.j;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(this.i, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < this.j)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.j); 
    System.arraycopy(this.i, 0, arrayOfT, 0, this.j);
    int i = arrayOfT.length;
    int j = this.j;
    if (i > j)
      arrayOfT[j] = null; 
    return arrayOfT;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.j * 14);
    stringBuilder.append('{');
    for (byte b1 = 0; b1 < this.j; b1++) {
      if (b1 > 0)
        stringBuilder.append(", "); 
      E e = m(b1);
      if (e != this) {
        stringBuilder.append(e);
      } else {
        stringBuilder.append("(this Set)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  class a extends f<E, E> {
    a(b this$0) {}
    
    protected void a() {
      this.d.clear();
    }
    
    protected Object b(int param1Int1, int param1Int2) {
      return this.d.i[param1Int1];
    }
    
    protected Map<E, E> c() {
      throw new UnsupportedOperationException("not a map");
    }
    
    protected int d() {
      return this.d.j;
    }
    
    protected int e(Object param1Object) {
      return this.d.indexOf(param1Object);
    }
    
    protected int f(Object param1Object) {
      return this.d.indexOf(param1Object);
    }
    
    protected void g(E param1E1, E param1E2) {
      this.d.add(param1E1);
    }
    
    protected void h(int param1Int) {
      this.d.l(param1Int);
    }
    
    protected E i(int param1Int, E param1E) {
      throw new UnsupportedOperationException("not a map");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */