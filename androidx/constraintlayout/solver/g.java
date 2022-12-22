package androidx.constraintlayout.solver;

class g<T> implements f<T> {
  private final Object[] a;
  
  private int b;
  
  g(int paramInt) {
    if (paramInt > 0) {
      this.a = new Object[paramInt];
      return;
    } 
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  public T b() {
    int i = this.b;
    if (i > 0) {
      int j = i - 1;
      Object[] arrayOfObject = this.a;
      Object object = arrayOfObject[j];
      arrayOfObject[j] = null;
      this.b = i - 1;
      return (T)object;
    } 
    return null;
  }
  
  public boolean c(T paramT) {
    int i = this.b;
    Object[] arrayOfObject = this.a;
    if (i < arrayOfObject.length) {
      arrayOfObject[i] = paramT;
      this.b = i + 1;
      return true;
    } 
    return false;
  }
  
  public void d(T[] paramArrayOfT, int paramInt) {
    int i = paramInt;
    if (paramInt > paramArrayOfT.length)
      i = paramArrayOfT.length; 
    for (paramInt = 0; paramInt < i; paramInt++) {
      T t = paramArrayOfT[paramInt];
      int j = this.b;
      Object[] arrayOfObject = this.a;
      if (j < arrayOfObject.length) {
        arrayOfObject[j] = t;
        this.b = j + 1;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */