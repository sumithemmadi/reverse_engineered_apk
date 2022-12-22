package androidx.lifecycle;

class CompositeGeneratedAdaptersObserver implements f {
  private final d[] b;
  
  CompositeGeneratedAdaptersObserver(d[] paramArrayOfd) {
    this.b = paramArrayOfd;
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    l l = new l();
    d[] arrayOfD = this.b;
    int i = arrayOfD.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++)
      arrayOfD[b].a(paramh, paramEvent, false, l); 
    arrayOfD = this.b;
    i = arrayOfD.length;
    for (b = bool; b < i; b++)
      arrayOfD[b].a(paramh, paramEvent, true, l); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/CompositeGeneratedAdaptersObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */