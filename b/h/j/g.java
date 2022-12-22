package b.h.j;

public class g<T> implements f<T> {
  private final Object[] a;
  
  private int b;
  
  public g(int paramInt) {
    if (paramInt > 0) {
      this.a = new Object[paramInt];
      return;
    } 
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  private boolean a(T paramT) {
    for (byte b = 0; b < this.b; b++) {
      if (this.a[b] == paramT)
        return true; 
    } 
    return false;
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
    if (!a(paramT)) {
      int i = this.b;
      Object[] arrayOfObject = this.a;
      if (i < arrayOfObject.length) {
        arrayOfObject[i] = paramT;
        this.b = i + 1;
        return true;
      } 
      return false;
    } 
    throw new IllegalStateException("Already in the pool!");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/j/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */