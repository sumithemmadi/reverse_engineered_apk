package b.h.j;

public class h<T> extends g<T> {
  private final Object c = new Object();
  
  public h(int paramInt) {
    super(paramInt);
  }
  
  public T b() {
    synchronized (this.c) {
      return super.b();
    } 
  }
  
  public boolean c(T paramT) {
    synchronized (this.c) {
      return super.c(paramT);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */