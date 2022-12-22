package b.e;

public class d<E> implements Cloneable {
  private static final Object b = new Object();
  
  private boolean c = false;
  
  private long[] d;
  
  private Object[] e;
  
  private int f;
  
  public d() {
    this(10);
  }
  
  public d(int paramInt) {
    if (paramInt == 0) {
      this.d = c.b;
      this.e = c.c;
    } else {
      paramInt = c.f(paramInt);
      this.d = new long[paramInt];
      this.e = new Object[paramInt];
    } 
  }
  
  private void g() {
    int i = this.f;
    long[] arrayOfLong = this.d;
    Object[] arrayOfObject = this.e;
    int j = 0;
    int k;
    for (k = 0; j < i; k = m) {
      Object object = arrayOfObject[j];
      int m = k;
      if (object != b) {
        if (j != k) {
          arrayOfLong[k] = arrayOfLong[j];
          arrayOfObject[k] = object;
          arrayOfObject[j] = null;
        } 
        m = k + 1;
      } 
      j++;
    } 
    this.c = false;
    this.f = k;
  }
  
  public void a(long paramLong, E paramE) {
    int i = this.f;
    if (i != 0 && paramLong <= this.d[i - 1]) {
      n(paramLong, paramE);
      return;
    } 
    if (this.c && i >= this.d.length)
      g(); 
    i = this.f;
    if (i >= this.d.length) {
      int j = c.f(i + 1);
      long[] arrayOfLong1 = new long[j];
      Object[] arrayOfObject1 = new Object[j];
      long[] arrayOfLong2 = this.d;
      System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
      Object[] arrayOfObject2 = this.e;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.d = arrayOfLong1;
      this.e = arrayOfObject1;
    } 
    this.d[i] = paramLong;
    this.e[i] = paramE;
    this.f = i + 1;
  }
  
  public void b() {
    int i = this.f;
    Object[] arrayOfObject = this.e;
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = null; 
    this.f = 0;
    this.c = false;
  }
  
  public d<E> f() {
    try {
      d<E> d1 = (d)super.clone();
      d1.d = (long[])this.d.clone();
      d1.e = (Object[])this.e.clone();
      return d1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public E i(long paramLong) {
    return k(paramLong, null);
  }
  
  public E k(long paramLong, E paramE) {
    int i = c.b(this.d, this.f, paramLong);
    if (i >= 0) {
      Object[] arrayOfObject = this.e;
      if (arrayOfObject[i] != b)
        return (E)arrayOfObject[i]; 
    } 
    return paramE;
  }
  
  public int l(long paramLong) {
    if (this.c)
      g(); 
    return c.b(this.d, this.f, paramLong);
  }
  
  public long m(int paramInt) {
    if (this.c)
      g(); 
    return this.d[paramInt];
  }
  
  public void n(long paramLong, E paramE) {
    int i = c.b(this.d, this.f, paramLong);
    if (i >= 0) {
      this.e[i] = paramE;
    } else {
      int j = i ^ 0xFFFFFFFF;
      int k = this.f;
      if (j < k) {
        Object[] arrayOfObject = this.e;
        if (arrayOfObject[j] == b) {
          this.d[j] = paramLong;
          arrayOfObject[j] = paramE;
          return;
        } 
      } 
      i = j;
      if (this.c) {
        i = j;
        if (k >= this.d.length) {
          g();
          i = c.b(this.d, this.f, paramLong) ^ 0xFFFFFFFF;
        } 
      } 
      j = this.f;
      if (j >= this.d.length) {
        j = c.f(j + 1);
        long[] arrayOfLong1 = new long[j];
        Object[] arrayOfObject1 = new Object[j];
        long[] arrayOfLong2 = this.d;
        System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
        Object[] arrayOfObject2 = this.e;
        System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
        this.d = arrayOfLong1;
        this.e = arrayOfObject1;
      } 
      j = this.f;
      if (j - i != 0) {
        long[] arrayOfLong = this.d;
        k = i + 1;
        System.arraycopy(arrayOfLong, i, arrayOfLong, k, j - i);
        Object[] arrayOfObject = this.e;
        System.arraycopy(arrayOfObject, i, arrayOfObject, k, this.f - i);
      } 
      this.d[i] = paramLong;
      this.e[i] = paramE;
      this.f++;
    } 
  }
  
  public void q(long paramLong) {
    int i = c.b(this.d, this.f, paramLong);
    if (i >= 0) {
      Object[] arrayOfObject = this.e;
      Object object1 = arrayOfObject[i];
      Object object2 = b;
      if (object1 != object2) {
        arrayOfObject[i] = object2;
        this.c = true;
      } 
    } 
  }
  
  public void r(int paramInt) {
    Object[] arrayOfObject = this.e;
    Object object1 = arrayOfObject[paramInt];
    Object object2 = b;
    if (object1 != object2) {
      arrayOfObject[paramInt] = object2;
      this.c = true;
    } 
  }
  
  public int s() {
    if (this.c)
      g(); 
    return this.f;
  }
  
  public E t(int paramInt) {
    if (this.c)
      g(); 
    return (E)this.e[paramInt];
  }
  
  public String toString() {
    if (s() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.f * 28);
    stringBuilder.append('{');
    for (byte b = 0; b < this.f; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      stringBuilder.append(m(b));
      stringBuilder.append('=');
      E e = t(b);
      if (e != this) {
        stringBuilder.append(e);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */