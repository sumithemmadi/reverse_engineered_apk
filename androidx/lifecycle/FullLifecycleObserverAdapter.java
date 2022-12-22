package androidx.lifecycle;

class FullLifecycleObserverAdapter implements f {
  private final c b;
  
  private final f c;
  
  FullLifecycleObserverAdapter(c paramc, f paramf) {
    this.b = paramc;
    this.c = paramf;
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    switch (a.a[paramEvent.ordinal()]) {
      case 7:
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
      case 6:
        this.b.f(paramh);
        break;
      case 5:
        this.b.e(paramh);
        break;
      case 4:
        this.b.d(paramh);
        break;
      case 3:
        this.b.a(paramh);
        break;
      case 2:
        this.b.g(paramh);
        break;
      case 1:
        this.b.b(paramh);
        break;
    } 
    f f1 = this.c;
    if (f1 != null)
      f1.c(paramh, paramEvent); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/FullLifecycleObserverAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */