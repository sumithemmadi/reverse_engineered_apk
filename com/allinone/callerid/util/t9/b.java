package com.allinone.callerid.util.t9;

final class b<T> {
  private final Object a = new Object();
  
  private final Object[] b;
  
  private int c;
  
  public b(int paramInt) {
    if (paramInt > 0) {
      this.b = new Object[paramInt];
      return;
    } 
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  private boolean b(T paramT) {
    for (byte b1 = 0; b1 < this.c; b1++) {
      if (this.b[b1] == paramT)
        return true; 
    } 
    return false;
  }
  
  public T a() {
    synchronized (this.a) {
      int i = this.c;
      if (i > 0) {
        int j = i - 1;
        Object[] arrayOfObject = this.b;
        Object object = arrayOfObject[j];
        arrayOfObject[j] = null;
        this.c = i - 1;
        return (T)object;
      } 
      return null;
    } 
  }
  
  public boolean c(T paramT) {
    synchronized (this.a) {
      if (!b(paramT)) {
        int i = this.c;
        Object[] arrayOfObject = this.b;
        if (i < arrayOfObject.length) {
          arrayOfObject[i] = paramT;
          this.c = i + 1;
          return true;
        } 
        return false;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("Already in the pool!");
      throw illegalStateException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t9/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */