package androidx.lifecycle;

class SingleGeneratedAdapterObserver implements f {
  private final d b;
  
  SingleGeneratedAdapterObserver(d paramd) {
    this.b = paramd;
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    this.b.a(paramh, paramEvent, false, null);
    this.b.a(paramh, paramEvent, true, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/SingleGeneratedAdapterObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */