package androidx.lifecycle;

class ReflectiveGenericLifecycleObserver implements f {
  private final Object b;
  
  private final a.a c;
  
  ReflectiveGenericLifecycleObserver(Object paramObject) {
    this.b = paramObject;
    this.c = a.a.c(paramObject.getClass());
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    this.c.a(paramh, paramEvent, this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/ReflectiveGenericLifecycleObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */