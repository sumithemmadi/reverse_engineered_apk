package b.e;

public class h<E> implements Cloneable {
  private static final Object b = new Object();
  
  private boolean c = false;
  
  private int[] d;
  
  private Object[] e;
  
  private int f;
  
  public h() {
    this(10);
  }
  
  public h(int paramInt) {
    if (paramInt == 0) {
      this.d = c.a;
      this.e = c.c;
    } else {
      paramInt = c.e(paramInt);
      this.d = new int[paramInt];
      this.e = new Object[paramInt];
    } 
  }
  
  private void g() {
    int i = this.f;
    int[] arrayOfInt = this.d;
    Object[] arrayOfObject = this.e;
    int j = 0;
    int k;
    for (k = 0; j < i; k = m) {
      Object object = arrayOfObject[j];
      int m = k;
      if (object != b) {
        if (j != k) {
          arrayOfInt[k] = arrayOfInt[j];
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
  
  public void a(int paramInt, E paramE) {
    int i = this.f;
    if (i != 0 && paramInt <= this.d[i - 1]) {
      n(paramInt, paramE);
      return;
    } 
    if (this.c && i >= this.d.length)
      g(); 
    i = this.f;
    if (i >= this.d.length) {
      int j = c.e(i + 1);
      int[] arrayOfInt1 = new int[j];
      Object[] arrayOfObject1 = new Object[j];
      int[] arrayOfInt2 = this.d;
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
      Object[] arrayOfObject2 = this.e;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.d = arrayOfInt1;
      this.e = arrayOfObject1;
    } 
    this.d[i] = paramInt;
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
  
  public h<E> f() {
    try {
      h<E> h1 = (h)super.clone();
      h1.d = (int[])this.d.clone();
      h1.e = (Object[])this.e.clone();
      return h1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public E i(int paramInt) {
    return k(paramInt, null);
  }
  
  public E k(int paramInt, E paramE) {
    paramInt = c.a(this.d, this.f, paramInt);
    if (paramInt >= 0) {
      Object[] arrayOfObject = this.e;
      if (arrayOfObject[paramInt] != b)
        return (E)arrayOfObject[paramInt]; 
    } 
    return paramE;
  }
  
  public int l(E paramE) {
    if (this.c)
      g(); 
    for (byte b = 0; b < this.f; b++) {
      if (this.e[b] == paramE)
        return b; 
    } 
    return -1;
  }
  
  public int m(int paramInt) {
    if (this.c)
      g(); 
    return this.d[paramInt];
  }
  
  public void n(int paramInt, E paramE) {
    int i = c.a(this.d, this.f, paramInt);
    if (i >= 0) {
      this.e[i] = paramE;
    } else {
      int j = i ^ 0xFFFFFFFF;
      int k = this.f;
      if (j < k) {
        Object[] arrayOfObject = this.e;
        if (arrayOfObject[j] == b) {
          this.d[j] = paramInt;
          arrayOfObject[j] = paramE;
          return;
        } 
      } 
      i = j;
      if (this.c) {
        i = j;
        if (k >= this.d.length) {
          g();
          i = c.a(this.d, this.f, paramInt) ^ 0xFFFFFFFF;
        } 
      } 
      j = this.f;
      if (j >= this.d.length) {
        j = c.e(j + 1);
        int[] arrayOfInt1 = new int[j];
        Object[] arrayOfObject1 = new Object[j];
        int[] arrayOfInt2 = this.d;
        System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
        Object[] arrayOfObject2 = this.e;
        System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
        this.d = arrayOfInt1;
        this.e = arrayOfObject1;
      } 
      j = this.f;
      if (j - i != 0) {
        int[] arrayOfInt = this.d;
        k = i + 1;
        System.arraycopy(arrayOfInt, i, arrayOfInt, k, j - i);
        Object[] arrayOfObject = this.e;
        System.arraycopy(arrayOfObject, i, arrayOfObject, k, this.f - i);
      } 
      this.d[i] = paramInt;
      this.e[i] = paramE;
      this.f++;
    } 
  }
  
  public void q(int paramInt) {
    paramInt = c.a(this.d, this.f, paramInt);
    if (paramInt >= 0) {
      Object[] arrayOfObject = this.e;
      Object object1 = arrayOfObject[paramInt];
      Object object2 = b;
      if (object1 != object2) {
        arrayOfObject[paramInt] = object2;
        this.c = true;
      } 
    } 
  }
  
  public int r() {
    if (this.c)
      g(); 
    return this.f;
  }
  
  public E s(int paramInt) {
    if (this.c)
      g(); 
    return (E)this.e[paramInt];
  }
  
  public String toString() {
    if (r() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.f * 28);
    stringBuilder.append('{');
    for (byte b = 0; b < this.f; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      stringBuilder.append(m(b));
      stringBuilder.append('=');
      E e = s(b);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */