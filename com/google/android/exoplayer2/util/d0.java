package com.google.android.exoplayer2.util;

public final class d0<V> {
  private long[] a;
  
  private V[] b;
  
  private int c;
  
  private int d;
  
  public d0() {
    this(10);
  }
  
  public d0(int paramInt) {
    this.a = new long[paramInt];
    this.b = f(paramInt);
  }
  
  private void b(long paramLong, V paramV) {
    int i = this.c;
    int j = this.d;
    V[] arrayOfV = this.b;
    i = (i + j) % arrayOfV.length;
    this.a[i] = paramLong;
    arrayOfV[i] = paramV;
    this.d = j + 1;
  }
  
  private void d(long paramLong) {
    int i = this.d;
    if (i > 0) {
      int j = this.c;
      int k = this.b.length;
      if (paramLong <= this.a[(j + i - 1) % k])
        c(); 
    } 
  }
  
  private void e() {
    int i = this.b.length;
    if (this.d < i)
      return; 
    int j = i * 2;
    long[] arrayOfLong = new long[j];
    Object[] arrayOfObject = f(j);
    j = this.c;
    i -= j;
    System.arraycopy(this.a, j, arrayOfLong, 0, i);
    System.arraycopy(this.b, this.c, arrayOfObject, 0, i);
    j = this.c;
    if (j > 0) {
      System.arraycopy(this.a, 0, arrayOfLong, i, j);
      System.arraycopy(this.b, 0, arrayOfObject, i, this.c);
    } 
    this.a = arrayOfLong;
    this.b = (V[])arrayOfObject;
    this.c = 0;
  }
  
  private static <V> V[] f(int paramInt) {
    return (V[])new Object[paramInt];
  }
  
  private V h(long paramLong, boolean paramBoolean) {
    V v;
    long l = Long.MAX_VALUE;
    Object object = null;
    while (true) {
      int i = this.d;
      if (i > 0) {
        long[] arrayOfLong = this.a;
        int j = this.c;
        long l1 = paramLong - arrayOfLong[j];
        if (l1 < 0L && (paramBoolean || -l1 >= l))
          break; 
        V[] arrayOfV = this.b;
        v = arrayOfV[j];
        arrayOfV[j] = null;
        this.c = (j + 1) % arrayOfV.length;
        this.d = i - 1;
        l = l1;
        continue;
      } 
      break;
    } 
    return v;
  }
  
  public void a(long paramLong, V paramV) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: invokespecial d : (J)V
    //   7: aload_0
    //   8: invokespecial e : ()V
    //   11: aload_0
    //   12: lload_1
    //   13: aload_3
    //   14: invokespecial b : (JLjava/lang/Object;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_3
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_3
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
  
  public void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield c : I
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield d : I
    //   12: aload_0
    //   13: getfield b : [Ljava/lang/Object;
    //   16: aconst_null
    //   17: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	23	finally
  }
  
  public V g(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: iconst_0
    //   5: invokespecial h : (JZ)Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_3
    //   12: areturn
    //   13: astore_3
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_3
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	13	finally
  }
  
  public V i(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lload_1
    //   4: iconst_1
    //   5: invokespecial h : (JZ)Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_3
    //   12: areturn
    //   13: astore_3
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_3
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	13	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */